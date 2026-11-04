package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fq0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.m51 e;
    public final org.telegram.ui.Components.xq f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.xq.i;
        setAlpha(0.0f);
    }

    public static void a(fq0 fq0Var) {
        PhotoViewer photoViewer = fq0Var.n;
        org.telegram.ui.Components.m51 m51Var = photoViewer.G2;
        if (m51Var == null || m51Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = fq0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                fq0Var.h = null;
            }
            fq0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = fq0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                fq0Var.h = null;
            }
            fq0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.G2.d0()) {
            ValueAnimator valueAnimator3 = fq0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                fq0Var.h = null;
            }
            fq0Var.setAlpha(max2);
            return;
        }
        if (fq0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            fq0Var.h = ofFloat;
            ofFloat.addUpdateListener(new b3(fq0Var, 22));
            fq0Var.h.setDuration(max);
            fq0Var.h.setInterpolator(fq0Var.f);
            fq0Var.h.start();
            fq0Var.setAlpha(max2);
        }
    }
}
