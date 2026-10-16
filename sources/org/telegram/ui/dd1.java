package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dd1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ ce1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd1(ce1 ce1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = ce1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        ce1 ce1Var = this.c;
        if (i10 == 0) {
            ce1Var.r.setBounds(ce1Var.V.getLeft() - rect.left, 0, ce1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            ce1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ce1Var.r.draw(canvas);
    }
}
