package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kg0 implements ig.g {
    public final /* synthetic */ ng0 a;

    public /* synthetic */ kg0(ng0 ng0Var) {
        this.a = ng0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ig.g
    public void k(Canvas canvas) {
        ng.d y10;
        Canvas canvas2;
        ng0 ng0Var = this.a;
        RectF rectF = ng0Var.Q;
        int measuredWidth = ng0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = ng0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        SparseArray sparseArray = ng0Var.a;
        int size = sparseArray.size();
        int i9 = 0;
        while (i9 < size) {
            org.telegram.ui.ActionBar.o2 o2Var = ((rg1) sparseArray.valueAt(i9)).a;
            View view = o2Var.fragmentView;
            if (view != null && pg.i.c(view, ng0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof mg0) && (y10 = ((mg0) o2Var).y()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.T0(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i9++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ig.g
    public void x0(g.x xVar) {
        ng0 ng0Var = this.a;
        RectF rectF = ng0Var.Q;
        xVar.a(ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = ng0Var.a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            org.telegram.ui.ActionBar.o2 o2Var = ((rg1) sparseArray.valueAt(i9)).a;
            View view = o2Var.fragmentView;
            if (view != null && pg.i.c(view, ng0Var.b, rectF) && rectF.right > 0.0f && rectF.left < ng0Var.fragmentView.getMeasuredWidth() && (o2Var instanceof mg0) && ((mg0) o2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(o2Var.getClassGuid());
            }
        }
    }
}
