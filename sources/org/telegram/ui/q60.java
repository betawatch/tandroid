package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q60 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.us b;

    public /* synthetic */ q60(org.telegram.messenger.us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                s60 s60Var = (s60) this.b;
                if (s60Var.I == null && surfaceTexture != null) {
                    s60Var.I = new r60(s60Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    s60Var.I.postRunnable(new zy(this, 12));
                    r60 r60Var = s60Var.I;
                    r60Var.postRunnable(r60Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                s60 s60Var = (s60) this.b;
                r60 r60Var = s60Var.I;
                if (r60Var == null) {
                    return true;
                }
                r60Var.postRunnable(new zy(r60Var, 14));
                s60Var.I = null;
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
                if (((s60) this.b).I != null) {
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
