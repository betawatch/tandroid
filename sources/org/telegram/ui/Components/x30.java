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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x30 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.zy0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.zy0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                p40 p40Var = (p40) this.b;
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera camera surface available");
                }
                if (p40Var.l0 == null && surfaceTexture != null && !p40Var.k0) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("InstantCamera start create thread");
                    }
                    p40Var.l0 = new b40(p40Var, surfaceTexture, i7, i10);
                    break;
                }
                break;
            case 1:
                final ez0 ez0Var = (ez0) this.b;
                ArrayList arrayList = ez0Var.c;
                cz0 cz0Var = ez0Var.a;
                if (cz0Var != null) {
                    cz0Var.h();
                    ez0Var.a = null;
                }
                final int i11 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.zy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ez0Var.invalidate();
                                break;
                            default:
                                ez0 ez0Var2 = ez0Var;
                                Runnable runnable = ez0Var2.d;
                                if (runnable != null) {
                                    ez0Var2.e = true;
                                    ez0Var2.d = null;
                                    ez0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                cz0 cz0Var2 = new cz0(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.zy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ez0Var.invalidate();
                                break;
                            default:
                                ez0 ez0Var2 = ez0Var;
                                Runnable runnable = ez0Var2.d;
                                if (runnable != null) {
                                    ez0Var2.e = true;
                                    ez0Var2.d = null;
                                    ez0.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i7, i10);
                ez0Var.a = cz0Var2;
                cz0Var2.a = org.telegram.messenger.n6.h(ez0Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        dz0 dz0Var = (dz0) arrayList.get(i13);
                        Bitmap bitmap = dz0Var.e;
                        if (bitmap != null) {
                            ez0Var.a.c(dz0Var.f, bitmap, dz0Var.c, dz0Var.d);
                        } else {
                            ArrayList arrayList2 = dz0Var.b;
                            if (arrayList2 != null) {
                                ez0Var.a.d(arrayList2, dz0Var.d);
                            } else {
                                ez0Var.a.b(dz0Var.g, dz0Var.a, dz0Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(ez0Var.b);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.b;
                EglRenderer eglRenderer = q0Var.a;
                if (!q0Var.c && q0Var.b != surfaceTexture) {
                    q0Var.b = surfaceTexture;
                    if (i7 > 0 && i10 > 0) {
                        eglRenderer.setLayoutAspectRatio(i7 / i10);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    break;
                }
                break;
            case 4:
                wi.k kVar = (wi.k) this.b;
                kVar.j.b("preview surface available: view=" + i7 + "x" + i10);
                Handler handler = kVar.n;
                if (kVar.U && handler != null && kVar.c.isAvailable()) {
                    handler.post(new wi.a(kVar, 8));
                    break;
                }
                break;
            default:
                xh.e eVar = (xh.e) this.b;
                if (eVar.f == null) {
                    xh.d dVar = new xh.d(eVar, surfaceTexture, i7, i10, new xh.c(eVar, 1));
                    eVar.f = dVar;
                    dVar.start();
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                p40 p40Var = (p40) this.b;
                Camera2Session[] camera2SessionArr = p40Var.u0;
                b40 b40Var = p40Var.l0;
                if (b40Var != null) {
                    b40Var.a(0, true, 0, 0, 0L);
                    p40Var.l0 = null;
                }
                if (p40Var.r0) {
                    for (int i7 = 0; i7 < camera2SessionArr.length; i7++) {
                        Camera2Session camera2Session = camera2SessionArr[i7];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i7] = null;
                        }
                    }
                    break;
                } else if (p40Var.s0 != null) {
                    CameraController.getInstance().close(p40Var.s0, null, null);
                    break;
                }
                break;
            case 1:
                ez0 ez0Var = (ez0) this.b;
                cz0 cz0Var = ez0Var.a;
                if (cz0Var != null) {
                    cz0Var.h();
                    ez0Var.a = null;
                }
                Runnable runnable = ez0Var.d;
                if (runnable != null) {
                    ez0Var.d = null;
                    ez0.b(runnable);
                    break;
                }
                break;
            case 2:
                m71 m71Var = (m71) this.b;
                TextureView textureView = m71Var.d;
                if (m71Var.S) {
                    if (m71Var.W) {
                        m71Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    m71Var.S = false;
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                ((wi.k) this.b).j.b("preview surface destroyed: active=" + ((wi.k) this.b).U);
                if (((wi.k) this.b).U) {
                    ((wi.k) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            default:
                xh.d dVar = ((xh.e) this.b).f;
                if (dVar != null) {
                    dVar.a = false;
                    ((xh.e) this.b).f = null;
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
                b40 b40Var = ((p40) this.b).l0;
                if (b40Var != null) {
                    b40Var.F = i7;
                    b40Var.G = i10;
                    b40Var.b();
                    return;
                }
                return;
            case 1:
                cz0 cz0Var = ((ez0) this.b).a;
                if (cz0Var == null || (handler = cz0Var.getHandler()) == null || !cz0Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i7, i10));
                return;
            case 2:
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.b;
                if (i7 <= 0 || i10 <= 0) {
                    return;
                }
                q0Var.a.setLayoutAspectRatio(i7 / i10);
                return;
            case 4:
                wi.k kVar = (wi.k) this.b;
                kVar.j.b("preview surface size changed: view=" + i7 + "x" + i10);
                kVar.a0();
                return;
            default:
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
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        float f10;
        switch (this.a) {
            case 2:
                m71 m71Var = (m71) this.b;
                if (m71Var.r == 1) {
                    m71Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 5));
                    m71Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((wi.k) this.b).X) {
                    ((wi.k) this.b).X = false;
                    wi.o oVar = ((wi.k) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    sb2.append(((wi.k) this.b).k0 ? "DUAL_ACTIVE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(wi.k.z(((wi.k) this.b).F0));
                    oVar.b(sb2.toString());
                    wi.t0 t0Var = (wi.t0) ((wi.k) this.b).k.b;
                    Handler handler = t0Var.i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.a0(rtVar, 1));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                wi.k kVar = (wi.k) this.b;
                if (kVar.G0 == 0) {
                    kVar.G0 = elapsedRealtimeNanos;
                    wi.o oVar2 = kVar.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((wi.k) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((wi.k) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    TextureView textureView = ((wi.k) this.b).c;
                    sb3.append(Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight()))));
                    sb3.append(", attached=");
                    sb3.append(((wi.k) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((wi.k) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((wi.k) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((wi.k) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((wi.k) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((wi.k) this.b).c.getDisplay().getRefreshRate()));
                    oVar2.b(sb3.toString());
                }
                wi.k kVar2 = (wi.k) this.b;
                long j10 = kVar2.I0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    kVar2.K0++;
                    kVar2.L0 += j11;
                    j3 = 0;
                    double d = j11;
                    kVar2.M0 = (d * d) + kVar2.M0;
                    long j12 = kVar2.N0;
                    if (j12 == 0 || j11 < j12) {
                        kVar2.N0 = j11;
                    }
                    kVar2.O0 = Math.max(kVar2.O0, j11);
                    if (j11 > 50000000) {
                        kVar2.P0++;
                    }
                    if (j11 > 100000000) {
                        kVar2.Q0++;
                    }
                } else {
                    j3 = 0;
                }
                wi.k kVar3 = (wi.k) this.b;
                kVar3.I0 = elapsedRealtimeNanos;
                long j13 = kVar3.J0;
                if (timestamp > j13) {
                    if (kVar3.S0 == j3) {
                        kVar3.S0 = timestamp;
                    }
                    kVar3.T0 = timestamp;
                    kVar3.R0++;
                } else if (j13 != j3) {
                    kVar3.U0++;
                }
                kVar3.J0 = timestamp;
                kVar3.H0++;
                long j14 = elapsedRealtimeNanos - kVar3.G0;
                if (j14 >= 5000000000L) {
                    TextureView textureView2 = kVar3.c;
                    long j15 = kVar3.T0 - kVar3.S0;
                    if (j15 > j3) {
                        if (kVar3.R0 > 1) {
                            f10 = ((r14 - 1) * 1.0E9f) / j15;
                            kVar3.j.b("preview frame delivery: callbackFps=" + ((kVar3.H0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (kVar3.N0 / 1000000.0f) + ", max=" + (kVar3.O0 / 1000000.0f) + ", jitter=" + wi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                            kVar3.O();
                            kVar3.G0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f10 = 0.0f;
                    kVar3.j.b("preview frame delivery: callbackFps=" + ((kVar3.H0 * 1.0E9f) / j14) + ", timestampFps=" + f10 + ", callbackIntervalMs={avg=" + wi.k.i(kVar3.L0, kVar3.K0) + ", min=" + (kVar3.N0 / 1000000.0f) + ", max=" + (kVar3.O0 / 1000000.0f) + ", jitter=" + wi.k.U(kVar3.M0, kVar3.L0, kVar3.K0) + "}, gaps={over50ms=" + kVar3.P0 + ", over100ms=" + kVar3.Q0 + "}, nonMonotonicTimestamps=" + kVar3.U0 + ", viewState={shown=" + textureView2.isShown() + ", alpha=" + textureView2.getAlpha() + ", windowVisibility=" + textureView2.getWindowVisibility() + "}");
                    kVar3.O();
                    kVar3.G0 = elapsedRealtimeNanos;
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
