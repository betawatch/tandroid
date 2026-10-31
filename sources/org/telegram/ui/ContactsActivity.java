package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ContactsActivity extends org.telegram.ui.ActionBar.k2 implements fe.e, org.telegram.messenger.us, of0, hh.d {
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
    public boolean P;
    public long Q;
    public long R;
    public String S;
    public boolean T;
    public vs U;
    public String V;
    public org.telegram.ui.ActionBar.x1 W;
    public boolean X;
    public boolean Y;
    public final a0.h Z;
    public final fe.f a;
    public org.telegram.ui.ActionBar.p5 a0;
    public ss b;
    public String b0;
    public org.telegram.ui.Components.dw0 c;
    public boolean c0;
    public org.telegram.ui.Components.tk0 d;
    public long d0;
    public org.telegram.ui.Components.vj0 e;
    public ViewPropertyAnimator e0;
    public s4.a0 f;
    public boolean f0;
    public final m4 g0;
    public rs h;
    public int h0;
    public int i0;
    public float j0;
    public int k0;
    public int l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.p5 n;
    public boolean n0;
    public int phonebookRow;
    public boolean r;
    public org.telegram.ui.Components.f10 s;
    public boolean w;
    public w8 x;
    public boolean y;

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.a = new fe.f(0, this, org.telegram.ui.Components.gr.h, 380L, 1.0f);
        this.phonebookRow = 0;
        this.w = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.S = null;
        this.T = true;
        this.X = true;
        this.Z = new a0.h();
        this.c0 = true;
        this.g0 = new m4(this, 3);
    }

    public static void Y(ContactsActivity contactsActivity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(contactsActivity.currentAccount).s(1));
            contactsActivity.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static /* synthetic */ void Z(ContactsActivity contactsActivity, int i10) {
        org.telegram.messenger.vp.e1().edit().putBoolean("askAboutContacts2", false).commit();
        org.telegram.messenger.zs.f(contactsActivity.currentAccount).k(org.telegram.messenger.zs.P5, new Object[0]);
        contactsActivity.X = i10 != 0;
        if (i10 == 0) {
            return;
        }
        contactsActivity.g0(false);
    }

    public static void a0(ContactsActivity contactsActivity) {
        if (org.telegram.messenger.vp.r1(contactsActivity.currentAccount).u2()) {
            b.b(contactsActivity.currentAccount);
        } else {
            new gi0(contactsActivity.getParentActivity(), contactsActivity).show();
        }
    }

    public static void b0(ContactsActivity contactsActivity, int i10, View view, int i11) {
        a0.h hVar = contactsActivity.Z;
        s4.g0 adapter = contactsActivity.d.getAdapter();
        rs rsVar = contactsActivity.h;
        if (adapter == rsVar) {
            rsVar.getClass();
            Object E = contactsActivity.h.E(i11);
            if (!hVar.i() && (view instanceof org.telegram.ui.Cells.k6)) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                if (k6Var.getUser() == null || !k6Var.getUser().contact) {
                    return;
                }
                contactsActivity.o0(k6Var);
                return;
            }
            if (!(E instanceof TLRPC.User)) {
                if (!(E instanceof String)) {
                    if (E instanceof org.telegram.messenger.f5) {
                        org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                        org.telegram.ui.Components.s4.u(contactsActivity, f5Var.i, f5Var.j, (String) f5Var.e.get(0));
                        return;
                    }
                    return;
                }
                String str = (String) E;
                if (str.equals("section")) {
                    return;
                }
                if (org.telegram.messenger.vp.r1(contactsActivity.currentAccount).u2()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                gi0 gi0Var = new gi0(contactsActivity.getParentActivity(), contactsActivity);
                gi0Var.N0(str, true);
                gi0Var.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) E;
            rs rsVar2 = contactsActivity.h;
            int size = rsVar2.d.size();
            int size2 = rsVar2.H.size();
            zf.m1 m1Var = rsVar2.f;
            int size3 = m1Var.e.size();
            int size4 = m1Var.j.size();
            if ((i11 < 0 || i11 >= size) && ((i11 <= size || i11 >= size + size2 + 1) && ((i11 <= size + size2 + 1 || i11 >= size + size4 + size2 + 1) && i11 > size + size4 + size2 + 1 && i11 <= size3 + size4 + size + size2 + 1))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                contactsActivity.getMessagesController().V3(arrayList, false);
                org.telegram.messenger.hs.a0(contactsActivity.currentAccount).m1(arrayList, null, false, true);
            }
            if (contactsActivity.I) {
                contactsActivity.k0(user, true, null);
                return;
            }
            if (contactsActivity.J) {
                if (user.id == org.telegram.messenger.d20.i(contactsActivity.currentAccount).e()) {
                    return;
                }
                contactsActivity.K = true;
                org.telegram.messenger.ow.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            if (contactsActivity.getMessagesController().E(bundle, contactsActivity, null, null)) {
                contactsActivity.presentFragment(new un(bundle), contactsActivity.O);
                return;
            }
            return;
        }
        contactsActivity.b.getClass();
        int S = contactsActivity.b.S(i11);
        int Q = contactsActivity.b.Q(i11);
        if (Q < 0 || S < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof org.telegram.ui.Components.hq)) {
            org.telegram.ui.Components.f10 f10Var = contactsActivity.s;
            if (f10Var != null) {
                f10Var.performClick();
                return;
            }
            return;
        }
        if (!hVar.i() && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.o0((org.telegram.ui.Cells.pa) view);
            return;
        }
        if ((contactsActivity.E && i10 == 0) || S != 0) {
            Object O = contactsActivity.b.O(contactsActivity.b.S(i11), contactsActivity.b.Q(i11));
            if (O instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) O;
                if (contactsActivity.I) {
                    contactsActivity.k0(user2, true, null);
                    return;
                }
                if (contactsActivity.J) {
                    contactsActivity.K = true;
                    org.telegram.messenger.ow.i(contactsActivity.currentAccount).A(contactsActivity.getParentActivity(), user2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.id);
                if (contactsActivity.getMessagesController().E(bundle2, contactsActivity, null, null)) {
                    contactsActivity.presentFragment(new un(bundle2), contactsActivity.O);
                    return;
                }
                return;
            }
            if (O instanceof org.telegram.messenger.f5) {
                ArrayList arrayList2 = ((org.telegram.messenger.f5) O).e;
                String str2 = !arrayList2.isEmpty() ? (String) arrayList2.get(0) : null;
                if (str2 == null || contactsActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131749116, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.T = L0;
                x1Var.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new org.telegram.ui.Components.f2(27, contactsActivity, str2));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                contactsActivity.showDialog(x1Var);
                return;
            }
            return;
        }
        if (contactsActivity.F) {
            if (Q != 0) {
                if (Q == 1) {
                    contactsActivity.presentFragment(new j9(null));
                    return;
                }
                return;
            } else if (org.telegram.messenger.vp.r1(contactsActivity.currentAccount).u2()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new y60());
                return;
            }
        }
        if (i10 != 0) {
            if (Q == 0) {
                if (org.telegram.messenger.vp.r1(contactsActivity.currentAccount).u2()) {
                    b.b(contactsActivity.currentAccount);
                    return;
                }
                long j10 = contactsActivity.R;
                if (j10 == 0) {
                    j10 = contactsActivity.Q;
                }
                e60 e60Var = new e60(null);
                e60Var.d = j10;
                contactsActivity.presentFragment(e60Var);
                return;
            }
            return;
        }
        if (Q == 0) {
            if (org.telegram.messenger.vp.r1(contactsActivity.currentAccount).u2()) {
                b.b(contactsActivity.currentAccount);
                return;
            } else {
                contactsActivity.presentFragment(new v50(new Bundle()), false);
                return;
            }
        }
        if (Q == 1) {
            if (org.telegram.messenger.vp.r1(contactsActivity.currentAccount).u2()) {
                b.b(contactsActivity.currentAccount);
                return;
            }
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            boolean z10 = org.telegram.messenger.v2.a;
            contactsActivity.presentFragment(new f(0));
            d12.edit().putBoolean("channel_intro", true).commit();
        }
    }

    public static void f0(ContactsActivity contactsActivity) {
        ss ssVar;
        org.telegram.ui.Components.f10 f10Var = contactsActivity.s;
        if (f10Var == null || (ssVar = contactsActivity.b) == null) {
            return;
        }
        f10Var.e((!contactsActivity.w || contactsActivity.D || ssVar.I) ? false : true, true);
    }

    @Override // org.telegram.ui.of0
    public final hi.f B() {
        return getBaseSimpleGlass().h;
    }

    @Override // hh.d
    public final View R() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.of0
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.Components.tk0 tk0Var = this.d;
        return tk0Var == null || tk0Var.getFastScroll() == null || !this.d.getFastScroll().n;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10;
        this.D = false;
        this.y = false;
        if (!this.H) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751780, null));
        } else if (this.I) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745678, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(this.J ? 2131748280 : 2131748287, null));
        }
        if (!this.G) {
            this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        }
        this.simpleActionBar.l().d(100, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 12));
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, R.drawable.outline_header_search);
        this.a0 = b10;
        b10.setContentDescription(org.telegram.messenger.cd.L0(2131745829, null));
        org.telegram.ui.ActionBar.p5 p5Var = this.a0;
        p5Var.N();
        p5Var.B0 = new ag.l3(this, 8);
        if (!this.J && !this.I) {
            org.telegram.ui.ActionBar.p5 b11 = o10.b(1, this.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.n = b11;
            b11.setContentDescription(org.telegram.messenger.cd.L0(2131754891, null));
        }
        this.d = new org.telegram.ui.Components.tk0(context, null);
        this.h = new rs(this, context, this.Z, this.T, this.M, this.L);
        int i11 = 2;
        int i12 = 3;
        if (this.R != 0) {
            i10 = org.telegram.messenger.w3.y(3, getMessagesController().L0(Long.valueOf(this.R))) ? 1 : 0;
        } else {
            if (this.Q != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Q));
                if (org.telegram.messenger.w3.y(3, L0) && !org.telegram.messenger.w3.t0(L0)) {
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        ss ssVar = new ss(this, context, this.E ? 1 : 0, this.F, this.Z, i10);
        this.b = ssVar;
        if (this.n == null) {
            i11 = 0;
        } else if (this.r) {
            i11 = 1;
        }
        ssVar.Y(i11, false);
        ss ssVar2 = this.b;
        ssVar2.M = 17.0f;
        ssVar2.H = this.Y;
        w8 w8Var = new w8(this, context, i12);
        this.x = w8Var;
        this.fragmentView = w8Var;
        this.d.r1();
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, this.x, getResourceProvider());
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(29);
        zzVar.x = false;
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, zzVar, 1, null);
        this.c = dw0Var;
        dw0Var.addView(zzVar, 0);
        this.c.setAnimateLayoutChange(true);
        this.c.e(true, false);
        this.c.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.c.e.setText(org.telegram.messenger.cd.L0(2131745824, null));
        this.x.addView(this.c, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 12.0f, 12.0f, 12.0f, 0.0f));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.n(150L);
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.setSectionsType(1);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFastScrollEnabled(0);
        org.telegram.ui.Components.tk0 tk0Var = this.d;
        s4.a0 a0Var = new s4.a0(1, false);
        this.f = a0Var;
        tk0Var.setLayoutManager(a0Var);
        this.d.setAdapter(this.b);
        this.d.setClipToPadding(false);
        this.e = new org.telegram.ui.Components.vj0(this.d, this.f);
        this.x.addView(this.d, w7.b6.c(-1.0f, -1));
        this.d.setEmptyView(this.c);
        org.telegram.ui.Components.tk0 tk0Var2 = this.d;
        tk0Var2.W1 = true;
        tk0Var2.X1 = 0;
        tk0Var2.setOnItemClickListener(new i2.q(this, i10, 11));
        this.d.setOnItemLongClickListener(new qs(this));
        this.d.setOnScrollListener(new ts(this));
        if (!this.J && !this.I) {
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
            this.s = f10Var;
            this.x.addView(f10Var, org.telegram.ui.Components.f10.b());
            this.s.setOnClickListener(new a(this, 15));
            this.s.c.f(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.s.c.getAnimatedDrawable().M(this.s.c.getAnimatedDrawable().e[0] - 1);
            this.s.setContentDescription(org.telegram.messenger.cd.L0(2131751718, null));
        }
        String str = this.V;
        if (str != null) {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var.w(true, false)) {
                i5Var.setSearchFieldText(str);
            }
            this.V = null;
        }
        j0();
        setBulletinDelegate(new z8(this, i12));
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.add(this);
        }
        View view = this.fragmentView;
        qs qsVar = new qs(this);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(view, qsVar);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tk0 tk0Var;
        if (i10 == org.telegram.messenger.zs.O) {
            ss ssVar = this.b;
            if (ssVar != null) {
                if (!this.r) {
                    ssVar.Y(2, true);
                }
                this.b.f();
            }
            if (this.h != null) {
                s4.g0 adapter = this.d.getAdapter();
                rs rsVar = this.h;
                if (adapter == rsVar) {
                    rsVar.G(this.b0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.r) {
            int i12 = org.telegram.messenger.zs.a0;
            int i13 = org.telegram.messenger.zs.t;
            if (i10 != i12) {
                if (i10 != i13 || this.K) {
                    return;
                }
                removeSelfFromStack(true);
                return;
            }
            if (this.J && this.K) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                org.telegram.messenger.zs.f(this.currentAccount).k(i13, new Object[0]);
                presentFragment(new un(bundle), false);
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i14 = org.telegram.messenger.vp.D8;
        if (((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) && (tk0Var = this.d) != null) {
            int childCount = tk0Var.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = this.d.getChildAt(i15);
                if (childAt instanceof org.telegram.ui.Cells.pa) {
                    ((org.telegram.ui.Cells.pa) childAt).i(intValue);
                }
            }
        }
        int i16 = org.telegram.messenger.vp.D8;
        if ((intValue & 4) == 0 || this.r || this.b == null || this.f0) {
            return;
        }
        this.f0 = true;
        m4 m4Var = this.g0;
        org.telegram.messenger.i0.r(m4Var);
        org.telegram.messenger.i0.h3(m4Var, 5000L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return !this.G;
    }

    public final void g0(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !org.telegram.messenger.d20.i(this.currentAccount).U || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z10 && this.X) {
            showDialog(org.telegram.ui.Components.s4.v(parentActivity, new os(this, 1)).a);
            return;
        }
        this.d0 = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(6, this);
        if (!this.G) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 262148, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.o6));
        org.telegram.ui.Components.f10 f10Var = this.s;
        if (f10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(f10Var.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.s.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q9));
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.dw0 dw0Var = this.c;
        if (dw0Var != null) {
            dw0Var.b(Math.max(this.k0 + this.h0, this.l0), false);
        }
    }

    public final void i0() {
        org.telegram.ui.Components.f10 f10Var = this.s;
        if (f10Var != null) {
            f10Var.setTranslationY(((-this.k0) - this.i0) - this.j0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ss ssVar = this.b;
        boolean z10 = ssVar != null && ssVar.I;
        if (this.m0 == z10 && this.n0) {
            return;
        }
        this.a0.setSearchFieldHint(org.telegram.messenger.cd.L0(z10 ? 2131745751 : 2131745829, null));
        this.m0 = z10;
        this.n0 = true;
    }

    public final void k0(TLRPC.User user, boolean z10, String str) {
        EditTextBoldCursor editTextBoldCursor;
        if (!z10 || this.S == null) {
            vs vsVar = this.U;
            if (vsVar != null) {
                vsVar.c(user);
                if (this.P) {
                    this.U = null;
                }
            }
            if (this.O) {
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
                    org.telegram.ui.Components.cc.a0(this).t(org.telegram.messenger.cd.L0(2131753108, null), null).j();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            if (this.Q != 0) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Q));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean w9 = org.telegram.messenger.w3.w(4, L0);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                if (w9) {
                    x1Var.R = org.telegram.messenger.cd.L0(2131754461, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131754460, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754466, null), new org.telegram.ui.Components.f2(this, user, str));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                } else {
                    x1Var.T = org.telegram.messenger.cd.L0(2131752566, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                }
                showDialog(x1Var);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String L02 = org.telegram.messenger.cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
        x1Var2.R = L02;
        String b02 = org.telegram.messenger.cd.b0(this.S, org.telegram.messenger.h20.p(user));
        if (user.bot || !this.N) {
            editTextBoldCursor = null;
        } else {
            b02 = a1.g.C(b02, "\n\n", org.telegram.messenger.cd.L0(2131754365, null));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.j5, getResourceProvider());
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.t6.U(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new us(editTextBoldCursor));
            alertDialog$Builder2.o(editTextBoldCursor);
        }
        x1Var2.T = b02;
        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), new a7(this, user, editTextBoldCursor, 11));
        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var2);
        if (editTextBoldCursor != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
            if (marginLayoutParams != null) {
                if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                }
                int L = org.telegram.messenger.i0.L(24.0f);
                marginLayoutParams.leftMargin = L;
                marginLayoutParams.rightMargin = L;
                marginLayoutParams.height = org.telegram.messenger.i0.L(36.0f);
                editTextBoldCursor.setLayoutParams(marginLayoutParams);
            }
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        }
    }

    @Override // hh.d
    public final void l(r0.j1 j1Var) {
        this.l0 = j1Var.a.f(8).d;
        h0();
    }

    public final void l0() {
        this.simpleActionBar.r();
        int childCount = this.d.getChildCount();
        int i10 = 0;
        while (true) {
            a0.h hVar = this.Z;
            if (i10 >= childCount) {
                hVar.b();
                return;
            }
            View childAt = this.d.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.pa) {
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                if (hVar.h(paVar.getDialogId()) >= 0) {
                    paVar.c(false, true);
                }
            } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                if (hVar.h(k6Var.getDialogId()) >= 0) {
                    k6Var.y(false, true);
                }
            }
            i10++;
        }
    }

    public final void m0(ag.v0 v0Var) {
        this.U = v0Var;
    }

    public final void n0(String str) {
        this.V = str;
    }

    public final void o0(ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = viewGroup instanceof org.telegram.ui.Cells.pa;
        boolean z12 = true;
        a0.h hVar = this.Z;
        if (z11) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) viewGroup;
            long dialogId = paVar.getDialogId();
            if (hVar.h(dialogId) >= 0) {
                hVar.l(dialogId);
                paVar.c(false, true);
            } else if (paVar.getCurrentObject() instanceof TLRPC.User) {
                hVar.k((TLRPC.User) paVar.getCurrentObject(), dialogId);
                paVar.c(true, true);
                z10 = true;
            }
            z10 = false;
        } else {
            if (!(viewGroup instanceof org.telegram.ui.Cells.k6)) {
                return;
            }
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) viewGroup;
            long dialogId2 = k6Var.getDialogId();
            if (hVar.h(dialogId2) >= 0) {
                hVar.l(dialogId2);
                k6Var.y(false, true);
            } else if (k6Var.getUser() != null) {
                hVar.k(k6Var.getUser(), dialogId2);
                k6Var.y(true, true);
                z10 = true;
            }
            z10 = false;
        }
        if (!this.simpleActionBar.s()) {
            if (z10) {
                org.telegram.messenger.i0.v1(this.fragmentView.findFocus());
                this.simpleActionBar.y(hVar.m(), false);
                this.simpleActionBar.C();
            }
            z12 = false;
        } else if (hVar.i()) {
            l0();
            return;
        }
        this.simpleActionBar.y(hVar.m(), z12);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!this.simpleActionBar.s()) {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (!i5Var.F) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                i5Var.j(true);
            }
        } else if (z10) {
            l0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.c0 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.c0 = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                g0(true);
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(parentActivity, new os(this, 0)).a;
            this.W = x1Var;
            showDialog(x1Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        org.telegram.ui.ActionBar.x1 x1Var = this.W;
        if (x1Var == null || dialog != x1Var || getParentActivity() == null || !this.X) {
            return;
        }
        g0(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.O);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.a0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.t);
        this.c0 = org.telegram.messenger.d20.i(this.currentAccount).U;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.E = bundle.getBoolean("onlyUsers", false);
            this.H = this.arguments.getBoolean("destroyAfterSelect", false);
            this.I = this.arguments.getBoolean("returnAsResult", false);
            this.J = this.arguments.getBoolean("createSecretChat", false);
            this.S = this.arguments.getString("selectAlertString");
            this.T = this.arguments.getBoolean("allowUsernameSearch", true);
            this.N = this.arguments.getBoolean("needForwardCount", true);
            this.M = this.arguments.getBoolean("allowBots", true);
            this.L = this.arguments.getBoolean("allowSelf", true);
            this.Q = this.arguments.getLong("channelId", 0L);
            this.O = this.arguments.getBoolean("needFinishFragment", true);
            this.R = this.arguments.getLong("chat_id", 0L);
            this.Y = this.arguments.getBoolean("disableSections", false);
            this.P = this.arguments.getBoolean("resetDelegate", false);
            this.F = this.arguments.getBoolean("needPhonebook", false);
            this.G = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.F = true;
        }
        if (!this.J && !this.I) {
            this.r = org.telegram.messenger.tz.L0;
        }
        getContactsController().f();
        getContactsController().J(false);
        this.h0 = this.G ? org.telegram.messenger.i0.L(72.0f) : 0;
        this.i0 = this.G ? org.telegram.messenger.i0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.O);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.a0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.t);
        this.U = null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.k0 = i13;
        ei.b.e(this.d, i11, i13, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), this.h0);
        i0();
        h0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.j(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11 && "android.permission.READ_CONTACTS".equals(strArr[i11])) {
                    if (iArr[i11] == 0) {
                        org.telegram.messenger.i5.r(this.currentAccount).l();
                        return;
                    }
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.e1().edit();
                    this.X = false;
                    edit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
                    if (SystemClock.elapsedRealtime() - this.d0 < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", org.telegram.messenger.w0.b.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        ss ssVar = this.b;
        if (ssVar != null) {
            ssVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                org.telegram.ui.Components.tk0 tk0Var = this.d;
                if (tk0Var != null) {
                    tk0Var.x1();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.of0
    public final void u() {
        if (this.f.L0() < 15) {
            this.d.y0(0);
            return;
        }
        org.telegram.ui.Components.vj0 vj0Var = this.e;
        vj0Var.b = 1;
        vj0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ss ssVar = this.b;
            ArrayList arrayList = ssVar.N;
            ssVar.L = f7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Cells.u4) arrayList.get(i11)).setLetterProgress(f7);
            }
            this.d.invalidate();
        }
    }

    @Override // hh.d
    public final /* synthetic */ void P() {
    }

    @Override // hh.d
    public final /* synthetic */ void w() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
