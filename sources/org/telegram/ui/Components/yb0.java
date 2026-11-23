package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yb0 extends TextView {
    public final /* synthetic */ zb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb0(zb0 zb0Var, Context context, int i7) {
        super(context);
        this.a = zb0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zb0 zb0Var = this.a;
        if (zb0Var.e.getAdapter() instanceof kx) {
            ((kx) zb0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        zb0 zb0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.n6.H1(background, zb0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(zb0Var.c(z10 ? 0.8f : 0.6f));
    }
}
