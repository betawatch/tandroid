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
import com.google.android.gms.internal.cast.d0;
import f7.r8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m extends e0.h implements u0, androidx.lifecycle.i, g2.f {
    public final CopyOnWriteArrayList A;
    public final CopyOnWriteArrayList B;
    public final CopyOnWriteArrayList C;
    public boolean D;
    public boolean E;
    public final d0 b;
    public final j4.c c;
    public final androidx.lifecycle.v d;
    public final o e;
    public t0 f;
    public n0 h;
    public x n;
    public final l r;
    public final o s;
    public final AtomicInteger v;
    public final h w;
    public final CopyOnWriteArrayList x;
    public final CopyOnWriteArrayList y;

    public m() {
        d0 d0Var = new d0(1);
        this.b = d0Var;
        this.c = new j4.c(new af.e(this, 1));
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(this);
        this.d = vVar;
        o oVar = new o(this);
        this.e = oVar;
        this.n = null;
        this.r = new l(this);
        new zc.a() { // from class: androidx.activity.d
            @Override // zc.a
            public final Object invoke() {
                m.this.reportFullyDrawn();
                return null;
            }
        };
        o oVar2 = new o();
        oVar2.b = new Object();
        oVar2.c = new ArrayList();
        this.s = oVar2;
        this.v = new AtomicInteger();
        this.w = new h(this);
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.D = false;
        this.E = false;
        int i9 = Build.VERSION.SDK_INT;
        vVar.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    Window window = m.this.getWindow();
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
                    m.this.b.c = null;
                    if (!m.this.isChangingConfigurations()) {
                        m.this.f().a();
                    }
                    l lVar = m.this.r;
                    m mVar2 = lVar.d;
                    mVar2.getWindow().getDecorView().removeCallbacks(lVar);
                    mVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                }
            }
        });
        vVar.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.r
            public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                m mVar2 = m.this;
                if (mVar2.f == null) {
                    k kVar = (k) mVar2.getLastNonConfigurationInstance();
                    if (kVar != null) {
                        mVar2.f = kVar.a;
                    }
                    if (mVar2.f == null) {
                        mVar2.f = new t0();
                    }
                }
                mVar2.d.b(this);
            }
        });
        oVar.a();
        j0.d(this);
        if (i9 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.a = this;
            vVar.a(immLeaksCleaner);
        }
        ((g2.e) oVar.c).f("android:support:activity-result", new e(this, 0));
        f fVar = new f(this, 0);
        if (((m) d0Var.c) != null) {
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
            k kVar = (k) getLastNonConfigurationInstance();
            if (kVar != null) {
                this.f = kVar.a;
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
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (this.w.a(i9, i10, intent)) {
            return;
        }
        super.onActivityResult(i9, i10, intent);
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
        int i9 = h0.b;
        f0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i9, Menu menu) {
        if (i9 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i9, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 0) {
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
    public final void onPanelClosed(int i9, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.q();
        }
        super.onPanelClosed(i9, menu);
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
    public final boolean onPreparePanel(int i9, View view, Menu menu) {
        if (i9 != 0) {
            return true;
        }
        super.onPreparePanel(i9, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (this.w.a(i9, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i9, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        k kVar;
        t0 t0Var = this.f;
        if (t0Var == null && (kVar = (k) getLastNonConfigurationInstance()) != null) {
            t0Var = kVar.a;
        }
        if (t0Var == null) {
            return null;
        }
        k kVar2 = new k();
        kVar2.a = t0Var;
        return kVar2;
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
    public final void onTrimMemory(int i9) {
        super.onTrimMemory(i9);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(Integer.valueOf(i9));
        }
    }

    public final x p() {
        if (this.n == null) {
            this.n = new x(new i(this, 0));
            this.d.a(new androidx.lifecycle.r() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.r
                public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                    if (mVar != androidx.lifecycle.m.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    x xVar = m.this.n;
                    OnBackInvokedDispatcher invoker = j.a((m) tVar);
                    xVar.getClass();
                    kotlin.jvm.internal.i.e(invoker, "invoker");
                    xVar.e = invoker;
                    xVar.c(xVar.g);
                }
            });
        }
        return this.n;
    }

    public final void q() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.i.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final androidx.activity.result.c r(androidx.activity.result.b bVar, e0 e0Var) {
        return this.w.c("activity_rq#" + this.v.getAndIncrement(), this, e0Var, bVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (r8.b()) {
                r8.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            o oVar = this.s;
            synchronized (oVar.b) {
                try {
                    oVar.a = true;
                    ArrayList arrayList = (ArrayList) oVar.c;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((zc.a) obj).invoke();
                    }
                    ((ArrayList) oVar.c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i9) {
        q();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i9);
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
                kotlin.jvm.internal.i.e(newConfig, "newConfig");
                aVar.accept(new e0.i(z10));
            }
        } catch (Throwable th) {
            this.D = false;
            throw th;
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
                kotlin.jvm.internal.i.e(newConfig, "newConfig");
                aVar.accept(new e0.q0(z10));
            }
        } catch (Throwable th) {
            this.E = false;
            throw th;
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
