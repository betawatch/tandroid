package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ k71 c;

    public f61(k71 k71Var, Integer num) {
        this.c = k71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        k71 k71Var = this.c;
        boolean n10 = k71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (k71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.b1, AndroidUtilities.dp(k71Var.d1), com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * k71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.y(1.0f, k71Var.b1, AndroidUtilities.dp(k71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (k71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * k71Var.a1) + view.getPaddingLeft() + width), (int) ((height * k71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
