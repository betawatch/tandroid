package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.f71 e;
    public final org.telegram.ui.Components.rr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.rr.i;
        setAlpha(0.0f);
    }

    public static void a(nu0 nu0Var) {
        PhotoViewer photoViewer = nu0Var.n;
        org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
        if (f71Var == null || f71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = nu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nu0Var.h = null;
            }
            nu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = nu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                nu0Var.h = null;
            }
            nu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = nu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                nu0Var.h = null;
            }
            nu0Var.setAlpha(max2);
            return;
        }
        if (nu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            nu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new c3(nu0Var, 24));
            nu0Var.h.setDuration(max);
            nu0Var.h.setInterpolator(nu0Var.f);
            nu0Var.h.start();
            nu0Var.setAlpha(max2);
        }
    }
}
