package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.c21] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.c21] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                p60 p60Var = (p60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (p60Var.l0 == null && surfaceTexture != null && !p60Var.k0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    p60Var.l0 = new z50(p60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final h21 h21Var = (h21) this.b;
                ArrayList arrayList = h21Var.c;
                f21 f21Var = h21Var.a;
                if (f21Var != null) {
                    f21Var.i();
                    h21Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.c21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                h21Var.invalidate();
                                break;
                            default:
                                h21 h21Var2 = h21Var;
                                Runnable runnable = h21Var2.d;
                                if (runnable != null) {
                                    h21Var2.e = true;
                                    h21Var2.d = null;
                                    h21.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                f21 f21Var2 = new f21(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.c21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                h21Var.invalidate();
                                break;
                            default:
                                h21 h21Var2 = h21Var;
                                Runnable runnable = h21Var2.d;
                                if (runnable != null) {
                                    h21Var2.e = true;
                                    h21Var2.d = null;
                                    h21.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                h21Var.a = f21Var2;
                f21Var2.a = EmuDetector.with(h21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        g21 g21Var = (g21) arrayList.get(i14);
                        Bitmap bitmap = g21Var.e;
                        if (bitmap != null) {
                            h21Var.a.c(g21Var.f, bitmap, g21Var.c, g21Var.d);
                        } else {
                            ArrayList arrayList2 = g21Var.b;
                            if (arrayList2 != null) {
                                h21Var.a.f(arrayList2, g21Var.d);
                            } else {
                                h21Var.a.d(g21Var.a, g21Var.g, g21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(h21Var.b);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                vi.j jVar = (vi.j) this.b;
                jVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.n;
                if (jVar.V && handler != null && jVar.c.isAvailable()) {
                    handler.post(new vi.a(jVar, 7));
                    break;
                }
                break;
            default:
                xh.f fVar = (xh.f) this.b;
                if (fVar.f == null) {
                    xh.e eVar = new xh.e(fVar, surfaceTexture, i10, i11, new xh.d(fVar, 1));
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
                p60 p60Var = (p60) this.b;
                Camera2Session[] camera2SessionArr = p60Var.u0;
                z50 z50Var = p60Var.l0;
                if (z50Var != null) {
                    z50Var.b(0L, 0, true, 0, 0);
                    p60Var.l0 = null;
                }
                if (p60Var.r0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (p60Var.s0 != null) {
                    CameraController.getInstance().close(p60Var.s0, null, null);
                    break;
                }
                break;
            case 1:
                ((dh0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                break;
            case 2:
                h21 h21Var = (h21) this.b;
                f21 f21Var = h21Var.a;
                if (f21Var != null) {
                    f21Var.i();
                    h21Var.a = null;
                }
                Runnable runnable = h21Var.d;
                if (runnable != null) {
                    h21Var.d = null;
                    h21.b(runnable);
                    break;
                }
                break;
            case 3:
                na1 na1Var = (na1) this.b;
                TextureView textureView = na1Var.d;
                if (na1Var.S) {
                    if (na1Var.W) {
                        na1Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    na1Var.S = false;
                    break;
                }
                break;
            case 4:
                ((vi.j) this.b).j.b("preview surface destroyed: active=" + ((vi.j) this.b).V);
                if (((vi.j) this.b).V) {
                    ((vi.j) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            default:
                xh.e eVar = ((xh.f) this.b).f;
                if (eVar != null) {
                    eVar.a = false;
                    ((xh.f) this.b).f = null;
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                z50 z50Var = ((p60) this.b).l0;
                if (z50Var != null) {
                    z50Var.F = i10;
                    z50Var.G = i11;
                    z50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                f21 f21Var = ((h21) this.b).a;
                if (f21Var == null || (handler = f21Var.getHandler()) == null || !f21Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
                return;
            case 4:
                vi.j jVar = (vi.j) this.b;
                jVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                xh.e eVar = ((xh.f) this.b).f;
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
        long j10;
        float f7;
        switch (this.a) {
            case 3:
                na1 na1Var = (na1) this.b;
                if (na1Var.r == 1) {
                    na1Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 4));
                    na1Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((vi.j) this.b).a0) {
                    ((vi.j) this.b).a0 = false;
                    vi.n nVar = ((vi.j) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    vi.j jVar = (vi.j) this.b;
                    sb2.append(jVar.n0 ? "DUAL_ACTIVE" : jVar.E0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(vi.j.z(((vi.j) this.b).I0));
                    nVar.b(sb2.toString());
                    vi.u0 u0Var = (vi.u0) ((vi.j) this.b).k.b;
                    Handler handler = u0Var.i;
                    li.e3 e3Var = u0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                vi.j jVar2 = (vi.j) this.b;
                if (jVar2.J0 == 0) {
                    jVar2.J0 = elapsedRealtimeNanos;
                    vi.n nVar2 = jVar2.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((vi.j) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((vi.j) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((vi.j) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((vi.j) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((vi.j) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((vi.j) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((vi.j) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((vi.j) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((vi.j) this.b).c.getDisplay().getRefreshRate()));
                    nVar2.b(sb3.toString());
                }
                vi.j jVar3 = (vi.j) this.b;
                long j11 = jVar3.L0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar3.N0++;
                    jVar3.O0 += j12;
                    j10 = 0;
                    double d = j12;
                    jVar3.P0 = (d * d) + jVar3.P0;
                    long j13 = jVar3.Q0;
                    if (j13 == 0 || j12 < j13) {
                        jVar3.Q0 = j12;
                    }
                    jVar3.R0 = Math.max(jVar3.R0, j12);
                    if (j12 > 50000000) {
                        jVar3.S0++;
                    }
                    if (j12 > 100000000) {
                        jVar3.T0++;
                    }
                } else {
                    j10 = 0;
                }
                vi.j jVar4 = (vi.j) this.b;
                jVar4.L0 = elapsedRealtimeNanos;
                long j14 = jVar4.M0;
                if (timestamp > j14) {
                    if (jVar4.V0 == j10) {
                        jVar4.V0 = timestamp;
                    }
                    jVar4.W0 = timestamp;
                    jVar4.U0++;
                } else if (j14 != j10) {
                    jVar4.X0++;
                }
                jVar4.M0 = timestamp;
                jVar4.K0++;
                long j15 = elapsedRealtimeNanos - jVar4.J0;
                if (j15 >= 5000000000L) {
                    TextureView textureView = jVar4.c;
                    long j16 = jVar4.W0 - jVar4.V0;
                    if (j16 > j10) {
                        if (jVar4.U0 > 1) {
                            f7 = ((r14 - 1) * 1.0E9f) / j16;
                            jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.K0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (jVar4.Q0 / 1000000.0f) + ", max=" + (jVar4.R0 / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.J0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.K0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.O0, jVar4.N0) + ", min=" + (jVar4.Q0 / 1000000.0f) + ", max=" + (jVar4.R0 / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.P0, jVar4.O0, jVar4.N0) + "}, gaps={over50ms=" + jVar4.S0 + ", over100ms=" + jVar4.T0 + "}, nonMonotonicTimestamps=" + jVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar4.P();
                    jVar4.J0 = elapsedRealtimeNanos;
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
