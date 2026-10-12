package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ r71 c;

    public m61(r71 r71Var, Integer num) {
        this.c = r71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        r71 r71Var = this.c;
        boolean n10 = r71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (r71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.b1, AndroidUtilities.dp(r71Var.d1), com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * r71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, r71Var.b1, AndroidUtilities.dp(r71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (r71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * r71Var.a1) + view.getPaddingLeft() + width), (int) ((height * r71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
