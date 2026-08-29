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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.o2 implements vd.b, NotificationCenter.NotificationCenterDelegate, mg0, ah.d {
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
    public ss S;
    public String T;
    public cg.i0 U;
    public org.telegram.ui.Components.x10 V;
    public org.telegram.ui.ActionBar.c2 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final int a;
    public ImageView a0;
    public final vd.a b;
    public NumberTextView b0;
    public final vd.a c;
    public org.telegram.ui.ActionBar.w0 c0;
    public ps d;
    public org.telegram.ui.ActionBar.h2 d0;
    public org.telegram.ui.Components.qw0 e;
    public String e0;
    public org.telegram.ui.Components.jl0 f;
    public boolean f0;
    public long g0;
    public c2.z h;
    public boolean h0;
    public final w5 i0;
    public int j0;
    public int k0;
    public float l0;
    public int m0;
    public f2.j0 n;
    public int n0;
    public boolean o0;
    public final lg.e p0;
    public int phonebookRow;
    public final qg.d q0;
    public os r;
    public final qg.d r0;
    public org.telegram.ui.ActionBar.w0 s;
    public lg.k s0;
    public final ArrayList t0;
    public final RectF u0;
    public boolean v;
    public final RectF v0;
    public org.telegram.ui.Components.u10 w;
    public boolean x;
    public ih.j4 y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.b = new vd.a(0, this, jrVar, 350L, false);
        this.c = new vd.a(2, this, jrVar, 350L, false);
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
        this.i0 = new w5(this, 2);
        ArrayList arrayList = new ArrayList();
        this.t0 = arrayList;
        RectF rectF = new RectF();
        this.u0 = rectF;
        RectF rectF2 = new RectF();
        this.v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i10 >= 31) {
            this.p0 = new lg.e(false);
            this.q0 = new qg.d(null);
            this.r0 = new qg.d(null);
        } else {
            this.p0 = null;
            this.q0 = null;
            this.r0 = null;
        }
    }

    public static void U(ContactsActivity contactsActivity, int i10, View view, int i11) {
        a0.h hVar = contactsActivity.Z;
        f2.p0 adapter = contactsActivity.f.getAdapter();
        os osVar = contactsActivity.r;
        if (adapter == osVar) {
            osVar.getClass();
            Object E = contactsActivity.r.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.f6)) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                if (f6Var.getUser() == null || !f6Var.getUser().contact) {
                    return;
                }
                contactsActivity.r0(f6Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof ContactsController.Contact) {
                        ContactsController.Contact contact = (ContactsController.Contact) E;
                        org.telegram.ui.Components.c5.v(contactsActivity, contact.first_name, contact.last_name, contact.phones.get(0));
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
                kj0 kj0Var = new kj0(contactsActivity.getParentActivity(), contactsActivity);
                kj0Var.v(str, true);
                kj0Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            os osVar2 = contactsActivity.r;
            int size = osVar2.d.size();
            int size2 = osVar2.D.size();
            rf.k1 k1Var = osVar2.f;
            int size3 = k1Var.e.size();
            int size4 = k1Var.j.size();
            if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                contactsActivity.getMessagesController().putUsers(arrayList, false);
                MessagesStorage.getInstance(contactsActivity.currentAccount).putUsersAndChats(arrayList, null, false, true);
            }
            if (contactsActivity.G) {
                contactsActivity.n0(user, true, null);
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
                contactsActivity.presentFragment(new tn(bundle), contactsActivity.M);
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
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.mq)) {
            org.telegram.ui.Components.u10 u10Var = contactsActivity.w;
            if (u10Var != null) {
                u10Var.performClick();
                return;
            }
            return;
        }
        if (!hVar.i() && (view instanceof org.telegram.ui.Cells.sa)) {
            contactsActivity.r0((org.telegram.ui.Cells.sa) view);
            return;
        }
        if ((contactsActivity.C && i10 == 0) || S != 0) {
            Object O = contactsActivity.d.O(contactsActivity.d.S(i11), contactsActivity.d.Q(i11));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (contactsActivity.G) {
                    contactsActivity.n0(user2, true, null);
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
                    contactsActivity.presentFragment(new tn(bundle2), contactsActivity.M);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new xr(1, contactsActivity, str2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                contactsActivity.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (contactsActivity.D) {
            if (Q != 0) {
                if (Q == 1) {
                    contactsActivity.presentFragment(new h9(null));
                    return;
                }
                return;
            } else if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                c.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new s70());
                return;
            }
        }
        if (i10 != 0) {
            if (Q == 0) {
                if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                    c.b(contactsActivity.currentAccount);
                    return;
                }
                long j10 = contactsActivity.P;
                if (j10 == 0) {
                    j10 = contactsActivity.O;
                }
                v60 v60Var = new v60(null);
                v60Var.d = j10;
                contactsActivity.presentFragment(v60Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
                c.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new m60(new Bundle()), false);
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
                contactsActivity.presentFragment(new hd(a4.w.h(0, "step")));
            } else {
                contactsActivity.presentFragment(new i(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            }
        }
    }

    public static void V(ContactsActivity contactsActivity) {
        org.telegram.ui.Components.jl0 jl0Var = contactsActivity.f;
        if (jl0Var != null) {
            int childCount = jl0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = contactsActivity.f.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.sa) {
                    ((org.telegram.ui.Cells.sa) childAt).j(0);
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    ((org.telegram.ui.Cells.f6) childAt).u(0);
                }
            }
        }
        ImageView imageView = contactsActivity.a0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            contactsActivity.a0.setBackground(org.telegram.ui.ActionBar.g6.f0(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
        }
        org.telegram.ui.ActionBar.l lVar = contactsActivity.actionBar;
        if (lVar != null) {
            lVar.e();
        }
        ih.j4 j4Var = contactsActivity.y;
        if (j4Var != null) {
            j4Var.setBackgroundColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        }
    }

    public static /* synthetic */ void W(ContactsActivity contactsActivity, int i10) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(contactsActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        contactsActivity.X = i10 != 0;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void Y(ContactsActivity contactsActivity) {
        if (MessagesController.getInstance(contactsActivity.currentAccount).isFrozen()) {
            c.b(contactsActivity.currentAccount);
        } else {
            new kj0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void d0(ContactsActivity contactsActivity) {
        float y8 = contactsActivity.f.getY() + contactsActivity.f.getPaddingTop();
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
                org.telegram.ui.Components.jl0 jl0Var = contactsActivity.f;
                X.a(rect, childAt, jl0Var, jl0Var.p0);
                y8 = contactsActivity.f.getY() + (childAt.getY() - (contactsActivity.d.G ? 0 : rect.top));
            } else {
                if (R > 0) {
                    y8 = -AndroidUtilities.dp(52.0f);
                    break;
                }
                i10++;
            }
        }
        contactsActivity.V.setTranslationY(AndroidUtilities.lerp(y8, contactsActivity.f.getY() + contactsActivity.f.getPaddingTop(), contactsActivity.c.e) - AndroidUtilities.dp(48.0f));
        contactsActivity.b.a(y8 > (contactsActivity.f.getY() + ((float) contactsActivity.f.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public static void e0(ContactsActivity contactsActivity) {
        ps psVar;
        org.telegram.ui.Components.u10 u10Var = contactsActivity.w;
        if (u10Var == null || (psVar = contactsActivity.d) == null) {
            return;
        }
        u10Var.e((!contactsActivity.x || contactsActivity.B || psVar.E) ? false : true, true);
    }

    @Override // ah.d
    public final View M() {
        return this.fragmentView;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            k0();
        } else if (i10 == 2) {
            k0();
            m0();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.mg0
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.jl0 jl0Var = this.f;
        return jl0Var == null || jl0Var.getFastScroll() == null || !this.f.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
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
        int i10;
        final int i11 = 0;
        this.B = false;
        this.A = false;
        final int i12 = 1;
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
        org.telegram.ui.Components.x10 x10Var = new org.telegram.ui.Components.x10(context, this.resourceProvider);
        this.V = x10Var;
        x10Var.w = true;
        x10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        x10Var.e();
        this.V.setPivotY(0.0f);
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
        j10.setBackgroundColor(0);
        if (this.E) {
            ImageView imageView = new ImageView(context);
            this.a0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.a0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.a0.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            this.a0.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.z8), 1, -1));
            this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ls
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
            j10.addView(this.a0, i7.f6.q(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.b0 = numberTextView;
        numberTextView.setTextSize(18);
        this.b0.setTypeface(AndroidUtilities.bold());
        this.b0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y8));
        j10.addView(this.b0, i7.f6.m(1.0f, 0, -1, this.E ? 18 : 72, 0, 0));
        int i13 = 2;
        this.b0.setOnTouchListener(new mh.d(i13));
        j10.h(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ns(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        this.c0 = a2;
        a2.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        ig.f fVar = this.V.r;
        fVar.addTextChangedListener(new jf.n0(fVar, new bb(this, 6)));
        if (!this.H && !this.G) {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(1, this.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.s = a10;
            a10.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.f = new org.telegram.ui.Components.jl0(context, null);
        this.r = new os(this, context, this.Z, this.R, this.K, this.J);
        int i14 = 3;
        if (this.P != 0) {
            i10 = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.P)), 3) ? 1 : 0;
        } else {
            if (this.O != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.O));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        ps psVar = new ps(this, context, this.C ? 1 : 0, this.D, this.Z, i10);
        this.d = psVar;
        if (this.s == null) {
            i13 = 0;
        } else if (this.v) {
            i13 = 1;
        }
        psVar.Y(i13, false);
        this.d.D = this.Y;
        ih.j4 j4Var = new ih.j4(this, context, 4);
        this.y = j4Var;
        this.fragmentView = j4Var;
        org.telegram.ui.Components.jl0 jl0Var = this.f;
        Objects.requireNonNull(jl0Var);
        this.s0 = new lg.k(jl0Var, j4Var, new ms(jl0Var, i11));
        this.f.C0(new js(this, i12));
        this.f.setSections(true);
        this.y.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        p00Var.setViewType(29);
        p00Var.w = false;
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, p00Var, 1, null);
        this.e = qw0Var;
        qw0Var.addView(p00Var, 0);
        this.e.setAnimateLayoutChange(true);
        this.e.e(true, false);
        this.e.d.setText(LocaleController.getString(R.string.NoResult));
        this.e.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.y.addView(this.e, i7.f6.d(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.n(150L);
        lVar.m = false;
        this.f.setItemAnimator(lVar);
        this.f.setSectionsType(1);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setFastScrollEnabled(0);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f;
        f2.j0 j0Var = new f2.j0(1, false);
        this.n = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        this.f.setAdapter(this.d);
        this.f.setClipToPadding(false);
        c2.z zVar = new c2.z(this.f, this.n);
        this.h = zVar;
        zVar.h = new ks(this);
        ih.j4 j4Var2 = this.y;
        org.telegram.ui.Components.jl0 jl0Var3 = this.f;
        float f9 = -this.a;
        j4Var2.addView(jl0Var3, i7.f6.d(-1, -1.0f, 3, 0.0f, f9, 0.0f, f9));
        this.y.addView(this.V, i7.f6.d(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.f.setEmptyView(this.e);
        org.telegram.ui.Components.jl0 jl0Var4 = this.f;
        jl0Var4.U1 = true;
        jl0Var4.V1 = 0;
        jl0Var4.setOnItemClickListener(new eg.n2(this, i10, 8));
        this.f.setOnItemLongClickListener(new ks(this));
        this.f.setOnScrollListener(new qs(this));
        if (!this.H && !this.G) {
            org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
            this.w = u10Var;
            this.y.addView(u10Var, org.telegram.ui.Components.u10.b());
            this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ls
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
        String str = this.T;
        if (str != null) {
            this.actionBar.x(str);
            this.T = null;
        }
        this.y.addView(this.actionBar);
        cg.i0 i0Var = new cg.i0(context, this.parentLayout);
        this.U = i0Var;
        i0Var.b(false, false);
        this.y.addView(this.U, i7.f6.e(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.f);
        this.actionBar.setDrawBlurBackground(this.y);
        this.b.a(true, false);
        l0();
        setBulletinDelegate(new w8(this, i14));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.c1.d.add(this);
        }
        View view = this.fragmentView;
        ks ksVar = new ks(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, ksVar);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.jl0 jl0Var;
        if (i10 == NotificationCenter.contactsDidLoad) {
            ps psVar = this.d;
            if (psVar != null) {
                if (!this.v) {
                    psVar.Y(2, true);
                }
                this.d.l();
            }
            if (this.r != null) {
                f2.p0 adapter = this.f.getAdapter();
                os osVar = this.r;
                if (adapter == osVar) {
                    osVar.G(this.e0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 != NotificationCenter.encryptedChatCreated) {
                if (i10 != NotificationCenter.closeChats || this.I) {
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
                presentFragment(new tn(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) && (jl0Var = this.f) != null) {
            int childCount = jl0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.sa) {
                    ((org.telegram.ui.Cells.sa) childAt).j(intValue);
                }
            }
        }
        if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.v || this.d == null || this.h0) {
            return;
        }
        this.h0 = true;
        w5 w5Var = this.i0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        AndroidUtilities.runOnUIThread(w5Var, 5000L);
    }

    public final void f0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z10 && this.X) {
            showDialog(org.telegram.ui.Components.c5.w(parentActivity, new is(this, 1)).a);
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

    public final void g0() {
        lg.e eVar;
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

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 12);
        if (!this.E) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.n7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 262148, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
        org.telegram.ui.Components.u10 u10Var = this.w;
        if (u10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(u10Var.c, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.w.c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.w.c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 16, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f1}, null, org.telegram.ui.ActionBar.g6.z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.qw0 qw0Var = this.e;
        if (qw0Var != null) {
            qw0Var.b(Math.max(this.m0 + this.j0, this.n0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.u10 u10Var = this.w;
        if (u10Var != null) {
            u10Var.setTranslationY(((-this.m0) - this.k0) - this.l0);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.f.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r1 + 44), 0, AndroidUtilities.dp(this.a) + this.m0 + this.j0);
    }

    @Override // ah.d
    public final void k(r0.m1 m1Var) {
        this.n0 = m1Var.a.f(8).d;
        h0();
    }

    public final void k0() {
        org.telegram.ui.Components.u10.d(this.c0, (1.0f - this.c.e) * (1.0f - this.b.e));
    }

    public final void l0() {
        ps psVar = this.d;
        boolean z10 = psVar != null && psVar.E;
        if (this.o0 != z10 || TextUtils.isEmpty(this.V.r.getHint())) {
            this.V.r.setHint(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.V.r.setContentDescription(LocaleController.getString(z10 ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.o0 = z10;
        }
    }

    public final void m0() {
        float f9 = 1.0f - this.c.e;
        ps psVar = this.d;
        org.telegram.ui.Components.u10.d(this.s, f9 * ((psVar == null || psVar.E) ? 0.0f : 1.0f));
    }

    public final void n0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z10 || this.Q == null) {
            ss ssVar = this.S;
            if (ssVar != null) {
                ssVar.d(user);
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
                    org.telegram.ui.Components.tc.a0(this).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
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
                    alertDialog$Builder.k(LocaleController.getString(R.string.AddAsAdmin), new xr(this, user, str));
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
            formatStringSimple = a4.w.y(formatStringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.g6.S(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new rs(editTextBoldCursor));
            alertDialog$Builder2.n(editTextBoldCursor);
        }
        c2Var2.P = formatStringSimple;
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new z6(this, user, editTextBoldCursor, 11));
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

    public final void o0() {
        this.actionBar.r();
        int childCount = this.f.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i10 >= childCount) {
                hVar.b();
                this.d0.c(0.0f, true);
                return;
            }
            View childAt = this.f.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.sa) {
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) childAt;
                if (hVar.h(saVar.getDialogId()) >= 0) {
                    saVar.c(false, true);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                if (hVar.h(f6Var.getDialogId()) >= 0) {
                    f6Var.s(false, true);
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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
                f0(true);
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.w(parentActivity, new is(this, 0)).a;
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
        f0(false);
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.m0 = i13;
        j0();
        i0();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
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
        ps psVar = this.d;
        if (psVar != null) {
            psVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void p0(com.google.firebase.messaging.i iVar) {
        this.S = iVar;
    }

    public final void q0(String str) {
        this.T = str;
    }

    public final void r0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.sa;
        boolean z12 = false;
        a0.h hVar = this.Z;
        if (z11) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) viewGroup;
            long dialogId = saVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                saVar.c(false, true);
            } else if (saVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) saVar.getCurrentObject(), dialogId);
                saVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            if (!(viewGroup instanceof org.telegram.ui.Cells.f6)) {
                return;
            }
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) viewGroup;
            long dialogId2 = f6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                f6Var.s(false, true);
            } else if (f6Var.getUser() != null) {
                hVar.k(f6Var.getUser(), dialogId2);
                f6Var.s(true, true);
                z10 = true;
            }
            z10 = false;
        }
        if (this.actionBar.s()) {
            if (hVar.i()) {
                o0();
                return;
            }
            z12 = true;
        } else if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.O(null, null);
            this.d0.c(1.0f, true);
        }
        this.b0.a(hVar.m(), z12);
    }

    @Override // org.telegram.ui.mg0
    public final void s() {
        if (this.n.L0() < 15) {
            this.f.x0(0);
        } else {
            c2.z zVar = this.h;
            zVar.b = 1;
            zVar.c(0, 0, false, false);
        }
        this.b.a(true, true);
    }

    @Override // org.telegram.ui.mg0
    public final qg.d y() {
        return this.r0;
    }

    @Override // ah.d
    public final /* synthetic */ void I() {
    }

    @Override // ah.d
    public final /* synthetic */ void t() {
    }

    @Override // vd.b
    public final void z(float f9, int i10) {
    }
}
