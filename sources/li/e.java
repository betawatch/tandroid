package li;

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
import org.telegram.messenger.f8;
import org.telegram.messenger.o6;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.l1;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.r40;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.telegram.ui.Components.b01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.b01] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                lVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = lVar.n;
                if (lVar.V && handler != null && lVar.c.isAvailable()) {
                    handler.post(new a(lVar, 7));
                    break;
                }
                break;
            case 1:
                nh.h hVar = (nh.h) this.b;
                if (hVar.f == null) {
                    nh.g gVar = new nh.g(hVar, surfaceTexture, i10, i11, new nh.e(hVar, 1));
                    hVar.f = gVar;
                    gVar.start();
                    break;
                }
                break;
            case 2:
                e50 e50Var = (e50) this.b;
                if (v2.a) {
                    f8.b("InstantCamera camera surface available");
                }
                if (e50Var.l0 == null && surfaceTexture != null && !e50Var.k0) {
                    if (v2.a) {
                        f8.b("InstantCamera start create thread");
                    }
                    e50Var.l0 = new r40(e50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 4:
                final h01 h01Var = (h01) this.b;
                ArrayList arrayList = h01Var.c;
                f01 f01Var = h01Var.a;
                if (f01Var != null) {
                    f01Var.h();
                    h01Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.b01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                h01Var.invalidate();
                                break;
                            default:
                                h01 h01Var2 = h01Var;
                                Runnable runnable = h01Var2.d;
                                if (runnable != null) {
                                    h01Var2.e = true;
                                    h01Var2.d = null;
                                    h01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                f01 f01Var2 = new f01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.b01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                h01Var.invalidate();
                                break;
                            default:
                                h01 h01Var2 = h01Var;
                                Runnable runnable = h01Var2.d;
                                if (runnable != null) {
                                    h01Var2.e = true;
                                    h01Var2.d = null;
                                    h01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                h01Var.a = f01Var2;
                f01Var2.a = o6.h(h01Var.getContext()).f();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        g01 g01Var = (g01) arrayList.get(i14);
                        Bitmap bitmap = g01Var.e;
                        if (bitmap != null) {
                            h01Var.a.c(g01Var.f, bitmap, g01Var.c, g01Var.d);
                        } else {
                            ArrayList arrayList2 = g01Var.b;
                            if (arrayList2 != null) {
                                h01Var.a.d(arrayList2, g01Var.d);
                            } else {
                                h01Var.a.b(g01Var.g, g01Var.a, g01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(h01Var.b);
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
                if (((l) this.b).V) {
                    ((l) this.b).N(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                    break;
                }
                break;
            case 1:
                nh.g gVar = ((nh.h) this.b).f;
                if (gVar != null) {
                    gVar.a = false;
                    ((nh.h) this.b).f = null;
                    break;
                }
                break;
            case 2:
                e50 e50Var = (e50) this.b;
                Camera2Session[] camera2SessionArr = e50Var.u0;
                r40 r40Var = e50Var.l0;
                if (r40Var != null) {
                    r40Var.a(0, true, 0, 0, 0L);
                    e50Var.l0 = null;
                }
                if (e50Var.r0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (e50Var.s0 != null) {
                    CameraController.getInstance().close(e50Var.s0, null, null);
                    break;
                }
                break;
            case 3:
                ((jf0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                break;
            case 4:
                h01 h01Var = (h01) this.b;
                f01 f01Var = h01Var.a;
                if (f01Var != null) {
                    f01Var.h();
                    h01Var.a = null;
                }
                Runnable runnable = h01Var.d;
                if (runnable != null) {
                    h01Var.d = null;
                    h01.b(runnable);
                    break;
                }
                break;
            default:
                m81 m81Var = (m81) this.b;
                TextureView textureView = m81Var.d;
                if (m81Var.S) {
                    if (m81Var.W) {
                        m81Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    m81Var.S = false;
                    break;
                }
                break;
        }
        return false;
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
                nh.g gVar = ((nh.h) this.b).f;
                if (gVar != null) {
                    synchronized (gVar.e) {
                        gVar.f = true;
                        gVar.h = i10;
                        gVar.n = i11;
                    }
                    return;
                }
                return;
            case 2:
                r40 r40Var = ((e50) this.b).l0;
                if (r40Var != null) {
                    r40Var.F = i10;
                    r40Var.G = i11;
                    r40Var.b();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                f01 f01Var = ((h01) this.b).a;
                if (f01Var == null || (handler = f01Var.getHandler()) == null || !f01Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            default:
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
                    sb2.append(lVar.n0 ? "DUAL_ACTIVE" : lVar.E0 ? "WARM_DEVICE" : "SEQUENTIAL");
                    sb2.append(", totalElapsedMs=");
                    sb2.append(l.z(((l) this.b).I0));
                    pVar.b(sb2.toString());
                    x0 x0Var = (x0) ((l) this.b).k.b;
                    Handler handler = x0Var.i;
                    k2.m0 m0Var = x0Var.d;
                    Objects.requireNonNull(m0Var);
                    handler.post(new lg.s(m0Var, 3));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                l lVar2 = (l) this.b;
                if (lVar2.J0 == 0) {
                    lVar2.J0 = elapsedRealtimeNanos;
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
                long j11 = lVar3.L0;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    lVar3.N0++;
                    lVar3.O0 += j12;
                    j10 = 0;
                    double d = j12;
                    lVar3.P0 = (d * d) + lVar3.P0;
                    long j13 = lVar3.Q0;
                    if (j13 == 0 || j12 < j13) {
                        lVar3.Q0 = j12;
                    }
                    lVar3.R0 = Math.max(lVar3.R0, j12);
                    if (j12 > 50000000) {
                        lVar3.S0++;
                    }
                    if (j12 > 100000000) {
                        lVar3.T0++;
                    }
                } else {
                    j10 = 0;
                }
                l lVar4 = (l) this.b;
                lVar4.L0 = elapsedRealtimeNanos;
                long j14 = lVar4.M0;
                if (timestamp > j14) {
                    if (lVar4.V0 == j10) {
                        lVar4.V0 = timestamp;
                    }
                    lVar4.W0 = timestamp;
                    lVar4.U0++;
                } else if (j14 != j10) {
                    lVar4.X0++;
                }
                lVar4.M0 = timestamp;
                lVar4.K0++;
                long j15 = elapsedRealtimeNanos - lVar4.J0;
                if (j15 >= 5000000000L) {
                    TextureView textureView = lVar4.c;
                    long j16 = lVar4.W0 - lVar4.V0;
                    if (j16 > j10) {
                        if (lVar4.U0 > 1) {
                            f7 = ((r14 - 1) * 1.0E9f) / j16;
                            lVar4.j.b("preview frame delivery: callbackFps=" + ((lVar4.K0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.O0, lVar4.N0) + ", min=" + (lVar4.Q0 / 1000000.0f) + ", max=" + (lVar4.R0 / 1000000.0f) + ", jitter=" + l.W(lVar4.P0, lVar4.O0, lVar4.N0) + "}, gaps={over50ms=" + lVar4.S0 + ", over100ms=" + lVar4.T0 + "}, nonMonotonicTimestamps=" + lVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            lVar4.P();
                            lVar4.J0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    lVar4.j.b("preview frame delivery: callbackFps=" + ((lVar4.K0 * 1.0E9f) / j15) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + l.j(lVar4.O0, lVar4.N0) + ", min=" + (lVar4.Q0 / 1000000.0f) + ", max=" + (lVar4.R0 / 1000000.0f) + ", jitter=" + l.W(lVar4.P0, lVar4.O0, lVar4.N0) + "}, gaps={over50ms=" + lVar4.S0 + ", over100ms=" + lVar4.T0 + "}, nonMonotonicTimestamps=" + lVar4.X0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    lVar4.P();
                    lVar4.J0 = elapsedRealtimeNanos;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                m81 m81Var = (m81) this.b;
                if (m81Var.r == 1) {
                    m81Var.n.getViewTreeObserver().addOnPreDrawListener(new l1(this, 5));
                    m81Var.n.invalidate();
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
