package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wd0 extends TextView {
    public final /* synthetic */ xd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(xd0 xd0Var, Context context, int i10) {
        super(context);
        this.a = xd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xd0 xd0Var = this.a;
        if (xd0Var.e.getAdapter() instanceof vd0) {
            ((vd0) xd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        xd0 xd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.h6.C1(background, xd0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(xd0Var.c(z10 ? 0.8f : 0.6f));
    }
}
