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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ee0 extends org.telegram.ui.ActionBar.e2 {
    public l4 a;
    public org.telegram.ui.Components.uj0 b;
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
    public static void Z(ee0 ee0Var, org.telegram.ui.ActionBar.t1 t1Var) {
        long j3;
        t1Var.dismiss();
        if (((org.telegram.messenger.h0) org.telegram.messenger.np.s1(ee0Var.currentAccount).y7.j0.b).c) {
            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(ee0Var.currentAccount);
            if (x10.v() > 0) {
                TL_wallet.WalletState walletState = x10.e;
                if (!(!(walletState instanceof TL_wallet.TL_walletState) ? false : ((TL_wallet.TL_walletState) walletState).backup_enabled) && !x10.f()) {
                    j3 = x10.v();
                    for (org.telegram.ui.Wallet.h0 h0Var : x10.H) {
                        if (!h0Var.e && !h0Var.d) {
                            long j10 = h0Var.c;
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
        String M0 = org.telegram.messenger.hd.M0(2131748743, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
        t1Var2.S = M0;
        t1Var2.U = org.telegram.messenger.g0.X2(j3 > 0 ? org.telegram.messenger.hd.a0(null, null, 2131754081, org.telegram.ui.Wallet.l0.s(j3, false)) : org.telegram.messenger.hd.M0(2131754082, null));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748743, null), new de0(ee0Var));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void b0(ee0 ee0Var, int i7) {
        int i10 = 3;
        Integer num = null;
        if (i7 == ee0Var.c) {
            int i11 = 0;
            while (i10 >= 0) {
                if (!org.telegram.messenger.m10.i(i10).p()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
                i10--;
            }
            if (!org.telegram.messenger.m10.o()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                ee0Var.presentFragment(new ce0(num.intValue()));
                return;
            } else {
                if (org.telegram.messenger.m10.o()) {
                    return;
                }
                ee0Var.showDialog(new ug.j0(7, ee0Var.currentAccount, ee0Var.getParentActivity(), ee0Var, null));
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
            ee0Var.showDialog(org.telegram.ui.Components.t4.R(ee0Var, null));
            return;
        }
        if (i7 != ee0Var.r || ee0Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ee0Var.getParentActivity(), null);
        t1Var.r(500L);
        int i12 = ee0Var.currentAccount;
        jd0 jd0Var = new jd0(i10, ee0Var, t1Var);
        org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
        if (((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i12).y7.j0.b).c) {
            org.telegram.messenger.g0.h3(new nb1(i12, jd0Var, 2));
        } else {
            jd0Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748741, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 15));
        this.a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.b = uj0Var;
        uj0Var.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.b, c8.ja.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new de0(this));
        this.b.r1();
        this.b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.w = 1;
        if (org.telegram.messenger.m10.c() < 4) {
            int i7 = this.w;
            this.w = i7 + 1;
            this.c = i7;
        } else {
            this.c = -1;
        }
        if (org.telegram.messenger.gz.s.length() <= 0) {
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
