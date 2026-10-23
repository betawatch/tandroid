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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class t50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.t11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.t11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                n60 n60Var = (n60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (n60Var.m0 == null && surfaceTexture != null && !n60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    n60Var.m0 = new x50(n60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final y11 y11Var = (y11) this.b;
                ArrayList arrayList = y11Var.c;
                w11 w11Var = y11Var.a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.t11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                y11Var.invalidate();
                                break;
                            default:
                                y11 y11Var2 = y11Var;
                                Runnable runnable = y11Var2.d;
                                if (runnable != null) {
                                    y11Var2.e = true;
                                    y11Var2.d = null;
                                    y11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                w11 w11Var2 = new w11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.t11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                y11Var.invalidate();
                                break;
                            default:
                                y11 y11Var2 = y11Var;
                                Runnable runnable = y11Var2.d;
                                if (runnable != null) {
                                    y11Var2.e = true;
                                    y11Var2.d = null;
                                    y11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                y11Var.a = w11Var2;
                w11Var2.a = EmuDetector.with(y11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        x11 x11Var = (x11) arrayList.get(i14);
                        Bitmap bitmap = x11Var.e;
                        if (bitmap != null) {
                            y11Var.a.c(x11Var.f, bitmap, x11Var.c, x11Var.d);
                        } else {
                            ArrayList arrayList2 = x11Var.b;
                            if (arrayList2 != null) {
                                y11Var.a.f(arrayList2, x11Var.d);
                            } else {
                                y11Var.a.d(x11Var.a, x11Var.g, x11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(y11Var.b);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                si.j jVar = (si.j) this.b;
                jVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = jVar.n;
                if (jVar.V && handler != null && jVar.c.isAvailable()) {
                    handler.post(new si.a(jVar, 7));
                    break;
                }
                break;
            default:
                wh.f fVar = (wh.f) this.b;
                if (fVar.f == null) {
                    wh.e eVar = new wh.e(fVar, surfaceTexture, i10, i11, new wh.d(fVar, 1));
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
                n60 n60Var = (n60) this.b;
                Camera2Session[] camera2SessionArr = n60Var.v0;
                x50 x50Var = n60Var.m0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    n60Var.m0 = null;
                }
                if (n60Var.s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (n60Var.t0 != null) {
                    CameraController.getInstance().close(n60Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                ((dh0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                break;
            case 2:
                y11 y11Var = (y11) this.b;
                w11 w11Var = y11Var.a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.a = null;
                }
                Runnable runnable = y11Var.d;
                if (runnable != null) {
                    y11Var.d = null;
                    y11.b(runnable);
                    break;
                }
                break;
            case 3:
                da1 da1Var = (da1) this.b;
                TextureView textureView = da1Var.d;
                if (da1Var.S) {
                    if (da1Var.W) {
                        da1Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    da1Var.S = false;
                    break;
                }
                break;
            case 4:
                ((si.j) this.b).j.b("preview surface destroyed: active=" + ((si.j) this.b).V);
                if (((si.j) this.b).V) {
                    ((si.j) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            default:
                wh.e eVar = ((wh.f) this.b).f;
                if (eVar != null) {
                    eVar.a = false;
                    ((wh.f) this.b).f = null;
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
                x50 x50Var = ((n60) this.b).m0;
                if (x50Var != null) {
                    x50Var.F = i10;
                    x50Var.G = i11;
                    x50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                w11 w11Var = ((y11) this.b).a;
                if (w11Var == null || (handler = w11Var.getHandler()) == null || !w11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
                return;
            case 4:
                si.j jVar = (si.j) this.b;
                jVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                jVar.d0();
                return;
            default:
                wh.e eVar = ((wh.f) this.b).f;
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
                da1 da1Var = (da1) this.b;
                if (da1Var.r == 1) {
                    da1Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 4));
                    da1Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((si.j) this.b).a0) {
                    ((si.j) this.b).a0 = false;
                    si.n nVar = ((si.j) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    si.j jVar = (si.j) this.b;
                    sb2.append(jVar.m0 ? "DUAL_ACTIVE" : jVar.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(si.j.z(((si.j) this.b).H0));
                    nVar.b(sb2.toString());
                    si.u0 u0Var = (si.u0) ((si.j) this.b).k.b;
                    Handler handler = u0Var.i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new org.telegram.ui.web.a2(fVar, 27));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                si.j jVar2 = (si.j) this.b;
                if (jVar2.I0 == 0) {
                    jVar2.I0 = elapsedRealtimeNanos;
                    si.n nVar2 = jVar2.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((si.j) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((si.j) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((si.j) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((si.j) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((si.j) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((si.j) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((si.j) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((si.j) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((si.j) this.b).c.getDisplay().getRefreshRate()));
                    nVar2.b(sb3.toString());
                }
                si.j jVar3 = (si.j) this.b;
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
                si.j jVar4 = (si.j) this.b;
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
                            jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.j.j(jVar4.N0, jVar4.M0) + ", min=" + (jVar4.P0 / 1000000.0f) + ", max=" + (jVar4.Q0 / 1000000.0f) + ", jitter=" + si.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            jVar4.P();
                            jVar4.I0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    jVar4.j.b("preview frame delivery: callbackFps=" + ((jVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.j.j(jVar4.N0, jVar4.M0) + ", min=" + (jVar4.P0 / 1000000.0f) + ", max=" + (jVar4.Q0 / 1000000.0f) + ", jitter=" + si.j.W(jVar4.O0, jVar4.N0, jVar4.M0) + "}, gaps={over50ms=" + jVar4.R0 + ", over100ms=" + jVar4.S0 + "}, nonMonotonicTimestamps=" + jVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
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
