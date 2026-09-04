package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class dd0 extends TextView {
    public final /* synthetic */ ed0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(ed0 ed0Var, Context context, int i10) {
        super(context);
        this.a = ed0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ed0 ed0Var = this.a;
        if (ed0Var.e.getAdapter() instanceof cd0) {
            ((cd0) ed0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        ed0 ed0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, ed0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(ed0Var.c(z10 ? 0.8f : 0.6f));
    }
}
