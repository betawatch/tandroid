package androidx.activity;

import a8.b8;
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
import c8.ab;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.y0;
import h2.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import m.q;
import org.telegram.ui.Components.st0;
import p4.d0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n implements m9.t, u2.k, com.google.android.gms.common.api.internal.p {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public n(String str, String str2, boolean z9) {
        this.a = 4;
        this.d = str;
        this.c = str2;
        this.b = z9;
    }

    @Override // u2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u2.c Y(b8 b8Var) {
        MediaCodec mediaCodec;
        u2.m eVar;
        int i7;
        u2.c cVar;
        String str = ((u2.o) b8Var.a).a;
        u2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    eVar = new u2.e(mediaCodec, (HandlerThread) ((u2.b) this.d).get());
                    i7 = 0;
                } else {
                    eVar = new org.telegram.ui.Components.n(mediaCodec);
                    i7 = 4;
                }
                cVar = new u2.c(mediaCodec, (HandlerThread) ((u2.b) this.c).get(), eVar, (u2.j) b8Var.f);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) b8Var.d;
                if (surface == null && ((u2.o) b8Var.a).h && Build.VERSION.SDK_INT >= 35) {
                    i7 |= 8;
                }
                u2.c.o(cVar, (MediaFormat) b8Var.b, surface, (MediaCrypto) b8Var.e, i7);
                return cVar;
            } catch (Exception e11) {
                e = e11;
                cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.internal.m mVar;
        boolean z9;
        u7.k kVar = (u7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            mVar = ((com.google.android.gms.common.api.internal.o) this.c).b;
            z9 = this.b;
            ((com.google.android.gms.common.api.internal.o) this.c).b = null;
        }
        if (mVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            u7.a.a.a(kVar, mVar, z9, taskCompletionSource);
        }
    }

    public boolean b(Long l10) {
        boolean z9;
        synchronized (((HashMap) this.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) this.d).get(l10);
                z9 = (bVar == null || bVar.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z9;
    }

    public void c() {
        switch (this.a) {
            case 1:
                this.b = false;
                break;
            default:
                this.b = false;
                break;
        }
    }

    public void d() {
        w4.e eVar = (w4.e) this.c;
        androidx.lifecycle.o m10 = eVar.m();
        if (((androidx.lifecycle.v) m10).c != androidx.lifecycle.n.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        m10.a(new Recreator(eVar));
        final m.q qVar = (m.q) this.d;
        qVar.getClass();
        if (qVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        m10.a(new androidx.lifecycle.r() { // from class: w4.b
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                q this$0 = q.this;
                j.e(this$0, "this$0");
                if (mVar == m.ON_START) {
                    this$0.e = true;
                } else if (mVar == m.ON_STOP) {
                    this$0.e = false;
                }
            }
        });
        qVar.c = true;
        this.b = true;
    }

    public void e(Bundle bundle) {
        if (!this.b) {
            d();
        }
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) ((w4.e) this.c).m();
        if (vVar.c.compareTo(androidx.lifecycle.n.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vVar.c).toString());
        }
        m.q qVar = (m.q) this.d;
        if (!qVar.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (qVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        qVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        qVar.d = true;
    }

    public void f(Bundle bundle) {
        m.q qVar = (m.q) this.d;
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
            bundle2.putBundle((String) entry.getKey(), ((w4.d) entry.getValue()).c());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public synchronized com.google.android.gms.common.api.internal.o g() {
        return (com.google.android.gms.common.api.internal.o) this.c;
    }

    @Override // m9.t
    public void h(Throwable th2) {
        d0 d0Var = (d0) this.d;
        if (th2 instanceof UnsupportedOperationException) {
            h2.a.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            h2.a.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        m0.J(d0Var.t);
        if (this.b) {
            d0Var.p((p4.v) this.c);
        }
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        d0 d0Var = (d0) this.d;
        p4.v vVar = (p4.v) this.c;
        boolean z9 = this.b;
        ab.b(d0Var.t, (p4.w) obj);
        m0.J(d0Var.t);
        if (z9) {
            d0Var.p(vVar);
        }
    }

    public /* synthetic */ n(st0 st0Var, Object obj, int i7) {
        this.a = i7;
        this.d = st0Var;
        this.c = obj;
    }

    public n(u7.c cVar, com.google.android.gms.common.api.internal.o oVar) {
        this.a = 8;
        this.d = cVar;
        this.b = true;
        this.c = oVar;
    }

    public n(w4.e eVar) {
        this.a = 9;
        this.c = eVar;
        this.d = new m.q();
    }

    public n(k kVar, d dVar) {
        this.a = 0;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public n(int i7) {
        this.a = i7;
        switch (i7) {
            case 10:
                this.d = new HashMap();
                this.b = true;
                break;
        }
    }

    public n(u2.b bVar, u2.b bVar2) {
        this.a = 7;
        this.c = bVar;
        this.d = bVar2;
        this.b = true;
    }

    public n(kh.a aVar, te.a aVar2) {
        this.a = 2;
        this.c = aVar;
        this.d = aVar2;
    }

    public n(d0 d0Var, p4.v vVar, boolean z9, y0 y0Var) {
        this.a = 3;
        this.d = d0Var;
        this.c = vVar;
        this.b = z9;
    }
}
