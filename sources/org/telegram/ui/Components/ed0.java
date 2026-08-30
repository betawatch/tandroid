package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ed0 extends TextView {
    public final /* synthetic */ fd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(fd0 fd0Var, Context context, int i10) {
        super(context);
        this.a = fd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fd0 fd0Var = this.a;
        if (fd0Var.e.getAdapter() instanceof dd0) {
            ((dd0) fd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z4) {
        super.setSelected(z4);
        Drawable background = getBackground();
        fd0 fd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, fd0Var.c(z4 ? 0.1f : 0.05f), true);
        }
        setTextColor(fd0Var.c(z4 ? 0.8f : 0.6f));
    }
}
