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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public n4 a;
    public org.telegram.ui.Components.tj0 b;
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

    public static void Z(ProxyListActivity proxyListActivity, View view, int i3) {
        ArrayList arrayList = proxyListActivity.G;
        if (i3 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.az.B1 == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new mx0());
                    return;
                }
                org.telegram.messenger.az.B1 = (org.telegram.messenger.zy) arrayList.get(0);
                if (!proxyListActivity.d) {
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    org.telegram.messenger.az.B1.a.i(edit);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.hp.e1();
            ((org.telegram.ui.Cells.q8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.az.B1.a);
            org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
            int i10 = org.telegram.messenger.hs.A4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.hs.e().k(i10, new Object[0]);
            org.telegram.messenger.hs.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.n; i11 < proxyListActivity.r; i11++) {
                org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) proxyListActivity.b.K(i11);
                if (bj0Var != null) {
                    ((fx0) bj0Var.a).b();
                }
            }
            return;
        }
        if (i3 == proxyListActivity.w) {
            boolean z10 = !org.telegram.messenger.az.a1;
            org.telegram.messenger.az.a1 = z10;
            ((org.telegram.ui.Cells.q8) view).setChecked(z10);
            org.telegram.messenger.az.y();
            proxyListActivity.h0(true);
            return;
        }
        if (i3 < proxyListActivity.n || i3 >= proxyListActivity.r) {
            if (i3 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new mx0());
                return;
            }
            if (i3 == proxyListActivity.E) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131751580, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.U = M0;
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.S = org.telegram.messenger.bd.M0(2131751510, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new dx0(proxyListActivity));
                proxyListActivity.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.F.isEmpty()) {
            proxyListActivity.a.M(i3);
            return;
        }
        org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList.get(i3 - proxyListActivity.n);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit3 = org.telegram.messenger.hp.e1().edit();
        zyVar.a.i(edit3);
        edit3.putBoolean("proxy_enabled", proxyListActivity.d);
        edit3.commit();
        org.telegram.messenger.az.B1 = zyVar;
        for (int i12 = proxyListActivity.n; i12 < proxyListActivity.r; i12++) {
            org.telegram.ui.Components.bj0 bj0Var2 = (org.telegram.ui.Components.bj0) proxyListActivity.b.K(i12);
            if (bj0Var2 != null) {
                fx0 fx0Var = (fx0) bj0Var2.a;
                fx0Var.setChecked(fx0Var.d == zyVar);
                fx0Var.b();
            }
        }
        proxyListActivity.h0(false);
        org.telegram.ui.Components.bj0 bj0Var3 = (org.telegram.ui.Components.bj0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (bj0Var3 != null) {
            ((org.telegram.ui.Cells.q8) bj0Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.az.B1.a);
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.G;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.messenger.az.i((org.telegram.messenger.zy) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
        int i10 = org.telegram.messenger.hs.A4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.hs.e().k(i10, new Object[0]);
        org.telegram.messenger.hs.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        n4 n4Var = proxyListActivity.a;
        if (n4Var != null) {
            n4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.F();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746609, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 4));
        this.a = new n4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        ((u4.k) this.b.getItemAnimator()).C = false;
        ((u4.k) this.b.getItemAnimator()).o = org.telegram.ui.Components.xq.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.b, b8.mf.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new h(this, 29));
        this.b.setOnItemLongClickListener(new dx0(this));
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.c(1, R.drawable.msg_share, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.bd.M0(2131744856, null));
        l10.c(0, R.drawable.msg_delete, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.bd.M0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fi0(this, context, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.bj0 bj0Var;
        org.telegram.messenger.zy zyVar;
        org.telegram.ui.Components.bj0 bj0Var2;
        boolean z10 = false;
        if (i3 == org.telegram.messenger.hs.C4) {
            this.b.M(new g3(this, 7));
            h0(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.A4) {
            h0(true);
            return;
        }
        int i11 = org.telegram.messenger.hs.T1;
        ArrayList arrayList = this.G;
        if (i3 == i11) {
            int connectionState = ConnectionsManager.getInstance(i10).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (zyVar = org.telegram.messenger.az.B1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(zyVar);
                if (indexOf >= 0 && (bj0Var2 = (org.telegram.ui.Components.bj0) this.b.K(indexOf + this.n)) != null) {
                    ((fx0) bj0Var2.a).b();
                }
                if (this.c == 3) {
                    h0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.B4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((org.telegram.messenger.zy) objArr[0]);
        if (indexOf2 >= 0 && (bj0Var = (org.telegram.ui.Components.bj0) this.b.K(indexOf2 + this.n)) != null) {
            ((fx0) bj0Var.a).b();
        }
        if (!this.H) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) obj;
                if (zyVar2.c || zyVar2.e == 0) {
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

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    public final void h0(boolean z10) {
        n4 n4Var;
        final boolean z11;
        this.e = 1;
        this.useProxyRow = 0;
        if (!this.d || org.telegram.messenger.az.B1 == null || org.telegram.messenger.az.z1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i3 = this.e;
            int i10 = i3 + 1;
            this.e = i10;
            this.w = i3;
            if (org.telegram.messenger.az.a1) {
                this.x = i10;
                this.e = i3 + 3;
                this.y = i3 + 2;
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
            arrayList.addAll(org.telegram.messenger.az.z1);
            if (this.H) {
                z11 = false;
            } else {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) obj;
                    if (zyVar.c || zyVar.e == 0) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                if (!z11) {
                    this.H = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.ex0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) obj2;
                    org.telegram.messenger.zy zyVar3 = (org.telegram.messenger.zy) obj3;
                    org.telegram.messenger.zy zyVar4 = org.telegram.messenger.az.B1;
                    long j10 = zyVar4 == zyVar2 ? -200000L : 0L;
                    if (!zyVar2.d) {
                        j10 += 100000;
                    }
                    long j11 = zyVar4 == zyVar3 ? -200000L : 0L;
                    if (!zyVar3.d) {
                        j11 += 100000;
                    }
                    boolean z12 = z11;
                    return Long.compare((!z12 || zyVar2 == zyVar4) ? j10 + zyVar2.b : org.telegram.messenger.az.z1.indexOf(zyVar2) * 10000, (!z12 || zyVar3 == org.telegram.messenger.az.B1) ? zyVar3.b + j11 : org.telegram.messenger.az.z1.indexOf(zyVar3) * 10000);
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
            org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) arrayList.get(i17);
            if (!zyVar2.c && SystemClock.elapsedRealtime() - zyVar2.e >= 120000) {
                zyVar2.c = true;
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(zyVar2.a, new ci0(zyVar2, 13));
            }
        }
        if (!z10 || (n4Var = this.a) == null) {
            return;
        }
        n4Var.f();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.az.u();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.C4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.A4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.B4);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T1);
        boolean z10 = false;
        if (org.telegram.messenger.hp.e1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.az.z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.C4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.A4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.B4);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.a;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
