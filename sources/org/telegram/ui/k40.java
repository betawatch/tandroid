package org.telegram.ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        if (m40Var.A0 == null) {
            m40Var.A0 = (jc) m40Var.F0(m40Var.a0);
        }
        m40Var.A0.f.setOnClickListener(new j40(this, 0));
    }
}
