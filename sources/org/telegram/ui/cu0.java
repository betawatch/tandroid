package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.k71 e;
    public final org.telegram.ui.Components.pr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.pr.i;
        setAlpha(0.0f);
    }

    public static void a(cu0 cu0Var) {
        PhotoViewer photoViewer = cu0Var.n;
        org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
        if (k71Var == null || k71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = cu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                cu0Var.h = null;
            }
            cu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.C2.p() - photoViewer.C2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = cu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                cu0Var.h = null;
            }
            cu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.C2.y()) {
            ValueAnimator valueAnimator3 = cu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                cu0Var.h = null;
            }
            cu0Var.setAlpha(max2);
            return;
        }
        if (cu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            cu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new e3(cu0Var, 24));
            cu0Var.h.setDuration(max);
            cu0Var.h.setInterpolator(cu0Var.f);
            cu0Var.h.start();
            cu0Var.setAlpha(max2);
        }
    }
}
