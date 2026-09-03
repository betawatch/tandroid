package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hu0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.j71 e;
    public final org.telegram.ui.Components.pr f;
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
        this.f = org.telegram.ui.Components.pr.i;
        setAlpha(0.0f);
    }

    public static void a(hu0 hu0Var) {
        PhotoViewer photoViewer = hu0Var.n;
        org.telegram.ui.Components.j71 j71Var = photoViewer.C2;
        if (j71Var == null || j71Var.p() == -9223372036854775807L) {
            ValueAnimator valueAnimator = hu0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                hu0Var.h = null;
            }
            hu0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.C2.p() - photoViewer.C2.n());
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
        if (!photoViewer.C2.y()) {
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
            ofFloat.addUpdateListener(new e3(hu0Var, 24));
            hu0Var.h.setDuration(max);
            hu0Var.h.setInterpolator(hu0Var.f);
            hu0Var.h.start();
            hu0Var.setAlpha(max2);
        }
    }
}
