package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kg0 implements bh.h {
    public final /* synthetic */ ng0 a;

    public /* synthetic */ kg0(ng0 ng0Var) {
        this.a = ng0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void J(bh.a aVar) {
        ng0 ng0Var = this.a;
        RectF rectF = ng0Var.T;
        aVar.a(ng0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ng0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((mg1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, ng0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof mg0) && ((mg0) n2Var).z() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void b(Canvas canvas) {
        gh.d z10;
        Canvas canvas2;
        ng0 ng0Var = this.a;
        RectF rectF = ng0Var.T;
        int measuredWidth = ng0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = ng0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ng0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        SparseArray sparseArray = ng0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((mg1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.j.c(view, ng0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof mg0) && (z10 = ((mg0) n2Var).z()) != null) {
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
