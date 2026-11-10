package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ m40 b;

    public k40(m40 m40Var, FrameLayout frameLayout) {
        this.b = m40Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        m40 m40Var = this.b;
        if (m40Var.z0 == null) {
            m40Var.z0 = (kc) m40Var.F0(m40Var.Z);
        }
        m40Var.z0.f.setOnClickListener(new j40(this, 0));
    }
}
