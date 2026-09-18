package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class b61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ g71 c;

    public b61(g71 g71Var, Integer num) {
        this.c = g71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        g71 g71Var = this.c;
        boolean n10 = g71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (g71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.b1, AndroidUtilities.dp(g71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * g71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, g71Var.b1, AndroidUtilities.dp(g71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (g71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * g71Var.a1) + view.getPaddingLeft() + width), (int) ((height * g71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
