package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class os0 implements org.telegram.ui.Components.j61 {
    public boolean a = true;
    public final /* synthetic */ PhotoViewer b;

    public os0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // org.telegram.ui.Components.j61
    public final void onError(org.telegram.ui.Components.m61 m61Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.b;
        if (photoViewer.B2 != m61Var) {
            return;
        }
        FileLog.e(exc);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.k0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.y, 0, photoViewer.r2);
        alertDialog$Builder.a.N = LocaleController.getString("AppName", R.string.AppName);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.CantPlayVideo);
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new dl0(this, 3));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.S2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.j61
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.b;
        if (!photoViewer.D3) {
            photoViewer.D3 = true;
            photoViewer.a0.invalidate();
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
            if (m61Var == null || !m61Var.R) {
                AndroidUtilities.runOnUIThread(new ns0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.j61
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.m61 m61Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.b;
        ArrayList arrayList = photoViewer.c7;
        org.telegram.ui.Components.m61 m61Var2 = photoViewer.B2;
        if (m61Var2 != null) {
            m61Var2.P(d1.f.t() || photoViewer.r);
        }
        if (this.a && (m61Var = photoViewer.B2) != null && m61Var.q() != -9223372036854775807L) {
            this.a = false;
            if (photoViewer.U6.isEmpty() && photoViewer.a7.isEmpty() && photoViewer.W6.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.M4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.M4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.B2.L((long) (videoEditedInfo.start * r3.q()));
                        wr0 wr0Var = photoViewer.N7;
                        if (wr0Var != null) {
                            wr0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z10);
    }

    @Override // org.telegram.ui.Components.j61
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        ye.d p6 = org.telegram.ui.Components.sf0.p();
        PhotoViewer photoViewer = this.b;
        if (p6 != null && org.telegram.ui.Components.sf0.p().b.a != 0 && (textureView = photoViewer.s3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.l0;
            (sf0Var != null ? sf0Var.h0 : null).setSurfaceTexture(surfaceTexture);
            (sf0Var != null ? sf0Var.h0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.B3) {
            photoViewer.B3 = false;
            if (photoViewer.F3) {
                photoViewer.C3 = 1;
                photoViewer.s3.setSurfaceTexture(surfaceTexture);
                photoViewer.s3.setSurfaceTextureListener(photoViewer.f4);
                photoViewer.s3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.j61
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.P8;
        this.b.x0(false);
        AndroidUtilities.runOnUIThread(new ns0(this, 0));
    }

    @Override // org.telegram.ui.Components.j61
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.u2 != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f10;
            int i13 = (int) f11;
            photoViewer.Q = i13;
            float f12 = i11;
            int i14 = (int) (f10 * f12);
            photoViewer.R = i14;
            ye.d dVar = photoViewer.C2;
            if (dVar != null) {
                dVar.d(i13, i14);
            }
            photoViewer.u2.a(i11 == 0 ? 1.0f : f11 / f12, i12);
            if (photoViewer.x2 instanceof org.telegram.ui.Components.a61) {
                ((org.telegram.ui.Components.a61) photoViewer.x2).setHDRInfo(photoViewer.B2.r(null));
                org.telegram.ui.Components.a61 a61Var = (org.telegram.ui.Components.a61) photoViewer.x2;
                a61Var.d = i13;
                a61Var.e = i11;
                org.telegram.ui.Components.jz jzVar = a61Var.b;
                if (jzVar != null) {
                    jzVar.postRunnable(new org.telegram.ui.Components.fz(jzVar, i13, i11, 0));
                }
                if (photoViewer.Y1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.E3 = true;
        }
    }

    @Override // org.telegram.ui.Components.j61
    public final void onRenderedFirstFrame(i3.a aVar) {
        PhotoViewer photoViewer = this.b;
        bf.e eVar = photoViewer.L8;
        if (eVar != null) {
            eVar.run();
            photoViewer.L8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.S7) {
            photoViewer.R7 = j10;
            photoViewer.S7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.A2 != null) {
            org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
            if (m61Var == null || !m61Var.R) {
                AndroidUtilities.runOnUIThread(new ns0(this, 2), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.j61
    public final /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public final /* synthetic */ void onSeekStarted(i3.a aVar) {
    }
}
