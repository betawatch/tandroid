package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qb0 extends TextView {
    public final /* synthetic */ rb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb0(rb0 rb0Var, Context context, int i7) {
        super(context);
        this.a = rb0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rb0 rb0Var = this.a;
        if (rb0Var.e.getAdapter() instanceof ax) {
            ((ax) rb0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z9) {
        super.setSelected(z9);
        Drawable background = getBackground();
        rb0 rb0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.l6.H1(background, rb0Var.c(z9 ? 0.1f : 0.05f), true);
        }
        setTextColor(rb0Var.c(z9 ? 0.8f : 0.6f));
    }
}
