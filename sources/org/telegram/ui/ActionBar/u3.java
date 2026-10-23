package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class u3 extends AnimatorListenerAdapter {
    public final /* synthetic */ p3 a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ z3 c;

    public u3(z3 z3Var, p3 p3Var, w3 w3Var) {
        this.c = z3Var;
        this.a = p3Var;
        this.b = w3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        p3 p3Var = this.a;
        ViewGroup viewGroup = p3Var.b;
        if (viewGroup == null) {
            viewGroup = p3Var.c;
        }
        z3 z3Var = this.c;
        w3 w3Var = this.b;
        if (viewGroup != null && p3Var.m == null && (i10 = p3Var.g) > 0 && (i11 = p3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                z3.g(viewGroup, -p3Var.i, new m3(p3Var, w3Var));
                z3Var.b = null;
                z3Var.invalidate();
                return;
            } else {
                p3Var.m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(p3Var.m);
                canvas.translate(0.0f, -p3Var.i);
                viewGroup.draw(canvas);
            }
        }
        w3Var.getWindowView().setDrawingFromOverlay(false);
        w3Var.release();
        z3Var.b = null;
        z3Var.invalidate();
    }
}
