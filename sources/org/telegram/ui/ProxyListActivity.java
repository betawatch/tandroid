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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public l4 a;
    public org.telegram.ui.Components.pj0 b;
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
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i7) {
        ArrayList arrayList = proxyListActivity.F;
        if (i7 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.iz.B1 == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new ux0());
                    return;
                }
                org.telegram.messenger.iz.B1 = (org.telegram.messenger.hz) arrayList.get(0);
                if (!proxyListActivity.d) {
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.B1.a.i(edit);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.qp.e1();
            ((org.telegram.ui.Cells.r8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.iz.B1.a);
            org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
            int i10 = org.telegram.messenger.qs.A4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.qs.e().k(i10, new Object[0]);
            org.telegram.messenger.qs.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.n; i11 < proxyListActivity.r; i11++) {
                org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) proxyListActivity.b.K(i11);
                if (xi0Var != null) {
                    ((nx0) xi0Var.a).b();
                }
            }
            return;
        }
        if (i7 == proxyListActivity.w) {
            boolean z9 = !org.telegram.messenger.iz.a1;
            org.telegram.messenger.iz.a1 = z9;
            ((org.telegram.ui.Cells.r8) view).setChecked(z9);
            org.telegram.messenger.iz.y();
            proxyListActivity.h0(true);
            return;
        }
        if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
            if (i7 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new ux0());
                return;
            }
            if (i7 == proxyListActivity.D) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131751580, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.T = M0;
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.R = org.telegram.messenger.id.M0(2131751510, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new lx0(proxyListActivity));
                proxyListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.E.isEmpty()) {
            proxyListActivity.a.M(i7);
            return;
        }
        org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) arrayList.get(i7 - proxyListActivity.n);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit3 = org.telegram.messenger.qp.e1().edit();
        hzVar.a.i(edit3);
        edit3.putBoolean("proxy_enabled", proxyListActivity.d);
        edit3.commit();
        org.telegram.messenger.iz.B1 = hzVar;
        for (int i12 = proxyListActivity.n; i12 < proxyListActivity.r; i12++) {
            org.telegram.ui.Components.xi0 xi0Var2 = (org.telegram.ui.Components.xi0) proxyListActivity.b.K(i12);
            if (xi0Var2 != null) {
                nx0 nx0Var = (nx0) xi0Var2.a;
                nx0Var.setChecked(nx0Var.d == hzVar);
                nx0Var.b();
            }
        }
        proxyListActivity.h0(false);
        org.telegram.ui.Components.xi0 xi0Var3 = (org.telegram.ui.Components.xi0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (xi0Var3 != null) {
            ((org.telegram.ui.Cells.r8) xi0Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.iz.B1.a);
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.iz.i((org.telegram.messenger.hz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
        int i10 = org.telegram.messenger.qs.A4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.qs.e().k(i10, new Object[0]);
        org.telegram.messenger.qs.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.F();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746602, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 3));
        this.a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        ((v4.k) this.b.getItemAnimator()).C = false;
        ((v4.k) this.b.getItemAnimator()).o = org.telegram.ui.Components.xq.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.b, c8.ha.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new h(this, 29));
        this.b.setOnItemLongClickListener(new lx0(this));
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.c(1, R.drawable.msg_share, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.id.M0(2131744849, null));
        l10.c(0, R.drawable.msg_delete, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.id.M0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hi0(this, context, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.xi0 xi0Var;
        org.telegram.messenger.hz hzVar;
        org.telegram.ui.Components.xi0 xi0Var2;
        boolean z9 = false;
        if (i7 == org.telegram.messenger.qs.C4) {
            this.b.M(new f3(this, 7));
            h0(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.A4) {
            h0(true);
            return;
        }
        int i11 = org.telegram.messenger.qs.T1;
        ArrayList arrayList = this.F;
        if (i7 == i11) {
            int connectionState = ConnectionsManager.getInstance(i10).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (hzVar = org.telegram.messenger.iz.B1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(hzVar);
                if (indexOf >= 0 && (xi0Var2 = (org.telegram.ui.Components.xi0) this.b.K(indexOf + this.n)) != null) {
                    ((nx0) xi0Var2.a).b();
                }
                if (this.c == 3) {
                    h0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.B4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((org.telegram.messenger.hz) objArr[0]);
        if (indexOf2 >= 0 && (xi0Var = (org.telegram.ui.Components.xi0) this.b.K(indexOf2 + this.n)) != null) {
            ((nx0) xi0Var.a).b();
        }
        if (!this.G) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                org.telegram.messenger.hz hzVar2 = (org.telegram.messenger.hz) obj;
                if (hzVar2.c || hzVar2.e == 0) {
                    z9 = true;
                    break;
                }
            }
            if (!z9) {
                this.G = true;
            }
        }
        if (z9) {
            return;
        }
        h0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{nx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{nx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{nx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262156, new Class[]{nx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    public final void h0(boolean z9) {
        l4 l4Var;
        final boolean z10;
        this.e = 1;
        this.useProxyRow = 0;
        if (!this.d || org.telegram.messenger.iz.B1 == null || org.telegram.messenger.iz.z1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i7 = this.e;
            int i10 = i7 + 1;
            this.e = i10;
            this.w = i7;
            if (org.telegram.messenger.iz.a1) {
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
        ArrayList arrayList = this.F;
        if (z9) {
            arrayList.clear();
            arrayList.addAll(org.telegram.messenger.iz.z1);
            if (this.G) {
                z10 = false;
            } else {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) obj;
                    if (hzVar.c || hzVar.e == 0) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                if (!z10) {
                    this.G = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.mx0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    org.telegram.messenger.hz hzVar2 = (org.telegram.messenger.hz) obj2;
                    org.telegram.messenger.hz hzVar3 = (org.telegram.messenger.hz) obj3;
                    org.telegram.messenger.hz hzVar4 = org.telegram.messenger.iz.B1;
                    long j3 = hzVar4 == hzVar2 ? -200000L : 0L;
                    if (!hzVar2.d) {
                        j3 += 100000;
                    }
                    long j10 = hzVar4 == hzVar3 ? -200000L : 0L;
                    if (!hzVar3.d) {
                        j10 += 100000;
                    }
                    boolean z11 = z10;
                    return Long.compare((!z11 || hzVar2 == hzVar4) ? j3 + hzVar2.b : org.telegram.messenger.iz.z1.indexOf(hzVar2) * 10000, (!z11 || hzVar3 == org.telegram.messenger.iz.B1) ? hzVar3.b + j10 : org.telegram.messenger.iz.z1.indexOf(hzVar3) * 10000);
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
            this.D = i16;
        } else {
            this.D = -1;
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            org.telegram.messenger.hz hzVar2 = (org.telegram.messenger.hz) arrayList.get(i17);
            if (!hzVar2.c && SystemClock.elapsedRealtime() - hzVar2.e >= 120000) {
                hzVar2.c = true;
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(hzVar2.a, new li0(hzVar2, 12));
            }
        }
        if (!z9 || (l4Var = this.a) == null) {
            return;
        }
        l4Var.f();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.E.isEmpty()) {
            return super.onBackPressed(z9);
        }
        if (!z9) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.iz.u();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.C4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.A4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.B4);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T1);
        boolean z9 = false;
        if (org.telegram.messenger.qp.e1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.iz.z1.isEmpty()) {
            z9 = true;
        }
        this.d = z9;
        h0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.C4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.A4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.B4);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T1);
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
