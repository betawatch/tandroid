package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yc0 extends TextView {
    public final /* synthetic */ zc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(zc0 zc0Var, Context context, int i10) {
        super(context);
        this.a = zc0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zc0 zc0Var = this.a;
        if (zc0Var.e.getAdapter() instanceof xc0) {
            ((xc0) zc0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        zc0 zc0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.g6.B1(background, zc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(zc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
