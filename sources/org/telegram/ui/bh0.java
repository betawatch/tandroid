package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bh0 implements ah.j {
    public final /* synthetic */ eh0 a;

    public /* synthetic */ bh0(eh0 eh0Var) {
        this.a = eh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ah.j
    public void b(Canvas canvas) {
        fh.d x10;
        Canvas canvas2;
        eh0 eh0Var = this.a;
        RectF rectF = eh0Var.T;
        int measuredWidth = eh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = eh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(eh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        SparseArray sparseArray = eh0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((zh1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, eh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < eh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof dh0) && (x10 = ((dh0) n2Var).x()) != null) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ah.j
    public void m(ah.a aVar) {
        eh0 eh0Var = this.a;
        RectF rectF = eh0Var.T;
        aVar.a(eh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = eh0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((zh1) sparseArray.valueAt(i10)).a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, eh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < eh0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof dh0) && ((dh0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }
}
