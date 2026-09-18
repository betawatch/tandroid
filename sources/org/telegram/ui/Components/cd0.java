package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cd0 extends TextView {
    public final /* synthetic */ dd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(dd0 dd0Var, Context context, int i10) {
        super(context);
        this.a = dd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dd0 dd0Var = this.a;
        if (dd0Var.e.getAdapter() instanceof bd0) {
            ((bd0) dd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        dd0 dd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, dd0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(dd0Var.c(z10 ? 0.8f : 0.6f));
    }
}
