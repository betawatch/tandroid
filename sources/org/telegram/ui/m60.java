package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ o60 b;

    public m60(o60 o60Var, FrameLayout frameLayout) {
        this.b = o60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        o60 o60Var = this.b;
        if (o60Var.w0 == null) {
            o60Var.w0 = (wc) o60Var.y0(o60Var.W);
        }
        o60Var.w0.f.setOnClickListener(new g60(this, 1));
    }
}
