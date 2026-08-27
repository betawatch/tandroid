package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ float a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ PhotoViewer c;

    public hs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.c = photoViewer;
        this.a = f10;
        this.b = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.c;
        photoViewer.l6 = null;
        photoViewer.b6 = 0.0f;
        photoViewer.X5 = 0.0f;
        photoViewer.c6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.a6 = r22;
        photoViewer.W5 = r22;
        photoViewer.a0.invalidate();
        CropAreaView cropAreaView = photoViewer.y1.b.a;
        float r23 = photoViewer.r2(false);
        cropAreaView.j0 = 0.0f;
        cropAreaView.k0 = r23;
        cropAreaView.l0 = 0.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.y1.c.setRotated(false);
        float f10 = this.a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.ge0 ge0Var = photoViewer.y1;
            uf.e eVar = ge0Var.c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (ge0Var.b.m(f10)) {
                photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.X0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.T4.c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
