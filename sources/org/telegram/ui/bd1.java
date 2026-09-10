package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bd1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ ae1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(ae1 ae1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = ae1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        ae1 ae1Var = this.c;
        if (i10 == 0) {
            ae1Var.r.setBounds(ae1Var.V.getLeft() - rect.left, 0, ae1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            ae1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        ae1Var.r.draw(canvas);
    }
}
