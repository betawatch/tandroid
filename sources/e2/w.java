package e2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w implements s61 {
    public static w f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.c = pVar;
        this.d = cVarArr;
        this.a = z10;
        this.b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f == null) {
                    f = new w(context);
                }
                wVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.a && this.b == i10) {
                    return;
                }
                this.a = true;
                this.b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.b.execute(new a3.d(vVar2, 29));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
        f8.g(exc, true);
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        int i11 = this.b;
        MediaController mediaController = (MediaController) this.e;
        if (i11 != mediaController.m0) {
            return;
        }
        MediaController.f(mediaController, (jj) this.c, (int[]) this.d, this.a, z10, i10);
    }

    @Override // org.telegram.ui.Components.s61
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.e;
        if (mediaController.E0 != null) {
            int i10 = mediaController.I0;
            if (i10 == 2) {
                k4 k4Var = mediaController.L0;
                if (k4Var != null) {
                    if (mediaController.M0) {
                        k4Var.setDrawingReady(true);
                    }
                    if (mediaController.L0.getParent() == null) {
                        mediaController.N0.addView(mediaController.L0);
                    }
                    if (mediaController.G0.getSurfaceTexture() != surfaceTexture) {
                        mediaController.G0.setSurfaceTexture(surfaceTexture);
                    }
                    mediaController.E0.A0(mediaController.G0);
                }
                mediaController.I0 = 0;
                return true;
            }
            if (i10 == 1) {
                if (mediaController.J0 != null) {
                    if (mediaController.H0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.H0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.J0, new org.telegram.messenger.a(this, 16));
                        } catch (Exception unused) {
                            mediaController.H0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.H0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.H0.c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.E0.A0(mediaController.H0.c);
                    }
                }
                mediaController.I0 = 0;
                return true;
            }
            if (PhotoViewer.F1() && PhotoViewer.v1().S2 != null) {
                PhotoViewer.v1().T2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        MediaController mediaController = (MediaController) this.e;
        float f10 = i11 == 0 ? 1.0f : (i10 * f7) / i11;
        mediaController.O0 = f10;
        k4 k4Var = mediaController.L0;
        if (k4Var != null) {
            k4Var.a(f10, 0);
        }
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.e;
        k4 k4Var = mediaController.L0;
        if (k4Var != null && !k4Var.d) {
            mediaController.M0 = true;
            k4Var.setDrawingReady(true);
            mediaController.N0.setTag(1);
        }
        if (mediaController.E0 == null || !b5.d.u()) {
            return;
        }
        mediaController.E0.t0(true);
    }

    public w(Context context) {
        Executor e = a.e();
        this.c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        e.execute(new d1.e(8, this, context));
    }

    public w(MediaController mediaController, int i10, jj jjVar, int[] iArr, boolean z10) {
        this.e = mediaController;
        this.b = i10;
        this.c = jjVar;
        this.d = iArr;
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
