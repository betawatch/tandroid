// default package

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hr2 extends gr2 implements ufc, me5, es9 {
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public boolean I;
    public boolean J;
    public final ix2 b;
    public final in3 c;
    public final g36 d;
    public final ry e;
    public tfc f;
    public fs9 h;
    public yq7 n;
    public final fr2 r;
    public final ry s;
    public final AtomicInteger w;
    public final br2 x;
    public final CopyOnWriteArrayList y;

    public hr2() {
        ix2 ix2Var = new ix2();
        this.b = ix2Var;
        this.c = new in3(new xf2(this, (byte) 8));
        g36 g36Var = new g36(this);
        this.d = g36Var;
        ry ryVar = new ry(this);
        this.e = ryVar;
        this.n = null;
        fr2 fr2Var = new fr2(this);
        this.r = fr2Var;
        byte b = 0;
        this.s = new ry(fr2Var, new yq2(this, b));
        this.w = new AtomicInteger();
        this.x = new br2(this);
        this.y = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = false;
        this.J = false;
        g36Var.a(new cr2(this, b));
        g36Var.a(new cr2(this, (byte) 1));
        g36Var.a(new cr2(this, (byte) 2));
        ryVar.e();
        oed.b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            cr2 cr2Var = new cr2();
            cr2Var.b = this;
            g36Var.a(cr2Var);
        }
        ((op) ryVar.d).f("android:support:activity-result", new zq2(this, b));
        ar2 ar2Var = new ar2(this, b);
        if (((hr2) ix2Var.c) != null) {
            ar2Var.a();
        }
        ((CopyOnWriteArraySet) ix2Var.b).add(ar2Var);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        this.r.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // me5
    public final sfc c() {
        fs9 fs9Var = this.h;
        if (fs9Var == null) {
            fs9Var = new fs9(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            this.h = fs9Var;
        }
        return fs9Var;
    }

    @Override // me5
    public final ij7 d() {
        ij7 ij7Var = new ij7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) ij7Var.a;
        if (getApplication() != null) {
            linkedHashMap.put(rfc.I, getApplication());
        }
        linkedHashMap.put(oed.a, this);
        linkedHashMap.put(oed.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(oed.c, getIntent().getExtras());
        }
        return ij7Var;
    }

    @Override // ufc
    public final tfc f() {
        if (getApplication() == null) {
            dq9.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        tfc tfcVar = this.f;
        if (tfcVar != null) {
            return tfcVar;
        }
        er2 er2Var = (er2) getLastNonConfigurationInstance();
        if (er2Var != null) {
            this.f = er2Var.a;
        }
        tfc tfcVar2 = this.f;
        if (tfcVar2 != null) {
            return tfcVar2;
        }
        tfc tfcVar3 = new tfc();
        this.f = tfcVar3;
        return tfcVar3;
    }

    @Override // es9
    public final op g() {
        return (op) this.e.d;
    }

    @Override // e36
    public final g36 m() {
        return this.d;
    }

    public final void o(gu2 gu2Var) {
        this.y.add(gu2Var);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.x.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        p().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(configuration);
        }
    }

    @Override // gr2, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.f(bundle);
        ix2 ix2Var = this.b;
        ix2Var.getClass();
        ix2Var.c = this;
        Iterator it = ((CopyOnWriteArraySet) ix2Var.b).iterator();
        while (it.hasNext()) {
            ((ar2) it.next()).a();
        }
        super.onCreate(bundle);
        int i = ga9.b;
        ea9.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((aq4) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                if (((aq4) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.I = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.I = false;
            Iterator it = this.G.iterator();
            while (it.hasNext()) {
                gu2 gu2Var = (gu2) it.next();
                configuration.getClass();
                gu2Var.accept(new vi7(z));
            }
        } catch (Throwable th) {
            this.I = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((aq4) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.J = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.J = false;
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                gu2 gu2Var = (gu2) it.next();
                configuration.getClass();
                gu2Var.accept(new dc8(z));
            }
        } catch (Throwable th) {
            this.J = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((aq4) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.x.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        er2 er2Var;
        tfc tfcVar = this.f;
        if (tfcVar == null && (er2Var = (er2) getLastNonConfigurationInstance()) != null) {
            tfcVar = er2Var.a;
        }
        if (tfcVar == null) {
            return null;
        }
        er2 er2Var2 = new er2();
        er2Var2.a = tfcVar;
        return er2Var2;
    }

    @Override // gr2, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        g36 g36Var = this.d;
        if (g36Var != null) {
            g36Var.d("setCurrentState");
            g36Var.f(v26.c);
        }
        super.onSaveInstanceState(bundle);
        this.e.g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final yq7 p() {
        if (this.n == null) {
            this.n = new yq7(new o1(this, (byte) 18));
            this.d.a(new cr2(this, (byte) 3));
        }
        return this.n;
    }

    public final void r() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (yxe.b()) {
                yxe.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ry ryVar = this.s;
            synchronized (ryVar.c) {
                ryVar.b = true;
                ArrayList arrayList = (ArrayList) ryVar.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((pr4) obj).invoke();
                }
                ((ArrayList) ryVar.d).clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        r();
        this.r.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final u9 t(r9 r9Var, s9 s9Var) {
        String str = "activity_rq#" + this.w.getAndIncrement();
        br2 br2Var = this.x;
        HashMap hashMap = br2Var.c;
        g36 g36Var = this.d;
        if (g36Var.b.compareTo(v26.d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            v26 v26Var = g36Var.b;
            sb.append(" is attempting to register while current state is ");
            sb.append(v26Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        br2Var.d(str);
        w9 w9Var = (w9) hashMap.get(str);
        if (w9Var == null) {
            w9Var = new w9(g36Var);
        }
        t9 t9Var = new t9(br2Var, str, r9Var, s9Var);
        w9Var.a.a(t9Var);
        w9Var.b.add(t9Var);
        hashMap.put(str, w9Var);
        return new u9(br2Var, str, s9Var, (byte) 0);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        r();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        this.r.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.I) {
            return;
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(new vi7(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.J) {
            return;
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((gu2) it.next()).accept(new dc8(z));
        }
    }
}
