package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ kc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(kc1 kc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = kc1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        kc1 kc1Var = this.c;
        if (i10 == 0) {
            kc1Var.r.setBounds(kc1Var.V.getLeft() - rect.left, 0, kc1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            kc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        kc1Var.r.draw(canvas);
    }
}
