package androidx.activity;

import ag.q1;
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
import com.google.android.gms.internal.cast.d0;
import h7.m8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import l3.g0;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l extends e0.h implements u0, androidx.lifecycle.i, g2.f {
    public final CopyOnWriteArrayList A;
    public final CopyOnWriteArrayList B;
    public final CopyOnWriteArrayList C;
    public boolean D;
    public boolean E;
    public final d0 b;
    public final g0 c;
    public final androidx.lifecycle.v d;
    public final n e;
    public t0 f;
    public n0 h;
    public w n;
    public final k r;
    public final n s;
    public final AtomicInteger v;
    public final h w;
    public final CopyOnWriteArrayList x;
    public final CopyOnWriteArrayList y;

    public l() {
        d0 d0Var = new d0(1);
        this.b = d0Var;
        this.c = new g0(new a4.g(this, 6));
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(this);
        this.d = vVar;
        n nVar = new n(this);
        this.e = nVar;
        this.n = null;
        this.r = new k(this);
        new bd.a() { // from class: androidx.activity.d
            @Override // bd.a
            public final Object invoke() {
                l.this.reportFullyDrawn();
                return null;
            }
        };
        n nVar2 = new n();
        nVar2.b = new Object();
        nVar2.c = new ArrayList();
        this.s = nVar2;
        this.v = new AtomicInteger();
        this.w = new h(this);
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.D = false;
        this.E = false;
        int i10 = Build.VERSION.SDK_INT;
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
                    k kVar = l.this.r;
                    l lVar = kVar.d;
                    lVar.getWindow().getDecorView().removeCallbacks(kVar);
                    lVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
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
        nVar.a();
        j0.d(this);
        if (i10 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.a = this;
            vVar.a(immLeaksCleaner);
        }
        ((g2.e) nVar.c).f("android:support:activity-result", new e(this, 0));
        f fVar = new f(this, 0);
        if (((l) d0Var.c) != null) {
            fVar.a();
        }
        ((CopyOnWriteArraySet) d0Var.b).add(fVar);
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
    public final v1.b d() {
        v1.b bVar = new v1.b();
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

    @Override // g2.f
    public final g2.e g() {
        return (g2.e) this.e.c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.d;
    }

    public final void o(q0.a aVar) {
        this.x.add(aVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.w.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        p().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(configuration);
        }
    }

    @Override // e0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.b(bundle);
        d0 d0Var = this.b;
        d0Var.getClass();
        d0Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) d0Var.b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        super.onCreate(bundle);
        int i10 = h0.b;
        f0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
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
        if (this.D) {
            return;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new e0.i(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.q();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.E) {
            return;
        }
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new e0.q0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.w.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
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

    @Override // e0.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.v vVar = this.d;
        if (vVar != null) {
            vVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.e.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    public final w p() {
        if (this.n == null) {
            this.n = new w(new q1(this, 1));
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

    public final androidx.activity.result.c r(androidx.activity.result.b bVar, e0 e0Var) {
        return this.w.c("activity_rq#" + this.v.getAndIncrement(), this, e0Var, bVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (m8.b()) {
                m8.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            n nVar = this.s;
            synchronized (nVar.b) {
                try {
                    nVar.a = true;
                    ArrayList arrayList = (ArrayList) nVar.c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((bd.a) obj).invoke();
                    }
                    ((ArrayList) nVar.c).clear();
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
    public final void setContentView(int i10) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        this.D = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.D = false;
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new e0.i(z10));
            }
        } catch (Throwable th2) {
            this.D = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        this.E = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.E = false;
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new e0.q0(z10));
            }
        } catch (Throwable th2) {
            this.E = false;
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
