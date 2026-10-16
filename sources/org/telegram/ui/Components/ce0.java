package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ce0 extends TextView {
    public final /* synthetic */ de0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(de0 de0Var, Context context, int i10) {
        super(context);
        this.a = de0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        de0 de0Var = this.a;
        if (de0Var.e.getAdapter() instanceof be0) {
            ((be0) de0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        de0 de0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.g6.C1(background, de0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(de0Var.c(z10 ? 0.8f : 0.6f));
    }
}
