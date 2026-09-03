package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r3 extends AnimatorListenerAdapter {
    public final /* synthetic */ m3 a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ w3 c;

    public r3(w3 w3Var, m3 m3Var, t3 t3Var) {
        this.c = w3Var;
        this.a = m3Var;
        this.b = t3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        m3 m3Var = this.a;
        ViewGroup viewGroup = m3Var.b;
        if (viewGroup == null) {
            viewGroup = m3Var.c;
        }
        w3 w3Var = this.c;
        t3 t3Var = this.b;
        if (viewGroup != null && m3Var.m == null && (i10 = m3Var.g) > 0 && (i11 = m3Var.h) > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                w3.g(viewGroup, -m3Var.i, new kh.a1(11, m3Var, t3Var));
                w3Var.b = null;
                w3Var.invalidate();
                return;
            } else {
                m3Var.m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(m3Var.m);
                canvas.translate(0.0f, -m3Var.i);
                viewGroup.draw(canvas);
            }
        }
        t3Var.getWindowView().setDrawingFromOverlay(false);
        t3Var.release();
        w3Var.b = null;
        w3Var.invalidate();
    }
}
