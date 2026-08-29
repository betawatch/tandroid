package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ float a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ PhotoViewer c;

    public fs0(PhotoViewer photoViewer, float f9, Runnable runnable) {
        this.c = photoViewer;
        this.a = f9;
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
        float f9 = this.a;
        if (Math.abs(f9) > 0.0f) {
            org.telegram.ui.Components.pe0 pe0Var = photoViewer.y1;
            wf.e eVar = pe0Var.c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (pe0Var.b.m(f9)) {
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
