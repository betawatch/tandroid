package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class au0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.c81 e;
    public final org.telegram.ui.Components.bs f;
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
        this.f = org.telegram.ui.Components.bs.i;
        setAlpha(0.0f);
    }

    public static void a(au0 au0Var) {
        PhotoViewer photoViewer = au0Var.n;
        org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
        if (c81Var == null || c81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = au0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                au0Var.h = null;
            }
            au0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
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
        if (!photoViewer.F2.y()) {
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
