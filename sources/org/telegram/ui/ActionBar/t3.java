package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t3 extends AnimatorListenerAdapter {
    public final /* synthetic */ o3 a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ y3 c;

    public t3(y3 y3Var, o3 o3Var, v3 v3Var) {
        this.c = y3Var;
        this.a = o3Var;
        this.b = v3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        o3 o3Var = this.a;
        ViewGroup viewGroup = o3Var.b;
        if (viewGroup == null) {
            viewGroup = o3Var.c;
        }
        y3 y3Var = this.c;
        v3 v3Var = this.b;
        if (viewGroup != null && o3Var.m == null && (i10 = o3Var.g) > 0 && (i11 = o3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                y3.g(viewGroup, -o3Var.i, new ci.m2(24, o3Var, v3Var));
                y3Var.b = null;
                y3Var.invalidate();
                return;
            } else {
                o3Var.m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(o3Var.m);
                canvas.translate(0.0f, -o3Var.i);
                viewGroup.draw(canvas);
            }
        }
        v3Var.getWindowView().setDrawingFromOverlay(false);
        v3Var.release();
        y3Var.b = null;
        y3Var.invalidate();
    }
}
