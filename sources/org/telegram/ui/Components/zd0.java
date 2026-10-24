package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zd0 extends TextView {
    public final /* synthetic */ ae0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd0(ae0 ae0Var, Context context, int i10) {
        super(context);
        this.a = ae0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ae0 ae0Var = this.a;
        if (ae0Var.e.getAdapter() instanceof yd0) {
            ((yd0) ae0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        ae0 ae0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.k6.E1(background, ae0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(ae0Var.c(z10 ? 0.8f : 0.6f));
    }
}
