package androidx.activity;

import a8.ra;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a0;
import androidx.fragment.app.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import c8.he;
import com.google.android.gms.internal.cast.b0;
import e0.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.beta.R;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class l extends e0.e implements u0, androidx.lifecycle.i, w4.e {
    public final CopyOnWriteArrayList D;
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public boolean H;
    public boolean I;
    public final b0 b;
    public final hy0 c;
    public final androidx.lifecycle.v d;
    public final n e;
    public t0 f;
    public n0 h;
    public w n;
    public final k r;
    public final n s;
    public final AtomicInteger w;
    public final h x;
    public final CopyOnWriteArrayList y;

    public l() {
        b0 b0Var = new b0();
        this.b = b0Var;
        this.c = new hy0(new a3.f(this, 5));
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(this);
        this.d = vVar;
        n nVar = new n(this);
        this.e = nVar;
        this.n = null;
        k kVar = new k(this);
        this.r = kVar;
        this.s = new n(kVar, new d(this, 0));
        this.w = new AtomicInteger();
        this.x = new h(this);
        this.y = new CopyOnWriteArrayList();
        this.D = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = false;
        this.I = false;
        int i7 = Build.VERSION.SDK_INT;
        vVar.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    Window window = l.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        vVar.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    l.this.b.c = null;
                    if (!l.this.isChangingConfigurations()) {
                        l.this.f().a();
                    }
                    k kVar2 = l.this.r;
                    l lVar = kVar2.d;
                    lVar.getWindow().getDecorView().removeCallbacks(kVar2);
                    lVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar2);
                }
            }
        });
        vVar.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                l lVar = l.this;
                if (lVar.f == null) {
                    j jVar = (j) lVar.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        lVar.f = jVar.a;
                    }
                    if (lVar.f == null) {
                        lVar.f = new t0();
                    }
                }
                lVar.d.b(this);
            }
        });
        nVar.d();
        j0.d(this);
        if (i7 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.a = this;
            vVar.a(immLeaksCleaner);
        }
        ((m.q) nVar.d).f("android:support:activity-result", new e(this, 0));
        f fVar = new f(this, 0);
        if (((l) b0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) b0Var.b).add(fVar);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        this.r.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.i
    public final s0 c() {
        if (this.h == null) {
            this.h = new n0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.h;
    }

    @Override // androidx.lifecycle.i
    public final y1.b d() {
        y1.b bVar = new y1.b();
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
        if (getApplication() != null) {
            linkedHashMap.put(q0.a, getApplication());
        }
        linkedHashMap.put(j0.a, this);
        linkedHashMap.put(j0.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(j0.c, getIntent().getExtras());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.u0
    public final t0 f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f = jVar.a;
            }
            if (this.f == null) {
                this.f = new t0();
            }
        }
        return this.f;
    }

    @Override // w4.e
    public final m.q g() {
        return (m.q) this.e.d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.d;
    }

    public final void o(q0.a aVar) {
        this.y.add(aVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        if (this.x.a(i7, i10, intent)) {
            return;
        }
        super.onActivityResult(i7, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        p().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(configuration);
        }
    }

    @Override // e0.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.e(bundle);
        b0 b0Var = this.b;
        b0Var.getClass();
        b0Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) b0Var.b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        super.onCreate(bundle);
        int i7 = h0.b;
        f0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                if (((a0) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9) {
        if (this.H) {
            return;
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new e0.f(z9));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a.q();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z9) {
        if (this.I) {
            return;
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new k0(z9));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.x.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        t0 t0Var = this.f;
        if (t0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            t0Var = jVar.a;
        }
        if (t0Var == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.a = t0Var;
        return jVar2;
    }

    @Override // e0.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.v vVar = this.d;
        if (vVar != null) {
            vVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.e.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    public final w p() {
        if (this.n == null) {
            this.n = new w(new ra(this, 2));
            this.d.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.r
                public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                    if (mVar != androidx.lifecycle.m.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    w wVar = l.this.n;
                    OnBackInvokedDispatcher invoker = i.a((l) tVar);
                    wVar.getClass();
                    kotlin.jvm.internal.j.e(invoker, "invoker");
                    wVar.e = invoker;
                    wVar.c(wVar.g);
                }
            });
        }
        return this.n;
    }

    public final void q() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final androidx.activity.result.c r(androidx.activity.result.b bVar, d0 d0Var) {
        return this.x.c("activity_rq#" + this.w.getAndIncrement(), this, d0Var, bVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (he.b()) {
                he.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = this.s;
            synchronized (nVar.c) {
                try {
                    nVar.b = true;
                    ArrayList arrayList = (ArrayList) nVar.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((rd.a) obj).invoke();
                    }
                    ((ArrayList) nVar.d).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z9, Configuration newConfig) {
        this.H = true;
        try {
            super.onMultiWindowModeChanged(z9, newConfig);
            this.H = false;
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new e0.f(z9));
            }
        } catch (Throwable th2) {
            this.H = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration newConfig) {
        this.I = true;
        try {
            super.onPictureInPictureModeChanged(z9, newConfig);
            this.I = false;
            Iterator it = this.G.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new k0(z9));
            }
        } catch (Throwable th2) {
            this.I = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
