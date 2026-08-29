package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kg0 implements lg.g {
    public final /* synthetic */ ng0 a;

    public /* synthetic */ kg0(ng0 ng0Var) {
        this.a = ng0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lg.g
    public void d(Canvas canvas) {
        qg.d y8;
        Canvas canvas2;
        ng0 ng0Var = this.a;
        RectF rectF = ng0Var.Q;
        int measuredWidth = ng0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = ng0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ng0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        SparseArray sparseArray = ng0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.o2 o2Var = ((tg1) sparseArray.valueAt(i10)).a;
            View view = o2Var.fragmentView;
            if (view != null && sg.i.c(view, ng0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof mg0) && (y8 = ((mg0) o2Var).y()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y8.E0(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lg.g
    public void q(g.x xVar) {
        ng0 ng0Var = this.a;
        RectF rectF = ng0Var.Q;
        xVar.a(ng0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ng0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.o2 o2Var = ((tg1) sparseArray.valueAt(i10)).a;
            View view = o2Var.fragmentView;
            if (view != null && sg.i.c(view, ng0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof mg0) && ((mg0) o2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(o2Var.getClassGuid());
            }
        }
    }
}
