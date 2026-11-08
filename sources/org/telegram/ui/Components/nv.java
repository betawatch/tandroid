package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
