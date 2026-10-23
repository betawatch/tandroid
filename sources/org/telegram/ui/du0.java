package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class du0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.j81 e;
    public final org.telegram.ui.Components.bs f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.bs.i;
        setAlpha(0.0f);
    }

    public static void a(du0 du0Var) {
        PhotoViewer photoViewer = du0Var.n;
        org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
        if (j81Var == null || j81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = du0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                du0Var.h = null;
            }
            du0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = du0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                du0Var.h = null;
            }
            du0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = du0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                du0Var.h = null;
            }
            du0Var.setAlpha(max2);
            return;
        }
        if (du0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            du0Var.h = ofFloat;
            ofFloat.addUpdateListener(new d3(du0Var, 24));
            du0Var.h.setDuration(max);
            du0Var.h.setInterpolator(du0Var.f);
            du0Var.h.start();
            du0Var.setAlpha(max2);
        }
    }
}
