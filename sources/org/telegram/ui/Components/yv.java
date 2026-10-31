package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yv extends iy {
    public final /* synthetic */ vy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(vy vyVar, Context context) {
        super(vyVar, context, 2);
        this.H = vyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
