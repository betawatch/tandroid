package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.p2 implements xd.b, NotificationCenter.NotificationCenterDelegate, vg0, dh.d {
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public long Q;
    public String R;
    public boolean S;
    public at T;
    public String U;
    public fg.i0 V;
    public org.telegram.ui.Components.d20 W;
    public org.telegram.ui.ActionBar.d2 X;
    public boolean Y;
    public boolean Z;
    public final int a;
    public final a0.h a0;
    public final xd.a b;
    public ImageView b0;
    public final xd.a c;
    public NumberTextView c0;
    public xs d;
    public org.telegram.ui.ActionBar.w0 d0;
    public org.telegram.ui.Components.ax0 e;
    public org.telegram.ui.ActionBar.i2 e0;
    public org.telegram.ui.Components.tl0 f;
    public String f0;
    public boolean g0;
    public c2.y h;
    public long h0;
    public boolean i0;
    public final z5 j0;
    public int k0;
    public int l0;
    public float m0;
    public f2.j0 n;
    public int n0;
    public int o0;
    public boolean p0;
    public int phonebookRow;
    public final og.e q0;
    public ws r;
    public final tg.d r0;
    public org.telegram.ui.ActionBar.w0 s;
    public final tg.d s0;
    public og.k t0;
    public final ArrayList u0;
    public boolean v;
    public final RectF v0;
    public org.telegram.ui.Components.a20 w;
    public final RectF w0;
    public boolean x;
    public lh.j4 y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.b = new xd.a(0, this, prVar, 350L, false);
        this.c = new xd.a(2, this, prVar, 350L, false);
        this.phonebookRow = 0;
        this.x = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = null;
        this.S = true;
        this.Y = true;
        this.a0 = new a0.h();
        this.g0 = true;
        this.j0 = new z5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.u0 = arrayList;
        RectF rectF = new RectF();
        this.v0 = rectF;
        RectF rectF2 = new RectF();
        this.w0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i10 >= 31) {
            this.q0 = new og.e(false);
            this.r0 = new tg.d(null);
            this.s0 = new tg.d(null);
        } else {
            this.q0 = null;
            this.r0 = null;
            this.s0 = null;
        }
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        a0.h hVar = contactsActivity.a0;
        f2.p0 adapter = contactsActivity.f.getAdapter();
        ws wsVar = contactsActivity.r;
        if (adapter == wsVar) {
            wsVar.getClass();
            Object E = contactsActivity.r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() == null || !h6Var.getUser().contact) {
                    return;
                }
                contactsActivity.r0(h6Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof ContactsController.Contact) {
                        ContactsController.Contact contact = (ContactsController.Contact) E;
                        org.telegram.ui.Components.z4.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                        return;
                    }
                    return;
                }
                String str = (String) E;
                if (str.equals("section")) {
                    return;
                }
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    c.b(contactsActivity.currentAccount);
                    return;
                }
                uj0 uj0Var = new uj0(contactsActivity.getParentActivity(), contactsActivity);
                uj0Var.v(str, true);
                uj0Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            ws wsVar2 = contactsActivity.r;
            int size = wsVar2.d.size();
            int size2 = wsVar2.E.size();
            uf.k1 k1Var = wsVar2.f;
            int size3 = k1Var.e.size();
            int size4 = k1Var.j.size();
            if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                contactsActivity.getMessagesController().putUsers(arrayList, false);
                MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
            }
            if (contactsActivity.H) {
                contactsActivity.n0(user, true, null);
                return;
            }
            if (contactsActivity.I) {
                if (user.id == UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                    return;
                }
                contactsActivity.J = true;
                SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                contactsActivity.presentFragment(new xn(bundle), contactsActivity.N);
                return;
            }
            return;
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i11);
        int Q = contactsActivity.d.Q(i11);
        if (Q < 0 || S < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.sq)) {
            org.telegram.ui.Components.a20 a20Var = contactsActivity.w;
            if (a20Var != null) {
                a20Var.performClick();
                return;
            }
            return;
        }
        if (!hVar.i() && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.r0((org.telegram.ui.Cells.va) view);
            return;
        }
        if ((contactsActivity.D && i10 == 0) || S != 0) {
            Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (contactsActivity.H) {
                    contactsActivity.n0(user2, true, null);
                    return;
                }
                if (contactsActivity.I) {
                    contactsActivity.J = true;
                    SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                    contactsActivity.presentFragment(new xn(bundle2), contactsActivity.N);
                    return;
                }
                return;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact2 = (ContactsController.Contact) O;
                String str2 = !contact2.phones.isEmpty() ? contact2.phones.get(0) : null;
                if (str2 == null || contactsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.InviteUser);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rs(0, contactsActivity, str2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                contactsActivity.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (contactsActivity.E) {
            if (Q != 0) {
                if (Q == 1) {
                    contactsActivity.presentFragment(new l9(null));
                    return;
                }
                return;
            } else if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                c.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new d80());
                return;
            }
        }
        if (i10 != 0) {
            if (Q == 0) {
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    c.b(contactsActivity.currentAccount);
                    return;
                }
                long j10 = contactsActivity.Q;
                if (j10 == 0) {
                    j10 = contactsActivity.P;
                }
                h70 h70Var = new h70(null);
                h70Var.d = j10;
                contactsActivity.presentFragment(h70Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                c.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new z60(new Bundle()), false);
                return;
            }
        }
        if (Q == 1) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                c.b(contactsActivity.currentAccount);
                return;
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                contactsActivity.presentFragment(new nd(android.support.v4.media.a.h(0, "step")));
            } else {
                contactsActivity.presentFragment(new i(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.tl0 tl0Var = contactsActivity.f;
        if (tl0Var != null) {
            int childCount = tl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.b0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.b0.setBackground(org.telegram.ui.ActionBar.k6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.e();
        }
        lh.j4 j4Var = contactsActivity.y;
        if (j4Var != null) {
            j4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
    }

    public static /* synthetic */ void W(ContactsActivity contactsActivity, int i10) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        contactsActivity.Y = i10 != 0;
        if (i10 == 0) {
            return;
        }
        contactsActivity.f0(false);
    }

    public static /* synthetic */ void X(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            c.b(contactsActivity.currentAccount);
        } else {
            new uj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        float y10 = contactsActivity.f.getY() + contactsActivity.f.getPaddingTop();
        int i10 = 0;
        while (true) {
            if (i10 >= contactsActivity.f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f.getChildAt(i10);
            contactsActivity.f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                f2.v0 X = contactsActivity.f.X(i10);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.tl0 tl0Var = contactsActivity.f;
                X.a(rect, childAt, tl0Var, tl0Var.q0);
                y10 = contactsActivity.f.getY() + (childAt.getY() - (contactsActivity.d.H ? 0 : rect.top));
            } else {
                if (R > 0) {
                    y10 = -AndroidUtilities.dp(52.0f);
                    break;
                }
                i10++;
            }
        }
        contactsActivity.W.setTranslationY(AndroidUtilities.lerp(y10, contactsActivity.f.getY() + contactsActivity.f.getPaddingTop(), contactsActivity.c.e) - AndroidUtilities.dp(48.0f));
        contactsActivity.b.a(y10 > (contactsActivity.f.getY() + ((float) contactsActivity.f.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        xs xsVar;
        org.telegram.ui.Components.a20 a20Var = contactsActivity.w;
        if (a20Var == null || (xsVar = contactsActivity.d) == null) {
            return;
        }
        a20Var.e((!contactsActivity.x || contactsActivity.C || xsVar.F) ? false : true, true);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    @Override // dh.d
    public final View N() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.vg0
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.Components.tl0 tl0Var = this.f;
        return tl0Var == null || tl0Var.getFastScroll() == null || !this.f.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.K();
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10;
        final int i11 = 0;
        this.C = false;
        this.B = false;
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (!this.G) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        } else if (this.H) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(this.I ? R.string.NewSecretChat : R.string.NewMessageTitle));
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.e0 = i2Var;
        if (!this.F) {
            this.actionBar.setBackButtonDrawable(i2Var);
        }
        org.telegram.ui.Components.d20 d20Var = new org.telegram.ui.Components.d20(context, this.resourceProvider);
        this.W = d20Var;
        d20Var.w = true;
        d20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        d20Var.e();
        this.W.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.F) {
            ImageView imageView = new ImageView(context);
            this.b0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.b0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.b0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.y8), PorterDuff.Mode.MULTIPLY));
            this.b0.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.z8), 1, -1));
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ts
                public final /* synthetic */ ContactsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.o0();
                            break;
                        default:
                            ContactsActivity.Y(this.b);
                            break;
                    }
                }
            });
            j10.addView(this.b0, k7.c6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.c0 = numberTextView;
        numberTextView.setTextSize(18);
        this.c0.setTypeface(AndroidUtilities.bold());
        this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
        j10.addView(this.c0, k7.c6.m(1.0f, 0, -1, this.F ? 18 : 72, 0, 0));
        this.c0.setOnTouchListener(new org.telegram.ui.ActionBar.s2(i12));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new vs(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.d0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        lg.f fVar = this.W.r;
        fVar.addTextChangedListener(new lf.n0(fVar, new fb(this, 6)));
        if (!this.I && !this.H) {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, this.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f = new org.telegram.ui.Components.tl0(context, null);
        this.r = new ws(this, context, this.a0, this.S, this.L, this.K);
        int i13 = 2;
        int i14 = 3;
        if (this.Q != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.Q)), 3) ? 1 : 0;
        } else {
            if (this.P != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.P));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        xs xsVar = new xs(this, context, this.D ? 1 : 0, this.E, this.a0, i10);
        this.d = xsVar;
        if (this.s == null) {
            i13 = 0;
        } else if (this.v) {
            i13 = 1;
        }
        xsVar.Y(i13, false);
        this.d.E = this.Z;
        lh.j4 j4Var = new lh.j4(this, context, 4);
        this.y = j4Var;
        this.fragmentView = j4Var;
        org.telegram.ui.Components.tl0 tl0Var = this.f;
        Objects.requireNonNull(tl0Var);
        this.t0 = new og.k(tl0Var, j4Var, new us(tl0Var, i11));
        this.f.C0(new qs(this, i12));
        this.f.setSections(true);
        this.y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(29);
        u00Var.w = false;
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, u00Var, 1, null);
        this.e = ax0Var;
        ax0Var.addView(u00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.y.addView(this.e, k7.c6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.n(150L);
        lVar.m = false;
        this.f.setItemAnimator(lVar);
        this.f.setSectionsType(1);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setFastScrollEnabled(0);
        org.telegram.ui.Components.tl0 tl0Var2 = this.f;
        f2.j0 j0Var = new f2.j0(1, false);
        this.n = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        this.f.setAdapter(this.d);
        this.f.setClipToPadding(false);
        c2.y yVar = new c2.y(this.f, this.n);
        this.h = yVar;
        yVar.h = new ss(this);
        lh.j4 j4Var2 = this.y;
        org.telegram.ui.Components.tl0 tl0Var3 = this.f;
        float f10 = -this.a;
        j4Var2.addView(tl0Var3, k7.c6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.y.addView(this.W, k7.c6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f.setEmptyView(this.e);
        org.telegram.ui.Components.tl0 tl0Var4 = this.f;
        tl0Var4.V1 = true;
        tl0Var4.W1 = 0;
        tl0Var4.setOnItemClickListener(new hg.m2(this, i10, 9));
        this.f.setOnItemLongClickListener(new ss(this));
        this.f.setOnScrollListener(new ys(this));
        if (!this.I && !this.H) {
            org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
            this.w = a20Var;
            this.y.addView(a20Var, org.telegram.ui.Components.a20.b());
            this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ts
                public final /* synthetic */ ContactsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.b.o0();
                            break;
                        default:
                            ContactsActivity.Y(this.b);
                            break;
                    }
                }
            });
            this.w.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.w.c.getAnimatedDrawable().K(this.w.c.getAnimatedDrawable().e[0] - 1);
            this.w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.U;
        if (str != null) {
            this.actionBar.x(str);
            this.U = null;
        }
        this.y.addView(this.actionBar);
        fg.i0 i0Var = new fg.i0(context, this.parentLayout);
        this.V = i0Var;
        i0Var.b(false, false);
        this.y.addView(this.V, k7.c6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f);
        this.actionBar.setDrawBlurBackground(this.y);
        this.b.a(true, false);
        l0();
        setBulletinDelegate(new a9(this, i14));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.d1.d.add(this);
        }
        View view = this.fragmentView;
        ss ssVar = new ss(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, ssVar);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tl0 tl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            xs xsVar = this.d;
            if (xsVar != null) {
                if (!this.v) {
                    xsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.r != null) {
                f2.p0 adapter = this.f.getAdapter();
                ws wsVar = this.r;
                if (adapter == wsVar) {
                    wsVar.G(this.f0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 != NotificationCenter.encryptedChatCreated) {
                if (i10 != NotificationCenter.closeChats || this.J) {
                    return;
                }
                removeSelfFromStack(true);
                return;
            }
            if (this.I && this.J) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new xn(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (tl0Var = this.f) != null) {
            int childCount = tl0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(intValue);
                }
            }
        }
        if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.v || this.d == null || this.i0) {
            return;
        }
        this.i0 = true;
        z5 z5Var = this.j0;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        AndroidUtilities.runOnUIThread(z5Var, 5000L);
    }

    public final void f0(boolean z4) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z4 && this.Y) {
            showDialog(org.telegram.ui.Components.z4.w(parentActivity, new ps(this, 1)).a);
            return;
        }
        this.h0 = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void g0() {
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.q0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.n0) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.v0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.w0;
        rectF.set(0.0f, dp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.F ? 2 : 1, this.u0);
        eVar.e(this.t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 12);
        if (!this.F) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.n7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 262148, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 262148, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.m6));
        org.telegram.ui.Components.a20 a20Var = this.w;
        if (a20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(a20Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.w.c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.w.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.i1}, null, org.telegram.ui.ActionBar.k6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f1}, null, org.telegram.ui.ActionBar.k6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.k6.Q0, null, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.k6.P0, null, null, org.telegram.ui.ActionBar.k6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.ax0 ax0Var = this.e;
        if (ax0Var != null) {
            ax0Var.b(Math.max(this.n0 + this.k0, this.o0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.a20 a20Var = this.w;
        if (a20Var != null) {
            a20Var.setTranslationY(((-this.n0) - this.l0) - this.m0);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.f.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r1 + 44), 0, AndroidUtilities.dp(this.a) + this.n0 + this.k0);
    }

    @Override // dh.d
    public final void k(r0.m1 m1Var) {
        this.o0 = m1Var.a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.a20.d(this.d0, (1.0f - this.c.e) * (1.0f - this.b.e));
    }

    public final void l0() {
        xs xsVar = this.d;
        boolean z4 = xsVar != null && xsVar.F;
        if (this.p0 != z4 || TextUtils.isEmpty(this.W.r.getHint())) {
            this.W.r.setHint(LocaleController.getString(z4 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.W.r.setContentDescription(LocaleController.getString(z4 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.p0 = z4;
        }
    }

    public final void m0() {
        float f10 = 1.0f - this.c.e;
        xs xsVar = this.d;
        org.telegram.ui.Components.a20.d(this.s, f10 * ((xsVar == null || xsVar.F) ? 0.0f : 1.0f));
    }

    public final void n0(TLRPC.User user, boolean z4, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z4 || this.R == null) {
            at atVar = this.T;
            if (atVar != null) {
                atVar.b(user);
                if (this.O) {
                    this.T = null;
                }
            }
            if (this.N) {
                finishFragment();
                return;
            }
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (user.bot) {
            if (user.bot_nochats) {
                try {
                    org.telegram.ui.Components.qc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            }
            if (this.P != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.P));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                if (canAddAdmins) {
                    d2Var.O = LocaleController.getString(R.string.AddBotAdminAlert);
                    d2Var.Q = LocaleController.getString(R.string.AddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new rs(this, user, str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    d2Var.Q = LocaleController.getString(R.string.CantAddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                }
                showDialog(d2Var);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
        d2Var2.O = string;
        String formatStringSimple = LocaleController.formatStringSimple(this.R, UserObject.getUserName(user));
        if (user.bot || !this.M) {
            editTextBoldCursor = null;
        } else {
            formatStringSimple = android.support.v4.media.a.z(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.j5));
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.S(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new zs(editTextBoldCursor));
            alertDialog$Builder2.n(editTextBoldCursor);
        }
        d2Var2.Q = formatStringSimple;
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new d7(this, user, editTextBoldCursor, 11));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var2);
        if (editTextBoldCursor != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
            if (marginLayoutParams != null) {
                if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                }
                int dp = AndroidUtilities.dp(24.0f);
                marginLayoutParams.leftMargin = dp;
                marginLayoutParams.rightMargin = dp;
                marginLayoutParams.height = AndroidUtilities.dp(36.0f);
                editTextBoldCursor.setLayoutParams(marginLayoutParams);
            }
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        }
    }

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.a0;
            if (i10 >= childCount) {
                hVar.b();
                this.e0.c(0.0f, true);
                return;
            }
            View childAt = this.f.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.va) {
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) childAt;
                if (hVar.h(vaVar.getDialogId()) >= 0) {
                    vaVar.c(false, true);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                if (hVar.h(h6Var.getDialogId()) >= 0) {
                    h6Var.s(false, true);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.actionBar.s()) {
            if (z4) {
                o0();
                return false;
            }
        } else {
            if (!this.c.f) {
                return super.onBackPressed(z4);
            }
            if (z4) {
                this.W.r.getText().clear();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.g0 || Build.VERSION.SDK_INT < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.g0 = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                f0(true);
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(parentActivity, new ps(this, 0)).a;
            this.X = d2Var;
            showDialog(d2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.d2 d2Var = this.X;
        if (d2Var == null || dialog != d2Var || getParentActivity() == null || !this.Y) {
            return;
        }
        f0(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.g0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.D = bundle.getBoolean("onlyUsers", false);
            this.G = this.arguments.getBoolean("destroyAfterSelect", false);
            this.H = this.arguments.getBoolean("returnAsResult", false);
            this.I = this.arguments.getBoolean("createSecretChat", false);
            this.R = this.arguments.getString("selectAlertString");
            this.S = this.arguments.getBoolean("allowUsernameSearch", true);
            this.M = this.arguments.getBoolean("needForwardCount", true);
            this.L = this.arguments.getBoolean("allowBots", true);
            this.K = this.arguments.getBoolean("allowSelf", true);
            this.P = this.arguments.getLong("channelId", 0L);
            this.N = this.arguments.getBoolean("needFinishFragment", true);
            this.Q = this.arguments.getLong("chat_id", 0L);
            this.Z = this.arguments.getBoolean("disableSections", false);
            this.O = this.arguments.getBoolean("resetDelegate", false);
            this.E = this.arguments.getBoolean("needPhonebook", false);
            this.F = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.E = true;
        }
        if (!this.I && !this.H) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        this.k0 = this.F ? AndroidUtilities.dp(72.0f) : 0;
        this.l0 = this.F ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.T = null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.n0 = i13;
        j0();
        i0();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.Y = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.h0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        xs xsVar = this.d;
        if (xsVar != null) {
            xsVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(com.google.firebase.messaging.i iVar) {
        this.T = iVar;
    }

    public final void q0(String str) {
        this.U = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z4;
        boolean z10 = viewGroup instanceof org.telegram.ui.Cells.va;
        boolean z11 = false;
        a0.h hVar = this.a0;
        if (z10) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) viewGroup;
            long dialogId = vaVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                vaVar.c(false, true);
            } else if (vaVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) vaVar.getCurrentObject(), dialogId);
                vaVar.c(true, true);
                z4 = true;
            }
            z4 = false;
        } else {
            if (!(viewGroup instanceof org.telegram.ui.Cells.h6)) {
                return;
            }
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) viewGroup;
            long dialogId2 = h6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                h6Var.s(false, true);
            } else if (h6Var.getUser() != null) {
                hVar.k(h6Var.getUser(), dialogId2);
                h6Var.s(true, true);
                z4 = true;
            }
            z4 = false;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                o0();
                return;
            }
            z11 = true;
        } else if (z4) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.e0.c(1.0f, true);
        }
        this.c0.a(hVar.m(), z11);
    }

    @Override // org.telegram.ui.vg0
    public final void s() {
        if (this.n.L0() < 15) {
            this.f.x0(0);
        } else {
            c2.y yVar = this.h;
            yVar.b = 1;
            yVar.c(0, 0, false, false);
        }
        this.b.a(true, true);
    }

    @Override // org.telegram.ui.vg0
    public final tg.d y() {
        return this.s0;
    }

    @Override // dh.d
    public final /* synthetic */ void I() {
    }

    @Override // dh.d
    public final /* synthetic */ void t() {
    }

    @Override // xd.b
    public final void z(float f10, int i10) {
    }
}
