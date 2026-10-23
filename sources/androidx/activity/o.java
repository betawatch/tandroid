package androidx.activity;

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
import e2.m0;
import java.util.Map;
import ki.t1;
import kotlin.jvm.internal.i;
import m.q;
import m4.f0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class o implements j9.t, r2.k, com.google.android.gms.common.api.internal.r {
    public boolean a;
    public Object b;
    public Object c = new m.q();

    public o(t4.e eVar) {
        this.b = eVar;
    }

    @Override // r2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r2.c J(com.google.firebase.messaging.l lVar) {
        MediaCodec mediaCodec;
        r2.m eVar;
        int i10;
        r2.c cVar;
        String str = ((r2.o) lVar.a).a;
        r2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.a || Build.VERSION.SDK_INT < 36) {
                    eVar = new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.c).get());
                    i10 = 0;
                } else {
                    eVar = new t1(mediaCodec, 23);
                    i10 = 4;
                }
                cVar = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.b).get(), eVar, (r2.j) lVar.f);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) lVar.d;
                if (surface == null && ((r2.o) lVar.a).h && Build.VERSION.SDK_INT >= 35) {
                    i10 |= 8;
                }
                r2.c.o(cVar, (MediaFormat) lVar.b, surface, (MediaCrypto) lVar.e, i10);
                return cVar;
            } catch (Exception e7) {
                e = e7;
                cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.internal.n nVar;
        boolean z10;
        r7.k kVar = (r7.k) obj;
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
            r7.a.a.a(kVar, nVar, z10, taskCompletionSource);
        }
    }

    public void b() {
        t4.e eVar = (t4.e) this.b;
        androidx.lifecycle.o m10 = eVar.m();
        if (((androidx.lifecycle.v) m10).c != androidx.lifecycle.n.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        m10.a(new Recreator(eVar));
        final m.q qVar = (m.q) this.c;
        qVar.getClass();
        if (qVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        m10.a(new androidx.lifecycle.r() { // from class: t4.b
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                q this$0 = q.this;
                i.e(this$0, "this$0");
                if (mVar == m.ON_START) {
                    this$0.e = true;
                } else if (mVar == m.ON_STOP) {
                    this$0.e = false;
                }
            }
        });
        qVar.c = true;
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
        m.q qVar = (m.q) this.c;
        if (!qVar.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (qVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        qVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        qVar.d = true;
    }

    public void d(Bundle bundle) {
        m.q qVar = (m.q) this.c;
        qVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) qVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.f fVar = (o.f) qVar.f;
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

    @Override // j9.t
    public void i(Throwable th2) {
        f0 f0Var = (f0) this.c;
        if (th2 instanceof UnsupportedOperationException) {
            e2.a.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            e2.a.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        m0.J(f0Var.t);
        if (this.a) {
            f0Var.p((m4.v) this.b);
        }
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        f0 f0Var = (f0) this.c;
        m4.v vVar = (m4.v) this.b;
        boolean z10 = this.a;
        w7.v.b(f0Var.t, (m4.w) obj);
        m0.J(f0Var.t);
        if (z10) {
            f0Var.p(vVar);
        }
    }
}
