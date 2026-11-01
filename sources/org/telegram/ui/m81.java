package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m81 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ k91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m81(k91 k91Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = k91Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        k91 k91Var = this.c;
        if (i10 == 0) {
            k91Var.r.setBounds(k91Var.W.getLeft() - rect.left, 0, k91Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            k91Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        k91Var.r.draw(canvas);
    }
}
