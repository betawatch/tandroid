package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class md0 extends TextView {
    public final /* synthetic */ nd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(nd0 nd0Var, Context context, int i10) {
        super(context);
        this.a = nd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nd0 nd0Var = this.a;
        if (nd0Var.e.getAdapter() instanceof kd0) {
            ((kd0) nd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        nd0 nd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, nd0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(nd0Var.c(z10 ? 0.8f : 0.6f));
    }
}
