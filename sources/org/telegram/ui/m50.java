package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.cs b;

    public /* synthetic */ m50(org.telegram.messenger.cs csVar, int i3) {
        this.a = i3;
        this.b = csVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.a) {
            case 0:
                o50 o50Var = (o50) this.b;
                if (o50Var.J == null && surfaceTexture != null) {
                    o50Var.J = new n50(o50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i3, i10, Math.min(i3 / 150.0f, i10 / 150.0f), 0);
                    o50Var.J.postRunnable(new fz(this, 11));
                    n50 n50Var = o50Var.J;
                    n50Var.postRunnable(n50Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                o50 o50Var = (o50) this.b;
                n50 n50Var = o50Var.J;
                if (n50Var == null) {
                    return true;
                }
                n50Var.postRunnable(new fz(n50Var, 13));
                o50Var.J = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.C2 != null) {
                    org.telegram.ui.Components.ie0 ie0Var = org.telegram.ui.Components.ie0.q0;
                    if (ie0Var.Q && org.telegram.ui.Components.ie0.k() != null && org.telegram.ui.Components.ie0.k().b.a != 0) {
                        (ie0Var != null ? ie0Var.m0 : null).setSurfaceTexture(surfaceTexture);
                        (ie0Var != null ? ie0Var.m0 : null).setVisibility(0);
                        return false;
                    }
                    if (photoViewer.G3) {
                        if (photoViewer.M3) {
                            photoViewer.H3 = 2;
                        }
                        photoViewer.C2.setSurfaceTexture(surfaceTexture);
                        photoViewer.C2.setVisibility(0);
                        photoViewer.G3 = false;
                        photoViewer.f0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.a) {
            case 0:
                if (((o50) this.b).J != null) {
                    Intro.onSurfaceChanged(i3, i10, Math.min(i3 / 150.0f, i10 / 150.0f), 0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.H3 == 1) {
                    photoViewer.y0(true);
                    break;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i3, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i3, int i10) {
    }
}
