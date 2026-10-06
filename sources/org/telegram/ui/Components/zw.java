package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class zw extends az {
    public final /* synthetic */ nz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(nz nzVar, Context context) {
        super(nzVar, context, 0);
        this.H = nzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
