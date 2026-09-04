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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.Components.q01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.q01] */
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
                final w01 w01Var = (w01) this.b;
                ArrayList arrayList = w01Var.c;
                u01 u01Var = w01Var.a;
                if (u01Var != null) {
                    u01Var.i();
                    w01Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.q01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                w01Var.invalidate();
                                break;
                            default:
                                w01 w01Var2 = w01Var;
                                Runnable runnable = w01Var2.d;
                                if (runnable != null) {
                                    w01Var2.e = true;
                                    w01Var2.d = null;
                                    w01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                u01 u01Var2 = new u01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.q01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                w01Var.invalidate();
                                break;
                            default:
                                w01 w01Var2 = w01Var;
                                Runnable runnable = w01Var2.d;
                                if (runnable != null) {
                                    w01Var2.e = true;
                                    w01Var2.d = null;
                                    w01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                w01Var.a = u01Var2;
                u01Var2.a = EmuDetector.with(w01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        v01 v01Var = (v01) arrayList.get(i14);
                        Bitmap bitmap = v01Var.e;
                        if (bitmap != null) {
                            w01Var.a.c(v01Var.f, bitmap, v01Var.c, v01Var.d);
                        } else {
                            ArrayList arrayList2 = v01Var.b;
                            if (arrayList2 != null) {
                                w01Var.a.f(arrayList2, v01Var.d);
                            } else {
                                w01Var.a.e(v01Var.a, v01Var.g, v01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(w01Var.b);
                    break;
                }
                break;
            case 3:
                break;
            default:
                wh.g gVar = (wh.g) this.b;
                if (gVar.f == null) {
                    wh.f fVar = new wh.f(gVar, surfaceTexture, i10, i11, new wh.d(gVar, 1));
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
                ((eg0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 2:
                w01 w01Var = (w01) this.b;
                u01 u01Var = w01Var.a;
                if (u01Var != null) {
                    u01Var.i();
                    w01Var.a = null;
                }
                Runnable runnable = w01Var.d;
                if (runnable == null) {
                    return false;
                }
                w01Var.d = null;
                w01.b(runnable);
                return false;
            case 3:
                b91 b91Var = (b91) this.b;
                TextureView textureView = b91Var.d;
                if (!b91Var.S) {
                    return true;
                }
                if (b91Var.W) {
                    b91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                b91Var.S = false;
                return false;
            default:
                wh.f fVar = ((wh.g) this.b).f;
                if (fVar == null) {
                    return true;
                }
                fVar.a = false;
                ((wh.g) this.b).f = null;
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
                u01 u01Var = ((w01) this.b).a;
                if (u01Var == null || (handler = u01Var.getHandler()) == null || !u01Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 3:
                return;
            default:
                wh.f fVar = ((wh.g) this.b).f;
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
                b91 b91Var = (b91) this.b;
                if (b91Var.r == 1) {
                    b91Var.n.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 4));
                    b91Var.n.invalidate();
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
