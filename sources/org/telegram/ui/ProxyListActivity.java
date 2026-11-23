package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public l4 a;
    public org.telegram.ui.Components.ek0 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    private int proxyAddRow;
    public int r;
    public int s;
    private int useProxyRow;
    public int w;
    public int x;
    public int y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i7) {
        ArrayList arrayList = proxyListActivity.G;
        if (i7 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.cz.B1 == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new yx0());
                    return;
                }
                org.telegram.messenger.cz.B1 = (org.telegram.messenger.bz) arrayList.get(0);
                if (!proxyListActivity.d) {
                    SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                    org.telegram.messenger.cz.B1.a.i(edit);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.np.g1();
            ((org.telegram.ui.Cells.s8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.np.g1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.cz.B1.a);
            org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
            int i10 = org.telegram.messenger.ls.D4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.ls.e().k(i10, new Object[0]);
            org.telegram.messenger.ls.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.n; i11 < proxyListActivity.r; i11++) {
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) proxyListActivity.b.K(i11);
                if (mj0Var != null) {
                    ((rx0) mj0Var.a).b();
                }
            }
            return;
        }
        if (i7 == proxyListActivity.w) {
            boolean z10 = !org.telegram.messenger.cz.a1;
            org.telegram.messenger.cz.a1 = z10;
            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
            org.telegram.messenger.cz.y();
            proxyListActivity.h0(true);
            return;
        }
        if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
            if (i7 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new yx0());
                return;
            }
            if (i7 == proxyListActivity.E) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                String N0 = org.telegram.messenger.hd.N0(2131751567, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.U = N0;
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                t1Var.S = org.telegram.messenger.hd.N0(2131751497, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ox0(proxyListActivity));
                proxyListActivity.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.F.isEmpty()) {
            proxyListActivity.a.M(i7);
            return;
        }
        org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) arrayList.get(i7 - proxyListActivity.n);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit3 = org.telegram.messenger.np.g1().edit();
        bzVar.a.i(edit3);
        edit3.putBoolean("proxy_enabled", proxyListActivity.d);
        edit3.commit();
        org.telegram.messenger.cz.B1 = bzVar;
        for (int i12 = proxyListActivity.n; i12 < proxyListActivity.r; i12++) {
            org.telegram.ui.Components.mj0 mj0Var2 = (org.telegram.ui.Components.mj0) proxyListActivity.b.K(i12);
            if (mj0Var2 != null) {
                rx0 rx0Var = (rx0) mj0Var2.a;
                rx0Var.setChecked(rx0Var.d == bzVar);
                rx0Var.b();
            }
        }
        proxyListActivity.h0(false);
        org.telegram.ui.Components.mj0 mj0Var3 = (org.telegram.ui.Components.mj0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (mj0Var3 != null) {
            ((org.telegram.ui.Cells.s8) mj0Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.cz.B1.a);
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.G;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.cz.i((org.telegram.messenger.bz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
        int i10 = org.telegram.messenger.ls.D4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.ls.e().k(i10, new Object[0]);
        org.telegram.messenger.ls.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.F();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746405, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 6));
        this.a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        ((v4.k) this.b.getItemAnimator()).C = false;
        ((v4.k) this.b.getItemAnimator()).o = org.telegram.ui.Components.nr.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.b, c8.ma.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new h(this, 29));
        this.b.setOnItemLongClickListener(new ox0(this));
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        q10.c(1, R.drawable.msg_share, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.hd.N0(2131744603, null));
        q10.c(0, R.drawable.msg_delete, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.hd.N0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new mi0(this, context, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.mj0 mj0Var;
        org.telegram.messenger.bz bzVar;
        org.telegram.ui.Components.mj0 mj0Var2;
        boolean z10 = false;
        if (i7 == org.telegram.messenger.ls.F4) {
            this.b.M(new f3(this, 8));
            h0(false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.D4) {
            h0(true);
            return;
        }
        int i11 = org.telegram.messenger.ls.T1;
        ArrayList arrayList = this.G;
        if (i7 == i11) {
            int connectionState = ConnectionsManager.getInstance(i10).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (bzVar = org.telegram.messenger.cz.B1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(bzVar);
                if (indexOf >= 0 && (mj0Var2 = (org.telegram.ui.Components.mj0) this.b.K(indexOf + this.n)) != null) {
                    ((rx0) mj0Var2.a).b();
                }
                if (this.c == 3) {
                    h0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ls.E4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((org.telegram.messenger.bz) objArr[0]);
        if (indexOf2 >= 0 && (mj0Var = (org.telegram.ui.Components.mj0) this.b.K(indexOf2 + this.n)) != null) {
            ((rx0) mj0Var.a).b();
        }
        if (!this.H) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                org.telegram.messenger.bz bzVar2 = (org.telegram.messenger.bz) obj;
                if (bzVar2.c || bzVar2.e == 0) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.H = true;
            }
        }
        if (z10) {
            return;
        }
        h0(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.s6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        return arrayList;
    }

    public final void h0(boolean z10) {
        l4 l4Var;
        final boolean z11;
        this.e = 1;
        this.useProxyRow = 0;
        if (!this.d || org.telegram.messenger.cz.B1 == null || org.telegram.messenger.cz.z1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i7 = this.e;
            int i10 = i7 + 1;
            this.e = i10;
            this.w = i7;
            if (org.telegram.messenger.cz.a1) {
                this.x = i10;
                this.e = i7 + 3;
                this.y = i7 + 2;
            } else {
                this.x = -1;
                this.y = -1;
            }
        }
        if (this.y == -1) {
            int i11 = this.e;
            this.e = i11 + 1;
            this.f = i11;
        } else {
            this.f = -1;
        }
        int i12 = this.e;
        this.e = i12 + 1;
        this.h = i12;
        ArrayList arrayList = this.G;
        if (z10) {
            arrayList.clear();
            arrayList.addAll(org.telegram.messenger.cz.z1);
            if (this.H) {
                z11 = false;
            } else {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) obj;
                    if (bzVar.c || bzVar.e == 0) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                if (!z11) {
                    this.H = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.px0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    org.telegram.messenger.bz bzVar2 = (org.telegram.messenger.bz) obj2;
                    org.telegram.messenger.bz bzVar3 = (org.telegram.messenger.bz) obj3;
                    org.telegram.messenger.bz bzVar4 = org.telegram.messenger.cz.B1;
                    long j3 = bzVar4 == bzVar2 ? -200000L : 0L;
                    if (!bzVar2.d) {
                        j3 += 100000;
                    }
                    long j10 = bzVar4 == bzVar3 ? -200000L : 0L;
                    if (!bzVar3.d) {
                        j10 += 100000;
                    }
                    boolean z12 = z11;
                    return Long.compare((!z12 || bzVar2 == bzVar4) ? j3 + bzVar2.b : org.telegram.messenger.cz.z1.indexOf(bzVar2) * 10000, (!z12 || bzVar3 == org.telegram.messenger.cz.B1) ? bzVar3.b + j10 : org.telegram.messenger.cz.z1.indexOf(bzVar3) * 10000);
                }
            });
        }
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i14 = this.e;
            this.n = i14;
            int size2 = arrayList.size() + i14;
            this.e = size2;
            this.r = size2;
        }
        int i15 = this.e;
        this.proxyAddRow = i15;
        this.e = i15 + 2;
        this.s = i15 + 1;
        if (arrayList.size() >= 10) {
            int i16 = this.e;
            this.e = i16 + 1;
            this.E = i16;
        } else {
            this.E = -1;
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            org.telegram.messenger.bz bzVar2 = (org.telegram.messenger.bz) arrayList.get(i17);
            if (!bzVar2.c && SystemClock.elapsedRealtime() - bzVar2.e >= 120000) {
                bzVar2.c = true;
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(bzVar2.a, new qi0(bzVar2, 12));
            }
        }
        if (!z10 || (l4Var = this.a) == null) {
            return;
        }
        l4Var.f();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        if (this.F.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.a6.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.cz.u();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.F4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.D4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.E4);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.T1);
        boolean z10 = false;
        if (org.telegram.messenger.np.g1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.cz.z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.F4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.D4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.E4);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.T1);
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
