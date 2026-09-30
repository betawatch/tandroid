package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class pd0 extends TextView {
    public final /* synthetic */ qd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(qd0 qd0Var, Context context, int i10) {
        super(context);
        this.a = qd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qd0 qd0Var = this.a;
        if (qd0Var.e.getAdapter() instanceof od0) {
            ((od0) qd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        qd0 qd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.h6.B1(background, qd0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(qd0Var.c(z10 ? 0.8f : 0.6f));
    }
}
