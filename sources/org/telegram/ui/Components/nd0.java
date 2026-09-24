package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class nd0 extends TextView {
    public final /* synthetic */ od0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(od0 od0Var, Context context, int i10) {
        super(context);
        this.a = od0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        od0 od0Var = this.a;
        if (od0Var.e.getAdapter() instanceof md0) {
            ((md0) od0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        od0 od0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.h6.B1(background, od0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(od0Var.c(z10 ? 0.8f : 0.6f));
    }
}
