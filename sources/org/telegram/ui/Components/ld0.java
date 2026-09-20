package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ld0 extends TextView {
    public final /* synthetic */ md0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(md0 md0Var, Context context, int i10) {
        super(context);
        this.a = md0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        md0 md0Var = this.a;
        if (md0Var.e.getAdapter() instanceof kd0) {
            ((kd0) md0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        md0 md0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, md0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(md0Var.c(z10 ? 0.8f : 0.6f));
    }
}
