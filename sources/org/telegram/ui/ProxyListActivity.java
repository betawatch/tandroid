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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public s20 a;
    public o39 b;
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

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setTitle(k96.M0(2131746408, null));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 3));
        this.a = new s20(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        ((gb3) this.b.getItemAnimator()).C = false;
        ((gb3) this.b.getItemAnimator()).o = s33.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new bf4(this, (byte) 27));
        this.b.setOnItemLongClickListener(new ut8(this));
        wha q = this.simpleActionBar.q();
        q.b(1, R.drawable.msg_share, null, null, gl.L(54.0f), null).setContentDescription(k96.M0(2131744609, null));
        q.b(0, R.drawable.msg_delete, null, null, gl.L(54.0f), null).setContentDescription(k96.M0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new iv7(this, context, (byte) 1));
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        y29 y29Var;
        fba fbaVar;
        y29 y29Var2;
        boolean z = false;
        if (i == kk7.E4) {
            this.b.M(new gw(this, (byte) 15));
            g0(false);
            return;
        }
        if (i == kk7.C4) {
            g0(true);
            return;
        }
        int i3 = kk7.S1;
        ArrayList arrayList = this.G;
        if (i == i3) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (fbaVar = gba.y1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(fbaVar);
                if (indexOf >= 0 && (y29Var2 = (y29) this.b.K(indexOf + this.n)) != null) {
                    ((yt8) y29Var2.a).b();
                }
                if (this.c == 3) {
                    g0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != kk7.D4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((fba) objArr[0]);
        if (indexOf2 >= 0 && (y29Var = (y29) this.b.K(indexOf2 + this.n)) != null) {
            ((yt8) y29Var.a).b();
        }
        if (!this.H) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                fba fbaVar2 = (fba) obj;
                if (fbaVar2.c || fbaVar2.e == 0) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.H = true;
            }
        }
        if (z) {
            return;
        }
        g0(true);
    }

    public final void e0() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gba.i((fba) obj);
        }
        this.d = false;
        kk7 e = kk7.e();
        int i2 = kk7.C4;
        e.n(this, i2);
        kk7.e().k(i2, new Object[0]);
        kk7.e().b(this, i2);
        g0(true);
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.h(this.useProxyRow, 0);
            this.a.F();
        }
    }

    public final void f0(int i, View view) {
        int i2 = this.useProxyRow;
        ArrayList arrayList = this.G;
        if (i == i2) {
            if (gba.y1 == null) {
                if (arrayList.isEmpty()) {
                    presentFragment(new fu8());
                    return;
                }
                gba.y1 = (fba) arrayList.get(0);
                if (!this.d) {
                    SharedPreferences.Editor edit = na7.c1().edit();
                    gba.y1.a.i(edit);
                    edit.commit();
                }
            }
            this.d = !this.d;
            g0(true);
            na7.c1();
            ((ahb) view).setChecked(this.d);
            SharedPreferences.Editor edit2 = na7.c1().edit();
            edit2.putBoolean("proxy_enabled", this.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(this.d, gba.y1.a);
            kk7 e = kk7.e();
            int i3 = kk7.C4;
            e.n(this, i3);
            kk7.e().k(i3, new Object[0]);
            kk7.e().b(this, i3);
            for (int i4 = this.n; i4 < this.r; i4++) {
                y29 y29Var = (y29) this.b.K(i4);
                if (y29Var != null) {
                    ((yt8) y29Var.a).b();
                }
            }
            return;
        }
        if (i == this.w) {
            boolean z = !gba.X0;
            gba.X0 = z;
            ((ahb) view).setChecked(z);
            gba.x();
            g0(true);
            return;
        }
        if (i < this.n || i >= this.r) {
            if (i == this.proxyAddRow) {
                presentFragment(new fu8());
                return;
            }
            if (i == this.E) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131751567, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.U = M0;
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hdVar.S = k96.M0(2131751497, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new ut8(this));
                showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.F.isEmpty()) {
            this.a.P(i);
            return;
        }
        fba fbaVar = (fba) arrayList.get(i - this.n);
        this.d = true;
        SharedPreferences.Editor edit3 = na7.c1().edit();
        fbaVar.a.i(edit3);
        edit3.putBoolean("proxy_enabled", this.d);
        edit3.commit();
        gba.y1 = fbaVar;
        for (int i5 = this.n; i5 < this.r; i5++) {
            y29 y29Var2 = (y29) this.b.K(i5);
            if (y29Var2 != null) {
                yt8 yt8Var = (yt8) y29Var2.a;
                yt8Var.setChecked(yt8Var.d == fbaVar);
                yt8Var.b();
            }
        }
        g0(false);
        y29 y29Var3 = (y29) this.b.K(this.useProxyRow);
        if (y29Var3 != null) {
            ((ahb) y29Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(this.d, gba.y1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(boolean z) {
        int i;
        ArrayList arrayList;
        int size;
        int i2;
        s20 s20Var;
        final boolean z2;
        this.e = 1;
        byte b = 0;
        this.useProxyRow = 0;
        if (!this.d || gba.y1 == null || gba.w1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i3 = this.e;
            int i4 = i3 + 1;
            this.e = i4;
            this.w = i3;
            if (gba.X0) {
                i = i3 + 2;
                this.x = i4;
                this.e = i3 + 3;
                this.y = i;
                if (i != -1) {
                    int i5 = this.e;
                    this.e = i5 + 1;
                    this.f = i5;
                } else {
                    this.f = -1;
                }
                int i6 = this.e;
                this.e = i6 + 1;
                this.h = i6;
                arrayList = this.G;
                if (z) {
                    arrayList.clear();
                    arrayList.addAll(gba.w1);
                    if (this.H) {
                        z2 = false;
                    } else {
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            fba fbaVar = (fba) obj;
                            if (fbaVar.c || fbaVar.e == 0) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            this.H = true;
                        }
                    }
                    Collections.sort(arrayList, new Comparator() { // from class: vt8
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            fba fbaVar2 = (fba) obj2;
                            fba fbaVar3 = (fba) obj3;
                            fba fbaVar4 = gba.y1;
                            long j = fbaVar4 == fbaVar2 ? -200000L : 0L;
                            if (!fbaVar2.d) {
                                j += 100000;
                            }
                            long j2 = fbaVar4 == fbaVar3 ? -200000L : 0L;
                            if (!fbaVar3.d) {
                                j2 += 100000;
                            }
                            boolean z3 = z2;
                            return Long.compare((!z3 || fbaVar2 == fbaVar4) ? j + fbaVar2.b : gba.w1.indexOf(fbaVar2) * 10000, (!z3 || fbaVar3 == gba.y1) ? fbaVar3.b + j2 : gba.w1.indexOf(fbaVar3) * 10000);
                        }
                    });
                }
                if (arrayList.isEmpty()) {
                    int i8 = this.e;
                    this.n = i8;
                    int size3 = arrayList.size() + i8;
                    this.e = size3;
                    this.r = size3;
                } else {
                    this.n = -1;
                    this.r = -1;
                }
                int i9 = this.e;
                this.proxyAddRow = i9;
                this.e = i9 + 2;
                this.s = i9 + 1;
                if (arrayList.size() < 10) {
                    int i10 = this.e;
                    this.e = i10 + 1;
                    this.E = i10;
                } else {
                    this.E = -1;
                }
                size = arrayList.size();
                for (i2 = 0; i2 < size; i2++) {
                    fba fbaVar2 = (fba) arrayList.get(i2);
                    if (!fbaVar2.c && SystemClock.elapsedRealtime() - fbaVar2.e >= 120000) {
                        fbaVar2.c = true;
                        ConnectionsManager.getInstance(this.currentAccount).checkProxy(fbaVar2.a, new wt8(fbaVar2, b));
                    }
                }
                if (z || (s20Var = this.a) == null) {
                }
                s20Var.f();
                return;
            }
            this.x = -1;
            this.y = -1;
        }
        i = -1;
        if (i != -1) {
        }
        int i62 = this.e;
        this.e = i62 + 1;
        this.h = i62;
        arrayList = this.G;
        if (z) {
        }
        if (arrayList.isEmpty()) {
        }
        int i92 = this.e;
        this.proxyAddRow = i92;
        this.e = i92 + 2;
        this.s = i92 + 1;
        if (arrayList.size() < 10) {
        }
        size = arrayList.size();
        while (i2 < size) {
        }
        if (z) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.r6));
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.y6));
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.v6));
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.F.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onDialogDismiss(Dialog dialog) {
        up3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        gba.t();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        kk7.e().b(this, kk7.E4);
        kk7.e().b(this, kk7.C4);
        kk7.e().b(this, kk7.D4);
        kk7.f(this.currentAccount).b(this, kk7.S1);
        boolean z = false;
        if (na7.c1().getBoolean("proxy_enabled", false) && !gba.w1.isEmpty()) {
            z = true;
        }
        this.d = z;
        g0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.E4);
        kk7.e().n(this, kk7.C4);
        kk7.e().n(this, kk7.D4);
        kk7.f(this.currentAccount).n(this, kk7.S1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
