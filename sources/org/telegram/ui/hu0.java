package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.s81 e;
    public final org.telegram.ui.Components.ds f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.ds.i;
        setAlpha(0.0f);
    }

    public static void a(hu0 hu0Var) {
        PhotoViewer photoViewer = hu0Var.n;
        org.telegram.ui.Components.s81 s81Var = photoViewer.F2;
        if (s81Var == null || s81Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = hu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                hu0Var.h = null;
            }
            hu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = hu0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                hu0Var.h = null;
            }
            hu0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.F2.y()) {
            ValueAnimator valueAnimator3 = hu0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                hu0Var.h = null;
            }
            hu0Var.setAlpha(max2);
            return;
        }
        if (hu0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            hu0Var.h = ofFloat;
            ofFloat.addUpdateListener(new b3(hu0Var, 23));
            hu0Var.h.setDuration(max);
            hu0Var.h.setInterpolator(hu0Var.f);
            hu0Var.h.start();
            hu0Var.setAlpha(max2);
        }
    }
}
