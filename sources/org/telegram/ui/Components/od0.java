package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class od0 extends TextView {
    public final /* synthetic */ pd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(pd0 pd0Var, Context context, int i10) {
        super(context);
        this.a = pd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pd0 pd0Var = this.a;
        if (pd0Var.e.getAdapter() instanceof nd0) {
            ((nd0) pd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        pd0 pd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, pd0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(pd0Var.c(z10 ? 0.8f : 0.6f));
    }
}
