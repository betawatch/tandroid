package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ac0 extends TextView {
    public final /* synthetic */ bc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(bc0 bc0Var, Context context, int i7) {
        super(context);
        this.a = bc0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bc0 bc0Var = this.a;
        if (bc0Var.e.getAdapter() instanceof lx) {
            ((lx) bc0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        bc0 bc0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.n6.H1(background, bc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(bc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
