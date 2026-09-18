package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ i71 c;

    public d61(i71 i71Var, Integer num) {
        this.c = i71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        i71 i71Var = this.c;
        boolean n10 = i71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (i71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, i71Var.b1, AndroidUtilities.dp(i71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, i71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * i71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, i71Var.b1, AndroidUtilities.dp(i71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (i71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * i71Var.a1) + view.getPaddingLeft() + width), (int) ((height * i71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
