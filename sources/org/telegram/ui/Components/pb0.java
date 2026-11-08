package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pb0 extends TextView {
    public final /* synthetic */ qb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb0(qb0 qb0Var, Context context, int i7) {
        super(context);
        this.a = qb0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qb0 qb0Var = this.a;
        if (qb0Var.e.getAdapter() instanceof ax) {
            ((ax) qb0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z9) {
        super.setSelected(z9);
        Drawable background = getBackground();
        qb0 qb0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.k6.H1(background, qb0Var.c(z9 ? 0.1f : 0.05f), true);
        }
        setTextColor(qb0Var.c(z9 ? 0.8f : 0.6f));
    }
}
