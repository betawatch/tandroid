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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public s30 a;
    public r59 b;
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
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setTitle(jb6.M0(2131746334, null));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 4));
        this.a = new s30(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        ((sc3) this.b.getItemAnimator()).C = false;
        ((sc3) this.b.getItemAnimator()).o = d53.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new kg4(this, (byte) 28));
        this.b.setOnItemLongClickListener(new vv8(this));
        yja q = this.simpleActionBar.q();
        q.b(1, R.drawable.msg_share, null, null, gm.L(54.0f), null).setContentDescription(jb6.M0(2131744535, null));
        q.b(0, R.drawable.msg_delete, null, null, gm.L(54.0f), null).setContentDescription(jb6.M0(2131751535, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kx7(this, context, (byte) 1));
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        b59 b59Var;
        fda fdaVar;
        b59 b59Var2;
        boolean z = false;
        if (i == nm7.G4) {
            this.b.M(new gx(this, (byte) 15));
            h0(false);
            return;
        }
        if (i == nm7.E4) {
            h0(true);
            return;
        }
        int i3 = nm7.T1;
        ArrayList arrayList = this.G;
        if (i == i3) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (fdaVar = gda.x1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(fdaVar);
                if (indexOf >= 0 && (b59Var2 = (b59) this.b.K(indexOf + this.n)) != null) {
                    ((zv8) b59Var2.a).b();
                }
                if (this.c == 3) {
                    h0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != nm7.F4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((fda) objArr[0]);
        if (indexOf2 >= 0 && (b59Var = (b59) this.b.K(indexOf2 + this.n)) != null) {
            ((zv8) b59Var.a).b();
        }
        if (!this.H) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                fda fdaVar2 = (fda) obj;
                if (fdaVar2.c || fdaVar2.e == 0) {
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
        h0(true);
    }

    public final void f0() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gda.i((fda) obj);
        }
        this.d = false;
        nm7 e = nm7.e();
        int i2 = nm7.E4;
        e.n(this, i2);
        nm7.e().k(i2, new Object[0]);
        nm7.e().b(this, i2);
        h0(true);
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.h(this.useProxyRow, 0);
            this.a.F();
        }
    }

    public final void g0(int i, View view) {
        int i2 = this.useProxyRow;
        ArrayList arrayList = this.G;
        if (i == i2) {
            if (gda.x1 == null) {
                if (arrayList.isEmpty()) {
                    presentFragment(new gw8());
                    return;
                }
                gda.x1 = (fda) arrayList.get(0);
                if (!this.d) {
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    gda.x1.a.i(edit);
                    edit.commit();
                }
            }
            this.d = !this.d;
            h0(true);
            oc7.d1();
            ((bjb) view).setChecked(this.d);
            SharedPreferences.Editor edit2 = oc7.d1().edit();
            edit2.putBoolean("proxy_enabled", this.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(this.d, gda.x1.a);
            nm7 e = nm7.e();
            int i3 = nm7.E4;
            e.n(this, i3);
            nm7.e().k(i3, new Object[0]);
            nm7.e().b(this, i3);
            for (int i4 = this.n; i4 < this.r; i4++) {
                b59 b59Var = (b59) this.b.K(i4);
                if (b59Var != null) {
                    ((zv8) b59Var.a).b();
                }
            }
            return;
        }
        if (i == this.w) {
            boolean z = !gda.W0;
            gda.W0 = z;
            ((bjb) view).setChecked(z);
            gda.x();
            h0(true);
            return;
        }
        if (i < this.n || i >= this.r) {
            if (i == this.proxyAddRow) {
                presentFragment(new gw8());
                return;
            }
            if (i == this.E) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131751516, null);
                he heVar = alertDialog$Builder.a;
                heVar.U = M0;
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                heVar.S = jb6.M0(2131751446, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new vv8(this));
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
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
        fda fdaVar = (fda) arrayList.get(i - this.n);
        this.d = true;
        SharedPreferences.Editor edit3 = oc7.d1().edit();
        fdaVar.a.i(edit3);
        edit3.putBoolean("proxy_enabled", this.d);
        edit3.commit();
        gda.x1 = fdaVar;
        for (int i5 = this.n; i5 < this.r; i5++) {
            b59 b59Var2 = (b59) this.b.K(i5);
            if (b59Var2 != null) {
                zv8 zv8Var = (zv8) b59Var2.a;
                zv8Var.setChecked(zv8Var.d == fdaVar);
                zv8Var.b();
            }
        }
        h0(false);
        b59 b59Var3 = (b59) this.b.K(this.useProxyRow);
        if (b59Var3 != null) {
            ((bjb) b59Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(this.d, gda.x1.a);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.r6));
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.y6));
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.v6));
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        return arrayList;
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
    public final void h0(boolean z) {
        int i;
        ArrayList arrayList;
        int size;
        int i2;
        s30 s30Var;
        final boolean z2;
        this.e = 1;
        byte b = 0;
        this.useProxyRow = 0;
        if (!this.d || gda.x1 == null || gda.v1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i3 = this.e;
            int i4 = i3 + 1;
            this.e = i4;
            this.w = i3;
            if (gda.W0) {
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
                    arrayList.addAll(gda.v1);
                    if (this.H) {
                        z2 = false;
                    } else {
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            fda fdaVar = (fda) obj;
                            if (fdaVar.c || fdaVar.e == 0) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            this.H = true;
                        }
                    }
                    Collections.sort(arrayList, new Comparator() { // from class: wv8
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            fda fdaVar2 = (fda) obj2;
                            fda fdaVar3 = (fda) obj3;
                            fda fdaVar4 = gda.x1;
                            long j = fdaVar4 == fdaVar2 ? -200000L : 0L;
                            if (!fdaVar2.d) {
                                j += 100000;
                            }
                            long j2 = fdaVar4 == fdaVar3 ? -200000L : 0L;
                            if (!fdaVar3.d) {
                                j2 += 100000;
                            }
                            boolean z3 = z2;
                            return Long.compare((!z3 || fdaVar2 == fdaVar4) ? j + fdaVar2.b : gda.v1.indexOf(fdaVar2) * 10000, (!z3 || fdaVar3 == gda.x1) ? fdaVar3.b + j2 : gda.v1.indexOf(fdaVar3) * 10000);
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
                    fda fdaVar2 = (fda) arrayList.get(i2);
                    if (!fdaVar2.c && SystemClock.elapsedRealtime() - fdaVar2.e >= 120000) {
                        fdaVar2.c = true;
                        ConnectionsManager.getInstance(this.currentAccount).checkProxy(fdaVar2.a, new xv8(fdaVar2, b));
                    }
                }
                if (z || (s30Var = this.a) == null) {
                }
                s30Var.f();
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
        er3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        gda.t();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        nm7.e().b(this, nm7.G4);
        nm7.e().b(this, nm7.E4);
        nm7.e().b(this, nm7.F4);
        nm7.f(this.currentAccount).b(this, nm7.T1);
        boolean z = false;
        if (oc7.d1().getBoolean("proxy_enabled", false) && !gda.v1.isEmpty()) {
            z = true;
        }
        this.d = z;
        h0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.G4);
        nm7.e().n(this, nm7.E4);
        nm7.e().n(this, nm7.F4);
        nm7.f(this.currentAccount).n(this, nm7.T1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
