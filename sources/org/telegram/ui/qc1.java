package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class qc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ pd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(pd1 pd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = pd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        pd1 pd1Var = this.c;
        if (i10 == 0) {
            pd1Var.r.setBounds(pd1Var.V.getLeft() - rect.left, 0, pd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            pd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        pd1Var.r.draw(canvas);
    }
}
