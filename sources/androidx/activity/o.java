package androidx.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o implements com.google.android.gms.common.api.internal.s {
    public boolean a;
    public Object b;
    public Object c = new g2.e();

    public o(g2.f fVar) {
        this.b = fVar;
    }

    public void a() {
        g2.f fVar = (g2.f) this.b;
        androidx.lifecycle.o m9 = fVar.m();
        if (((androidx.lifecycle.v) m9).c != androidx.lifecycle.n.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        m9.a(new Recreator(fVar));
        final g2.e eVar = (g2.e) this.c;
        eVar.getClass();
        if (eVar.a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        m9.a(new androidx.lifecycle.r() { // from class: g2.b
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                e this$0 = e.this;
                j.e(this$0, "this$0");
                if (mVar == m.ON_START) {
                    this$0.c = true;
                } else if (mVar == m.ON_STOP) {
                    this$0.c = false;
                }
            }
        });
        eVar.a = true;
        this.a = true;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.internal.n nVar;
        boolean z4;
        f7.l lVar = (f7.l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            nVar = ((com.google.android.gms.common.api.internal.p) this.b).c;
            z4 = this.a;
            com.google.android.gms.common.api.internal.p pVar = (com.google.android.gms.common.api.internal.p) this.b;
            pVar.b = null;
            pVar.c = null;
        }
        if (nVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            f7.a.a.a(lVar, nVar, z4, taskCompletionSource);
        }
    }

    public void b(Bundle bundle) {
        if (!this.a) {
            a();
        }
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) ((g2.f) this.b).m();
        if (vVar.c.compareTo(androidx.lifecycle.n.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.c).toString());
        }
        g2.e eVar = (g2.e) this.c;
        if (!eVar.a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.b = true;
    }

    public void c(Bundle bundle) {
        g2.e eVar = (g2.e) this.c;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.f fVar = (o.f) eVar.d;
        fVar.getClass();
        o.d dVar = new o.d(fVar);
        fVar.c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((g2.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d() {
        j3.b bVar = (j3.b) this.c;
        Context context = (Context) this.b;
        if (this.a) {
            context.unregisterReceiver(bVar);
            this.a = false;
        }
    }

    public synchronized com.google.android.gms.common.api.internal.p e() {
        return (com.google.android.gms.common.api.internal.p) this.b;
    }
}
