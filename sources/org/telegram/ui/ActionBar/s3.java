package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s3 extends AnimatorListenerAdapter {
    public final /* synthetic */ n3 a;
    public final /* synthetic */ u3 b;
    public final /* synthetic */ x3 c;

    public s3(x3 x3Var, n3 n3Var, u3 u3Var) {
        this.c = x3Var;
        this.a = n3Var;
        this.b = u3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        n3 n3Var = this.a;
        ViewGroup viewGroup = n3Var.b;
        if (viewGroup == null) {
            viewGroup = n3Var.c;
        }
        x3 x3Var = this.c;
        u3 u3Var = this.b;
        if (viewGroup != null && n3Var.m == null && (i10 = n3Var.g) > 0 && (i11 = n3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                x3.g(viewGroup, -n3Var.i, new di.m2(24, n3Var, u3Var));
                x3Var.b = null;
                x3Var.invalidate();
                return;
            } else {
                n3Var.m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(n3Var.m);
                canvas.translate(0.0f, -n3Var.i);
                viewGroup.draw(canvas);
            }
        }
        u3Var.getWindowView().setDrawingFromOverlay(false);
        u3Var.release();
        x3Var.b = null;
        x3Var.invalidate();
    }
}
