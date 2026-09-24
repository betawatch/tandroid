package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.s71 e;
    public final org.telegram.ui.Components.rr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.rr.i;
        setAlpha(0.0f);
    }

    public static void a(mu0 mu0Var) {
        PhotoViewer photoViewer = mu0Var.n;
        org.telegram.ui.Components.s71 s71Var = photoViewer.F2;
        if (s71Var == null || s71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = mu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                mu0Var.h = null;
            }
            mu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = mu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                mu0Var.h = null;
            }
            mu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = mu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                mu0Var.h = null;
            }
            mu0Var.setAlpha(max2);
            return;
        }
        if (mu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            mu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new c3(mu0Var, 24));
            mu0Var.h.setDuration(max);
            mu0Var.h.setInterpolator(mu0Var.f);
            mu0Var.h.start();
            mu0Var.setAlpha(max2);
        }
    }
}
