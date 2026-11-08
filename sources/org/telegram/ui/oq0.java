package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class oq0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.t51 e;
    public final org.telegram.ui.Components.xq f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.xq.i;
        setAlpha(0.0f);
    }

    public static void a(oq0 oq0Var) {
        PhotoViewer photoViewer = oq0Var.n;
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var == null || t51Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = oq0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                oq0Var.h = null;
            }
            oq0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = oq0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                oq0Var.h = null;
            }
            oq0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.d0()) {
            ValueAnimator valueAnimator3 = oq0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                oq0Var.h = null;
            }
            oq0Var.setAlpha(max2);
            return;
        }
        if (oq0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            oq0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(oq0Var, 22));
            oq0Var.h.setDuration(max);
            oq0Var.h.setInterpolator(oq0Var.f);
            oq0Var.h.start();
            oq0Var.setAlpha(max2);
        }
    }
}
