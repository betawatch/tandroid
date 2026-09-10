package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g61 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ l71 c;

    public g61(l71 l71Var, Integer num) {
        this.c = l71Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        l71 l71Var = this.c;
        boolean n10 = l71Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (l71Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, l71Var.b1, AndroidUtilities.dp(l71Var.d1), com.google.android.gms.internal.vision.e2.z(1.0f, l71Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * l71Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, l71Var.b1, AndroidUtilities.dp(l71Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (l71Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * l71Var.a1) + view.getPaddingLeft() + width), (int) ((height * l71Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
