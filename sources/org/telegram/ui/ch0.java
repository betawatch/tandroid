package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ch0 implements zg.g {
    public final /* synthetic */ fh0 a;

    public /* synthetic */ ch0(fh0 fh0Var) {
        this.a = fh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.g
    public void d(Canvas canvas) {
        eh.d x10;
        Canvas canvas2;
        fh0 fh0Var = this.a;
        RectF rectF = fh0Var.U;
        int measuredWidth = fh0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = fh0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        SparseArray sparseArray = fh0Var.a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.p2 p2Var = ((ei1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && gh.k.c(view, fh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < fh0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof eh0) && (x10 = ((eh0) p2Var).x()) != null) {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                x10.u(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.g
    public void u(g.z zVar) {
        fh0 fh0Var = this.a;
        RectF rectF = fh0Var.U;
        zVar.a(fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        zVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = fh0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.p2 p2Var = ((ei1) sparseArray.valueAt(i10)).a;
            View view = p2Var.fragmentView;
            if (view != null && gh.k.c(view, fh0Var.b, rectF) && rectF.right > 0.0f && rectF.left < fh0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof eh0) && ((eh0) p2Var).x() != null) {
                zVar.c(rectF.left);
                zVar.c(rectF.top);
                zVar.a(p2Var.getClassGuid());
            }
        }
    }
}
