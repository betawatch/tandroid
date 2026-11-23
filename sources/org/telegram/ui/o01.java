package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
            rect.set((int) ((width - (s11Var.b1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.c1, org.telegram.messenger.g0.L(s11Var.e1), com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.c1, height, view.getPaddingTop())), (int) (((width2 - width) * s11Var.b1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, s11Var.c1, org.telegram.messenger.g0.L(s11Var.e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (s11Var.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * s11Var.b1) + view.getPaddingLeft() + width), (int) ((height * s11Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
