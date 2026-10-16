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
import ji.w4;
import kotlin.jvm.internal.i;
import m.r;
import m4.e0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class o implements j9.t, r2.k, com.google.android.gms.common.api.internal.s {
    public boolean a;
    public Object b;
    public Object c = new m.r();

    public o(t4.e eVar) {
        this.b = eVar;
    }

    @Override // r2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r2.c h(com.google.firebase.messaging.m mVar) {
        MediaCodec mediaCodec;
        r2.m eVar;
        int i10;
        r2.c cVar;
        String str = ((r2.o) mVar.a).a;
        r2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.a || Build.VERSION.SDK_INT < 36) {
                    eVar = new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.c).get());
                    i10 = 0;
                } else {
                    eVar = new w4(mediaCodec, 21);
                    i10 = 4;
                }
                cVar = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.b).get(), eVar, (r2.j) mVar.f);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) mVar.d;
                if (surface == null && ((r2.o) mVar.a).h && Build.VERSION.SDK_INT >= 35) {
                    i10 |= 8;
                }
                r2.c.a(cVar, (MediaFormat) mVar.b, surface, (MediaCrypto) mVar.e, i10);
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

    @Override // com.google.android.gms.common.api.internal.s
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
        final m.r rVar = (m.r) this.c;
        rVar.getClass();
        if (rVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        m10.a(new androidx.lifecycle.r() { // from class: t4.b
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                r this$0 = r.this;
                i.e(this$0, "this$0");
                if (mVar == m.ON_START) {
                    this$0.e = true;
                } else if (mVar == m.ON_STOP) {
                    this$0.e = false;
                }
            }
        });
        rVar.c = true;
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
        m.r rVar = (m.r) this.c;
        if (!rVar.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (rVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        rVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        rVar.d = true;
    }

    public void d(Bundle bundle) {
        m.r rVar = (m.r) this.c;
        rVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) rVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.f fVar = (o.f) rVar.f;
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
        e0 e0Var = (e0) this.c;
        if (th2 instanceof UnsupportedOperationException) {
            e2.a.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            e2.a.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        m0.J(e0Var.t);
        if (this.a) {
            e0Var.p((m4.v) this.b);
        }
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        e0 e0Var = (e0) this.c;
        m4.v vVar = (m4.v) this.b;
        boolean z10 = this.a;
        w7.v.b(e0Var.t, (m4.w) obj);
        m0.J(e0Var.t);
        if (z10) {
            e0Var.p(vVar);
        }
    }
}
