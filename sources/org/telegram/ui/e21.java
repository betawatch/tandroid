package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e21 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ i31 c;

    public e21(i31 i31Var, Integer num) {
        this.c = i31Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.i0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        i31 i31Var = this.c;
        boolean n10 = i31Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (i31Var.a1 * width)) + view.getPaddingLeft()), (int) c3.i0.z(1.0f, i31Var.b1, org.telegram.messenger.i0.L(i31Var.d1), c3.i0.z(1.0f, i31Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * i31Var.a1) + view.getPaddingLeft() + width), (int) c3.i0.z(1.0f, i31Var.b1, org.telegram.messenger.i0.L(i31Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (i31Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * i31Var.a1) + view.getPaddingLeft() + width), (int) ((height * i31Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.i0.L(12.0f));
    }
}
