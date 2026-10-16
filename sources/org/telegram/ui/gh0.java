package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gh0 implements bh.h {
    public final /* synthetic */ jh0 a;

    public /* synthetic */ gh0(jh0 jh0Var) {
        this.a = jh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void k(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        jh0 jh0Var = this.a;
        RectF rectF = jh0Var.T;
        int measuredWidth = jh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = jh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(jh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        SparseArray sparseArray = jh0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.m2 m2Var = ((hi1) sparseArray.valueAt(i10)).a;
            View view = m2Var.fragmentView;
            if (view != null && ih.j.c(view, jh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < jh0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof ih0) && (z10 = ((ih0) m2Var).z()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                z10.v(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void m0(bh.a aVar) {
        jh0 jh0Var = this.a;
        RectF rectF = jh0Var.T;
        aVar.a(jh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = jh0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.m2 m2Var = ((hi1) sparseArray.valueAt(i10)).a;
            View view = m2Var.fragmentView;
            if (view != null && ih.j.c(view, jh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < jh0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof ih0) && ((ih0) m2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(m2Var.getClassGuid());
            }
        }
    }
}
