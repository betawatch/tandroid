package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o81 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ m91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(m91 m91Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = m91Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        m91 m91Var = this.c;
        if (i10 == 0) {
            m91Var.r.setBounds(m91Var.W.getLeft() - rect.left, 0, m91Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            m91Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        m91Var.r.draw(canvas);
    }
}
