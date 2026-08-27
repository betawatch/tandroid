package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nc0 extends TextView {
    public final /* synthetic */ oc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(oc0 oc0Var, Context context, int i10) {
        super(context);
        this.a = oc0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oc0 oc0Var = this.a;
        if (oc0Var.e.getAdapter() instanceof mc0) {
            ((mc0) oc0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        oc0 oc0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.g6.B1(background, oc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(oc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
