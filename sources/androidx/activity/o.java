package androidx.activity;

import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import b2.x0;
import bi.g2;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.p;
import m4.b0;
import m4.l0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o implements i9.r, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public /* synthetic */ o() {
        this.a = 5;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.internal.n nVar;
        boolean z10;
        r7.k kVar = (r7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            nVar = ((com.google.android.gms.common.api.internal.p) this.c).c;
            z10 = this.b;
            com.google.android.gms.common.api.internal.p pVar = (com.google.android.gms.common.api.internal.p) this.c;
            pVar.b = null;
            pVar.c = null;
        }
        if (nVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            r7.a.a.a(kVar, nVar, z10, taskCompletionSource);
        }
    }

    public void b() {
        t4.e eVar = (t4.e) this.c;
        androidx.lifecycle.o m10 = eVar.m();
        if (((androidx.lifecycle.v) m10).c != androidx.lifecycle.n.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        m10.a(new Recreator(eVar));
        final m.p pVar = (m.p) this.d;
        pVar.getClass();
        if (pVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        m10.a(new androidx.lifecycle.r() { // from class: t4.b
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                p this$0 = p.this;
                i.e(this$0, "this$0");
                if (mVar == m.ON_START) {
                    this$0.e = true;
                } else if (mVar == m.ON_STOP) {
                    this$0.e = false;
                }
            }
        });
        pVar.c = true;
        this.b = true;
    }

    public void c(Bundle bundle) {
        if (!this.b) {
            b();
        }
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) ((t4.e) this.c).m();
        if (vVar.c.compareTo(androidx.lifecycle.n.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.c).toString());
        }
        m.p pVar = (m.p) this.d;
        if (!pVar.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (pVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        pVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        pVar.d = true;
    }

    public void d(Bundle bundle) {
        m.p pVar = (m.p) this.d;
        pVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) pVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.f fVar = (o.f) pVar.f;
        fVar.getClass();
        o.d dVar = new o.d(fVar);
        fVar.c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((t4.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public synchronized com.google.android.gms.common.api.internal.p e() {
        return (com.google.android.gms.common.api.internal.p) this.c;
    }

    @Override // i9.r
    public void h(Throwable th2) {
        switch (this.a) {
            case 2:
                b0 b0Var = (b0) this.d;
                if (th2 instanceof UnsupportedOperationException) {
                    e2.a.o("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
                } else {
                    e2.a.f("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
                }
                d0.H(b0Var.t);
                if (this.b) {
                    b0Var.p((m4.r) this.c);
                    break;
                }
                break;
        }
    }

    @Override // i9.r
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 2:
                b0 b0Var = (b0) this.d;
                m4.r rVar = (m4.r) this.c;
                boolean z10 = this.b;
                w7.u.b(b0Var.t, (m4.s) obj);
                d0.H(b0Var.t);
                if (z10) {
                    b0Var.p(rVar);
                    break;
                }
                break;
            default:
                m4.s sVar = (m4.s) obj;
                b0 b0Var2 = ((l0) this.d).g;
                Handler handler = b0Var2.l;
                m4.r rVar2 = (m4.r) this.c;
                d0.U(handler, new m4.w(b0Var2, rVar2, new g2(this, sVar, this.b, rVar2, 6)));
                break;
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    public o(r7.c cVar, com.google.android.gms.common.api.internal.p pVar) {
        this.a = 6;
        this.d = cVar;
        this.b = true;
        this.c = pVar;
    }

    public o(t4.e eVar) {
        this.a = 7;
        this.c = eVar;
        this.d = new m.p();
    }

    public o(l lVar, d dVar) {
        this.a = 0;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public o(hh.a aVar, le.b bVar) {
        this.a = 1;
        this.c = aVar;
        this.d = bVar;
    }

    public o(b0 b0Var, m4.r rVar, boolean z10, x0 x0Var) {
        this.a = 2;
        this.d = b0Var;
        this.c = rVar;
        this.b = z10;
    }

    private final void a(Throwable th2) {
    }
}
