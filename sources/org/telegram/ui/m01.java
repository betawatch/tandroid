package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class m01 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ q11 c;

    public m01(q11 q11Var, Integer num) {
        this.c = q11Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        q11 q11Var = this.c;
        boolean n10 = q11Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (q11Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.z(1.0f, q11Var.b1, org.telegram.messenger.g0.L(q11Var.d1), com.google.android.recaptcha.internal.a.z(1.0f, q11Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * q11Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.z(1.0f, q11Var.b1, org.telegram.messenger.g0.L(q11Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (q11Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * q11Var.a1) + view.getPaddingLeft() + width), (int) ((height * q11Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
