package ki;

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
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q91;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class c implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.g11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.g11] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                gVar.f.b("preview surface available: view=" + i10 + "x" + i11);
                Handler handler = gVar.j;
                if (gVar.B && handler != null && gVar.c.isAvailable()) {
                    handler.post(new a(gVar, 2));
                    break;
                }
                break;
            case 1:
                b60 b60Var = (b60) this.b;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera camera surface available");
                }
                if (b60Var.k0 == null && surfaceTexture != null && !b60Var.j0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera start create thread");
                    }
                    b60Var.k0 = new m50(b60Var, surfaceTexture, i10, i11);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                final m11 m11Var = (m11) this.b;
                ArrayList arrayList = m11Var.c;
                k11 k11Var = m11Var.a;
                if (k11Var != null) {
                    k11Var.i();
                    m11Var.a = null;
                }
                final int i12 = 0;
                ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.g11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                m11Var.invalidate();
                                break;
                            default:
                                m11 m11Var2 = m11Var;
                                Runnable runnable = m11Var2.d;
                                if (runnable != null) {
                                    m11Var2.e = true;
                                    m11Var2.d = null;
                                    m11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i13 = 1;
                k11 k11Var2 = new k11(surfaceTexture, r52, new Runnable() { // from class: org.telegram.ui.Components.g11
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                m11Var.invalidate();
                                break;
                            default:
                                m11 m11Var2 = m11Var;
                                Runnable runnable = m11Var2.d;
                                if (runnable != null) {
                                    m11Var2.e = true;
                                    m11Var2.d = null;
                                    m11.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i10, i11);
                m11Var.a = k11Var2;
                k11Var2.a = EmuDetector.with(m11Var.getContext()).detect();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        l11 l11Var = (l11) arrayList.get(i14);
                        Bitmap bitmap = l11Var.e;
                        if (bitmap != null) {
                            m11Var.a.c(l11Var.f, bitmap, l11Var.c, l11Var.d);
                        } else {
                            ArrayList arrayList2 = l11Var.b;
                            if (arrayList2 != null) {
                                m11Var.a.f(arrayList2, l11Var.d);
                            } else {
                                m11Var.a.e(l11Var.a, l11Var.g, l11Var.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(m11Var.b);
                    break;
                }
                break;
            case 4:
                break;
            default:
                vh.g gVar2 = (vh.g) this.b;
                if (gVar2.f == null) {
                    vh.f fVar = new vh.f(gVar2, surfaceTexture, i10, i11, new vh.d(gVar2, 1));
                    gVar2.f = fVar;
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
                g gVar = (g) this.b;
                gVar.f.b("preview surface destroyed: active=" + gVar.B);
                if (!gVar.B) {
                    return true;
                }
                gVar.k(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                return true;
            case 1:
                b60 b60Var = (b60) this.b;
                Camera2Session[] camera2SessionArr = b60Var.t0;
                m50 m50Var = b60Var.k0;
                if (m50Var != null) {
                    m50Var.b(0L, 0, true, 0, 0);
                    b60Var.k0 = null;
                }
                if (!b60Var.q0) {
                    if (b60Var.r0 == null) {
                        return true;
                    }
                    CameraController.getInstance().close(b60Var.r0, null, null);
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
                ((pg0) this.b).V.w3.setSurfaceTexture(surfaceTexture);
                return false;
            case 3:
                m11 m11Var = (m11) this.b;
                k11 k11Var = m11Var.a;
                if (k11Var != null) {
                    k11Var.i();
                    m11Var.a = null;
                }
                Runnable runnable = m11Var.d;
                if (runnable == null) {
                    return false;
                }
                m11Var.d = null;
                m11.b(runnable);
                return false;
            case 4:
                q91 q91Var = (q91) this.b;
                TextureView textureView = q91Var.d;
                if (!q91Var.S) {
                    return true;
                }
                if (q91Var.W) {
                    q91Var.r = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                q91Var.S = false;
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
                g gVar = (g) this.b;
                gVar.f.b("preview surface size changed: view=" + i10 + "x" + i11);
                gVar.s();
                return;
            case 1:
                m50 m50Var = ((b60) this.b).k0;
                if (m50Var != null) {
                    m50Var.F = i10;
                    m50Var.G = i11;
                    m50Var.c();
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                k11 k11Var = ((m11) this.b).a;
                if (k11Var == null || (handler = k11Var.getHandler()) == null || !k11Var.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i10, i11));
                return;
            case 4:
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
            case 4:
                q91 q91Var = (q91) this.b;
                if (q91Var.r == 1) {
                    q91Var.n.getViewTreeObserver().addOnPreDrawListener(new fa(this, 4));
                    q91Var.n.invalidate();
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

    private final void i(SurfaceTexture surfaceTexture) {
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
