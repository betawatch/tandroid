package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ float a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ PhotoViewer c;

    public jt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.c = photoViewer;
        this.a = f7;
        this.b = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.c;
        photoViewer.p6 = null;
        photoViewer.f6 = 0.0f;
        photoViewer.b6 = 0.0f;
        photoViewer.g6 = 0.0f;
        float q22 = photoViewer.q2(false);
        photoViewer.e6 = q22;
        photoViewer.a6 = q22;
        photoViewer.e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.b.a;
        float q23 = photoViewer.q2(false);
        cropAreaView.n0 = 0.0f;
        cropAreaView.o0 = q23;
        cropAreaView.p0 = 0.0f;
        cropAreaView.q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.c.setRotated(false);
        float f7 = this.a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
            lg.f fVar = df0Var.c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (df0Var.b.m(f7)) {
                photoViewer.b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.c;
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
