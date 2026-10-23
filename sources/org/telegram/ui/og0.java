package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class og0 implements bh.h {
    public final /* synthetic */ rg0 a;

    public /* synthetic */ og0(rg0 rg0Var) {
        this.a = rg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void J(bh.a aVar) {
        rg0 rg0Var = this.a;
        RectF rectF = rg0Var.T;
        aVar.a(rg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = rg0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.o2 o2Var = ((sg1) sparseArray.valueAt(i10)).a;
            View view = o2Var.fragmentView;
            if (view != null && ih.k.c(view, rg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < rg0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof qg0) && ((qg0) o2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(o2Var.getClassGuid());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void z(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        rg0 rg0Var = this.a;
        RectF rectF = rg0Var.T;
        int measuredWidth = rg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = rg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(rg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        SparseArray sparseArray = rg0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.o2 o2Var = ((sg1) sparseArray.valueAt(i10)).a;
            View view = o2Var.fragmentView;
            if (view != null && ih.k.c(view, rg0Var.b, rectF) && rectF.right > 0.0f && rectF.left < rg0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof qg0) && (z10 = ((qg0) o2Var).z()) != null) {
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
