package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kb0 extends TextView {
    public final /* synthetic */ lb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(lb0 lb0Var, Context context, int i3) {
        super(context);
        this.a = lb0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lb0 lb0Var = this.a;
        if (lb0Var.e.getAdapter() instanceof yw) {
            ((yw) lb0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        lb0 lb0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.k6.H1(background, lb0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(lb0Var.c(z10 ? 0.8f : 0.6f));
    }
}
