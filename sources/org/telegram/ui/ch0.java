package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ch0 implements ah.k {
    public final /* synthetic */ fh0 a;

    public /* synthetic */ ch0(fh0 fh0Var) {
        this.a = fh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ah.k
    public void U(ah.a aVar) {
        fh0 fh0Var = this.a;
        RectF rectF = fh0Var.T;
        aVar.a(fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = fh0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((wh1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, fh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < fh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof eh0) && ((eh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ah.k
    public void d(Canvas canvas) {
        fh.d x10;
        Canvas canvas2;
        fh0 fh0Var = this.a;
        RectF rectF = fh0Var.T;
        int measuredWidth = fh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = fh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        SparseArray sparseArray = fh0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((wh1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, fh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < fh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof eh0) && (x10 = ((eh0) n2Var).x()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                x10.y(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }
}
