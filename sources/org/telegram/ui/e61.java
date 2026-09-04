package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ j71 c;

    public e61(j71 j71Var, Integer num) {
        this.c = j71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        j71 j71Var = this.c;
        boolean n10 = j71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (j71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.b1, AndroidUtilities.dp(j71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * j71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.b1, AndroidUtilities.dp(j71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (j71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * j71Var.a1) + view.getPaddingLeft() + width), (int) ((height * j71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
