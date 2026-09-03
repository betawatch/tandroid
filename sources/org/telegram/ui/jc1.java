package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ jd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(jd1 jd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = jd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        jd1 jd1Var = this.c;
        if (i10 == 0) {
            jd1Var.r.setBounds(jd1Var.S.getLeft() - rect.left, 0, jd1Var.S.getRight() + rect.right, getMeasuredHeight());
        } else {
            jd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        jd1Var.r.draw(canvas);
    }
}
