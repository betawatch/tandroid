package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nq0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.u51 e;
    public final org.telegram.ui.Components.er f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.er.i;
        setAlpha(0.0f);
    }

    public static void a(nq0 nq0Var) {
        PhotoViewer photoViewer = nq0Var.n;
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var == null || u51Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = nq0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                nq0Var.h = null;
            }
            nq0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = nq0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                nq0Var.h = null;
            }
            nq0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.G2.d0()) {
            ValueAnimator valueAnimator3 = nq0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                nq0Var.h = null;
            }
            nq0Var.setAlpha(max2);
            return;
        }
        if (nq0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            nq0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(nq0Var, 22));
            nq0Var.h.setDuration(max);
            nq0Var.h.setInterpolator(nq0Var.f);
            nq0Var.h.start();
            nq0Var.setAlpha(max2);
        }
    }
}
