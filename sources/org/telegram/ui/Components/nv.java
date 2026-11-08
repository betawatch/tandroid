package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class nv extends ux {
    public final /* synthetic */ hy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(hy hyVar, Context context) {
        super(hyVar, context, 2);
        this.H = hyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.H.g0.invalidate();
        }
    }
}
