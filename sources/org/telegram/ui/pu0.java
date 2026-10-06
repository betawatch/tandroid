package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.e81 e;
    public final org.telegram.ui.Components.tr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.tr.i;
        setAlpha(0.0f);
    }

    public static void a(pu0 pu0Var) {
        PhotoViewer photoViewer = pu0Var.n;
        org.telegram.ui.Components.e81 e81Var = photoViewer.F2;
        if (e81Var == null || e81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = pu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                pu0Var.h = null;
            }
            pu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = pu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                pu0Var.h = null;
            }
            pu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = pu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                pu0Var.h = null;
            }
            pu0Var.setAlpha(max2);
            return;
        }
        if (pu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            pu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new c3(pu0Var, 23));
            pu0Var.h.setDuration(max);
            pu0Var.h.setInterpolator(pu0Var.f);
            pu0Var.h.start();
            pu0Var.setAlpha(max2);
        }
    }
}
