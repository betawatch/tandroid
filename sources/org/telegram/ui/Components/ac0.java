package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
