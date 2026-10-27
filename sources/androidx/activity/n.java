package androidx.activity;

import a8.ie;
import aa.m0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.n0;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.p;
import m4.f0;
import m4.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n implements k9.t, r2.k, com.google.android.gms.common.api.internal.r {
    public boolean a;
    public Object b;
    public Object c = new m.p();

    public n(t4.e eVar) {
        this.b = eVar;
    }

    @Override // r2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r2.c G(m0 m0Var) {
        MediaCodec mediaCodec;
        r2.m eVar;
        int i10;
        r2.c cVar;
        String str = ((r2.o) m0Var.a).a;
        r2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.a || Build.VERSION.SDK_INT < 36) {
                    eVar = new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.c).get());
                    i10 = 0;
                } else {
                    eVar = new jg.i(mediaCodec);
                    i10 = 4;
                }
                cVar = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.b).get(), eVar, (r2.j) m0Var.f);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) m0Var.d;
                if (surface == null && ((r2.o) m0Var.a).h && Build.VERSION.SDK_INT >= 35) {
                    i10 |= 8;
                }
                r2.c.a(cVar, (MediaFormat) m0Var.b, surface, (MediaCrypto) m0Var.e, i10);
                return cVar;
            } catch (Exception e10) {
                e = e10;
                cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.internal.n nVar;
        boolean z10;
        s7.k kVar = (s7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            nVar = ((com.google.android.gms.common.api.internal.p) this.b).c;
            z10 = this.a;
            com.google.android.gms.common.api.internal.p pVar = (com.google.android.gms.common.api.internal.p) this.b;
            pVar.b = null;
            pVar.c = null;
        }
        if (nVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            s7.a.a.a(kVar, nVar, z10, taskCompletionSource);
        }
    }

    public void b() {
        t4.e eVar = (t4.e) this.b;
        androidx.lifecycle.o m10 = eVar.m();
        if (((androidx.lifecycle.v) m10).c != androidx.lifecycle.n.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        m10.a(new Recreator(eVar));
        final m.p pVar = (m.p) this.c;
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
        this.a = true;
    }

    public void c(Bundle bundle) {
        if (!this.a) {
            b();
        }
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) ((t4.e) this.b).m();
        if (vVar.c.compareTo(androidx.lifecycle.n.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.c).toString());
        }
        m.p pVar = (m.p) this.c;
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
        m.p pVar = (m.p) this.c;
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
        return (com.google.android.gms.common.api.internal.p) this.b;
    }

    @Override // k9.t
    public void i(Throwable th2) {
        f0 f0Var = (f0) this.c;
        if (th2 instanceof UnsupportedOperationException) {
            e2.a.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            e2.a.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        n0.J(f0Var.t);
        if (this.a) {
            f0Var.p((m4.w) this.b);
        }
    }

    @Override // k9.t
    public void onSuccess(Object obj) {
        f0 f0Var = (f0) this.c;
        m4.w wVar = (m4.w) this.b;
        boolean z10 = this.a;
        ie.b(f0Var.t, (x) obj);
        n0.J(f0Var.t);
        if (z10) {
            f0Var.p(wVar);
        }
    }
}
