package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n01 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ r11 c;

    public n01(r11 r11Var, Integer num) {
        this.c = r11Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        r11 r11Var = this.c;
        boolean n10 = r11Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (r11Var.b1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.c1, org.telegram.messenger.g0.L(r11Var.e1), com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.c1, height, view.getPaddingTop())), (int) (((width2 - width) * r11Var.b1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, r11Var.c1, org.telegram.messenger.g0.L(r11Var.e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (r11Var.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * r11Var.b1) + view.getPaddingLeft() + width), (int) ((height * r11Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
