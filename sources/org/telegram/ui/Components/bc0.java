package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bc0 extends TextView {
    public final /* synthetic */ cc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc0(cc0 cc0Var, Context context, int i7) {
        super(context);
        this.a = cc0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cc0 cc0Var = this.a;
        if (cc0Var.e.getAdapter() instanceof nx) {
            ((nx) cc0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        cc0 cc0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.m6.H1(background, cc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(cc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
