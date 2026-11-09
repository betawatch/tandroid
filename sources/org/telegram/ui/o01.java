package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o01 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ s11 c;

    public o01(s11 s11Var, Integer num) {
        this.c = s11Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        s11 s11Var = this.c;
        boolean n10 = s11Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (s11Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.z(1.0f, s11Var.b1, org.telegram.messenger.g0.L(s11Var.d1), com.google.android.recaptcha.internal.a.z(1.0f, s11Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * s11Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.z(1.0f, s11Var.b1, org.telegram.messenger.g0.L(s11Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (s11Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * s11Var.a1) + view.getPaddingLeft() + width), (int) ((height * s11Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
