package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ h71 c;

    public c61(h71 h71Var, Integer num) {
        this.c = h71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        h71 h71Var = this.c;
        boolean n10 = h71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (h71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.b1, AndroidUtilities.dp(h71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * h71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, h71Var.b1, AndroidUtilities.dp(h71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (h71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * h71Var.a1) + view.getPaddingLeft() + width), (int) ((height * h71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
