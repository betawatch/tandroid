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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ct0 implements org.telegram.ui.Components.f71 {
    public boolean a = true;
    public final /* synthetic */ PhotoViewer b;

    public ct0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // org.telegram.ui.Components.f71
    public final void onError(org.telegram.ui.Components.i71 i71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.b;
        if (photoViewer.C2 != i71Var) {
            return;
        }
        FileLog.e(exc);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.l0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.y, 0, photoViewer.s2);
        alertDialog$Builder.a.O = LocaleController.getString("AppName", R.string.AppName);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.CantPlayVideo);
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new kl0(this, 3));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.S2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.f71
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.b;
        if (!photoViewer.E3) {
            photoViewer.E3 = true;
            photoViewer.b0.invalidate();
        }
        if (photoViewer.B2 != null) {
            org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
            if (i71Var == null || !i71Var.S) {
                AndroidUtilities.runOnUIThread(new bt0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.f71
    public final void onStateChanged(boolean z4, int i10) {
        org.telegram.ui.Components.i71 i71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.b;
        ArrayList arrayList = photoViewer.d7;
        org.telegram.ui.Components.i71 i71Var2 = photoViewer.C2;
        if (i71Var2 != null) {
            i71Var2.O(d1.f.u() || photoViewer.r);
        }
        if (this.a && (i71Var = photoViewer.C2) != null && i71Var.p() != -9223372036854775807L) {
            this.a = false;
            if (photoViewer.V6.isEmpty() && photoViewer.b7.isEmpty() && photoViewer.X6.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.N4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.N4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.C2.K((long) (videoEditedInfo.start * r3.p()));
                        js0 js0Var = photoViewer.O7;
                        if (js0Var != null) {
                            js0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z4);
    }

    @Override // org.telegram.ui.Components.f71
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        bf.f p10 = org.telegram.ui.Components.mg0.p();
        PhotoViewer photoViewer = this.b;
        if (p10 != null && org.telegram.ui.Components.mg0.p().b.a != 0 && (textureView = photoViewer.t3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.mg0 mg0Var = org.telegram.ui.Components.mg0.m0;
            (mg0Var != null ? mg0Var.i0 : null).setSurfaceTexture(surfaceTexture);
            (mg0Var != null ? mg0Var.i0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.C3) {
            photoViewer.C3 = false;
            if (photoViewer.G3) {
                photoViewer.D3 = 1;
                photoViewer.t3.setSurfaceTexture(surfaceTexture);
                photoViewer.t3.setSurfaceTextureListener(photoViewer.g4);
                photoViewer.t3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f71
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.b.x0(false);
        AndroidUtilities.runOnUIThread(new bt0(this, 0));
    }

    @Override // org.telegram.ui.Components.f71
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.v2 != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f10;
            int i13 = (int) f11;
            photoViewer.R = i13;
            float f12 = i11;
            int i14 = (int) (f10 * f12);
            photoViewer.S = i14;
            bf.f fVar = photoViewer.D2;
            if (fVar != null) {
                fVar.d(i13, i14);
            }
            photoViewer.v2.a(i11 == 0 ? 1.0f : f11 / f12, i12);
            if (photoViewer.y2 instanceof org.telegram.ui.Components.w61) {
                ((org.telegram.ui.Components.w61) photoViewer.y2).setHDRInfo(photoViewer.C2.q(null));
                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) photoViewer.y2;
                w61Var.d = i13;
                w61Var.e = i11;
                org.telegram.ui.Components.vz vzVar = w61Var.b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.rz(vzVar, i13, i11, 0));
                }
                if (photoViewer.Z1 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.F3 = true;
        }
    }

    @Override // org.telegram.ui.Components.f71
    public final void onRenderedFirstFrame(k3.a aVar) {
        PhotoViewer photoViewer = this.b;
        c2.p pVar = photoViewer.M8;
        if (pVar != null) {
            pVar.run();
            photoViewer.M8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.T7) {
            photoViewer.S7 = j10;
            photoViewer.T7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.B2 != null) {
            org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
            if (i71Var == null || !i71Var.S) {
                AndroidUtilities.runOnUIThread(new bt0(this, 2), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.f71
    public final /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public final /* synthetic */ void onSeekStarted(k3.a aVar) {
    }
}
