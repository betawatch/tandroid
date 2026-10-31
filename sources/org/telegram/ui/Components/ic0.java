package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ic0 extends TextView {
    public final /* synthetic */ jc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(jc0 jc0Var, Context context, int i10) {
        super(context);
        this.a = jc0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jc0 jc0Var = this.a;
        if (jc0Var.e.getAdapter() instanceof ox) {
            ((ox) jc0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        jc0 jc0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.t6.H1(background, jc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(jc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
