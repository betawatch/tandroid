package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class z30 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.az0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.az0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                r40 r40Var = (r40) this.b;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (r40Var.m0 == null && surfaceTexture != null && !r40Var.l0) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    r40Var.m0 = new d40(r40Var, surfaceTexture, i7, i10);
                    break;
                }
                break;
            case 1:
                final fz0 fz0Var = (fz0) this.b;
                ArrayList arrayList = fz0Var.c;
                dz0 dz0Var = fz0Var.a;
                if (dz0Var != null) {
                    dz0Var.h();
                    fz0Var.a = null;
                }
                final int i11 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.az0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                fz0Var.invalidate();
                                break;
                            default:
                                fz0 fz0Var2 = fz0Var;
                                Runnable runnable = fz0Var2.d;
                                if (runnable != null) {
                                    fz0Var2.e = true;
                                    fz0Var2.d = null;
                                    fz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                dz0 dz0Var2 = new dz0(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.az0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                fz0Var.invalidate();
                                break;
                            default:
                                fz0 fz0Var2 = fz0Var;
                                Runnable runnable = fz0Var2.d;
                                if (runnable != null) {
                                    fz0Var2.e = true;
                                    fz0Var2.d = null;
                                    fz0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i7, i10);
                fz0Var.a = dz0Var2;
                dz0Var2.a = org.telegram.messenger.n6.h(fz0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        ez0 ez0Var = (ez0) arrayList.get(i13);
                        Bitmap bitmap = ez0Var.e;
                        if (bitmap != null) {
                            fz0Var.a.c(ez0Var.f, bitmap, ez0Var.c, ez0Var.d);
                        } else {
                            ArrayList arrayList2 = ez0Var.b;
                            if (arrayList2 != null) {
                                fz0Var.a.d(arrayList2, ez0Var.d);
                            } else {
                                fz0Var.a.b(ez0Var.g, ez0Var.a, ez0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(fz0Var.b);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                EglRenderer eglRenderer = u0Var.a;
                if (!u0Var.c && u0Var.b != surfaceTexture) {
                    u0Var.b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    break;
                }
                break;
            case 4:
                xh.e eVar = (xh.e) this.b;
                if (eVar.f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f = dVar;
                    dVar.start();
                    break;
                }
                break;
            default:
                zi.l lVar = (zi.l) this.b;
                lVar.j.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = lVar.n;
                if (lVar.U && handler != null && lVar.c.isAvailable()) {
                    handler.post(new zi.a(lVar, 8));
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                r40 r40Var = (r40) this.b;
                Camera2Session[] camera2SessionArr = r40Var.v0;
                d40 d40Var = r40Var.m0;
                if (d40Var != null) {
                    d40Var.a(0, true, 0, 0, 0L);
                    r40Var.m0 = null;
                }
                if (r40Var.s0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    break;
                } else if (r40Var.t0 != null) {
                    CameraController.getInstance().close(r40Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                fz0 fz0Var = (fz0) this.b;
                dz0 dz0Var = fz0Var.a;
                if (dz0Var != null) {
                    dz0Var.h();
                    fz0Var.a = null;
                }
                Runnable runnable = fz0Var.d;
                if (runnable != null) {
                    fz0Var.d = null;
                    fz0.b(runnable);
                    break;
                }
                break;
            case 2:
                m71 m71Var = (m71) this.b;
                TextureView textureView = m71Var.d;
                if (m71Var.T) {
                    if (m71Var.a0) {
                        m71Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    m71Var.T = false;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                xh.d dVar = ((xh.e) this.b).f;
                if (dVar != null) {
                    dVar.a = false;
                    ((xh.e) this.b).f = null;
                    break;
                }
                break;
            default:
                ((zi.l) this.b).j.b("preview surface destroyed: active=" + ((zi.l) this.b).U);
                if (((zi.l) this.b).U) {
                    ((zi.l) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        Handler handler;
        switch (this.a) {
            case 0:
                d40 d40Var = ((r40) this.b).m0;
                if (d40Var != null) {
                    d40Var.G = i7;
                    d40Var.H = i10;
                    d40Var.b();
                    return;
                }
                return;
            case 1:
                dz0 dz0Var = ((fz0) this.b).a;
                if (dz0Var == null || (handler = dz0Var.getHandler()) == null || !dz0Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i7, i10));
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (i7 <= 0 || i10 <= 0) {
                    return;
                }
                u0Var.a.setLayoutAspectRatio(i7 / i10);
                return;
            case 4:
                xh.d dVar = ((xh.e) this.b).f;
                if (dVar != null) {
                    synchronized (dVar.e) {
                        dVar.f = true;
                        dVar.h = i7;
                        dVar.n = i10;
                    }
                    return;
                }
                return;
            default:
                zi.l lVar = (zi.l) this.b;
                lVar.j.b("preview surface size changed: view=" + i7 + "x" + i10);
                lVar.a0();
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        float f10;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                m71 m71Var = (m71) this.b;
                if (m71Var.r == 1) {
                    m71Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    m71Var.n.invalidate();
                    break;
                }
                break;
            case 3:
            case 4:
                break;
            default:
                if (((zi.l) this.b).X) {
                    ((zi.l) this.b).X = false;
                    zi.p pVar = ((zi.l) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    sb2.append(((zi.l) this.b).k0 ? "DUAL_ACTIVE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(zi.l.z(((zi.l) this.b).F0));
                    pVar.b(sb2.toString());
                    zi.v0 v0Var = (zi.v0) ((zi.l) this.b).k.a;
                    Handler handler = v0Var.i;
                    ff ffVar = v0Var.d;
                    Objects.requireNonNull(ffVar);
                    handler.post(new vg.o(ffVar, 14));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                zi.l lVar = (zi.l) this.b;
                if (lVar.G0 == 0) {
                    lVar.G0 = elapsedRealtimeNanos;
                    zi.p pVar2 = lVar.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((zi.l) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((zi.l) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((zi.l) this.b).c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((zi.l) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((zi.l) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((zi.l) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((zi.l) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((zi.l) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((zi.l) this.b).c.getDisplay().getRefreshRate()));
                    pVar2.b(sb3.toString());
                }
                zi.l lVar2 = (zi.l) this.b;
                long j10 = lVar2.I0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    lVar2.K0++;
                    lVar2.L0 += j11;
                    j3 = 0;
                    double d = j11;
                    lVar2.M0 = (d * d) + lVar2.M0;
                    long j12 = lVar2.N0;
                    if (j12 == 0 || j11 < j12) {
                        lVar2.N0 = j11;
                    }
                    lVar2.O0 = Math.max(lVar2.O0, j11);
                    if (j11 > 50000000) {
                        lVar2.P0++;
                    }
                    if (j11 > 100000000) {
                        lVar2.Q0++;
                    }
                } else {
                    j3 = 0;
                }
                zi.l lVar3 = (zi.l) this.b;
                lVar3.I0 = elapsedRealtimeNanos;
                long j13 = lVar3.J0;
                if (timestamp > j13) {
                    if (lVar3.S0 == j3) {
                        lVar3.S0 = timestamp;
                    }
                    lVar3.T0 = timestamp;
                    lVar3.R0++;
                } else if (j13 != j3) {
                    lVar3.U0++;
                }
                lVar3.J0 = timestamp;
                lVar3.H0++;
                long j14 = elapsedRealtimeNanos - lVar3.G0;
                if (j14 >= 5000000000L) {
                    TextureView textureView2 = lVar3.c;
                    long j15 = lVar3.T0 - lVar3.S0;
                    if (j15 > j3) {
                        if (lVar3.R0 > 1) {
                            f10 = ((r14 - 1) * 1.0E9f) / j15;
                            lVar3.j.b("preview frame delivery: callbackFps=" + ((lVar3.H0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.l.i(lVar3.L0, lVar3.K0) + ", min=" + (lVar3.N0 / 1000000.0f) + ", max=" + (lVar3.O0 / 1000000.0f) + ", jitter=" + zi.l.U(lVar3.M0, lVar3.L0, lVar3.K0) + "}, gaps={over50ms=" + lVar3.P0 + ", over100ms=" + lVar3.Q0 + "}, nonMonotonicTimestamps=" + lVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            lVar3.O();
                            lVar3.G0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f10 = 0.0f;
                    lVar3.j.b("preview frame delivery: callbackFps=" + ((lVar3.H0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + zi.l.i(lVar3.L0, lVar3.K0) + ", min=" + (lVar3.N0 / 1000000.0f) + ", max=" + (lVar3.O0 / 1000000.0f) + ", jitter=" + zi.l.U(lVar3.M0, lVar3.L0, lVar3.K0) + "}, gaps={over50ms=" + lVar3.P0 + ", over100ms=" + lVar3.Q0 + "}, nonMonotonicTimestamps=" + lVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                    lVar3.O();
                    lVar3.G0 = elapsedRealtimeNanos;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void d(SurfaceTexture surfaceTexture) {
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i7, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i7, int i10) {
    }
}
