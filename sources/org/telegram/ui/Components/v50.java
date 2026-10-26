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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.b21] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.b21] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                o60 o60Var = (o60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (o60Var.m0 == null && surfaceTexture != null && !o60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    o60Var.m0 = new z50(o60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final g21 g21Var = (g21) this.b;
                ArrayList arrayList = g21Var.c;
                e21 e21Var = g21Var.a;
                if (e21Var != null) {
                    e21Var.i();
                    g21Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.b21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                g21Var.invalidate();
                                break;
                            default:
                                g21 g21Var2 = g21Var;
                                Runnable runnable = g21Var2.d;
                                if (runnable != null) {
                                    g21Var2.e = true;
                                    g21Var2.d = null;
                                    g21.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                e21 e21Var2 = new e21(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.b21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                g21Var.invalidate();
                                break;
                            default:
                                g21 g21Var2 = g21Var;
                                Runnable runnable = g21Var2.d;
                                if (runnable != null) {
                                    g21Var2.e = true;
                                    g21Var2.d = null;
                                    g21.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                g21Var.a = e21Var2;
                e21Var2.a = EmuDetector.with(g21Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        f21 f21Var = (f21) arrayList.get(i14);
                        Bitmap bitmap = f21Var.e;
                        if (bitmap != null) {
                            g21Var.a.c(f21Var.f, bitmap, f21Var.c, f21Var.d);
                        } else {
                            ArrayList arrayList2 = f21Var.b;
                            if (arrayList2 != null) {
                                g21Var.a.f(arrayList2, f21Var.d);
                            } else {
                                g21Var.a.d(f21Var.a, f21Var.g, f21Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(g21Var.b);
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
                o60 o60Var = (o60) this.b;
                Camera2Session[] camera2SessionArr = o60Var.v0;
                z50 z50Var = o60Var.m0;
                if (z50Var != null) {
                    z50Var.b(0L, 0, true, 0, 0);
                    o60Var.m0 = null;
                }
                if (o60Var.s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (o60Var.t0 != null) {
                    CameraController.getInstance().close(o60Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                ((ch0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                break;
            case 2:
                g21 g21Var = (g21) this.b;
                e21 e21Var = g21Var.a;
                if (e21Var != null) {
                    e21Var.i();
                    g21Var.a = null;
                }
                Runnable runnable = g21Var.d;
                if (runnable != null) {
                    g21Var.d = null;
                    g21.b(runnable);
                    break;
                }
                break;
            case 3:
                ma1 ma1Var = (ma1) this.b;
                TextureView textureView = ma1Var.d;
                if (ma1Var.S) {
                    if (ma1Var.W) {
                        ma1Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    ma1Var.S = false;
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
                z50 z50Var = ((o60) this.b).m0;
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
                e21 e21Var = ((g21) this.b).a;
                if (e21Var == null || (handler = e21Var.getHandler()) == null || !e21Var.b.get()) {
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
                ma1 ma1Var = (ma1) this.b;
                if (ma1Var.r == 1) {
                    ma1Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 4));
                    ma1Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((vi.j) this.b).a0) {
                    ((vi.j) this.b).a0 = false;
                    vi.n nVar = ((vi.j) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    vi.j jVar = (vi.j) this.b;
                    sb2.append(jVar.m0 ? "DUAL_ACTIVE" : jVar.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(vi.j.z(((vi.j) this.b).H0));
                    nVar.b(sb2.toString());
                    vi.s0 s0Var = (vi.s0) ((vi.j) this.b).k.b;
                    Handler handler = s0Var.i;
                    li.e3 e3Var = s0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                vi.j jVar2 = (vi.j) this.b;
                if (jVar2.I0 == 0) {
                    jVar2.I0 = elapsedRealtimeNanos;
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
                long j11 = jVar3.K0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar3.M0++;
                    jVar3.N0 += j12;
                    j10 = 0;
                    double d = j12;
                    jVar3.O0 = (d * d) + jVar3.O0;
                    long j13 = jVar3.P0;
                    if (j13 == 0 || j12 < j13) {
                        jVar3.P0 = j12;
                    }
                    jVar3.Q0 = Math.max(jVar3.Q0, j12);
                    if (j12 > 50000000) {
                        jVar3.R0++;
                    }
                    if (j12 > 100000000) {
                        jVar3.S0++;
                    }
                } else {
                    j10 = 0;
                }
                vi.j jVar4 = (vi.j) this.b;
                jVar4.K0 = elapsedRealtimeNanos;
                long j14 = jVar4.L0;
                if (timestamp > j14) {
                    if (jVar4.U0 == j10) {
                        jVar4.U0 = timestamp;
                    }
                    jVar4.V0 = timestamp;
                    jVar4.T0++;
                } else if (j14 != j10) {
                    jVar4.W0++;
                }
                jVar4.L0 = timestamp;
                jVar4.J0++;
                long j15 = elapsedRealtimeNanos - jVar4.I0;
                if (j15 >= 5000000000L) {
                    TextureView textureView = jVar4.c;
                    long j16 = jVar4.V0 - jVar4.U0;
                    if (j16 > j10) {
                        if (jVar4.T0 > 1) {
                            f7 = ((r14 - 1) * 1.0E9f) / j16;
                            jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.N0, jVar4.M0) + ", min=" + (jVar4.P0 / 1000000.0f) + ", max=" + (jVar4.Q0 / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.I0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + vi.j.j(jVar4.N0, jVar4.M0) + ", min=" + (jVar4.P0 / 1000000.0f) + ", max=" + (jVar4.Q0 / 1000000.0f) + ", jitter=" + vi.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    jVar4.P();
                    jVar4.I0 = elapsedRealtimeNanos;
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
