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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public fg.j a;
    public org.telegram.ui.Components.uk0 b;
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

    public static void Z(ProxyListActivity proxyListActivity, View view, int i10) {
        ArrayList arrayList = proxyListActivity.F;
        if (i10 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.uz.B1 == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new iz0());
                    return;
                }
                org.telegram.messenger.uz.B1 = (org.telegram.messenger.tz) arrayList.get(0);
                if (!proxyListActivity.d) {
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    org.telegram.messenger.uz.B1.a.h(edit);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.wp.d1();
            ((org.telegram.ui.Cells.t8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.wp.d1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.uz.B1.a);
            org.telegram.messenger.at e = org.telegram.messenger.at.e();
            int i11 = org.telegram.messenger.at.A4;
            e.n(proxyListActivity, i11);
            org.telegram.messenger.at.e().k(i11, new Object[0]);
            org.telegram.messenger.at.e().c(proxyListActivity, i11);
            for (int i12 = proxyListActivity.n; i12 < proxyListActivity.r; i12++) {
                org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) proxyListActivity.b.K(i12);
                if (dk0Var != null) {
                    ((bz0) dk0Var.a).b();
                }
            }
            return;
        }
        if (i10 == proxyListActivity.w) {
            boolean z10 = !org.telegram.messenger.uz.a1;
            org.telegram.messenger.uz.a1 = z10;
            ((org.telegram.ui.Cells.t8) view).setChecked(z10);
            org.telegram.messenger.uz.y();
            proxyListActivity.h0(true);
            return;
        }
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            if (i10 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new iz0());
                return;
            }
            if (i10 == proxyListActivity.D) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131751580, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.T = L0;
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                x1Var.R = org.telegram.messenger.dd.L0(2131751510, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new zy0(proxyListActivity));
                proxyListActivity.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.E.isEmpty()) {
            proxyListActivity.a.M(i10);
            return;
        }
        org.telegram.messenger.tz tzVar = (org.telegram.messenger.tz) arrayList.get(i10 - proxyListActivity.n);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit3 = org.telegram.messenger.wp.d1().edit();
        tzVar.a.h(edit3);
        edit3.putBoolean("proxy_enabled", proxyListActivity.d);
        edit3.commit();
        org.telegram.messenger.uz.B1 = tzVar;
        for (int i13 = proxyListActivity.n; i13 < proxyListActivity.r; i13++) {
            org.telegram.ui.Components.dk0 dk0Var2 = (org.telegram.ui.Components.dk0) proxyListActivity.b.K(i13);
            if (dk0Var2 != null) {
                bz0 bz0Var = (bz0) dk0Var2.a;
                bz0Var.setChecked(bz0Var.d == tzVar);
                bz0Var.b();
            }
        }
        proxyListActivity.h0(false);
        org.telegram.ui.Components.dk0 dk0Var3 = (org.telegram.ui.Components.dk0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (dk0Var3 != null) {
            ((org.telegram.ui.Cells.t8) dk0Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.uz.B1.a);
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.uz.i((org.telegram.messenger.tz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.at e = org.telegram.messenger.at.e();
        int i11 = org.telegram.messenger.at.A4;
        e.n(proxyListActivity, i11);
        org.telegram.messenger.at.e().k(i11, new Object[0]);
        org.telegram.messenger.at.e().c(proxyListActivity, i11);
        proxyListActivity.h0(true);
        fg.j jVar = proxyListActivity.a;
        if (jVar != null) {
            jVar.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.F();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131746616, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 24));
        this.a = new fg.j(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.b = uk0Var;
        uk0Var.r1();
        ((s4.j) this.b.getItemAnimator()).C = false;
        ((s4.j) this.b.getItemAnimator()).o = org.telegram.ui.Components.gr.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.b, w7.b6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new g(this, 29));
        this.b.setOnItemLongClickListener(new zy0(this));
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.c(1, R.drawable.msg_share, null, null, org.telegram.messenger.i0.L(54.0f), null).setContentDescription(org.telegram.messenger.dd.L0(2131744864, null));
        l4.c(0, R.drawable.msg_delete, null, null, org.telegram.messenger.i0.L(54.0f), null).setContentDescription(org.telegram.messenger.dd.L0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new nj0(this, context, 1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.dk0 dk0Var;
        org.telegram.messenger.tz tzVar;
        org.telegram.ui.Components.dk0 dk0Var2;
        boolean z10 = false;
        if (i10 == org.telegram.messenger.at.C4) {
            this.b.M(new f3(this, 7));
            h0(false);
            return;
        }
        if (i10 == org.telegram.messenger.at.A4) {
            h0(true);
            return;
        }
        int i12 = org.telegram.messenger.at.T1;
        ArrayList arrayList = this.F;
        if (i10 == i12) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (tzVar = org.telegram.messenger.uz.B1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(tzVar);
                if (indexOf >= 0 && (dk0Var2 = (org.telegram.ui.Components.dk0) this.b.K(indexOf + this.n)) != null) {
                    ((bz0) dk0Var2.a).b();
                }
                if (this.c == 3) {
                    h0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.at.B4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((org.telegram.messenger.tz) objArr[0]);
        if (indexOf2 >= 0 && (dk0Var = (org.telegram.ui.Components.dk0) this.b.K(indexOf2 + this.n)) != null) {
            ((bz0) dk0Var.a).b();
        }
        if (!this.G) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                org.telegram.messenger.tz tzVar2 = (org.telegram.messenger.tz) obj;
                if (tzVar2.c || tzVar2.e == 0) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.G = true;
            }
        }
        if (z10) {
            return;
        }
        h0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        return arrayList;
    }

    public final void h0(boolean z10) {
        fg.j jVar;
        final boolean z11;
        this.e = 1;
        this.useProxyRow = 0;
        if (!this.d || org.telegram.messenger.uz.B1 == null || org.telegram.messenger.uz.z1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.w = i10;
            if (org.telegram.messenger.uz.a1) {
                this.x = i11;
                this.e = i10 + 3;
                this.y = i10 + 2;
            } else {
                this.x = -1;
                this.y = -1;
            }
        }
        if (this.y == -1) {
            int i12 = this.e;
            this.e = i12 + 1;
            this.f = i12;
        } else {
            this.f = -1;
        }
        int i13 = this.e;
        this.e = i13 + 1;
        this.h = i13;
        ArrayList arrayList = this.F;
        if (z10) {
            arrayList.clear();
            arrayList.addAll(org.telegram.messenger.uz.z1);
            if (this.G) {
                z11 = false;
            } else {
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.messenger.tz tzVar = (org.telegram.messenger.tz) obj;
                    if (tzVar.c || tzVar.e == 0) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                if (!z11) {
                    this.G = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.az0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    org.telegram.messenger.tz tzVar2 = (org.telegram.messenger.tz) obj2;
                    org.telegram.messenger.tz tzVar3 = (org.telegram.messenger.tz) obj3;
                    org.telegram.messenger.tz tzVar4 = org.telegram.messenger.uz.B1;
                    long j10 = tzVar4 == tzVar2 ? -200000L : 0L;
                    if (!tzVar2.d) {
                        j10 += 100000;
                    }
                    long j11 = tzVar4 == tzVar3 ? -200000L : 0L;
                    if (!tzVar3.d) {
                        j11 += 100000;
                    }
                    boolean z12 = z11;
                    return Long.compare((!z12 || tzVar2 == tzVar4) ? j10 + tzVar2.b : org.telegram.messenger.uz.z1.indexOf(tzVar2) * 10000, (!z12 || tzVar3 == org.telegram.messenger.uz.B1) ? tzVar3.b + j11 : org.telegram.messenger.uz.z1.indexOf(tzVar3) * 10000);
                }
            });
        }
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.e;
            this.n = i15;
            int size2 = arrayList.size() + i15;
            this.e = size2;
            this.r = size2;
        }
        int i16 = this.e;
        this.proxyAddRow = i16;
        this.e = i16 + 2;
        this.s = i16 + 1;
        if (arrayList.size() >= 10) {
            int i17 = this.e;
            this.e = i17 + 1;
            this.D = i17;
        } else {
            this.D = -1;
        }
        int size3 = arrayList.size();
        for (int i18 = 0; i18 < size3; i18++) {
            org.telegram.messenger.tz tzVar2 = (org.telegram.messenger.tz) arrayList.get(i18);
            if (!tzVar2.c && SystemClock.elapsedRealtime() - tzVar2.e >= 120000) {
                tzVar2.c = true;
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(tzVar2.a, new rj0(tzVar2, 13));
            }
        }
        if (!z10 || (jVar = this.a) == null) {
            return;
        }
        jVar.f();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.E.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.b6.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.uz.u();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.C4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.A4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.B4);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T1);
        boolean z10 = false;
        if (org.telegram.messenger.wp.d1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.uz.z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.C4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.A4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.B4);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T1);
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
