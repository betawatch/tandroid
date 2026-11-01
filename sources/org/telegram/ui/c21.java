package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c21 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ g31 c;

    public c21(g31 g31Var, Integer num) {
        this.c = g31Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.i0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        g31 g31Var = this.c;
        boolean n10 = g31Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (g31Var.a1 * width)) + view.getPaddingLeft()), (int) c3.i0.z(1.0f, g31Var.b1, org.telegram.messenger.i0.L(g31Var.d1), c3.i0.z(1.0f, g31Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * g31Var.a1) + view.getPaddingLeft() + width), (int) c3.i0.z(1.0f, g31Var.b1, org.telegram.messenger.i0.L(g31Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (g31Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * g31Var.a1) + view.getPaddingLeft() + width), (int) ((height * g31Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.i0.L(12.0f));
    }
}
