package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class mg0 implements bh.h {
    public final /* synthetic */ pg0 a;

    public /* synthetic */ mg0(pg0 pg0Var) {
        this.a = pg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void H(bh.a aVar) {
        pg0 pg0Var = this.a;
        RectF rectF = pg0Var.T;
        aVar.a(pg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = pg0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((og1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, pg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < pg0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof og0) && ((og0) n2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void r(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        pg0 pg0Var = this.a;
        RectF rectF = pg0Var.T;
        int measuredWidth = pg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = pg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(pg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        SparseArray sparseArray = pg0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((og1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, pg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < pg0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof og0) && (z10 = ((og0) n2Var).z()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                z10.y(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }
}
