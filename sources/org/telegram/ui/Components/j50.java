package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Choreographer;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.s01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.s01] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                w50 w50Var = (w50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (w50Var.h0 == null && surfaceTexture != null && !w50Var.g0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    w50Var.h0 = new n50(w50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                final y01 y01Var = (y01) this.b;
                ArrayList arrayList = y01Var.c;
                w01 w01Var = y01Var.a;
                if (w01Var != null) {
                    w01Var.i();
                    y01Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.s01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                y01Var.invalidate();
                                break;
                            default:
                                y01 y01Var2 = y01Var;
                                Runnable runnable = y01Var2.d;
                                if (runnable != null) {
                                    y01Var2.e = true;
                                    y01Var2.d = null;
                                    y01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                w01 w01Var2 = new w01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.s01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                y01Var.invalidate();
                                break;
                            default:
                                y01 y01Var2 = y01Var;
                                Runnable runnable = y01Var2.d;
                                if (runnable != null) {
                                    y01Var2.e = true;
                                    y01Var2.d = null;
                                    y01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                y01Var.a = w01Var2;
                w01Var2.a = EmuDetector.with(y01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        x01 x01Var = (x01) arrayList.get(i14);
                        Bitmap bitmap = x01Var.e;
                        if (bitmap != null) {
                            y01Var.a.c(x01Var.f, bitmap, x01Var.c, x01Var.d);
                        } else {
                            ArrayList arrayList2 = x01Var.b;
                            if (arrayList2 != null) {
                                y01Var.a.f(arrayList2, x01Var.d);
                            } else {
                                y01Var.a.e(x01Var.a, x01Var.g, x01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(y01Var.b);
                    break;
                }
                break;
            case 3:
                break;
            default:
                vh.g gVar = (vh.g) this.b;
                if (gVar.f == null) {
                    vh.f fVar = new vh.f(gVar, surfaceTexture, i10, i11, new vh.d(gVar, 1));
                    gVar.f = fVar;
                    fVar.start();
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                w50 w50Var = (w50) this.b;
                Camera2Session[] camera2SessionArr = w50Var.q0;
                n50 n50Var = w50Var.h0;
                if (n50Var != null) {
                    n50Var.b(0L, 0, true, 0, 0);
                    w50Var.h0 = null;
                }
                if (!w50Var.n0) {
                    if (w50Var.o0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(w50Var.o0, null, null);
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
            case 1:
                ((fg0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                y01 y01Var = (y01) this.b;
                w01 w01Var = y01Var.a;
                if (w01Var != null) {
                    w01Var.i();
                    y01Var.a = null;
                }
                Runnable runnable = y01Var.d;
                if (runnable == null) {
                    return false;
                }
                y01Var.d = null;
                y01.b(runnable);
                return false;
            case 3:
                d91 d91Var = (d91) this.b;
                TextureView textureView = d91Var.d;
                if (!d91Var.S) {
                    return true;
                }
                if (d91Var.W) {
                    d91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                d91Var.S = false;
                return false;
            default:
                vh.f fVar = ((vh.g) this.b).f;
                if (fVar == null) {
                    return true;
                }
                fVar.a = false;
                ((vh.g) this.b).f = null;
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Handler handler;
        switch (this.a) {
            case 0:
                n50 n50Var = ((w50) this.b).h0;
                if (n50Var != null) {
                    n50Var.F = i10;
                    n50Var.G = i11;
                    n50Var.c();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                w01 w01Var = ((y01) this.b).a;
                if (w01Var == null || (handler = w01Var.getHandler()) == null || !w01Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
                return;
            default:
                vh.f fVar = ((vh.g) this.b).f;
                if (fVar != null) {
                    synchronized (fVar.e) {
                        fVar.f = true;
                        fVar.h = i10;
                        fVar.n = i11;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 3:
                d91 d91Var = (d91) this.b;
                if (d91Var.r == 1) {
                    d91Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 4));
                    d91Var.n.invalidate();
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
