package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gd0 extends TextView {
    public final /* synthetic */ hd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(hd0 hd0Var, Context context, int i10) {
        super(context);
        this.a = hd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hd0 hd0Var = this.a;
        if (hd0Var.e.getAdapter() instanceof fd0) {
            ((fd0) hd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z4) {
        super.setSelected(z4);
        Drawable background = getBackground();
        hd0 hd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.k6.B1(background, hd0Var.c(z4 ? 0.1f : 0.05f), true);
        }
        setTextColor(hd0Var.c(z4 ? 0.8f : 0.6f));
    }
}
