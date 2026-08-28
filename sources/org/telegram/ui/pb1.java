package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ oc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(oc1 oc1Var, Context context, int i9, Rect rect) {
        super(context);
        this.c = oc1Var;
        this.a = i9;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9 = this.a;
        Rect rect = this.b;
        oc1 oc1Var = this.c;
        if (i9 == 0) {
            oc1Var.r.setBounds(oc1Var.R.getLeft() - rect.left, 0, oc1Var.R.getRight() + rect.right, getMeasuredHeight());
        } else {
            oc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        oc1Var.r.draw(canvas);
    }
}
