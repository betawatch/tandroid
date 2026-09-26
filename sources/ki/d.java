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
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class d implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.e11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.e11] */
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
                c60 c60Var = (c60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (c60Var.m0 == null && surfaceTexture != null && !c60Var.l0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    c60Var.m0 = new n50(c60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final k11 k11Var = (k11) this.b;
                ArrayList arrayList = k11Var.c;
                i11 i11Var = k11Var.a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.e11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                k11Var.invalidate();
                                break;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                i11 i11Var2 = new i11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.e11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                k11Var.invalidate();
                                break;
                            default:
                                k11 k11Var2 = k11Var;
                                Runnable runnable = k11Var2.d;
                                if (runnable != null) {
                                    k11Var2.e = true;
                                    k11Var2.d = null;
                                    k11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                k11Var.a = i11Var2;
                i11Var2.a = EmuDetector.with(k11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        j11 j11Var = (j11) arrayList.get(i14);
                        Bitmap bitmap = j11Var.e;
                        if (bitmap != null) {
                            k11Var.a.c(j11Var.f, bitmap, j11Var.c, j11Var.d);
                        } else {
                            ArrayList arrayList2 = j11Var.b;
                            if (arrayList2 != null) {
                                k11Var.a.f(arrayList2, j11Var.d);
                            } else {
                                k11Var.a.e(j11Var.a, j11Var.g, j11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(k11Var.b);
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
                c60 c60Var = (c60) this.b;
                Camera2Session[] camera2SessionArr = c60Var.v0;
                n50 n50Var = c60Var.m0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
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
                ((og0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                k11 k11Var = (k11) this.b;
                i11 i11Var = k11Var.a;
                if (i11Var != null) {
                    i11Var.i();
                    k11Var.a = null;
                }
                Runnable runnable = k11Var.d;
                if (runnable == null) {
                    return false;
                }
                k11Var.d = null;
                k11.b(runnable);
                return false;
            case 4:
                o91 o91Var = (o91) this.b;
                TextureView textureView = o91Var.d;
                if (!o91Var.S) {
                    return true;
                }
                if (o91Var.W) {
                    o91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                o91Var.S = false;
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
                n50 n50Var = ((c60) this.b).m0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                i11 i11Var = ((k11) this.b).a;
                if (i11Var == null || (handler = i11Var.getHandler()) == null || !i11Var.b.get()) {
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
                    Handler handler = s0Var.h;
                    l.d dVar = s0Var.c;
                    Objects.requireNonNull(dVar);
                    handler.post(new i2.h0(dVar, 10));
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
                o91 o91Var = (o91) this.b;
                if (o91Var.r == 1) {
                    o91Var.n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    o91Var.n.invalidate();
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
