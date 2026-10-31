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
import b2.b1;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.p;
import m4.f0;
import org.telegram.ui.Components.vu0;
import r2.y;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o implements j9.t, r2.k, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public o(String str, String str2, boolean z10) {
        this.a = 5;
        this.d = str;
        this.c = str2;
        this.b = z10;
    }

    @Override // r2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r2.c d(j2.f fVar) {
        MediaCodec mediaCodec;
        r2.m eVar;
        int i10;
        r2.c cVar;
        String str = ((r2.o) fVar.a).a;
        r2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    eVar = new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.d).get());
                    i10 = 0;
                } else {
                    eVar = new y(mediaCodec, 0);
                    i10 = 4;
                }
                cVar = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.c).get(), eVar, (r2.j) fVar.f);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) fVar.d;
                if (surface == null && ((r2.o) fVar.a).h && Build.VERSION.SDK_INT >= 35) {
                    i10 |= 8;
                }
                r2.c.o(cVar, (MediaFormat) fVar.b, surface, (MediaCrypto) fVar.e, i10);
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

    public boolean b(Long l4) {
        boolean z10;
        synchronized (((HashMap) this.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) this.d).get(l4);
                z10 = (bVar == null || bVar.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z10;
    }

    public void c() {
        switch (this.a) {
            case 3:
                this.b = false;
                break;
            default:
                this.b = false;
                break;
        }
    }

    public void e() {
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

    public void f(Bundle bundle) {
        if (!this.b) {
            e();
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

    public void g(Bundle bundle) {
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
            bundle2.putBundle((String) entry.getKey(), ((t4.d) entry.getValue()).c());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public synchronized com.google.android.gms.common.api.internal.p h() {
        return (com.google.android.gms.common.api.internal.p) this.c;
    }

    @Override // j9.t
    public void i(Throwable th2) {
        f0 f0Var = (f0) this.d;
        if (th2 instanceof UnsupportedOperationException) {
            e2.a.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            e2.a.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        l0.J(f0Var.t);
        if (this.b) {
            f0Var.p((m4.w) this.c);
        }
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        f0 f0Var = (f0) this.d;
        m4.w wVar = (m4.w) this.c;
        boolean z10 = this.b;
        w7.y.b(f0Var.t, (m4.x) obj);
        l0.J(f0Var.t);
        if (z10) {
            f0Var.p(wVar);
        }
    }

    public /* synthetic */ o(vu0 vu0Var, Object obj, int i10) {
        this.a = i10;
        this.d = vu0Var;
        this.c = obj;
    }

    public o(r7.c cVar, com.google.android.gms.common.api.internal.p pVar) {
        this.a = 8;
        this.d = cVar;
        this.b = true;
        this.c = pVar;
    }

    public o(t4.e eVar) {
        this.a = 9;
        this.c = eVar;
        this.d = new m.p();
    }

    public o(l lVar, d dVar) {
        this.a = 0;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public o(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                break;
            default:
                this.d = new HashMap();
                this.b = true;
                break;
        }
    }

    public o(r2.b bVar, r2.b bVar2) {
        this.a = 7;
        this.c = bVar;
        this.d = bVar2;
        this.b = true;
    }

    public o(ah.a aVar, fe.b bVar) {
        this.a = 1;
        this.c = aVar;
        this.d = bVar;
    }

    public o(f0 f0Var, m4.w wVar, boolean z10, b1 b1Var) {
        this.a = 4;
        this.d = f0Var;
        this.c = wVar;
        this.b = z10;
    }
}
