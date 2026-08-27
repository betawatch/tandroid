package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ nc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb1(nc1 nc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = nc1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        nc1 nc1Var = this.c;
        if (i10 == 0) {
            nc1Var.r.setBounds(nc1Var.R.getLeft() - rect.left, 0, nc1Var.R.getRight() + rect.right, getMeasuredHeight());
        } else {
            nc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        nc1Var.r.draw(canvas);
    }
}
