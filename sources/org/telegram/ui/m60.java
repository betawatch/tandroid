package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m60 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ p60 b;

    public m60(p60 p60Var, FrameLayout frameLayout) {
        this.b = p60Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        p60 p60Var = this.b;
        if (p60Var.z0 == null) {
            p60Var.z0 = (tc) p60Var.y0(p60Var.Z);
        }
        p60Var.z0.f.setOnClickListener(new h60(this, 1));
    }
}
