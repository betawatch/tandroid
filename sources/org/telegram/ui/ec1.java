package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ec1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ ed1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(ed1 ed1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = ed1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        ed1 ed1Var = this.c;
        if (i10 == 0) {
            ed1Var.r.setBounds(ed1Var.S.getLeft() - rect.left, 0, ed1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            ed1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ed1Var.r.draw(canvas);
    }
}
