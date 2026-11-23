package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ge0 extends org.telegram.ui.ActionBar.g2 {
    public l4 a;
    public org.telegram.ui.Components.ek0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(ge0 ge0Var, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3;
        t1Var.dismiss();
        if (((org.telegram.messenger.h0) org.telegram.messenger.np.u1(ge0Var.currentAccount).A7.p0.b).c) {
            org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(ge0Var.currentAccount);
            if (D.A() > 0) {
                TL_wallet.WalletState walletState = D.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !D.g()) {
                    j3 = D.A();
                    for (org.telegram.ui.Wallet.q0 q0Var : D.K) {
                        if (!q0Var.e && !q0Var.d) {
                            long j10 = q0Var.c;
                            if (j10 > 0) {
                                j3 += j10;
                            }
                        }
                    }
                }
            }
            j3 = 0;
            while (r10.hasNext()) {
            }
        } else {
            j3 = 0;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ge0Var.getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131748550, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
        t1Var2.S = N0;
        t1Var2.U = org.telegram.messenger.g0.W2(j3 > 0 ? org.telegram.messenger.hd.a0(null, null, 2131754078, org.telegram.ui.Wallet.u0.x(j3, false)) : org.telegram.messenger.hd.N0(2131754079, null));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131748550, null), new ee0(ge0Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void b0(ge0 ge0Var, int i7) {
        int i10 = 0;
        Integer num = null;
        if (i7 == ge0Var.c) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.k10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.k10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                ge0Var.presentFragment(new de0(num.intValue()));
                return;
            } else {
                if (org.telegram.messenger.k10.o()) {
                    return;
                }
                ge0Var.showDialog(new ug.k0(7, ge0Var.currentAccount, ge0Var.getParentActivity(), ge0Var, null));
                return;
            }
        }
        if (i7 == ge0Var.d) {
            ge0Var.presentFragment(PasscodeActivity.p0());
            return;
        }
        if (i7 == ge0Var.e) {
            ge0Var.presentFragment(new x6());
            return;
        }
        if (i7 == ge0Var.f) {
            ge0Var.presentFragment(new g(3));
            return;
        }
        if (i7 == ge0Var.h) {
            ge0Var.showDialog(org.telegram.ui.Components.c5.R(ge0Var, null));
            return;
        }
        if (i7 != ge0Var.r || ge0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ge0Var.getParentActivity(), null);
        t1Var.r(500L);
        int i12 = ge0Var.currentAccount;
        fe0 fe0Var = new fe0(i10, ge0Var, t1Var);
        org.telegram.ui.Wallet.u0[] u0VarArr = org.telegram.ui.Wallet.u0.R;
        if (((org.telegram.messenger.h0) org.telegram.messenger.np.u1(i12).A7.p0.b).c) {
            org.telegram.messenger.g0.g3(new jw0(i12, fe0Var, 4));
        } else {
            fe0Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748548, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 17));
        this.a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.b, c8.ma.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new ee0(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.a6.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (org.telegram.messenger.k10.c() < 4) {
            int i7 = this.w;
            this.w = i7 + 1;
            this.c = i7;
        } else {
            this.c = -1;
        }
        if (org.telegram.messenger.cz.s.length() <= 0) {
            int i10 = this.w;
            this.w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.w;
        this.e = i11;
        this.f = i11 + 1;
        this.h = i11 + 2;
        this.n = i11 + 3;
        this.r = i11 + 4;
        this.w = i11 + 6;
        this.s = i11 + 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
