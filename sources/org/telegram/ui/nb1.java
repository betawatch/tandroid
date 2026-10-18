package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ mc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb1(mc1 mc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = mc1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        mc1 mc1Var = this.c;
        if (i10 == 0) {
            mc1Var.r.setBounds(mc1Var.V.getLeft() - rect.left, 0, mc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            mc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        mc1Var.r.draw(canvas);
    }
}
