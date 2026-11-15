package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j01 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ n11 c;

    public j01(n11 n11Var, Integer num) {
        this.c = n11Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + org.telegram.messenger.g0.L(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        n11 n11Var = this.c;
        boolean n10 = n11Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (n11Var.b1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.c1, org.telegram.messenger.g0.L(n11Var.e1), com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.c1, height, view.getPaddingTop())), (int) (((width2 - width) * n11Var.b1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.c1, org.telegram.messenger.g0.L(n11Var.e1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (n11Var.b1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * n11Var.b1) + view.getPaddingLeft() + width), (int) ((height * n11Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, org.telegram.messenger.g0.L(12.0f));
    }
}
