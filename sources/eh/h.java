package eh;

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
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.sf0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.telegram.ui.Components.a01] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.a01] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                if (jVar.f == null) {
                    i iVar = new i(jVar, surfaceTexture, i10, i11, new f(jVar, 1));
                    jVar.f = iVar;
                    iVar.start();
                    break;
                }
                break;
            case 1:
                k50 k50Var = (k50) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (k50Var.d0 == null && surfaceTexture != null && !k50Var.c0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    k50Var.d0 = new b50(k50Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 3:
                final f01 f01Var = (f01) this.b;
                ArrayList arrayList = f01Var.c;
                d01 d01Var = f01Var.a;
                if (d01Var != null) {
                    d01Var.i();
                    f01Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.a01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                f01Var.invalidate();
                                break;
                            default:
                                f01 f01Var2 = f01Var;
                                Runnable runnable = f01Var2.d;
                                if (runnable != null) {
                                    f01Var2.e = true;
                                    f01Var2.d = null;
                                    f01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                d01 d01Var2 = new d01(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.a01
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                f01Var.invalidate();
                                break;
                            default:
                                f01 f01Var2 = f01Var;
                                Runnable runnable = f01Var2.d;
                                if (runnable != null) {
                                    f01Var2.e = true;
                                    f01Var2.d = null;
                                    f01.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                f01Var.a = d01Var2;
                d01Var2.a = EmuDetector.with(f01Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        e01 e01Var = (e01) arrayList.get(i14);
                        Bitmap bitmap = e01Var.e;
                        if (bitmap != null) {
                            f01Var.a.c(e01Var.f, bitmap, e01Var.c, e01Var.d);
                        } else {
                            ArrayList arrayList2 = e01Var.b;
                            if (arrayList2 != null) {
                                f01Var.a.f(arrayList2, e01Var.d);
                            } else {
                                f01Var.a.e(e01Var.a, e01Var.g, e01Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(f01Var.b);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                i iVar = ((j) this.b).f;
                if (iVar != null) {
                    iVar.a = false;
                    ((j) this.b).f = null;
                    break;
                }
                break;
            case 1:
                k50 k50Var = (k50) this.b;
                Camera2Session[] camera2SessionArr = k50Var.m0;
                b50 b50Var = k50Var.d0;
                if (b50Var != null) {
                    b50Var.b(0L, 0, true, 0, 0);
                    k50Var.d0 = null;
                }
                if (k50Var.j0) {
                    for (int i10 = 0; i10 < camera2SessionArr.length; i10++) {
                        Camera2Session camera2Session = camera2SessionArr[i10];
                        if (camera2Session != null) {
                            camera2Session.destroy(false);
                            camera2SessionArr[i10] = null;
                        }
                    }
                    break;
                } else if (k50Var.k0 != null) {
                    CameraController.getInstance().close(k50Var.k0, null, null);
                    break;
                }
                break;
            case 2:
                ((sf0) this.b).R.s3.setSurfaceTexture(surfaceTexture);
                break;
            case 3:
                f01 f01Var = (f01) this.b;
                d01 d01Var = f01Var.a;
                if (d01Var != null) {
                    d01Var.i();
                    f01Var.a = null;
                }
                Runnable runnable = f01Var.d;
                if (runnable != null) {
                    f01Var.d = null;
                    f01.b(runnable);
                    break;
                }
                break;
            default:
                i81 i81Var = (i81) this.b;
                TextureView textureView = i81Var.d;
                if (i81Var.O) {
                    if (i81Var.S) {
                        i81Var.r = 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    textureView.setVisibility(0);
                    i81Var.O = false;
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
                i iVar = ((j) this.b).f;
                if (iVar != null) {
                    synchronized (iVar.e) {
                        iVar.f = true;
                        iVar.h = i10;
                        iVar.n = i11;
                    }
                    return;
                }
                return;
            case 1:
                b50 b50Var = ((k50) this.b).d0;
                if (b50Var != null) {
                    b50Var.B = i10;
                    b50Var.C = i11;
                    b50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                d01 d01Var = ((f01) this.b).a;
                if (d01Var == null || (handler = d01Var.getHandler()) == null || !d01Var.b.get()) {
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
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                i81 i81Var = (i81) this.b;
                if (i81Var.r == 1) {
                    i81Var.n.getViewTreeObserver().addOnPreDrawListener(new y9(this, 4));
                    i81Var.n.invalidate();
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
