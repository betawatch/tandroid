package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q3 extends AnimatorListenerAdapter {
    public final /* synthetic */ l3 a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ v3 c;

    public q3(v3 v3Var, l3 l3Var, s3 s3Var) {
        this.c = v3Var;
        this.a = l3Var;
        this.b = s3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10;
        l3 l3Var = this.a;
        ViewGroup viewGroup = l3Var.b;
        if (viewGroup == null) {
            viewGroup = l3Var.c;
        }
        v3 v3Var = this.c;
        s3 s3Var = this.b;
        if (viewGroup != null && l3Var.k == null && (i9 = l3Var.e) > 0 && (i10 = l3Var.f) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                v3.g(viewGroup, -l3Var.g, new fh.f1(26, l3Var, s3Var));
                v3Var.b = null;
                v3Var.invalidate();
                return;
            } else {
                l3Var.k = Bitmap.createBitmap(i9, i10, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(l3Var.k);
                canvas.translate(0.0f, -l3Var.g);
                viewGroup.draw(canvas);
            }
        }
        s3Var.getWindowView().setDrawingFromOverlay(false);
        s3Var.release();
        v3Var.b = null;
        v3Var.invalidate();
    }
}
