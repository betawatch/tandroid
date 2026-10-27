package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a51 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ f61 c;

    public a51(f61 f61Var, Integer num) {
        this.c = f61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        f61 f61Var = this.c;
        boolean n10 = f61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (f61Var.a1 * width)) + view.getPaddingLeft()), (int) c3.h0.z(1.0f, f61Var.b1, AndroidUtilities.dp(f61Var.d1), c3.h0.z(1.0f, f61Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * f61Var.a1) + view.getPaddingLeft() + width), (int) c3.h0.z(1.0f, f61Var.b1, AndroidUtilities.dp(f61Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (f61Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * f61Var.a1) + view.getPaddingLeft() + width), (int) ((height * f61Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
