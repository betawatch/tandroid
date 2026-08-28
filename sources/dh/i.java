package dh;

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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.w40;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.telegram.ui.Components.yz0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.yz0] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                if (kVar.f == null) {
                    j jVar = new j(kVar, surfaceTexture, i9, i10, new f(kVar, 1));
                    kVar.f = jVar;
                    jVar.start();
                    break;
                }
                break;
            case 1:
                f50 f50Var = (f50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (f50Var.d0 == null && surfaceTexture != null && !f50Var.c0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    f50Var.d0 = new w40(f50Var, surfaceTexture, i9, i10);
                    break;
                }
                break;
            case 3:
                final d01 d01Var = (d01) this.b;
                ArrayList arrayList = d01Var.c;
                b01 b01Var = d01Var.a;
                if (b01Var != null) {
                    b01Var.i();
                    d01Var.a = null;
                }
                final int i11 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.yz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d01Var.invalidate();
                                break;
                            default:
                                d01 d01Var2 = d01Var;
                                Runnable runnable = d01Var2.d;
                                if (runnable != null) {
                                    d01Var2.e = true;
                                    d01Var2.d = null;
                                    d01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i12 = 1;
                b01 b01Var2 = new b01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.yz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                d01Var.invalidate();
                                break;
                            default:
                                d01 d01Var2 = d01Var;
                                Runnable runnable = d01Var2.d;
                                if (runnable != null) {
                                    d01Var2.e = true;
                                    d01Var2.d = null;
                                    d01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i9, i10);
                d01Var.a = b01Var2;
                b01Var2.a = EmuDetector.with(d01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        c01 c01Var = (c01) arrayList.get(i13);
                        Bitmap bitmap = c01Var.e;
                        if (bitmap != null) {
                            d01Var.a.c(c01Var.f, bitmap, c01Var.c, c01Var.d);
                        } else {
                            ArrayList arrayList2 = c01Var.b;
                            if (arrayList2 != null) {
                                d01Var.a.f(arrayList2, c01Var.d);
                            } else {
                                d01Var.a.e(c01Var.a, c01Var.g, c01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(d01Var.b);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                j jVar = ((k) this.b).f;
                if (jVar != null) {
                    jVar.a = false;
                    ((k) this.b).f = null;
                    break;
                }
                break;
            case 1:
                f50 f50Var = (f50) this.b;
                Camera2Session[] camera2SessionArr = f50Var.m0;
                w40 w40Var = f50Var.d0;
                if (w40Var != null) {
                    w40Var.b(0L, 0, true, 0, 0);
                    f50Var.d0 = null;
                }
                if (f50Var.j0) {
                    for (int i9 = 0; i9 < camera2SessionArr.length; i9++) {
                        Camera2Session camera2Session = camera2SessionArr[i9];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i9] = null;
                        }
                    }
                    break;
                } else if (f50Var.k0 != null) {
                    CameraController.getInstance().close(f50Var.k0, null, null);
                    break;
                }
                break;
            case 2:
                ((pf0) this.b).R.s3.setSurfaceTexture(surfaceTexture);
                break;
            case 3:
                d01 d01Var = (d01) this.b;
                b01 b01Var = d01Var.a;
                if (b01Var != null) {
                    b01Var.i();
                    d01Var.a = null;
                }
                Runnable runnable = d01Var.d;
                if (runnable != null) {
                    d01Var.d = null;
                    d01.b(runnable);
                    break;
                }
                break;
            default:
                g81 g81Var = (g81) this.b;
                TextureView textureView = g81Var.d;
                if (g81Var.O) {
                    if (g81Var.S) {
                        g81Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    g81Var.O = false;
                    break;
                }
                break;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        Handler handler;
        switch (this.a) {
            case 0:
                j jVar = ((k) this.b).f;
                if (jVar != null) {
                    synchronized (jVar.e) {
                        jVar.f = true;
                        jVar.h = i9;
                        jVar.n = i10;
                    }
                    return;
                }
                return;
            case 1:
                w40 w40Var = ((f50) this.b).d0;
                if (w40Var != null) {
                    w40Var.B = i9;
                    w40Var.C = i10;
                    w40Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                b01 b01Var = ((d01) this.b).a;
                if (b01Var == null || (handler = b01Var.getHandler()) == null || !b01Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i9, i10));
                return;
            default:
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                g81 g81Var = (g81) this.b;
                if (g81Var.r == 1) {
                    g81Var.n.getViewTreeObserver().addOnPreDrawListener(new ca(this, 4));
                    g81Var.n.invalidate();
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

    private final void a(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    private final void d(SurfaceTexture surfaceTexture, int i9, int i10) {
    }
}
