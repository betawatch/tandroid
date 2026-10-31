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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jf0 extends org.telegram.ui.ActionBar.k2 {
    public fg.j a;
    public org.telegram.ui.Components.tk0 b;
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
    public static void Y(jf0 jf0Var, org.telegram.ui.ActionBar.x1 x1Var) {
        long j10;
        x1Var.dismiss();
        if (((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(jf0Var.currentAccount).y7.j0.b).c) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(jf0Var.currentAccount);
            if (x10.v() > 0) {
                TL_wallet.WalletState walletState = x10.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !x10.f()) {
                    j10 = x10.v();
                    for (org.telegram.ui.Wallet.g0 g0Var : x10.H) {
                        if (!g0Var.e && !g0Var.d) {
                            long j11 = g0Var.c;
                            if (j11 > 0) {
                                j10 += j11;
                            }
                        }
                    }
                }
            }
            j10 = 0;
            while (r10.hasNext()) {
            }
        } else {
            j10 = 0;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131748754, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
        x1Var2.R = L0;
        x1Var2.T = org.telegram.messenger.i0.W2(j10 > 0 ? org.telegram.messenger.cd.a0(null, null, 2131754081, org.telegram.ui.Wallet.k0.s(j10, false)) : org.telegram.messenger.cd.L0(2131754082, null));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748754, null), new if0(jf0Var));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void a0(jf0 jf0Var, int i10) {
        Integer num = null;
        if (i10 == jf0Var.c) {
            int i11 = 0;
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!org.telegram.messenger.d20.i(i12).p()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!org.telegram.messenger.d20.o()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                jf0Var.presentFragment(new hf0(num.intValue()));
                return;
            } else {
                if (org.telegram.messenger.d20.o()) {
                    return;
                }
                jf0Var.showDialog(new kg.q0(7, jf0Var.currentAccount, jf0Var.getParentActivity(), jf0Var, null));
                return;
            }
        }
        if (i10 == jf0Var.d) {
            jf0Var.presentFragment(PasscodeActivity.o0());
            return;
        }
        if (i10 == jf0Var.e) {
            jf0Var.presentFragment(new y6());
            return;
        }
        if (i10 == jf0Var.f) {
            jf0Var.presentFragment(new f(3));
            return;
        }
        if (i10 == jf0Var.h) {
            jf0Var.showDialog(org.telegram.ui.Components.s4.T(jf0Var, null));
            return;
        }
        if (i10 != jf0Var.r || jf0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, jf0Var.getParentActivity(), null);
        x1Var.r(500L);
        int i13 = jf0Var.currentAccount;
        f70 f70Var = new f70(29, jf0Var, x1Var);
        org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
        if (((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i13).y7.j0.b).c) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.qq(i13, f70Var, 24));
        } else {
            f70Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748752, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 5));
        this.a = new fg.j(11, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.b, w7.b6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new if0(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.b6.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (org.telegram.messenger.d20.c() < 4) {
            int i10 = this.w;
            this.w = i10 + 1;
            this.c = i10;
        } else {
            this.c = -1;
        }
        if (org.telegram.messenger.tz.s.length() <= 0) {
            int i11 = this.w;
            this.w = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.w;
        this.e = i12;
        this.f = i12 + 1;
        this.h = i12 + 2;
        this.n = i12 + 3;
        this.r = i12 + 4;
        this.w = i12 + 6;
        this.s = i12 + 5;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
