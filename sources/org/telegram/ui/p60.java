package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p60 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.vs b;

    public /* synthetic */ p60(org.telegram.messenger.vs vsVar, int i10) {
        this.a = i10;
        this.b = vsVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                r60 r60Var = (r60) this.b;
                if (r60Var.I == null && surfaceTexture != null) {
                    r60Var.I = new q60(r60Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    r60Var.I.postRunnable(new yy(this, 12));
                    q60 q60Var = r60Var.I;
                    q60Var.postRunnable(q60Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                r60 r60Var = (r60) this.b;
                q60 q60Var = r60Var.I;
                if (q60Var == null) {
                    return true;
                }
                q60Var.postRunnable(new yy(q60Var, 14));
                r60Var.I = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.p0;
                    if (jf0Var.P && org.telegram.ui.Components.jf0.k() != null && org.telegram.ui.Components.jf0.k().b.a != 0) {
                        (jf0Var != null ? jf0Var.l0 : null).setSurfaceTexture(surfaceTexture);
                        (jf0Var != null ? jf0Var.l0 : null).setVisibility(0);
                        return false;
                    }
                    if (photoViewer.F3) {
                        if (photoViewer.L3) {
                            photoViewer.G3 = 2;
                        }
                        photoViewer.B2.setSurfaceTexture(surfaceTexture);
                        photoViewer.B2.setVisibility(0);
                        photoViewer.F3 = false;
                        photoViewer.e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                if (((r60) this.b).I != null) {
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
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
                if (photoViewer.G3 == 1) {
                    photoViewer.y0(true);
                    break;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
