package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w3 extends AnimatorListenerAdapter {
    public final /* synthetic */ r3 a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ b4 c;

    public w3(b4 b4Var, r3 r3Var, y3 y3Var) {
        this.c = b4Var;
        this.a = r3Var;
        this.b = y3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        r3 r3Var = this.a;
        ViewGroup viewGroup = r3Var.b;
        if (viewGroup == null) {
            viewGroup = r3Var.c;
        }
        b4 b4Var = this.c;
        y3 y3Var = this.b;
        if (viewGroup != null && r3Var.m == null && (i10 = r3Var.g) > 0 && (i11 = r3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                b4.g(viewGroup, -r3Var.i, new li.s2(3, r3Var, y3Var));
                b4Var.b = null;
                b4Var.invalidate();
                return;
            } else {
                r3Var.m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(r3Var.m);
                canvas.translate(0.0f, -r3Var.i);
                viewGroup.draw(canvas);
            }
        }
        y3Var.getWindowView().setDrawingFromOverlay(false);
        y3Var.release();
        b4Var.b = null;
        b4Var.invalidate();
    }
}
