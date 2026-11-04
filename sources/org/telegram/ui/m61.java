package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ l71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(l71 l71Var, Context context, int i3, Rect rect) {
        super(context);
        this.c = l71Var;
        this.a = i3;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3 = this.a;
        Rect rect = this.b;
        l71 l71Var = this.c;
        if (i3 == 0) {
            l71Var.r.setBounds(l71Var.X.getLeft() - rect.left, 0, l71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            l71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        l71Var.r.draw(canvas);
    }
}
