package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bv0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.h81 e;
    public final org.telegram.ui.Components.es f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.es.i;
        setAlpha(0.0f);
    }

    public static void a(bv0 bv0Var) {
        PhotoViewer photoViewer = bv0Var.n;
        org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
        if (h81Var == null || h81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = bv0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                bv0Var.h = null;
            }
            bv0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = bv0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                bv0Var.h = null;
            }
            bv0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = bv0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                bv0Var.h = null;
            }
            bv0Var.setAlpha(max2);
            return;
        }
        if (bv0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            bv0Var.h = ofFloat;
            ofFloat.addUpdateListener(new e3(bv0Var, 24));
            bv0Var.h.setDuration(max);
            bv0Var.h.setInterpolator(bv0Var.f);
            bv0Var.h.start();
            bv0Var.setAlpha(max2);
        }
    }
}
