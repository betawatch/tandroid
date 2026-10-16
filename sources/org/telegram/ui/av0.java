package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class av0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.i81 e;
    public final org.telegram.ui.Components.es f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.es.i;
        setAlpha(0.0f);
    }

    public static void a(av0 av0Var) {
        PhotoViewer photoViewer = av0Var.n;
        org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
        if (i81Var == null || i81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = av0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                av0Var.h = null;
            }
            av0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = av0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                av0Var.h = null;
            }
            av0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = av0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                av0Var.h = null;
            }
            av0Var.setAlpha(max2);
            return;
        }
        if (av0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            av0Var.h = ofFloat;
            ofFloat.addUpdateListener(new e3(av0Var, 24));
            av0Var.h.setDuration(max);
            av0Var.h.setInterpolator(av0Var.f);
            av0Var.h.start();
            av0Var.setAlpha(max2);
        }
    }
}
