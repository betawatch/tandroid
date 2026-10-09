package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class de0 extends TextView {
    public final /* synthetic */ ee0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(ee0 ee0Var, Context context, int i10) {
        super(context);
        this.a = ee0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ee0 ee0Var = this.a;
        if (ee0Var.e.getAdapter() instanceof ce0) {
            ((ce0) ee0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        ee0 ee0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.i6.C1(background, ee0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(ee0Var.c(z10 ? 0.8f : 0.6f));
    }
}
