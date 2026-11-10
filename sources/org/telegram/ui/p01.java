package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p01 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ t11 c;

    public p01(t11 t11Var, Integer num) {
        this.c = t11Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        t11 t11Var = this.c;
        boolean n10 = t11Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (t11Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.z(1.0f, t11Var.b1, org.telegram.messenger.g0.L(t11Var.d1), com.google.android.recaptcha.internal.a.z(1.0f, t11Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * t11Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.z(1.0f, t11Var.b1, org.telegram.messenger.g0.L(t11Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (t11Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * t11Var.a1) + view.getPaddingLeft() + width), (int) ((height * t11Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
