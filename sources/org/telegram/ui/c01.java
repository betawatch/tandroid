package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c01 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ g11 c;

    public c01(g11 g11Var, Integer num) {
        this.c = g11Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        g11 g11Var = this.c;
        boolean n4 = g11Var.n();
        Rect rect = this.a;
        if (n4) {
            rect.set((int) ((width - (g11Var.b1 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.y(1.0f, g11Var.c1, org.telegram.messenger.g0.L(g11Var.e1), com.google.android.recaptcha.internal.a.y(1.0f, g11Var.c1, height, view.getPaddingTop())), (int) (((width2 - width) * g11Var.b1) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.y(1.0f, g11Var.c1, org.telegram.messenger.g0.L(g11Var.e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (g11Var.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * g11Var.b1) + view.getPaddingLeft() + width), (int) ((height * g11Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
