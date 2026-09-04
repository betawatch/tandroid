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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.n2 implements le.d, NotificationCenter.NotificationCenterDelegate, dh0, qh.d {
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
    public boolean P;
    public boolean Q;
    public boolean R;
    public long S;
    public long T;
    public String U;
    public boolean V;
    public dt W;
    public String X;
    public di.r6 Y;
    public org.telegram.ui.Components.b20 Z;
    public final int a;
    public org.telegram.ui.ActionBar.b2 a0;
    public final le.b b;
    public boolean b0;
    public final le.b c;
    public boolean c0;
    public at d;
    public final a0.i d0;
    public org.telegram.ui.Components.xw0 e;
    public ImageView e0;
    public org.telegram.ui.Components.ll0 f;
    public NumberTextView f0;
    public org.telegram.ui.ActionBar.v0 g0;
    public org.telegram.ui.Components.ok0 h;
    public org.telegram.ui.ActionBar.g2 h0;
    public String i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public final w5 m0;
    public s4.c0 n;
    public int n0;
    public int o0;
    public float p0;
    public int phonebookRow;
    public int q0;
    public zs r;
    public int r0;
    public org.telegram.ui.ActionBar.v0 s;
    public boolean s0;
    public final bh.f t0;
    public final gh.d u0;
    public boolean v;
    public final gh.d v0;
    public org.telegram.ui.Components.y10 w;
    public bh.l w0;
    public boolean x;
    public final ArrayList x0;
    public w8 y;
    public final RectF y0;
    public final RectF z0;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.b = new le.b(0, this, prVar, 350L, false);
        this.c = new le.b(2, this, prVar, 350L, false);
        this.phonebookRow = 0;
        this.x = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.U = null;
        this.V = true;
        this.b0 = true;
        this.d0 = new a0.i();
        this.j0 = true;
        this.m0 = new w5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.x0 = arrayList;
        RectF rectF = new RectF();
        this.y0 = rectF;
        RectF rectF2 = new RectF();
        this.z0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i10 >= 31) {
            this.t0 = new bh.f(false);
            this.u0 = new gh.d(null);
            this.v0 = new gh.d(null);
        } else {
            this.t0 = null;
            this.u0 = null;
            this.v0 = null;
        }
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        a0.i iVar = contactsActivity.d0;
        s4.h0 adapter = contactsActivity.f.getAdapter();
        zs zsVar = contactsActivity.r;
        if (adapter == zsVar) {
            zsVar.getClass();
            Object E = contactsActivity.r.E(i11);
            if (!iVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
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
                        org.telegram.ui.Components.e5.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
                        return;
                    }
                    return;
                }
                String str = (String) E;
                if (str.equals("section")) {
                    return;
                }
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                ek0 ek0Var = new ek0(contactsActivity.getParentActivity(), contactsActivity);
                ek0Var.v(str, true);
                ek0Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            zs zsVar2 = contactsActivity.r;
            int size = zsVar2.d.size();
            int size2 = zsVar2.H.size();
            hg.b2 b2Var = zsVar2.f;
            int size3 = b2Var.e.size();
            int size4 = b2Var.j.size();
            if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                contactsActivity.getMessagesController().putUsers(arrayList, false);
                MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
            }
            if (contactsActivity.K) {
                contactsActivity.n0(user, true, null);
                return;
            }
            if (contactsActivity.L) {
                if (user.id == UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                    return;
                }
                contactsActivity.M = true;
                SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                contactsActivity.presentFragment(new co(bundle), contactsActivity.Q);
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
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.rq)) {
            org.telegram.ui.Components.y10 y10Var = contactsActivity.w;
            if (y10Var != null) {
                y10Var.performClick();
                return;
            }
            return;
        }
        if (!iVar.i() && (view instanceof org.telegram.ui.Cells.za)) {
            contactsActivity.r0((org.telegram.ui.Cells.za) view);
            return;
        }
        if ((contactsActivity.G && i10 == 0) || S != 0) {
            Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (contactsActivity.K) {
                    contactsActivity.n0(user2, true, null);
                    return;
                }
                if (contactsActivity.L) {
                    contactsActivity.M = true;
                    SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                    contactsActivity.presentFragment(new co(bundle2), contactsActivity.Q);
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
                alertDialog$Builder.a.T = LocaleController.getString(R.string.InviteUser);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.b3(22, contactsActivity, str2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                contactsActivity.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (contactsActivity.H) {
            if (Q != 0) {
                if (Q == 1) {
                    contactsActivity.presentFragment(new k9(null));
                    return;
                }
                return;
            } else if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new l80());
                return;
            }
        }
        if (i10 != 0) {
            if (Q == 0) {
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                long j3 = contactsActivity.T;
                if (j3 == 0) {
                    j3 = contactsActivity.S;
                }
                n70 n70Var = new n70(null);
                n70Var.d = j3;
                contactsActivity.presentFragment(n70Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new f70(new Bundle()), false);
                return;
            }
        }
        if (Q == 1) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                contactsActivity.presentFragment(new md(org.telegram.ui.Cells.p6.e(0, "step")));
            } else {
                contactsActivity.presentFragment(new h(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.ll0 ll0Var = contactsActivity.f;
        if (ll0Var != null) {
            int childCount = ll0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.za) {
                    ((org.telegram.ui.Cells.za) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.e0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.e0.setBackground(org.telegram.ui.ActionBar.j6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.d();
        }
        w8 w8Var = contactsActivity.y;
        if (w8Var != null) {
            w8Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        }
    }

    public static /* synthetic */ void W(ContactsActivity contactsActivity, int i10) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        contactsActivity.b0 = i10 != 0;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new ek0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        float y3 = contactsActivity.f.getY() + contactsActivity.f.getPaddingTop();
        int i10 = 0;
        while (true) {
            if (i10 >= contactsActivity.f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f.getChildAt(i10);
            contactsActivity.f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                s4.n0 X = contactsActivity.f.X(i10);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.ll0 ll0Var = contactsActivity.f;
                X.a(rect, childAt, ll0Var, ll0Var.t0);
                y3 = contactsActivity.f.getY() + (childAt.getY() - (contactsActivity.d.K ? 0 : rect.top));
            } else {
                if (R > 0) {
                    y3 = -AndroidUtilities.dp(52.0f);
                    break;
                }
                i10++;
            }
        }
        contactsActivity.Z.setTranslationY(AndroidUtilities.lerp(y3, contactsActivity.f.getY() + contactsActivity.f.getPaddingTop(), contactsActivity.c.e) - AndroidUtilities.dp(48.0f));
        contactsActivity.b.a(y3 > (contactsActivity.f.getY() + ((float) contactsActivity.f.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        at atVar;
        org.telegram.ui.Components.y10 y10Var = contactsActivity.w;
        if (y10Var == null || (atVar = contactsActivity.d) == null) {
            return;
        }
        y10Var.e((!contactsActivity.x || contactsActivity.F || atVar.I) ? false : true, true);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    @Override // qh.d
    public final View N() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.dh0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.ll0 ll0Var = this.f;
        return ll0Var == null || ll0Var.getFastScroll() == null || !this.f.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.L();
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10;
        final int i11 = 0;
        this.F = false;
        this.E = false;
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (!this.J) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        } else if (this.K) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(this.L ? R.string.NewSecretChat : R.string.NewMessageTitle));
        }
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.h0 = g2Var;
        if (!this.I) {
            this.actionBar.setBackButtonDrawable(g2Var);
        }
        org.telegram.ui.Components.b20 b20Var = new org.telegram.ui.Components.b20(context, this.resourceProvider);
        this.Z = b20Var;
        b20Var.w = true;
        b20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        b20Var.d();
        this.Z.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        j3.setBackgroundColor(0);
        if (this.I) {
            ImageView imageView = new ImageView(context);
            this.e0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.e0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.e0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.MULTIPLY));
            this.e0.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.z8), 1, -1));
            this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ws
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
            j3.addView(this.e0, w7.x5.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f0 = numberTextView;
        numberTextView.setTextSize(18);
        this.f0.setTypeface(AndroidUtilities.bold());
        this.f0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
        j3.addView(this.f0, w7.x5.m(1.0f, 0, -1, this.I ? 18 : 72, 0, 0));
        int i13 = 2;
        this.f0.setOnTouchListener(new ci.d(i13));
        j3.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ys(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.g0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        di.h2 h2Var = this.Z.r;
        h2Var.addTextChangedListener(new yf.h0(h2Var, new ig.d2(this, 7)));
        if (!this.L && !this.K) {
            org.telegram.ui.ActionBar.v0 a10 = n10.a(1, this.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f = new org.telegram.ui.Components.ll0(context, null);
        this.r = new zs(this, context, this.d0, this.V, this.O, this.N);
        int i14 = 3;
        if (this.T != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.T)), 3) ? 1 : 0;
        } else {
            if (this.S != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        at atVar = new at(this, context, this.G ? 1 : 0, this.H, this.d0, i10);
        this.d = atVar;
        if (this.s == null) {
            i13 = 0;
        } else if (this.v) {
            i13 = 1;
        }
        atVar.Y(i13, false);
        this.d.H = this.c0;
        w8 w8Var = new w8(this, context, i14);
        this.y = w8Var;
        this.fragmentView = w8Var;
        org.telegram.ui.Components.ll0 ll0Var = this.f;
        Objects.requireNonNull(ll0Var);
        this.w0 = new bh.l(ll0Var, w8Var, new xs(ll0Var, i11));
        this.f.C0(new us(this, i12));
        this.f.setSections(true);
        this.y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(29);
        t00Var.w = false;
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, t00Var, 1, null);
        this.e = xw0Var;
        xw0Var.addView(t00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.y.addView(this.e, w7.x5.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.m = false;
        this.f.setItemAnimator(jVar);
        this.f.setSectionsType(1);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setFastScrollEnabled(0);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.n = c0Var;
        ll0Var2.setLayoutManager(c0Var);
        this.f.setAdapter(this.d);
        this.f.setClipToPadding(false);
        org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(this.f, this.n);
        this.h = ok0Var;
        ok0Var.h = new vs(this);
        w8 w8Var2 = this.y;
        org.telegram.ui.Components.ll0 ll0Var3 = this.f;
        float f7 = -this.a;
        w8Var2.addView(ll0Var3, w7.x5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.y.addView(this.Z, w7.x5.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f.setEmptyView(this.e);
        org.telegram.ui.Components.ll0 ll0Var4 = this.f;
        ll0Var4.Y1 = true;
        ll0Var4.Z1 = 0;
        ll0Var4.setOnItemClickListener(new i2.t(this, i10, 9));
        this.f.setOnItemLongClickListener(new vs(this));
        this.f.setOnScrollListener(new bt(this));
        if (!this.L && !this.K) {
            org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
            this.w = y10Var;
            this.y.addView(y10Var, org.telegram.ui.Components.y10.b());
            this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ws
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
        String str = this.X;
        if (str != null) {
            this.actionBar.x(str);
            this.X = null;
        }
        this.y.addView(this.actionBar);
        di.r6 r6Var = new di.r6(context, this.parentLayout);
        this.Y = r6Var;
        r6Var.b(false, false);
        this.y.addView(this.Y, w7.x5.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f);
        this.actionBar.setDrawBlurBackground(this.y);
        this.b.a(true, false);
        l0();
        setBulletinDelegate(new z8(this, i14));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        View view = this.fragmentView;
        vs vsVar = new vs(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view, vsVar);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ll0 ll0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            at atVar = this.d;
            if (atVar != null) {
                if (!this.v) {
                    atVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.r != null) {
                s4.h0 adapter = this.f.getAdapter();
                zs zsVar = this.r;
                if (adapter == zsVar) {
                    zsVar.G(this.i0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 != NotificationCenter.encryptedChatCreated) {
                if (i10 != NotificationCenter.closeChats || this.M) {
                    return;
                }
                removeSelfFromStack(true);
                return;
            }
            if (this.L && this.M) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new co(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (ll0Var = this.f) != null) {
            int childCount = ll0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.za) {
                    ((org.telegram.ui.Cells.za) childAt).j(intValue);
                }
            }
        }
        if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.v || this.d == null || this.l0) {
            return;
        }
        this.l0 = true;
        w5 w5Var = this.m0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        AndroidUtilities.runOnUIThread(w5Var, 5000L);
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z10 && this.b0) {
            showDialog(org.telegram.ui.Components.e5.w(parentActivity, new ts(this, 1)).a);
            return;
        }
        this.k0 = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void g0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.t0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.q0) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.y0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.z0;
        rectF.set(0.0f, dp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.I ? 2 : 1, this.x0);
        fVar.e(this.w0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.I) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.n7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 262148, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        org.telegram.ui.Components.y10 y10Var = this.w;
        if (y10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(y10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.w.c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.w.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f1}, null, org.telegram.ui.ActionBar.j6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.j6.Q0, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.xw0 xw0Var = this.e;
        if (xw0Var != null) {
            xw0Var.b(Math.max(this.q0 + this.n0, this.r0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.y10 y10Var = this.w;
        if (y10Var != null) {
            y10Var.setTranslationY(((-this.q0) - this.o0) - this.p0);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // qh.d
    public final void j(r0.l1 l1Var) {
        this.r0 = l1Var.a.f(8).d;
        h0();
    }

    public final void j0() {
        this.f.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r1 + 44), 0, AndroidUtilities.dp(this.a) + this.q0 + this.n0);
    }

    public final void k0() {
        org.telegram.ui.Components.y10.d(this.g0, (1.0f - this.c.e) * (1.0f - this.b.e));
    }

    public final void l0() {
        at atVar = this.d;
        boolean z10 = atVar != null && atVar.I;
        if (this.s0 != z10 || TextUtils.isEmpty(this.Z.r.getHint())) {
            this.Z.r.setHint(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.Z.r.setContentDescription(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.s0 = z10;
        }
    }

    public final void m0() {
        float f7 = 1.0f - this.c.e;
        at atVar = this.d;
        org.telegram.ui.Components.y10.d(this.s, f7 * ((atVar == null || atVar.I) ? 0.0f : 1.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z10 || this.U == null) {
            dt dtVar = this.W;
            if (dtVar != null) {
                dtVar.b(user);
                if (this.R) {
                    this.W = null;
                }
            }
            if (this.Q) {
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
                    org.telegram.ui.Components.yc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            if (this.S != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.S));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                if (canAddAdmins) {
                    b2Var.R = LocaleController.getString(R.string.AddBotAdminAlert);
                    b2Var.T = LocaleController.getString(R.string.AddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new org.telegram.ui.Components.b3(this, user, str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    b2Var.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                }
                showDialog(b2Var);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
        b2Var2.R = string;
        String formatStringSimple = LocaleController.formatStringSimple(this.U, UserObject.getUserName(user));
        if (user.bot || !this.P) {
            editTextBoldCursor = null;
        } else {
            formatStringSimple = a4.a.C(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.j6.S(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new ct(editTextBoldCursor));
            alertDialog$Builder2.n(editTextBoldCursor);
        }
        b2Var2.T = formatStringSimple;
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new b7(this, user, editTextBoldCursor, 11));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var2);
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
            a0.i iVar = this.d0;
            if (i10 >= childCount) {
                iVar.b();
                this.h0.c(0.0f, true);
                return;
            }
            View childAt = this.f.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.za) {
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                if (iVar.h(zaVar.getDialogId()) >= 0) {
                    zaVar.c(false, true);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                if (iVar.h(h6Var.getDialogId()) >= 0) {
                    h6Var.s(false, true);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                o0();
                return false;
            }
        } else {
            if (!this.c.f) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.Z.r.getText().clear();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.j0 || Build.VERSION.SDK_INT < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.j0 = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                f0(true);
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.w(parentActivity, new ts(this, 0)).a;
            this.a0 = b2Var;
            showDialog(b2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.b2 b2Var = this.a0;
        if (b2Var == null || dialog != b2Var || getParentActivity() == null || !this.b0) {
            return;
        }
        f0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.j0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.G = bundle.getBoolean("onlyUsers", false);
            this.J = this.arguments.getBoolean("destroyAfterSelect", false);
            this.K = this.arguments.getBoolean("returnAsResult", false);
            this.L = this.arguments.getBoolean("createSecretChat", false);
            this.U = this.arguments.getString("selectAlertString");
            this.V = this.arguments.getBoolean("allowUsernameSearch", true);
            this.P = this.arguments.getBoolean("needForwardCount", true);
            this.O = this.arguments.getBoolean("allowBots", true);
            this.N = this.arguments.getBoolean("allowSelf", true);
            this.S = this.arguments.getLong("channelId", 0L);
            this.Q = this.arguments.getBoolean("needFinishFragment", true);
            this.T = this.arguments.getLong("chat_id", 0L);
            this.c0 = this.arguments.getBoolean("disableSections", false);
            this.R = this.arguments.getBoolean("resetDelegate", false);
            this.H = this.arguments.getBoolean("needPhonebook", false);
            this.I = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.H = true;
        }
        if (!this.L && !this.K) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        this.n0 = this.I ? AndroidUtilities.dp(72.0f) : 0;
        this.o0 = this.I ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.W = null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.q0 = i13;
        j0();
        i0();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.b0 = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.k0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        at atVar = this.d;
        if (atVar != null) {
            atVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(com.google.firebase.messaging.i iVar) {
        this.W = iVar;
    }

    public final void q0(String str) {
        this.X = str;
    }

    @Override // org.telegram.ui.dh0
    public final void r() {
        if (this.n.L0() < 15) {
            this.f.x0(0);
        } else {
            org.telegram.ui.Components.ok0 ok0Var = this.h;
            ok0Var.b = 1;
            ok0Var.c(0, 0, false, false);
        }
        this.b.a(true, true);
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.za;
        boolean z12 = false;
        a0.i iVar = this.d0;
        if (z11) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) viewGroup;
            long dialogId = zaVar.getDialogId();
            if (iVar.h(dialogId) >= 0) {
                iVar.l(dialogId);
                zaVar.c(false, true);
            } else if (zaVar.getCurrentObject() instanceof TLRPC.User) {
                iVar.k((TLRPC.User) zaVar.getCurrentObject(), dialogId);
                zaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            if (!(viewGroup instanceof org.telegram.ui.Cells.h6)) {
                return;
            }
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) viewGroup;
            long dialogId2 = h6Var.getDialogId();
            if (iVar.h(dialogId2) >= 0) {
                iVar.l(dialogId2);
                h6Var.s(false, true);
            } else if (h6Var.getUser() != null) {
                iVar.k(h6Var.getUser(), dialogId2);
                h6Var.s(true, true);
                z10 = true;
            }
            z10 = false;
        }
        if (this.actionBar.s()) {
            if (iVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.h0.c(1.0f, true);
        }
        this.f0.a(iVar.m(), z12);
    }

    @Override // org.telegram.ui.dh0
    public final gh.d x() {
        return this.v0;
    }

    @Override // qh.d
    public final /* synthetic */ void J() {
    }

    @Override // qh.d
    public final /* synthetic */ void s() {
    }

    @Override // le.d
    public final void z(float f7, int i10) {
    }
}
