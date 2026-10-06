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
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.aa1;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.w11;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class d implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.q11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.q11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                iVar.j.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = iVar.n;
                if (iVar.S && handler != null && iVar.c.isAvailable()) {
                    handler.post(new a(iVar, 5));
                    break;
                }
                break;
            case 1:
                f60 f60Var = (f60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f60Var.m0 == null && surfaceTexture != null && !f60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    f60Var.m0 = new q50(f60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final w11 w11Var = (w11) this.b;
                ArrayList arrayList = w11Var.c;
                u11 u11Var = w11Var.a;
                if (u11Var != null) {
                    u11Var.i();
                    w11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.q11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                w11Var.invalidate();
                                break;
                            default:
                                w11 w11Var2 = w11Var;
                                Runnable runnable = w11Var2.d;
                                if (runnable != null) {
                                    w11Var2.e = true;
                                    w11Var2.d = null;
                                    w11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                u11 u11Var2 = new u11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.q11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                w11Var.invalidate();
                                break;
                            default:
                                w11 w11Var2 = w11Var;
                                Runnable runnable = w11Var2.d;
                                if (runnable != null) {
                                    w11Var2.e = true;
                                    w11Var2.d = null;
                                    w11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                w11Var.a = u11Var2;
                u11Var2.a = EmuDetector.with(w11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        v11 v11Var = (v11) arrayList.get(i14);
                        Bitmap bitmap = v11Var.e;
                        if (bitmap != null) {
                            w11Var.a.c(v11Var.f, bitmap, v11Var.c, v11Var.d);
                        } else {
                            ArrayList arrayList2 = v11Var.b;
                            if (arrayList2 != null) {
                                w11Var.a.f(arrayList2, v11Var.d);
                            } else {
                                w11Var.a.e(v11Var.a, v11Var.g, v11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(w11Var.b);
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
                ((i) this.b).j.b("preview surface destroyed: active=" + ((i) this.b).S);
                if (!((i) this.b).S) {
                    return true;
                }
                ((i) this.b).t(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                f60 f60Var = (f60) this.b;
                Camera2Session[] camera2SessionArr = f60Var.v0;
                q50 q50Var = f60Var.m0;
                if (q50Var != null) {
                    q50Var.b(0L, 0, true, 0, 0);
                    f60Var.m0 = null;
                }
                if (!f60Var.s0) {
                    if (f60Var.t0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(f60Var.t0, null, null);
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
                w11 w11Var = (w11) this.b;
                u11 u11Var = w11Var.a;
                if (u11Var != null) {
                    u11Var.i();
                    w11Var.a = null;
                }
                Runnable runnable = w11Var.d;
                if (runnable == null) {
                    return false;
                }
                w11Var.d = null;
                w11.b(runnable);
                return false;
            case 4:
                aa1 aa1Var = (aa1) this.b;
                TextureView textureView = aa1Var.d;
                if (!aa1Var.S) {
                    return true;
                }
                if (aa1Var.W) {
                    aa1Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                aa1Var.S = false;
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
                i iVar = (i) this.b;
                iVar.j.b("preview surface size changed: view=" + i10 + "x" + i11);
                iVar.G();
                return;
            case 1:
                q50 q50Var = ((f60) this.b).m0;
                if (q50Var != null) {
                    q50Var.F = i10;
                    q50Var.G = i11;
                    q50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                u11 u11Var = ((w11) this.b).a;
                if (u11Var == null || (handler = u11Var.getHandler()) == null || !u11Var.b.get()) {
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
                if (((i) this.b).X) {
                    ((i) this.b).X = false;
                    ((i) this.b).j.b("camera switch first preview frame");
                    s0 s0Var = (s0) ((i) this.b).k.b;
                    Handler handler = s0Var.i;
                    l2.g gVar = s0Var.d;
                    Objects.requireNonNull(gVar);
                    handler.post(new i2.h0(gVar, 10));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                i iVar = (i) this.b;
                if (iVar.j0 == 0) {
                    iVar.j0 = elapsedRealtimeNanos;
                    m mVar = iVar.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((i) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((i) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    sb2.append(((i) this.b).q);
                    sb2.append(", attached=");
                    sb2.append(((i) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((i) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((i) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((i) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    sb2.append(((i) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((i) this.b).c.getDisplay().getRefreshRate()));
                    mVar.b(sb2.toString());
                }
                i iVar2 = (i) this.b;
                long j10 = iVar2.l0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    iVar2.n0++;
                    iVar2.o0 += j11;
                    j3 = 0;
                    double d = j11;
                    iVar2.p0 = (d * d) + iVar2.p0;
                    long j12 = iVar2.q0;
                    if (j12 == 0 || j11 < j12) {
                        iVar2.q0 = j11;
                    }
                    iVar2.r0 = Math.max(iVar2.r0, j11);
                    if (j11 > 50000000) {
                        iVar2.s0++;
                    }
                    if (j11 > 100000000) {
                        iVar2.t0++;
                    }
                } else {
                    j3 = 0;
                }
                i iVar3 = (i) this.b;
                iVar3.l0 = elapsedRealtimeNanos;
                long j13 = iVar3.m0;
                if (timestamp > j13) {
                    if (iVar3.v0 == j3) {
                        iVar3.v0 = timestamp;
                    }
                    iVar3.w0 = timestamp;
                    iVar3.u0++;
                } else if (j13 != j3) {
                    iVar3.x0++;
                }
                iVar3.m0 = timestamp;
                iVar3.k0++;
                long j14 = elapsedRealtimeNanos - iVar3.j0;
                if (j14 >= 5000000000L) {
                    TextureView textureView = iVar3.c;
                    long j15 = iVar3.w0 - iVar3.v0;
                    if (j15 > j3) {
                        if (iVar3.u0 > 1) {
                            f7 = ((r13 - 1) * 1.0E9f) / j15;
                            iVar3.j.b("preview frame delivery: callbackFps=" + ((iVar3.k0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.o0, iVar3.n0) + ", min=" + (iVar3.q0 / 1000000.0f) + ", max=" + (iVar3.r0 / 1000000.0f) + ", jitter=" + i.B(iVar3.p0, iVar3.o0, iVar3.n0) + "}, gaps={over50ms=" + iVar3.s0 + ", over100ms=" + iVar3.t0 + "}, nonMonotonicTimestamps=" + iVar3.x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                            iVar3.v();
                            iVar3.j0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f7 = 0.0f;
                    iVar3.j.b("preview frame delivery: callbackFps=" + ((iVar3.k0 * 1.0E9f) / j14) + ", timestampFps=" + f7 + ", callbackIntervalMs={avg=" + i.c(iVar3.o0, iVar3.n0) + ", min=" + (iVar3.q0 / 1000000.0f) + ", max=" + (iVar3.r0 / 1000000.0f) + ", jitter=" + i.B(iVar3.p0, iVar3.o0, iVar3.n0) + "}, gaps={over50ms=" + iVar3.s0 + ", over100ms=" + iVar3.t0 + "}, nonMonotonicTimestamps=" + iVar3.x0 + ", viewState={shown=" + textureView.isShown() + ", alpha=" + textureView.getAlpha() + ", windowVisibility=" + textureView.getWindowVisibility() + "}");
                    iVar3.v();
                    iVar3.j0 = elapsedRealtimeNanos;
                }
                break;
            case 4:
                aa1 aa1Var = (aa1) this.b;
                if (aa1Var.r == 1) {
                    aa1Var.n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    aa1Var.n.invalidate();
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
