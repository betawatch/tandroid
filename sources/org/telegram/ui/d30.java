package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d30 extends View {
    public final /* synthetic */ b50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = b50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.U0();
        }
    }
}
