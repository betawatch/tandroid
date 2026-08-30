package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ q61 c;

    public k51(q61 q61Var, Integer num) {
        this.c = q61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        q61 q61Var = this.c;
        boolean n10 = q61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (q61Var.X0 * width)) + view.getPaddingLeft()), (int) e2.c.w(1.0f, q61Var.Y0, AndroidUtilities.dp(q61Var.a1), e2.c.w(1.0f, q61Var.Y0, height, view.getPaddingTop())), (int) (((width2 - width) * q61Var.X0) + view.getPaddingLeft() + width), (int) e2.c.w(1.0f, q61Var.Y0, AndroidUtilities.dp(q61Var.a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (q61Var.X0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * q61Var.X0) + view.getPaddingLeft() + width), (int) ((height * q61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
