package li;

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
import org.telegram.ui.Cells.da;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.y11;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.s11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.s11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                lVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = lVar.n;
                if (lVar.V && handler != null && lVar.c.isAvailable()) {
                    handler.post(new a(lVar, 6));
                    break;
                }
                break;
            case 1:
                p60 p60Var = (p60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (p60Var.m0 == null && surfaceTexture != null && !p60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    p60Var.m0 = new a60(p60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final y11 y11Var = (y11) this.b;
                ArrayList arrayList = y11Var.c;
                w11 w11Var = y11Var.a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.s11
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
                w11 w11Var2 = new w11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.s11
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
            case 4:
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
                ((l) this.b).j.b("preview surface destroyed: active=" + ((l) this.b).V);
                if (!((l) this.b).V) {
                    return true;
                }
                ((l) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                p60 p60Var = (p60) this.b;
                Camera2Session[] camera2SessionArr = p60Var.v0;
                a60 a60Var = p60Var.m0;
                if (a60Var != null) {
                    a60Var.b(0L, 0, true, 0, 0);
                    p60Var.m0 = null;
                }
                if (!p60Var.s0) {
                    if (p60Var.t0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(p60Var.t0, null, null);
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
                ((fh0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                y11 y11Var = (y11) this.b;
                w11 w11Var = y11Var.a;
                if (w11Var != null) {
                    w11Var.i();
                    y11Var.a = null;
                }
                Runnable runnable = y11Var.d;
                if (runnable == null) {
                    return false;
                }
                y11Var.d = null;
                y11.b(runnable);
                return false;
            case 4:
                ca1 ca1Var = (ca1) this.b;
                TextureView textureView = ca1Var.d;
                if (!ca1Var.S) {
                    return true;
                }
                if (ca1Var.W) {
                    ca1Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                ca1Var.S = false;
                return false;
            default:
                wh.e eVar = ((wh.f) this.b).f;
                if (eVar == null) {
                    return true;
                }
                eVar.a = false;
                ((wh.f) this.b).f = null;
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                lVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                lVar.d0();
                return;
            case 1:
                a60 a60Var = ((p60) this.b).m0;
                if (a60Var != null) {
                    a60Var.F = i10;
                    a60Var.G = i11;
                    a60Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                w11 w11Var = ((y11) this.b).a;
                if (w11Var == null || (handler = w11Var.getHandler()) == null || !w11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 4:
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
            case 0:
                if (((l) this.b).a0) {
                    ((l) this.b).a0 = false;
                    p pVar = ((l) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    l lVar = (l) this.b;
                    sb2.append(lVar.m0 ? "DUAL_ACTIVE" : lVar.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(l.z(((l) this.b).H0));
                    pVar.b(sb2.toString());
                    u0 u0Var = (u0) ((l) this.b).k.b;
                    Handler handler = u0Var.i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new ig.t0(fVar, 16));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                l lVar2 = (l) this.b;
                if (lVar2.I0 == 0) {
                    lVar2.I0 = elapsedRealtimeNanos;
                    p pVar2 = lVar2.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((l) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((l) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((l) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((l) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((l) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((l) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((l) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((l) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((l) this.b).c.getDisplay().getRefreshRate()));
                    pVar2.b(sb3.toString());
                }
                l lVar3 = (l) this.b;
                long j11 = lVar3.K0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    lVar3.M0++;
                    lVar3.N0 += j12;
                    j10 = 0;
                    double d = j12;
                    lVar3.O0 = (d * d) + lVar3.O0;
                    long j13 = lVar3.P0;
                    if (j13 == 0 || j12 < j13) {
                        lVar3.P0 = j12;
                    }
                    lVar3.Q0 = Math.max(lVar3.Q0, j12);
                    if (j12 > 50000000) {
                        lVar3.R0++;
                    }
                    if (j12 > 100000000) {
                        lVar3.S0++;
                    }
                } else {
                    j10 = 0;
                }
                l lVar4 = (l) this.b;
                lVar4.K0 = elapsedRealtimeNanos;
                long j14 = lVar4.L0;
                if (timestamp > j14) {
                    if (lVar4.U0 == j10) {
                        lVar4.U0 = timestamp;
                    }
                    lVar4.V0 = timestamp;
                    lVar4.T0++;
                } else if (j14 != j10) {
                    lVar4.W0++;
                }
                lVar4.L0 = timestamp;
                lVar4.J0++;
                long j15 = elapsedRealtimeNanos - lVar4.I0;
                if (j15 >= 5000000000L) {
                    TextureView textureView = lVar4.c;
                    long j16 = lVar4.V0 - lVar4.U0;
                    if (j16 > j10) {
                        if (lVar4.T0 > 1) {
                            f7 = ((r14 - 1) * 1.0E9f) / j16;
                            lVar4.j.b("preview frame delivery: callbackFps=" + ((lVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.N0, lVar4.M0) + ", min=" + (lVar4.P0 / 1000000.0f) + ", max=" + (lVar4.Q0 / 1000000.0f) + ", jitter=" + l.W(lVar4.O0, lVar4.N0, lVar4.M0) + "}, gaps={over50ms=" + lVar4.R0 + ", over100ms=" + lVar4.S0 + "}, nonMonotonicTimestamps=" + lVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            lVar4.P();
                            lVar4.I0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    lVar4.j.b("preview frame delivery: callbackFps=" + ((lVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.N0, lVar4.M0) + ", min=" + (lVar4.P0 / 1000000.0f) + ", max=" + (lVar4.Q0 / 1000000.0f) + ", jitter=" + l.W(lVar4.O0, lVar4.N0, lVar4.M0) + "}, gaps={over50ms=" + lVar4.R0 + ", over100ms=" + lVar4.S0 + "}, nonMonotonicTimestamps=" + lVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    lVar4.P();
                    lVar4.I0 = elapsedRealtimeNanos;
                }
                break;
            case 4:
                ca1 ca1Var = (ca1) this.b;
                if (ca1Var.r == 1) {
                    ca1Var.n.getViewTreeObserver().addOnPreDrawListener(new da(this, 4));
                    ca1Var.n.invalidate();
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
