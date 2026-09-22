package ki;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.x50;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class c implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.h11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.h11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = hVar.n;
                if (hVar.R && handler != null && hVar.c.isAvailable()) {
                    handler.post(new b(hVar, 4));
                    break;
                }
                break;
            case 1:
                c60 c60Var = (c60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (c60Var.m0 == null && surfaceTexture != null && !c60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    c60Var.m0 = new m50(c60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final n11 n11Var = (n11) this.b;
                ArrayList arrayList = n11Var.c;
                l11 l11Var = n11Var.a;
                if (l11Var != null) {
                    l11Var.i();
                    n11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.h11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                n11Var.invalidate();
                                break;
                            default:
                                n11 n11Var2 = n11Var;
                                Runnable runnable = n11Var2.d;
                                if (runnable != null) {
                                    n11Var2.e = true;
                                    n11Var2.d = null;
                                    n11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                l11 l11Var2 = new l11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.h11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                n11Var.invalidate();
                                break;
                            default:
                                n11 n11Var2 = n11Var;
                                Runnable runnable = n11Var2.d;
                                if (runnable != null) {
                                    n11Var2.e = true;
                                    n11Var2.d = null;
                                    n11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                n11Var.a = l11Var2;
                l11Var2.a = EmuDetector.with(n11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        m11 m11Var = (m11) arrayList.get(i14);
                        Bitmap bitmap = m11Var.e;
                        if (bitmap != null) {
                            n11Var.a.c(m11Var.f, bitmap, m11Var.c, m11Var.d);
                        } else {
                            ArrayList arrayList2 = m11Var.b;
                            if (arrayList2 != null) {
                                n11Var.a.f(arrayList2, m11Var.d);
                            } else {
                                n11Var.a.e(m11Var.a, m11Var.g, m11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(n11Var.b);
                    break;
                }
                break;
            case 4:
                break;
            default:
                vh.f fVar = (vh.f) this.b;
                if (fVar.f == null) {
                    vh.e eVar = new vh.e(fVar, surfaceTexture, i10, i11, new vh.d(fVar, 1));
                    fVar.f = eVar;
                    eVar.start();
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.j.b("preview surface destroyed: active=" + hVar.R);
                if (!hVar.R) {
                    return true;
                }
                hVar.u(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                c60 c60Var = (c60) this.b;
                Camera2Session[] camera2SessionArr = c60Var.v0;
                m50 m50Var = c60Var.m0;
                if (m50Var != null) {
                    m50Var.b(0L, 0, true, 0, 0);
                    c60Var.m0 = null;
                }
                if (!c60Var.s0) {
                    if (c60Var.t0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(c60Var.t0, null, null);
                    return true;
                }
                for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                    Camera2Session camera2Session = camera2SessionArr[i10];
                    if (camera2Session != null) {
                        camera2Session.destroy(false);
                        camera2SessionArr[i10] = null;
                    }
                }
                return true;
            case 2:
                ((rg0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                n11 n11Var = (n11) this.b;
                l11 l11Var = n11Var.a;
                if (l11Var != null) {
                    l11Var.i();
                    n11Var.a = null;
                }
                Runnable runnable = n11Var.d;
                if (runnable == null) {
                    return false;
                }
                n11Var.d = null;
                n11.b(runnable);
                return false;
            case 4:
                r91 r91Var = (r91) this.b;
                TextureView textureView = r91Var.d;
                if (!r91Var.S) {
                    return true;
                }
                if (r91Var.W) {
                    r91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                r91Var.S = false;
                return false;
            default:
                vh.e eVar = ((vh.f) this.b).f;
                if (eVar == null) {
                    return true;
                }
                eVar.a = false;
                ((vh.f) this.b).f = null;
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                hVar.H();
                return;
            case 1:
                m50 m50Var = ((c60) this.b).m0;
                if (m50Var != null) {
                    m50Var.F = i10;
                    m50Var.G = i11;
                    m50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                l11 l11Var = ((n11) this.b).a;
                if (l11Var == null || (handler = l11Var.getHandler()) == null || !l11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 4:
                return;
            default:
                vh.e eVar = ((vh.f) this.b).f;
                if (eVar != null) {
                    synchronized (eVar.e) {
                        eVar.f = true;
                        eVar.h = i10;
                        eVar.n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        float f7;
        switch (this.a) {
            case 0:
                if (((h) this.b).W) {
                    ((h) this.b).W = false;
                    ((h) this.b).j.b("camera switch first preview frame");
                    q0 q0Var = (q0) ((h) this.b).k.b;
                    Handler handler = q0Var.h;
                    x50 x50Var = q0Var.c;
                    Objects.requireNonNull(x50Var);
                    handler.post(new i2.g0(x50Var, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                h hVar = (h) this.b;
                if (hVar.h0 == 0) {
                    hVar.h0 = elapsedRealtimeNanos;
                    k kVar = hVar.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((h) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((h) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((h) this.b).q);
                    sb2.append(", attached=");
                    sb2.append(((h) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((h) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((h) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((h) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    sb2.append(((h) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((h) this.b).c.getDisplay().getRefreshRate()));
                    kVar.b(sb2.toString());
                }
                h hVar2 = (h) this.b;
                long j10 = hVar2.j0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    hVar2.l0++;
                    hVar2.m0 += j11;
                    j3 = 0;
                    double d = j11;
                    hVar2.n0 = (d * d) + hVar2.n0;
                    long j12 = hVar2.o0;
                    if (j12 == 0 || j11 < j12) {
                        hVar2.o0 = j11;
                    }
                    hVar2.p0 = Math.max(hVar2.p0, j11);
                    if (j11 > 50000000) {
                        hVar2.q0++;
                    }
                    if (j11 > 100000000) {
                        hVar2.r0++;
                    }
                } else {
                    j3 = 0;
                }
                h hVar3 = (h) this.b;
                hVar3.j0 = elapsedRealtimeNanos;
                long j13 = hVar3.k0;
                if (timestamp > j13) {
                    if (hVar3.t0 == j3) {
                        hVar3.t0 = timestamp;
                    }
                    hVar3.u0 = timestamp;
                    hVar3.s0++;
                } else if (j13 != j3) {
                    hVar3.v0++;
                }
                hVar3.k0 = timestamp;
                hVar3.i0++;
                long j14 = elapsedRealtimeNanos - hVar3.h0;
                if (j14 >= 5000000000L) {
                    TextureView textureView = hVar3.c;
                    long j15 = hVar3.u0 - hVar3.t0;
                    if (j15 > j3) {
                        if (hVar3.s0 > 1) {
                            f7 = ((r13 - 1) * 1.0E9f) / j15;
                            hVar3.j.b("preview frame delivery: callbackFps=" + ((hVar3.i0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.m0, hVar3.l0) + ", min=" + (hVar3.o0 / 1000000.0f) + ", max=" + (hVar3.p0 / 1000000.0f) + ", jitter=" + h.C(hVar3.n0, hVar3.m0, hVar3.l0) + "}, gaps={over50ms=" + hVar3.q0 + ", over100ms=" + hVar3.r0 + "}, nonMonotonicTimestamps=" + hVar3.v0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            hVar3.w();
                            hVar3.h0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    hVar3.j.b("preview frame delivery: callbackFps=" + ((hVar3.i0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + h.c(hVar3.m0, hVar3.l0) + ", min=" + (hVar3.o0 / 1000000.0f) + ", max=" + (hVar3.p0 / 1000000.0f) + ", jitter=" + h.C(hVar3.n0, hVar3.m0, hVar3.l0) + "}, gaps={over50ms=" + hVar3.q0 + ", over100ms=" + hVar3.r0 + "}, nonMonotonicTimestamps=" + hVar3.v0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    hVar3.w();
                    hVar3.h0 = elapsedRealtimeNanos;
                }
                break;
            case 4:
                r91 r91Var = (r91) this.b;
                if (r91Var.r == 1) {
                    r91Var.n.getViewTreeObserver().addOnPreDrawListener(new ga(this, 4));
                    r91Var.n.invalidate();
                    break;
                }
                break;
        }
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void g(SurfaceTexture surfaceTexture) {
    }

    private final void h(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
