package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class bt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ kv0 a;

    public bt0(kv0 kv0Var) {
        this.a = kv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        kv0 kv0Var = this.a;
        if (kv0Var.n0 == null) {
            return;
        }
        kv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - kv0Var.n0.getRight());
    }
}
