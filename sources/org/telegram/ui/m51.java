package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ r61 c;

    public m51(r61 r61Var, Integer num) {
        this.c = r61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        r61 r61Var = this.c;
        boolean n10 = r61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (r61Var.X0 * width)) + view.getPaddingLeft()), (int) e2.c.w(1.0f, r61Var.Y0, AndroidUtilities.dp(r61Var.a1), e2.c.w(1.0f, r61Var.Y0, height, view.getPaddingTop())), (int) (((width2 - width) * r61Var.X0) + view.getPaddingLeft() + width), (int) e2.c.w(1.0f, r61Var.Y0, AndroidUtilities.dp(r61Var.a1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (r61Var.X0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * r61Var.X0) + view.getPaddingLeft() + width), (int) ((height * r61Var.Y0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
