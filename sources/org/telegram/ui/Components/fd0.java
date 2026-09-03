package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fd0 extends TextView {
    public final /* synthetic */ gd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(gd0 gd0Var, Context context, int i10) {
        super(context);
        this.a = gd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gd0 gd0Var = this.a;
        if (gd0Var.e.getAdapter() instanceof ed0) {
            ((ed0) gd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z4) {
        super.setSelected(z4);
        Drawable background = getBackground();
        gd0 gd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, gd0Var.c(z4 ? 0.1f : 0.05f), true);
        }
        setTextColor(gd0Var.c(z4 ? 0.8f : 0.6f));
    }
}
