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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class t50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.o11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.o11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                m60 m60Var = (m60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (m60Var.m0 == null && surfaceTexture != null && !m60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    m60Var.m0 = new x50(m60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final t11 t11Var = (t11) this.b;
                ArrayList arrayList = t11Var.c;
                r11 r11Var = t11Var.a;
                if (r11Var != null) {
                    r11Var.i();
                    t11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.o11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                t11Var.invalidate();
                                break;
                            default:
                                t11 t11Var2 = t11Var;
                                Runnable runnable = t11Var2.d;
                                if (runnable != null) {
                                    t11Var2.e = true;
                                    t11Var2.d = null;
                                    t11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                r11 r11Var2 = new r11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.o11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                t11Var.invalidate();
                                break;
                            default:
                                t11 t11Var2 = t11Var;
                                Runnable runnable = t11Var2.d;
                                if (runnable != null) {
                                    t11Var2.e = true;
                                    t11Var2.d = null;
                                    t11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                t11Var.a = r11Var2;
                r11Var2.a = EmuDetector.with(t11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        s11 s11Var = (s11) arrayList.get(i14);
                        Bitmap bitmap = s11Var.e;
                        if (bitmap != null) {
                            t11Var.a.c(s11Var.f, bitmap, s11Var.c, s11Var.d);
                        } else {
                            ArrayList arrayList2 = s11Var.b;
                            if (arrayList2 != null) {
                                t11Var.a.f(arrayList2, s11Var.d);
                            } else {
                                t11Var.a.d(s11Var.a, s11Var.g, s11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(t11Var.b);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                si.k kVar = (si.k) this.b;
                kVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = kVar.n;
                if (kVar.V && handler != null && kVar.c.isAvailable()) {
                    handler.post(new si.b(kVar, 7));
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
                m60 m60Var = (m60) this.b;
                Camera2Session[] camera2SessionArr = m60Var.v0;
                x50 x50Var = m60Var.m0;
                if (x50Var != null) {
                    x50Var.b(0L, 0, true, 0, 0);
                    m60Var.m0 = null;
                }
                if (m60Var.s0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (m60Var.t0 != null) {
                    CameraController.getInstance().close(m60Var.t0, null, null);
                    break;
                }
                break;
            case 1:
                ((zg0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                break;
            case 2:
                t11 t11Var = (t11) this.b;
                r11 r11Var = t11Var.a;
                if (r11Var != null) {
                    r11Var.i();
                    t11Var.a = null;
                }
                Runnable runnable = t11Var.d;
                if (runnable != null) {
                    t11Var.d = null;
                    t11.b(runnable);
                    break;
                }
                break;
            case 3:
                u91 u91Var = (u91) this.b;
                TextureView textureView = u91Var.d;
                if (u91Var.S) {
                    if (u91Var.W) {
                        u91Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    u91Var.S = false;
                    break;
                }
                break;
            case 4:
                ((si.k) this.b).j.b("preview surface destroyed: active=" + ((si.k) this.b).V);
                if (((si.k) this.b).V) {
                    ((si.k) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
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
                x50 x50Var = ((m60) this.b).m0;
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
                r11 r11Var = ((t11) this.b).a;
                if (r11Var == null || (handler = r11Var.getHandler()) == null || !r11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
                return;
            case 4:
                si.k kVar = (si.k) this.b;
                kVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                kVar.d0();
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
                u91 u91Var = (u91) this.b;
                if (u91Var.r == 1) {
                    u91Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 4));
                    u91Var.n.invalidate();
                    break;
                }
                break;
            case 4:
                if (((si.k) this.b).a0) {
                    ((si.k) this.b).a0 = false;
                    si.o oVar = ((si.k) this.b).j;
                    StringBuilder sb2 = new StringBuilder("camera switch first preview frame: path=");
                    si.k kVar = (si.k) this.b;
                    sb2.append(kVar.m0 ? "DUAL_ACTIVE" : kVar.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(si.k.z(((si.k) this.b).H0));
                    oVar.b(sb2.toString());
                    si.s0 s0Var = (si.s0) ((si.k) this.b).k.b;
                    Handler handler = s0Var.i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new org.telegram.ui.web.z1(fVar, 27));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                si.k kVar2 = (si.k) this.b;
                if (kVar2.I0 == 0) {
                    kVar2.I0 = elapsedRealtimeNanos;
                    si.o oVar2 = kVar2.j;
                    StringBuilder sb3 = new StringBuilder("preview frame delivery started: thread=");
                    sb3.append(Thread.currentThread().getName());
                    sb3.append(", view=");
                    sb3.append(((si.k) this.b).c.getWidth());
                    sb3.append("x");
                    sb3.append(((si.k) this.b).c.getHeight());
                    sb3.append(", buffer=");
                    sb3.append(((si.k) this.b).q);
                    sb3.append(", attached=");
                    sb3.append(((si.k) this.b).c.isAttachedToWindow());
                    sb3.append(", shown=");
                    sb3.append(((si.k) this.b).c.isShown());
                    sb3.append(", alpha=");
                    sb3.append(((si.k) this.b).c.getAlpha());
                    sb3.append(", hardwareAccelerated=");
                    sb3.append(((si.k) this.b).c.isHardwareAccelerated());
                    sb3.append(", displayRefreshRate=");
                    sb3.append(((si.k) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((si.k) this.b).c.getDisplay().getRefreshRate()));
                    oVar2.b(sb3.toString());
                }
                si.k kVar3 = (si.k) this.b;
                long j11 = kVar3.K0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    kVar3.M0++;
                    kVar3.N0 += j12;
                    j10 = 0;
                    double d = j12;
                    kVar3.O0 = (d * d) + kVar3.O0;
                    long j13 = kVar3.P0;
                    if (j13 == 0 || j12 < j13) {
                        kVar3.P0 = j12;
                    }
                    kVar3.Q0 = Math.max(kVar3.Q0, j12);
                    if (j12 > 50000000) {
                        kVar3.R0++;
                    }
                    if (j12 > 100000000) {
                        kVar3.S0++;
                    }
                } else {
                    j10 = 0;
                }
                si.k kVar4 = (si.k) this.b;
                kVar4.K0 = elapsedRealtimeNanos;
                long j14 = kVar4.L0;
                if (timestamp > j14) {
                    if (kVar4.U0 == j10) {
                        kVar4.U0 = timestamp;
                    }
                    kVar4.V0 = timestamp;
                    kVar4.T0++;
                } else if (j14 != j10) {
                    kVar4.W0++;
                }
                kVar4.L0 = timestamp;
                kVar4.J0++;
                long j15 = elapsedRealtimeNanos - kVar4.I0;
                if (j15 >= 5000000000L) {
                    TextureView textureView = kVar4.c;
                    long j16 = kVar4.V0 - kVar4.U0;
                    if (j16 > j10) {
                        if (kVar4.T0 > 1) {
                            f7 = ((r14 - 1) * 1.0E9f) / j16;
                            kVar4.j.b("preview frame delivery: callbackFps=" + ((kVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.k.j(kVar4.N0, kVar4.M0) + ", min=" + (kVar4.P0 / 1000000.0f) + ", max=" + (kVar4.Q0 / 1000000.0f) + ", jitter=" + si.k.W(kVar4.O0, kVar4.N0, kVar4.M0) + "}, gaps={over50ms=" + kVar4.R0 + ", over100ms=" + kVar4.S0 + "}, nonMonotonicTimestamps=" + kVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            kVar4.P();
                            kVar4.I0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    kVar4.j.b("preview frame delivery: callbackFps=" + ((kVar4.J0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + si.k.j(kVar4.N0, kVar4.M0) + ", min=" + (kVar4.P0 / 1000000.0f) + ", max=" + (kVar4.Q0 / 1000000.0f) + ", jitter=" + si.k.W(kVar4.O0, kVar4.N0, kVar4.M0) + "}, gaps={over50ms=" + kVar4.R0 + ", over100ms=" + kVar4.S0 + "}, nonMonotonicTimestamps=" + kVar4.W0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    kVar4.P();
                    kVar4.I0 = elapsedRealtimeNanos;
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
