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
import b8.xe;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.a1;
import g2.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import m.p;
import o4.e0;
import o4.w;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements l9.t, t2.k, com.google.android.gms.common.api.internal.p {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public n(String str, String str2, boolean z10) {
        this.a = 4;
        this.d = str;
        this.c = str2;
        this.b = z10;
    }

    @Override // t2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t2.c L(l2.e eVar) {
        MediaCodec mediaCodec;
        t2.m eVar2;
        int i3;
        t2.c cVar;
        String str = ((t2.o) eVar.a).a;
        t2.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    eVar2 = new t2.e(mediaCodec, (HandlerThread) ((t2.b) this.d).get());
                    i3 = 0;
                } else {
                    eVar2 = new y00(mediaCodec);
                    i3 = 4;
                }
                cVar = new t2.c(mediaCodec, (HandlerThread) ((t2.b) this.c).get(), eVar2, (t2.j) eVar.f);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) eVar.d;
                if (surface == null && ((t2.o) eVar.a).h && Build.VERSION.SDK_INT >= 35) {
                    i3 |= 8;
                }
                t2.c.o(cVar, (MediaFormat) eVar.b, surface, (MediaCrypto) eVar.e, i3);
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
        boolean z10;
        t7.k kVar = (t7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            mVar = ((com.google.android.gms.common.api.internal.o) this.c).b;
            z10 = this.b;
            ((com.google.android.gms.common.api.internal.o) this.c).b = null;
        }
        if (mVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            t7.a.a.a(kVar, mVar, z10, taskCompletionSource);
        }
    }

    public boolean b(Long l10) {
        boolean z10;
        synchronized (((HashMap) this.d)) {
            try {
                ue.b bVar = (ue.b) ((HashMap) this.d).get(l10);
                z10 = (bVar == null || bVar.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z10;
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
        v4.e eVar = (v4.e) this.c;
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
        m10.a(new androidx.lifecycle.r() { // from class: v4.b
            @Override // androidx.lifecycle.r
            public final void d(t tVar, m mVar) {
                p this$0 = p.this;
                j.e(this$0, "this$0");
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

    public void e(Bundle bundle) {
        if (!this.b) {
            d();
        }
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) ((v4.e) this.c).m();
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

    public void f(Bundle bundle) {
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
            bundle2.putBundle((String) entry.getKey(), ((v4.d) entry.getValue()).c());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public synchronized com.google.android.gms.common.api.internal.o g() {
        return (com.google.android.gms.common.api.internal.o) this.c;
    }

    @Override // l9.t
    public void h(Throwable th2) {
        e0 e0Var = (e0) this.d;
        if (th2 instanceof UnsupportedOperationException) {
            g2.a.m("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th2);
        } else {
            g2.a.d("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th2.getMessage(), th2);
        }
        n0.J(e0Var.t);
        if (this.b) {
            e0Var.p((o4.v) this.c);
        }
    }

    @Override // l9.t
    public void onSuccess(Object obj) {
        e0 e0Var = (e0) this.d;
        o4.v vVar = (o4.v) this.c;
        boolean z10 = this.b;
        xe.b(e0Var.t, (w) obj);
        n0.J(e0Var.t);
        if (z10) {
            e0Var.p(vVar);
        }
    }

    public /* synthetic */ n(rt0 rt0Var, Object obj, int i3) {
        this.a = i3;
        this.d = rt0Var;
        this.c = obj;
    }

    public n(t7.c cVar, com.google.android.gms.common.api.internal.o oVar) {
        this.a = 7;
        this.d = cVar;
        this.b = true;
        this.c = oVar;
    }

    public n(v4.e eVar) {
        this.a = 10;
        this.c = eVar;
        this.d = new m.p();
    }

    public n(k kVar, d dVar) {
        this.a = 0;
        this.c = new Object();
        this.d = new ArrayList();
    }

    public n(int i3) {
        this.a = i3;
        switch (i3) {
            case 8:
                this.d = new HashMap();
                this.b = true;
                break;
        }
    }

    public n(t2.b bVar, t2.b bVar2) {
        this.a = 6;
        this.c = bVar;
        this.d = bVar2;
        this.b = true;
    }

    public n(lh.a aVar, qe.a aVar2) {
        this.a = 2;
        this.c = aVar;
        this.d = aVar2;
    }

    public n(e0 e0Var, o4.v vVar, boolean z10, a1 a1Var) {
        this.a = 3;
        this.d = e0Var;
        this.c = vVar;
        this.b = z10;
    }
}
