package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class au0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.i71 e;
    public final org.telegram.ui.Components.nr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.nr.i;
        setAlpha(0.0f);
    }

    public static void a(au0 au0Var) {
        PhotoViewer photoViewer = au0Var.n;
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        if (i71Var == null || i71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = au0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                au0Var.h = null;
            }
            au0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.C2.p() - photoViewer.C2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = au0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                au0Var.h = null;
            }
            au0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.C2.y()) {
            ValueAnimator valueAnimator3 = au0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                au0Var.h = null;
            }
            au0Var.setAlpha(max2);
            return;
        }
        if (au0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            au0Var.h = ofFloat;
            ofFloat.addUpdateListener(new e3(au0Var, 24));
            au0Var.h.setDuration(max);
            au0Var.h.setInterpolator(au0Var.f);
            au0Var.h.start();
            au0Var.setAlpha(max2);
        }
    }
}
