package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lg0 implements bh.h {
    public final /* synthetic */ og0 a;

    public /* synthetic */ lg0(og0 og0Var) {
        this.a = og0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void H(bh.a aVar) {
        og0 og0Var = this.a;
        RectF rectF = og0Var.T;
        aVar.a(og0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = og0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((og1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, og0Var.b, rectF) && rectF.right > 0.0f && rectF.left < og0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof ng0) && ((ng0) n2Var).z() != null) {
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
        og0 og0Var = this.a;
        RectF rectF = og0Var.T;
        int measuredWidth = og0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = og0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(og0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        SparseArray sparseArray = og0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((og1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, og0Var.b, rectF) && rectF.right > 0.0f && rectF.left < og0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof ng0) && (z10 = ((ng0) n2Var).z()) != null) {
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
