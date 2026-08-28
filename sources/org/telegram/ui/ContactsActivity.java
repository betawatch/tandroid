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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.o2 implements td.b, NotificationCenter.NotificationCenterDelegate, mg0, xg.d {
    public boolean A;
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
    public long O;
    public long P;
    public String Q;
    public boolean R;
    public ts S;
    public String T;
    public kh.h6 U;
    public org.telegram.ui.Components.m10 V;
    public org.telegram.ui.ActionBar.c2 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final int a;
    public ImageView a0;
    public final td.a b;
    public NumberTextView b0;
    public final td.a c;
    public org.telegram.ui.ActionBar.w0 c0;
    public qs d;
    public org.telegram.ui.ActionBar.h2 d0;
    public org.telegram.ui.Components.gw0 e;
    public String e0;
    public org.telegram.ui.Components.wk0 f;
    public boolean f0;
    public long g0;
    public c2.y h;
    public boolean h0;
    public final v5 i0;
    public int j0;
    public int k0;
    public float l0;
    public int m0;
    public f2.m0 n;
    public int n0;
    public boolean o0;
    public final ig.e p0;
    public int phonebookRow;
    public final ng.d q0;
    public ps r;
    public final ng.d r0;
    public org.telegram.ui.ActionBar.w0 s;
    public ig.k s0;
    public final ArrayList t0;
    public final RectF u0;
    public boolean v;
    public final RectF v0;
    public org.telegram.ui.Components.j10 w;
    public boolean x;
    public fh.x4 y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i9 = Build.VERSION.SDK_INT;
        this.a = i9 >= 31 ? 48 : 0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.b = new td.a(0, this, grVar, 350L, false);
        this.c = new td.a(2, this, grVar, 350L, false);
        this.phonebookRow = 0;
        this.x = true;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.Q = null;
        this.R = true;
        this.X = true;
        this.Z = new a0.h();
        this.f0 = true;
        this.i0 = new v5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.t0 = arrayList;
        RectF rectF = new RectF();
        this.u0 = rectF;
        RectF rectF2 = new RectF();
        this.v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i9 >= 31) {
            this.p0 = new ig.e(false);
            this.q0 = new ng.d(null);
            this.r0 = new ng.d(null);
        } else {
            this.p0 = null;
            this.q0 = null;
            this.r0 = null;
        }
    }

    public static void T(ContactsActivity contactsActivity, int i9, View view, int i10) {
        a0.h hVar = contactsActivity.Z;
        f2.r0 adapter = contactsActivity.f.getAdapter();
        ps psVar = contactsActivity.r;
        if (adapter == psVar) {
            psVar.getClass();
            Object E = contactsActivity.r.E(i10);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.h6)) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (h6Var.getUser() == null || !h6Var.getUser().contact) {
                    return;
                }
                contactsActivity.q0(h6Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof ContactsController.Contact) {
                        ContactsController.Contact contact = (ContactsController.Contact) E;
                        org.telegram.ui.Components.y4.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
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
                nj0 nj0Var = new nj0(contactsActivity.getParentActivity(), contactsActivity);
                nj0Var.v(str, true);
                nj0Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            ps psVar2 = contactsActivity.r;
            int size = psVar2.d.size();
            int size2 = psVar2.D.size();
            of.v1 v1Var = psVar2.f;
            int size3 = v1Var.e.size();
            int size4 = v1Var.j.size();
            if ((i10 < 0 || i10 >= size) && ((i10 <= size || i10 >= size + size2 + 1) && ((i10 <= size + size2 + 1 || i10 >= size + size4 + size2 + 1) && i10 > size + size4 + size2 + 1 && i10 <= size3 + size4 + size + size2 + 1))) {
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                contactsActivity.getMessagesController().putUsers(arrayList, false);
                MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
            }
            if (contactsActivity.G) {
                contactsActivity.m0(user, true, null);
                return;
            }
            if (contactsActivity.H) {
                if (user.id == UserConfig.getInstance(contactsActivity.currentAccount).getClientUserId()) {
                    return;
                }
                contactsActivity.I = true;
                SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (contactsActivity.getMessagesController().checkCanOpenChat(bundle, contactsActivity)) {
                contactsActivity.presentFragment(new qn(bundle), contactsActivity.M);
                return;
            }
            return;
        }
        contactsActivity.d.getClass();
        int S = contactsActivity.d.S(i10);
        int Q = contactsActivity.d.Q(i10);
        if (Q < 0 || S < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.iq)) {
            org.telegram.ui.Components.j10 j10Var = contactsActivity.w;
            if (j10Var != null) {
                j10Var.performClick();
                return;
            }
            return;
        }
        if (!hVar.i() && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.q0((org.telegram.ui.Cells.va) view);
            return;
        }
        if ((contactsActivity.C && i9 == 0) || S != 0) {
            Object O = contactsActivity.d.O(contactsActivity.d.S(i10), contactsActivity.d.Q(i10));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (contactsActivity.G) {
                    contactsActivity.m0(user2, true, null);
                    return;
                }
                if (contactsActivity.H) {
                    contactsActivity.I = true;
                    SecretChatHelper.getInstance(contactsActivity.currentAccount).startSecretChat(contactsActivity.getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (contactsActivity.getMessagesController().checkCanOpenChat(bundle2, contactsActivity)) {
                    contactsActivity.presentFragment(new qn(bundle2), contactsActivity.M);
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
                alertDialog$Builder.a.P = LocaleController.getString(R.string.InviteUser);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new yr(1, contactsActivity, str2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                contactsActivity.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (contactsActivity.D) {
            if (Q != 0) {
                if (Q == 1) {
                    contactsActivity.presentFragment(new i9(null));
                    return;
                }
                return;
            } else if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new q70());
                return;
            }
        }
        if (i9 != 0) {
            if (Q == 0) {
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                long j10 = contactsActivity.P;
                if (j10 == 0) {
                    j10 = contactsActivity.O;
                }
                t60 t60Var = new t60(null);
                t60Var.d = j10;
                contactsActivity.presentFragment(t60Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new k60(new Bundle()), false);
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
                contactsActivity.presentFragment(new id(aa.d.h(0, "step")));
            } else {
                contactsActivity.presentFragment(new h(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            }
        }
    }

    public static void U(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.wk0 wk0Var = contactsActivity.f;
        if (wk0Var != null) {
            int childCount = wk0Var.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = contactsActivity.f.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.a0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.a0.setBackground(org.telegram.ui.ActionBar.f6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = contactsActivity.actionBar;
        if (kVar != null) {
            kVar.d();
        }
        fh.x4 x4Var = contactsActivity.y;
        if (x4Var != null) {
            x4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        }
    }

    public static /* synthetic */ void V(ContactsActivity contactsActivity, int i9) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        contactsActivity.X = i9 != 0;
        if (i9 == 0) {
            return;
        }
        contactsActivity.e0(false);
    }

    public static /* synthetic */ void W(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(contactsActivity.currentAccount).getInviteText(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void X(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new nj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void c0(ContactsActivity contactsActivity) {
        float y10 = contactsActivity.f.getY() + contactsActivity.f.getPaddingTop();
        int i9 = 0;
        while (true) {
            if (i9 >= contactsActivity.f.getChildCount()) {
                break;
            }
            View childAt = contactsActivity.f.getChildAt(i9);
            contactsActivity.f.getClass();
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                f2.y0 X = contactsActivity.f.X(i9);
                Rect rect = AndroidUtilities.rectTmp2;
                org.telegram.ui.Components.wk0 wk0Var = contactsActivity.f;
                X.a(rect, childAt, wk0Var, wk0Var.p0);
                y10 = contactsActivity.f.getY() + (childAt.getY() - (contactsActivity.d.G ? 0 : rect.top));
            } else {
                if (R > 0) {
                    y10 = -AndroidUtilities.dp(52.0f);
                    break;
                }
                i9++;
            }
        }
        contactsActivity.V.setTranslationY(AndroidUtilities.lerp(y10, contactsActivity.f.getY() + contactsActivity.f.getPaddingTop(), contactsActivity.c.e) - AndroidUtilities.dp(48.0f));
        contactsActivity.b.a(y10 > (contactsActivity.f.getY() + ((float) contactsActivity.f.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public static void d0(ContactsActivity contactsActivity) {
        qs qsVar;
        org.telegram.ui.Components.j10 j10Var = contactsActivity.w;
        if (j10Var == null || (qsVar = contactsActivity.d) == null) {
            return;
        }
        j10Var.e((!contactsActivity.x || contactsActivity.B || qsVar.E) ? false : true, true);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            j0();
        } else if (i9 == 2) {
            j0();
            l0();
        }
    }

    @Override // xg.d
    public final View M() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.mg0
    public final boolean R(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.wk0 wk0Var = this.f;
        return wk0Var == null || wk0Var.getFastScroll() == null || !this.f.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9;
        final int i10 = 0;
        this.B = false;
        this.A = false;
        final int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (!this.F) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        } else if (this.G) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(this.H ? R.string.NewSecretChat : R.string.NewMessageTitle));
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.d0 = h2Var;
        if (!this.E) {
            this.actionBar.setBackButtonDrawable(h2Var);
        }
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider);
        this.V = m10Var;
        m10Var.w = true;
        m10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        m10Var.d();
        this.V.setPivotY(0.0f);
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.E) {
            ImageView imageView = new ImageView(context);
            this.a0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.a0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.a0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.MULTIPLY));
            this.a0.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.z8), 1, -1));
            this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ms
                public final /* synthetic */ ContactsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.n0();
                            break;
                        default:
                            ContactsActivity.X(this.b);
                            break;
                    }
                }
            });
            j10.addView(this.a0, g7.e6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.b0 = numberTextView;
        numberTextView.setTextSize(18);
        this.b0.setTypeface(AndroidUtilities.bold());
        this.b0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y8));
        j10.addView(this.b0, g7.e6.m(1.0f, 0, -1, this.E ? 18 : 72, 0, 0));
        int i12 = 2;
        this.b0.setOnTouchListener(new jh.d(i12));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new os(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.c0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        fg.g gVar = this.V.r;
        gVar.addTextChangedListener(new ff.o0(gVar, new cb(this, 6)));
        if (!this.H && !this.G) {
            org.telegram.ui.ActionBar.w0 a3 = n10.a(1, this.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.s = a3;
            a3.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f = new org.telegram.ui.Components.wk0(context, null);
        this.r = new ps(this, context, this.Z, this.R, this.K, this.J);
        int i13 = 3;
        if (this.P != 0) {
            i9 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.P)), 3) ? 1 : 0;
        } else {
            if (this.O != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i9 = 2;
                }
            }
            i9 = 0;
        }
        qs qsVar = new qs(this, context, this.C ? 1 : 0, this.D, this.Z, i9);
        this.d = qsVar;
        if (this.s == null) {
            i12 = 0;
        } else if (this.v) {
            i12 = 1;
        }
        qsVar.Y(i12, false);
        this.d.D = this.Y;
        fh.x4 x4Var = new fh.x4(this, context, 4);
        this.y = x4Var;
        this.fragmentView = x4Var;
        org.telegram.ui.Components.wk0 wk0Var = this.f;
        Objects.requireNonNull(wk0Var);
        this.s0 = new ig.k(wk0Var, x4Var, new ns(wk0Var, i10));
        this.f.C0(new ks(this, i11));
        this.f.setSections(true);
        this.y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(29);
        e00Var.w = false;
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 1, null);
        this.e = gw0Var;
        gw0Var.addView(e00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.y.addView(this.e, g7.e6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.n(150L);
        nVar.m = false;
        this.f.setItemAnimator(nVar);
        this.f.setSectionsType(1);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setFastScrollEnabled(0);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f;
        f2.m0 m0Var = new f2.m0(1, false);
        this.n = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        this.f.setAdapter(this.d);
        this.f.setClipToPadding(false);
        c2.y yVar = new c2.y(this.f, this.n);
        this.h = yVar;
        yVar.h = new ls(this);
        fh.x4 x4Var2 = this.y;
        org.telegram.ui.Components.wk0 wk0Var3 = this.f;
        float f10 = -this.a;
        x4Var2.addView(wk0Var3, g7.e6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.y.addView(this.V, g7.e6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f.setEmptyView(this.e);
        org.telegram.ui.Components.wk0 wk0Var4 = this.f;
        wk0Var4.U1 = true;
        wk0Var4.V1 = 0;
        wk0Var4.setOnItemClickListener(new bg.x2(this, i9, 8));
        this.f.setOnItemLongClickListener(new ls(this));
        this.f.setOnScrollListener(new rs(this));
        if (!this.H && !this.G) {
            org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
            this.w = j10Var;
            this.y.addView(j10Var, org.telegram.ui.Components.j10.b());
            this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ms
                public final /* synthetic */ ContactsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.n0();
                            break;
                        default:
                            ContactsActivity.X(this.b);
                            break;
                    }
                }
            });
            this.w.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.w.c.getAnimatedDrawable().K(this.w.c.getAnimatedDrawable().e[0] - 1);
            this.w.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.T;
        if (str != null) {
            this.actionBar.x(str);
            this.T = null;
        }
        this.y.addView(this.actionBar);
        kh.h6 h6Var = new kh.h6(context, this.parentLayout);
        this.U = h6Var;
        h6Var.b(false, false);
        this.y.addView(this.U, g7.e6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f);
        this.actionBar.setDrawBlurBackground(this.y);
        this.b.a(true, false);
        k0();
        setBulletinDelegate(new x8(this, i13));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.c1.d.add(this);
        }
        View view = this.fragmentView;
        ls lsVar = new ls(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, lsVar);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        if (i9 == NotificationCenter.contactsDidLoad) {
            qs qsVar = this.d;
            if (qsVar != null) {
                if (!this.v) {
                    qsVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.r != null) {
                f2.r0 adapter = this.f.getAdapter();
                ps psVar = this.r;
                if (adapter == psVar) {
                    psVar.G(this.e0);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.updateInterfaces) {
            if (i9 != NotificationCenter.encryptedChatCreated) {
                if (i9 != NotificationCenter.closeChats || this.I) {
                    return;
                }
                removeSelfFromStack(true);
                return;
            }
            if (this.H && this.I) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new qn(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (wk0Var = this.f) != null) {
            int childCount = wk0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.va) {
                    ((org.telegram.ui.Cells.va) childAt).j(intValue);
                }
            }
        }
        if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.v || this.d == null || this.h0) {
            return;
        }
        this.h0 = true;
        v5 v5Var = this.i0;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        AndroidUtilities.runOnUIThread(v5Var, 5000L);
    }

    public final void e0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z10 && this.X) {
            showDialog(org.telegram.ui.Components.y4.w(parentActivity, new js(this, 1)).a);
            return;
        }
        this.g0 = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void f0() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.p0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.m0) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.u0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.v0;
        rectF.set(0.0f, dp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.E ? 2 : 1, this.t0);
        eVar.e(this.s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void g0() {
        org.telegram.ui.Components.gw0 gw0Var = this.e;
        if (gw0Var != null) {
            gw0Var.b(Math.max(this.m0 + this.j0, this.n0), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 12);
        if (!this.E) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.n7));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 262148, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 262148, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        org.telegram.ui.Components.j10 j10Var = this.w;
        if (j10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(j10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.w.c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.w.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i1}, null, org.telegram.ui.ActionBar.f6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f1}, null, org.telegram.ui.ActionBar.f6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.f6.Q0, null, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, org.telegram.ui.ActionBar.f6.P0, null, null, org.telegram.ui.ActionBar.f6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.j10 j10Var = this.w;
        if (j10Var != null) {
            j10Var.setTranslationY(((-this.m0) - this.k0) - this.l0);
        }
    }

    public final void i0() {
        this.f.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r1 + 44), 0, AndroidUtilities.dp(this.a) + this.m0 + this.j0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.j10.d(this.c0, (1.0f - this.c.e) * (1.0f - this.b.e));
    }

    @Override // xg.d
    public final void k(r0.m1 m1Var) {
        this.n0 = m1Var.a.f(8).d;
        g0();
    }

    public final void k0() {
        qs qsVar = this.d;
        boolean z10 = qsVar != null && qsVar.E;
        if (this.o0 != z10 || TextUtils.isEmpty(this.V.r.getHint())) {
            this.V.r.setHint(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.V.r.setContentDescription(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.o0 = z10;
        }
    }

    public final void l0() {
        float f10 = 1.0f - this.c.e;
        qs qsVar = this.d;
        org.telegram.ui.Components.j10.d(this.s, f10 * ((qsVar == null || qsVar.E) ? 0.0f : 1.0f));
    }

    public final void m0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z10 || this.Q == null) {
            ts tsVar = this.S;
            if (tsVar != null) {
                tsVar.b(user);
                if (this.N) {
                    this.S = null;
                }
            }
            if (this.M) {
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
                    org.telegram.ui.Components.oc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            if (this.O != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                if (canAddAdmins) {
                    c2Var.N = LocaleController.getString(R.string.AddBotAdminAlert);
                    c2Var.P = LocaleController.getString(R.string.AddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new yr(this, user, str));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    c2Var.P = LocaleController.getString(R.string.CantAddBotAsAdmin);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                }
                showDialog(c2Var);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
        c2Var2.N = string;
        String formatStringSimple = LocaleController.formatStringSimple(this.Q, UserObject.getUserName(user));
        if (user.bot || !this.L) {
            editTextBoldCursor = null;
        } else {
            formatStringSimple = aa.d.z(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.j5));
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.f6.S(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new ss(editTextBoldCursor));
            alertDialog$Builder2.n(editTextBoldCursor);
        }
        c2Var2.P = formatStringSimple;
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new a7(this, user, editTextBoldCursor, 11));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var2);
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

    public final void n0() {
        this.actionBar.r();
        int childCount = this.f.getChildCount();
        int i9 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i9 >= childCount) {
                hVar.b();
                this.d0.c(0.0f, true);
                return;
            }
            View childAt = this.f.getChildAt(i9);
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
            i9++;
        }
    }

    public final void o0(b5.e eVar) {
        this.S = eVar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                n0();
                return false;
            }
        } else {
            if (!this.c.f) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.V.r.getText().clear();
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.f0 || Build.VERSION.SDK_INT < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.f0 = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                e0(true);
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.w(parentActivity, new js(this, 0)).a;
            this.W = c2Var;
            showDialog(c2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.c2 c2Var = this.W;
        if (c2Var == null || dialog != c2Var || getParentActivity() == null || !this.X) {
            return;
        }
        e0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.f0 = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.C = bundle.getBoolean("onlyUsers", false);
            this.F = this.arguments.getBoolean("destroyAfterSelect", false);
            this.G = this.arguments.getBoolean("returnAsResult", false);
            this.H = this.arguments.getBoolean("createSecretChat", false);
            this.Q = this.arguments.getString("selectAlertString");
            this.R = this.arguments.getBoolean("allowUsernameSearch", true);
            this.L = this.arguments.getBoolean("needForwardCount", true);
            this.K = this.arguments.getBoolean("allowBots", true);
            this.J = this.arguments.getBoolean("allowSelf", true);
            this.O = this.arguments.getLong("channelId", 0L);
            this.M = this.arguments.getBoolean("needFinishFragment", true);
            this.P = this.arguments.getLong("chat_id", 0L);
            this.Y = this.arguments.getBoolean("disableSections", false);
            this.N = this.arguments.getBoolean("resetDelegate", false);
            this.D = this.arguments.getBoolean("needPhonebook", false);
            this.E = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.D = true;
        }
        if (!this.H && !this.G) {
            this.v = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        this.j0 = this.E ? AndroidUtilities.dp(72.0f) : 0;
        this.k0 = this.E ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.S = null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.m0 = i12;
        i0();
        h0();
        g0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (i9 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10 && "android.permission.READ_CONTACTS".equals(strArr[i10])) {
                    if (iArr[i10] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.X = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.g0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        qs qsVar = this.d;
        if (qsVar != null) {
            qsVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(String str) {
        this.T = str;
    }

    public final void q0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.va;
        boolean z12 = false;
        a0.h hVar = this.Z;
        if (z11) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) viewGroup;
            long dialogId = vaVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                vaVar.c(false, true);
            } else if (vaVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) vaVar.getCurrentObject(), dialogId);
                vaVar.c(true, true);
                z10 = true;
            }
            z10 = false;
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
                z10 = true;
            }
            z10 = false;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                n0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.N(null, null);
            this.d0.c(1.0f, true);
        }
        this.b0.a(hVar.m(), z12);
    }

    @Override // org.telegram.ui.mg0
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

    @Override // org.telegram.ui.mg0
    public final ng.d y() {
        return this.r0;
    }

    @Override // xg.d
    public final /* synthetic */ void K() {
    }

    @Override // xg.d
    public final /* synthetic */ void t() {
    }

    @Override // td.b
    public final void B(float f10, int i9) {
    }
}
