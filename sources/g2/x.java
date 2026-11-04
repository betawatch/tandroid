package g2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import ei.z5;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.l4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x implements k51 {
    public static x f;
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public x(ci.a aVar, com.google.android.gms.common.api.internal.o oVar, m6.c[] cVarArr, boolean z10, int i3) {
        this.e = aVar;
        this.c = oVar;
        this.d = cVarArr;
        this.a = z10;
        this.b = i3;
    }

    public static synchronized x a(Context context) {
        x xVar;
        synchronized (x.class) {
            try {
                if (f == null) {
                    f = new x(context);
                }
                xVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    public int b() {
        int i3;
        synchronized (this.e) {
            i3 = this.b;
        }
        return i3;
    }

    public void c(int i3) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar.a.get() == null) {
                copyOnWriteArrayList.remove(wVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.a && this.b == i3) {
                    return;
                }
                this.a = true;
                this.b = i3;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    w wVar2 = (w) it2.next();
                    wVar2.b.execute(new z5(wVar2, 15));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
        a8.g(exc, true);
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        int i10 = this.b;
        MediaController mediaController = (MediaController) this.e;
        if (i10 != mediaController.n0) {
            return;
        }
        MediaController.f(mediaController, (zi) this.c, (int[]) this.d, this.a, z10, i3);
    }

    @Override // org.telegram.ui.Components.k51
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        MediaController mediaController = (MediaController) this.e;
        if (mediaController.F0 != null) {
            int i3 = mediaController.J0;
            if (i3 == 2) {
                l4 l4Var = mediaController.M0;
                if (l4Var != null) {
                    if (mediaController.N0) {
                        l4Var.setDrawingReady(true);
                    }
                    if (mediaController.M0.getParent() == null) {
                        mediaController.O0.addView(mediaController.M0);
                    }
                    if (mediaController.H0.getSurfaceTexture() != surfaceTexture) {
                        mediaController.H0.setSurfaceTexture(surfaceTexture);
                    }
                    mediaController.F0.A0(mediaController.H0);
                }
                mediaController.J0 = 0;
                return true;
            }
            if (i3 == 1) {
                if (mediaController.K0 != null) {
                    if (mediaController.I0 == null) {
                        try {
                            PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                            mediaController.I0 = pipRoundVideoView;
                            pipRoundVideoView.d(mediaController.K0, new org.telegram.messenger.a(this, 16));
                        } catch (Exception unused) {
                            mediaController.I0 = null;
                        }
                    }
                    PipRoundVideoView pipRoundVideoView2 = mediaController.I0;
                    if (pipRoundVideoView2 != null) {
                        if (pipRoundVideoView2.c.getSurfaceTexture() != surfaceTexture) {
                            mediaController.I0.c.setSurfaceTexture(surfaceTexture);
                        }
                        mediaController.F0.A0(mediaController.I0.c);
                    }
                }
                mediaController.J0 = 0;
                return true;
            }
            if (PhotoViewer.F1() && PhotoViewer.v1().T2 != null) {
                PhotoViewer.v1().U2 = surfaceTexture;
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        MediaController mediaController = (MediaController) this.e;
        float f11 = i10 == 0 ? 1.0f : (i3 * f10) / i10;
        mediaController.P0 = f11;
        l4 l4Var = mediaController.M0;
        if (l4Var != null) {
            l4Var.a(f11, 0);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
        MediaController mediaController = (MediaController) this.e;
        l4 l4Var = mediaController.M0;
        if (l4Var != null && !l4Var.d) {
            mediaController.N0 = true;
            l4Var.setDrawingReady(true);
            mediaController.O0.setTag(1);
        }
        if (mediaController.F0 == null || !d1.f.u()) {
            return;
        }
        mediaController.F0.t0(true);
    }

    public x(Context context) {
        Executor e10 = a.e();
        this.c = e10;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        e10.execute(new c(1, this, context));
    }

    public x(MediaController mediaController, int i3, zi ziVar, int[] iArr, boolean z10) {
        this.e = mediaController;
        this.b = i3;
        this.c = ziVar;
        this.d = iArr;
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
