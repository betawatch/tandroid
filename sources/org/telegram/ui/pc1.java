package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ od1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc1(od1 od1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = od1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        od1 od1Var = this.c;
        if (i10 == 0) {
            od1Var.r.setBounds(od1Var.V.getLeft() - rect.left, 0, od1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            od1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        od1Var.r.draw(canvas);
    }
}
