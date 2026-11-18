package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pq0 extends ImageView {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public org.telegram.ui.Components.f61 e;
    public final org.telegram.ui.Components.lr f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = org.telegram.ui.Components.lr.i;
        setAlpha(0.0f);
    }

    public static void a(pq0 pq0Var) {
        PhotoViewer photoViewer = pq0Var.n;
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var == null || f61Var.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = pq0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                pq0Var.h = null;
            }
            pq0Var.setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = pq0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                pq0Var.h = null;
            }
            pq0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.G2.d0()) {
            ValueAnimator valueAnimator3 = pq0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                pq0Var.h = null;
            }
            pq0Var.setAlpha(max2);
            return;
        }
        if (pq0Var.h == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            pq0Var.h = ofFloat;
            ofFloat.addUpdateListener(new a3(pq0Var, 22));
            pq0Var.h.setDuration(max);
            pq0Var.h.setInterpolator(pq0Var.f);
            pq0Var.h.start();
            pq0Var.setAlpha(max2);
        }
    }
}
