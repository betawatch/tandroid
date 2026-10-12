package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hx extends iz {
    public final /* synthetic */ wz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(wz wzVar, Context context) {
        super(wzVar, context, 0);
        this.H = wzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
