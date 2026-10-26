package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vd0 extends TextView {
    public final /* synthetic */ wd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd0(wd0 wd0Var, Context context, int i10) {
        super(context);
        this.a = wd0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        wd0 wd0Var = this.a;
        if (wd0Var.e.getAdapter() instanceof ud0) {
            ((ud0) wd0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        wd0 wd0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.y6.E1(background, wd0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(wd0Var.c(z10 ? 0.8f : 0.6f));
    }
}
