package androidx.activity;

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
import androidx.fragment.app.b0;
import androidx.fragment.app.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.cast.c0;
import e0.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.beta.R;
import x7.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class l extends e0.e implements u0, androidx.lifecycle.i, v4.e {
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public boolean I;
    public boolean J;
    public final c0 b;
    public final p7.d c;
    public final androidx.lifecycle.v d;
    public final n e;
    public t0 f;
    public n0 h;
    public v n;
    public final k r;
    public final n s;
    public final AtomicInteger w;
    public final h x;
    public final CopyOnWriteArrayList y;

    public l() {
        c0 c0Var = new c0();
        this.b = c0Var;
        this.c = new p7.d(new ai.s(this, 7));
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
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = false;
        this.J = false;
        int i3 = Build.VERSION.SDK_INT;
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
        if (i3 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.a = this;
            vVar.a(immLeaksCleaner);
        }
        ((m.p) nVar.d).f("android:support:activity-result", new e(this, 0));
        f fVar = new f(this, 0);
        if (((l) c0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) c0Var.b).add(fVar);
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
    public final x1.b d() {
        x1.b bVar = new x1.b();
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

    @Override // v4.e
    public final m.p g() {
        return (m.p) this.e.d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.d;
    }

    public final void o(q0.a aVar) {
        this.y.add(aVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i10, Intent intent) {
        if (this.x.a(i3, i10, intent)) {
            return;
        }
        super.onActivityResult(i3, i10, intent);
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
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) c0Var.b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        super.onCreate(bundle);
        int i3 = h0.b;
        f0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
            while (it.hasNext()) {
                if (((b0) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.I) {
            return;
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new e0.f(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.q();
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.J) {
            return;
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new l0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (this.x.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
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
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    public final v p() {
        if (this.n == null) {
            this.n = new v(new a3.o(this, 1));
            this.d.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.r
                public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                    if (mVar != androidx.lifecycle.m.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    v vVar = l.this.n;
                    OnBackInvokedDispatcher invoker = i.a((l) tVar);
                    vVar.getClass();
                    kotlin.jvm.internal.j.e(invoker, "invoker");
                    vVar.e = invoker;
                    vVar.c(vVar.g);
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

    public final androidx.activity.result.c r(androidx.activity.result.b bVar, e0 e0Var) {
        return this.x.c("activity_rq#" + this.w.getAndIncrement(), this, e0Var, bVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (e6.b()) {
                e6.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = this.s;
            synchronized (nVar.c) {
                try {
                    nVar.b = true;
                    ArrayList arrayList = (ArrayList) nVar.d;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((od.a) obj).invoke();
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
    public final void setContentView(int i3) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        this.I = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.I = false;
            Iterator it = this.G.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new e0.f(z10));
            }
        } catch (Throwable th2) {
            this.I = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        this.J = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.J = false;
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new l0(z10));
            }
        } catch (Throwable th2) {
            this.J = false;
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
