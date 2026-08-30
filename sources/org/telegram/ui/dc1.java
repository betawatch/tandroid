package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ cd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(cd1 cd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = cd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        cd1 cd1Var = this.c;
        if (i10 == 0) {
            cd1Var.r.setBounds(cd1Var.S.getLeft() - rect.left, 0, cd1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            cd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        cd1Var.r.draw(canvas);
    }
}
