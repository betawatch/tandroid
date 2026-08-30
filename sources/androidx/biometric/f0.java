package androidx.biometric;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import cg.f1;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.q1;
import dg.s2;
import f2.l1;
import f2.o1;
import f2.p1;
import f2.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import m.f2;
import nh.d4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.gb1;
import org.telegram.ui.o61;
import org.telegram.ui.xr0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f0 implements androidx.lifecycle.a0, v0, s2, p1, com.google.android.gms.common.api.internal.s, l.w, f2, l.i, o61, aq0, jo0, xd.d, yf.m {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f0(g6.g gVar, g6.a aVar) {
        this.a = 15;
        this.b = aVar;
    }

    public static com.google.android.gms.common.api.internal.p f(Looper looper, Object obj, String str) {
        b6.m.i(obj, "Listener must not be null");
        b6.m.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override // f2.p1
    public View C(int i10) {
        return ((f2.v0) this.b).q(i10);
    }

    @Override // f2.p1
    public int E(View view) {
        return f2.v0.y(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).rightMargin;
    }

    @Override // dg.s2
    public void F(float f10) {
        q1 q1Var = (q1) this.b;
        f1.e(q1Var.a).k("-1", f10);
        q1Var.e.setBrushSize(f10);
    }

    @Override // yf.m
    public void G() {
        xe0 xe0Var = ((ye0) this.b).a;
        if (xe0Var != null) {
            ((xr0) xe0Var).a.b0.invalidate();
        }
    }

    @Override // yf.m
    public void H(boolean z4) {
        ((ye0) this.b).c.setAspectLock(z4);
    }

    @Override // org.telegram.ui.Components.jo0
    public void Y(float f10, boolean z4) {
        gb1 gb1Var = (gb1) ((org.telegram.ui.Cells.k0) this.b);
        int i10 = (int) (j6.q * 100.0f);
        int i11 = (int) (f10 * 100.0f);
        j6.q = f10;
        if (i10 != i11) {
            ThemeActivity themeActivity = gb1Var.e.e;
            el0 el0Var = (el0) themeActivity.b.K(themeActivity.c0);
            if (el0Var != null) {
                ((a9) el0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.q * 100.0f))));
            }
            j6.E(true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                u7.e eVar = (u7.e) this.b;
                f7.a0 a0Var = (f7.a0) ((f7.l) obj).u();
                f7.g gVar = new f7.g(1, (TaskCompletionSource) obj2);
                Parcel M0 = a0Var.M0();
                f7.e.c(M0, eVar);
                f7.e.d(M0, gVar);
                M0.writeString(null);
                a0Var.Q0(M0, 63);
                break;
            case 15:
                g6.f fVar = new g6.f(1, (TaskCompletionSource) obj2);
                g6.e eVar2 = (g6.e) ((g6.h) obj).u();
                g6.a aVar = (g6.a) this.b;
                Parcel G0 = eVar2.G0();
                y6.a.d(G0, fVar);
                y6.a.c(G0, aVar);
                G0.writeStrongBinder(null);
                eVar2.H0(G0, 2);
                break;
            default:
                z7.a aVar2 = (z7.a) this.b;
                o7.d dVar = new o7.d(0, (TaskCompletionSource) obj2);
                o7.c cVar = (o7.c) ((o7.f) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = o7.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                aVar2.writeToParcel(obtain, 0);
                cVar.E0(obtain, 2);
                break;
        }
    }

    public c2.v b() {
        if (((ArrayList) this.b) == null) {
            return c2.v.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new c2.v(bundle, (ArrayList) this.b);
    }

    @Override // yf.m
    public void b0(boolean z4) {
        ye0 ye0Var = (ye0) this.b;
        ye0Var.getClass();
        xe0 xe0Var = ye0Var.a;
        if (xe0Var != null) {
            ((xr0) xe0Var).a(z4);
        }
    }

    @Override // l.w
    public void c(l.k kVar, boolean z4) {
        g.p pVar;
        switch (this.a) {
            case 14:
                g.q qVar = (g.q) this.b;
                l.k k10 = kVar.k();
                int i10 = 0;
                boolean z10 = k10 != kVar;
                if (z10) {
                    kVar = k10;
                }
                g.p[] pVarArr = qVar.R;
                int length = pVarArr != null ? pVarArr.length : 0;
                while (true) {
                    if (i10 >= length) {
                        pVar = null;
                    } else {
                        pVar = pVarArr[i10];
                        if (pVar == null || pVar.h != kVar) {
                            i10++;
                        }
                    }
                }
                if (pVar != null) {
                    if (!z10) {
                        qVar.h(pVar, z4);
                        break;
                    } else {
                        qVar.f(pVar.a, pVar, k10);
                        qVar.h(pVar, true);
                        break;
                    }
                }
                break;
            default:
                if (kVar instanceof l.d0) {
                    ((l.d0) kVar).z.k().c(false);
                }
                l.w wVar = ((m.h) this.b).e;
                if (wVar != null) {
                    wVar.c(kVar, z4);
                    break;
                }
                break;
        }
    }

    @Override // yf.m
    public void c0() {
        xe0 xe0Var = ((ye0) this.b).a;
        if (xe0Var != null) {
            PhotoViewer photoViewer = ((xr0) xe0Var).a;
            if (photoViewer.Z1 == 1) {
                photoViewer.E2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // f2.p1
    public int d(View view) {
        return f2.v0.x(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).leftMargin;
    }

    @Override // m.f2
    public void e(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // l.w
    public boolean e0(l.k kVar) {
        Window.Callback callback;
        switch (this.a) {
            case 14:
                g.q qVar = (g.q) this.b;
                if (kVar != kVar.k() || !qVar.L || (callback = qVar.f.getCallback()) == null || qVar.W) {
                    return true;
                }
                callback.onMenuOpened(108, kVar);
                return true;
            default:
                m.h hVar = (m.h) this.b;
                if (kVar == hVar.c) {
                    return false;
                }
                ((l.d0) kVar).A.getClass();
                hVar.getClass();
                l.w wVar = hVar.e;
                if (wVar != null) {
                    return wVar.e0(kVar);
                }
                return false;
        }
    }

    @Override // dg.s2
    public float get() {
        q1 q1Var = (q1) this.b;
        int i10 = q1Var.a;
        cg.m currentBrush = q1Var.e.getCurrentBrush();
        return currentBrush == null ? f1.e(i10).i : f1.e(i10).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.jo0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // xd.d
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // l.i
    public void i(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.h hVar = toolbar.a.G;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.T.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.b0) it.next()).a.t();
            }
        }
    }

    @Override // xd.d
    public /* synthetic */ boolean j(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.jo0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // f2.p1
    public int l() {
        return ((f2.v0) this.b).D();
    }

    public void m() {
        ((androidx.fragment.app.u) this.b).d.R();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m0(Object obj) {
        Integer num = (Integer) obj;
        i0 i0Var = (i0) this.b;
        Handler handler = i0Var.x0;
        androidx.activity.i iVar = i0Var.y0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (i0Var.C0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = i0Var.z0.y;
            Context n10 = i0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = org.telegram.messenger.beta.R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = org.telegram.messenger.beta.R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                i0Var.C0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    g0.a(drawable);
                }
                i0Var.z0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = i0Var.D0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? i0Var.A0 : i0Var.B0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void n(int i10) {
        y5.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.f()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = y5.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // l.i
    public boolean p(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // m.f2
    public void q(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new c2.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, 5), kVar, SystemClock.uptimeMillis() + 200);
    }

    public void r(c2.r rVar, c2.n nVar, Collection collection) {
        c2.e eVar = (c2.e) this.b;
        if (rVar != eVar.y || nVar == null) {
            if (rVar == eVar.e) {
                if (nVar != null) {
                    eVar.n(eVar.d, nVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        c2.z zVar = eVar.x.a;
        String d = nVar.d();
        c2.a0 a0Var = new c2.a0(zVar, d, eVar.b(zVar, d), false);
        a0Var.i(nVar);
        if (eVar.d == a0Var) {
            return;
        }
        eVar.h(eVar, a0Var, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public void s(l1 l1Var, c5.e eVar, c5.e eVar2) {
        boolean z4;
        l1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(l1Var);
        recyclerView.h(l1Var);
        l1Var.q(false);
        o1 o1Var = (o1) recyclerView.W;
        o1Var.getClass();
        int i11 = eVar.a;
        int i12 = eVar.b;
        View view = l1Var.a;
        int left = eVar2 == null ? view.getLeft() : eVar2.a;
        int top = eVar2 == null ? view.getTop() : eVar2.b;
        if (l1Var.j() || (i11 == left && i12 == top)) {
            int i13 = l1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            l1Var.i = (l1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            o1Var.s(l1Var, eVar);
            z4 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z4 = o1Var.r(l1Var, eVar, i11, i12, left, top);
        }
        if (z4) {
            recyclerView.l0();
        }
    }

    @Override // f2.p1
    public int t() {
        f2.v0 v0Var = (f2.v0) this.b;
        return v0Var.m - v0Var.E();
    }

    @Override // org.telegram.ui.Components.aq0
    public void t0() {
        d4.j0((d4) this.b);
    }

    @Override // xd.d
    public void u() {
        ((f9) this.b).a.invalidate();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void v(y5.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    public void w(l1 l1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        f2.v0 v0Var = recyclerView.x;
        View view = l1Var.a;
        bf.f fVar = recyclerView.b;
        e eVar = v0Var.a;
        a3.c cVar = (a3.c) eVar.b;
        int indexOfChild = ((RecyclerView) cVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((f2.c) eVar.c).E(indexOfChild)) {
                eVar.C(view);
            }
            cVar.P(indexOfChild);
        }
        fVar.g(view);
    }

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public f0(int i10) {
        this.a = i10;
        switch (i10) {
            case 5:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.aq0
    public /* synthetic */ void V() {
    }

    @Override // xd.d
    public /* synthetic */ void a() {
    }

    @Override // xd.d
    public /* synthetic */ void k() {
    }

    @Override // xd.d
    public /* synthetic */ void g(boolean z4) {
    }
}
