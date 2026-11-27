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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public t20 a;
    public d79 b;
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

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setTitle(ob6.M0(2131746328, null));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 5));
        this.a = new t20(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        ((zb3) this.b.getItemAnimator()).C = false;
        ((zb3) this.b.getItemAnimator()).o = k43.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new zg4(this, (byte) 27));
        this.b.setOnItemLongClickListener(new dx8(this));
        rla r = this.simpleActionBar.r();
        r.b(1, R.drawable.msg_share, null, null, hl.L(54.0f), null).setContentDescription(ob6.M0(2131744503, null));
        r.b(0, R.drawable.msg_delete, null, null, hl.L(54.0f), null).setContentDescription(ob6.M0(2131751563, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new py7(this, context, (byte) 1));
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        n69 n69Var;
        wea weaVar;
        n69 n69Var2;
        boolean z = false;
        if (i == jn7.F4) {
            this.b.N(new hw(this, (byte) 15));
            g0(false);
            return;
        }
        if (i == jn7.D4) {
            g0(true);
            return;
        }
        int i3 = jn7.T1;
        ArrayList arrayList = this.G;
        if (i == i3) {
            int connectionState = ConnectionsManager.getInstance(i2).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (weaVar = xea.x1) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(weaVar);
                if (indexOf >= 0 && (n69Var2 = (n69) this.b.L(indexOf + this.n)) != null) {
                    ((hx8) n69Var2.a).b();
                }
                if (this.c == 3) {
                    g0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != jn7.E4 || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((wea) objArr[0]);
        if (indexOf2 >= 0 && (n69Var = (n69) this.b.L(indexOf2 + this.n)) != null) {
            ((hx8) n69Var.a).b();
        }
        if (!this.H) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                wea weaVar2 = (wea) obj;
                if (weaVar2.c || weaVar2.e == 0) {
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
            xea.i((wea) obj);
        }
        this.d = false;
        jn7 e = jn7.e();
        int i2 = jn7.D4;
        e.n(this, i2);
        jn7.e().k(i2, new Object[0]);
        jn7.e().b(this, i2);
        g0(true);
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.h(this.useProxyRow, 0);
            this.a.F();
        }
    }

    public final void f0(int i, View view) {
        int i2 = this.useProxyRow;
        ArrayList arrayList = this.G;
        if (i == i2) {
            if (xea.x1 == null) {
                if (arrayList.isEmpty()) {
                    presentFragment(new ox8());
                    return;
                }
                xea.x1 = (wea) arrayList.get(0);
                if (!this.d) {
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    xea.x1.a.i(edit);
                    edit.commit();
                }
            }
            this.d = !this.d;
            g0(true);
            uc7.e1();
            ((wkb) view).setChecked(this.d);
            SharedPreferences.Editor edit2 = uc7.e1().edit();
            edit2.putBoolean("proxy_enabled", this.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(this.d, xea.x1.a);
            jn7 e = jn7.e();
            int i3 = jn7.D4;
            e.n(this, i3);
            jn7.e().k(i3, new Object[0]);
            jn7.e().b(this, i3);
            for (int i4 = this.n; i4 < this.r; i4++) {
                n69 n69Var = (n69) this.b.L(i4);
                if (n69Var != null) {
                    ((hx8) n69Var.a).b();
                }
            }
            return;
        }
        if (i == this.w) {
            boolean z = !xea.W0;
            xea.W0 = z;
            ((wkb) view).setChecked(z);
            xea.x();
            g0(true);
            return;
        }
        if (i < this.n || i >= this.r) {
            if (i == this.proxyAddRow) {
                presentFragment(new ox8());
                return;
            }
            if (i == this.E) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131751544, null);
                id idVar = alertDialog$Builder.a;
                idVar.U = M0;
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                idVar.S = ob6.M0(2131751474, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new dx8(this));
                showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
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
        wea weaVar = (wea) arrayList.get(i - this.n);
        this.d = true;
        SharedPreferences.Editor edit3 = uc7.e1().edit();
        weaVar.a.i(edit3);
        edit3.putBoolean("proxy_enabled", this.d);
        edit3.commit();
        xea.x1 = weaVar;
        for (int i5 = this.n; i5 < this.r; i5++) {
            n69 n69Var2 = (n69) this.b.L(i5);
            if (n69Var2 != null) {
                hx8 hx8Var = (hx8) n69Var2.a;
                hx8Var.setChecked(hx8Var.d == weaVar);
                hx8Var.b();
            }
        }
        g0(false);
        n69 n69Var3 = (n69) this.b.L(this.useProxyRow);
        if (n69Var3 != null) {
            ((wkb) n69Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(this.d, xea.x1.a);
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
        t20 t20Var;
        final boolean z2;
        this.e = 1;
        byte b = 0;
        this.useProxyRow = 0;
        if (!this.d || xea.x1 == null || xea.v1.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i3 = this.e;
            int i4 = i3 + 1;
            this.e = i4;
            this.w = i3;
            if (xea.W0) {
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
                    arrayList.addAll(xea.v1);
                    if (this.H) {
                        z2 = false;
                    } else {
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            wea weaVar = (wea) obj;
                            if (weaVar.c || weaVar.e == 0) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            this.H = true;
                        }
                    }
                    Collections.sort(arrayList, new Comparator() { // from class: ex8
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            wea weaVar2 = (wea) obj2;
                            wea weaVar3 = (wea) obj3;
                            wea weaVar4 = xea.x1;
                            long j = weaVar4 == weaVar2 ? -200000L : 0L;
                            if (!weaVar2.d) {
                                j += 100000;
                            }
                            long j2 = weaVar4 == weaVar3 ? -200000L : 0L;
                            if (!weaVar3.d) {
                                j2 += 100000;
                            }
                            boolean z3 = z2;
                            return Long.compare((!z3 || weaVar2 == weaVar4) ? j + weaVar2.b : xea.v1.indexOf(weaVar2) * 10000, (!z3 || weaVar3 == xea.x1) ? weaVar3.b + j2 : xea.v1.indexOf(weaVar3) * 10000);
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
                    wea weaVar2 = (wea) arrayList.get(i2);
                    if (!weaVar2.c && SystemClock.elapsedRealtime() - weaVar2.e >= 120000) {
                        weaVar2.c = true;
                        ConnectionsManager.getInstance(this.currentAccount).checkProxy(weaVar2.a, new fx8(weaVar2, b));
                    }
                }
                if (z || (t20Var = this.a) == null) {
                }
                t20Var.f();
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

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.s6));
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.z6));
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.w6));
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
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

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        lq3.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        xea.t();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        jn7.e().b(this, jn7.F4);
        jn7.e().b(this, jn7.D4);
        jn7.e().b(this, jn7.E4);
        jn7.f(this.currentAccount).b(this, jn7.T1);
        boolean z = false;
        if (uc7.e1().getBoolean("proxy_enabled", false) && !xea.v1.isEmpty()) {
            z = true;
        }
        this.d = z;
        g0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.F4);
        jn7.e().n(this, jn7.D4);
        jn7.e().n(this, jn7.E4);
        jn7.f(this.currentAccount).n(this, jn7.T1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
