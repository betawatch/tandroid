package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jc0 extends TextView {
    public final /* synthetic */ kc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(kc0 kc0Var, Context context, int i9) {
        super(context);
        this.a = kc0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kc0 kc0Var = this.a;
        if (kc0Var.e.getAdapter() instanceof ic0) {
            ((ic0) kc0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        kc0 kc0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.f6.B1(background, kc0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(kc0Var.c(z10 ? 0.8f : 0.6f));
    }
}
