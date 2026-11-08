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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ee0 extends org.telegram.ui.ActionBar.f2 {
    public l4 a;
    public org.telegram.ui.Components.pj0 b;
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
    public static void Z(ee0 ee0Var, org.telegram.ui.ActionBar.u1 u1Var) {
        long j3;
        u1Var.dismiss();
        if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(ee0Var.currentAccount).x7.j0.b).c) {
            org.telegram.ui.Wallet.m0 x10 = org.telegram.ui.Wallet.m0.x(ee0Var.currentAccount);
            if (x10.v() > 0) {
                TL_wallet.WalletState walletState = x10.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !x10.f()) {
                    j3 = x10.v();
                    for (org.telegram.ui.Wallet.i0 i0Var : x10.H) {
                        if (!i0Var.e && !i0Var.d) {
                            long j10 = i0Var.c;
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131748744, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
        u1Var2.R = M0;
        u1Var2.T = org.telegram.messenger.g0.X2(j3 > 0 ? org.telegram.messenger.id.a0(null, null, 2131754081, org.telegram.ui.Wallet.m0.s(j3, false)) : org.telegram.messenger.id.M0(2131754082, null));
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131748744, null), new de0(ee0Var));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void b0(ee0 ee0Var, int i7) {
        Integer num = null;
        if (i7 == ee0Var.c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.p10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.p10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                ee0Var.presentFragment(new ce0(num.intValue()));
                return;
            } else {
                if (org.telegram.messenger.p10.o()) {
                    return;
                }
                ee0Var.showDialog(new ug.i0(7, ee0Var.currentAccount, ee0Var.getParentActivity(), ee0Var, null));
                return;
            }
        }
        if (i7 == ee0Var.d) {
            ee0Var.presentFragment(PasscodeActivity.p0());
            return;
        }
        if (i7 == ee0Var.e) {
            ee0Var.presentFragment(new y6());
            return;
        }
        if (i7 == ee0Var.f) {
            ee0Var.presentFragment(new g(3));
            return;
        }
        if (i7 == ee0Var.h) {
            ee0Var.showDialog(org.telegram.ui.Components.v4.R(ee0Var, null));
            return;
        }
        if (i7 != ee0Var.r || ee0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ee0Var.getParentActivity(), null);
        u1Var.r(500L);
        int i12 = ee0Var.currentAccount;
        zc0 zc0Var = new zc0(7, ee0Var, u1Var);
        org.telegram.ui.Wallet.m0[] m0VarArr = org.telegram.ui.Wallet.m0.O;
        if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i12).x7.j0.b).c) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(i12, zc0Var, 29));
        } else {
            zc0Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748742, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 14));
        this.a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.b, c8.ha.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new de0(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (org.telegram.messenger.p10.c() < 4) {
            int i7 = this.w;
            this.w = i7 + 1;
            this.c = i7;
        } else {
            this.c = -1;
        }
        if (org.telegram.messenger.iz.s.length() <= 0) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
