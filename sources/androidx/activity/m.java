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
import e0.p0;
import j7.j8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import l7.w0;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class m extends e0.h implements u0, androidx.lifecycle.i, g2.f {
    public final CopyOnWriteArrayList B;
    public final CopyOnWriteArrayList C;
    public final CopyOnWriteArrayList D;
    public boolean E;
    public boolean F;
    public final c0 b;
    public final w0 c;
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
        c0 c0Var = new c0(1);
        this.b = c0Var;
        this.c = new w0(new ag.d(this, 1));
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(this);
        this.d = vVar;
        o oVar = new o(this);
        this.e = oVar;
        this.n = null;
        this.r = new l(this);
        new dd.a() { // from class: androidx.activity.d
            @Override // dd.a
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
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.D = new CopyOnWriteArrayList();
        this.E = false;
        this.F = false;
        int i10 = Build.VERSION.SDK_INT;
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
        if (i10 <= 23) {
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.a = this;
            vVar.a(immLeaksCleaner);
        }
        ((g2.e) oVar.c).f("android:support:activity-result", new e(this, 0));
        f fVar = new f(this, 0);
        if (((m) c0Var.c) != null) {
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
        c0 c0Var = this.b;
        c0Var.getClass();
        c0Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) c0Var.b).iterator();
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
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.E) {
            return;
        }
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new e0.i(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.B.iterator();
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
    public final void onPictureInPictureModeChanged(boolean z4) {
        if (this.F) {
            return;
        }
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(new p0(z4));
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
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((q0.a) it.next()).accept(Integer.valueOf(i10));
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
                    kotlin.jvm.internal.j.e(invoker, "invoker");
                    xVar.e = invoker;
                    xVar.c(xVar.g);
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
            if (j8.b()) {
                j8.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            o oVar = this.s;
            synchronized (oVar.b) {
                try {
                    oVar.a = true;
                    ArrayList arrayList = (ArrayList) oVar.c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((dd.a) obj).invoke();
                    }
                    ((ArrayList) oVar.c).clear();
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
    public final void onMultiWindowModeChanged(boolean z4, Configuration newConfig) {
        this.E = true;
        try {
            super.onMultiWindowModeChanged(z4, newConfig);
            this.E = false;
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new e0.i(z4));
            }
        } catch (Throwable th2) {
            this.E = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration newConfig) {
        this.F = true;
        try {
            super.onPictureInPictureModeChanged(z4, newConfig);
            this.F = false;
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                q0.a aVar = (q0.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new p0(z4));
            }
        } catch (Throwable th2) {
            this.F = false;
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
