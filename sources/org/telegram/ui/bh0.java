package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bh0 implements bh.h {
    public final /* synthetic */ eh0 a;

    public /* synthetic */ bh0(eh0 eh0Var) {
        this.a = eh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.h
    public void k(Canvas canvas) {
        gh.d x10;
        Canvas canvas2;
        eh0 eh0Var = this.a;
        RectF rectF = eh0Var.U;
        int measuredWidth = eh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = eh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        SparseArray sparseArray = eh0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((zh1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.k.c(view, eh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < eh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof dh0) && (x10 = ((dh0) n2Var).x()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                x10.v(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
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
    public void v(bh.a aVar) {
        eh0 eh0Var = this.a;
        RectF rectF = eh0Var.U;
        aVar.a(eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = eh0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((zh1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && ih.k.c(view, eh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < eh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof dh0) && ((dh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }
}
