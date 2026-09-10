package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pw extends ez {
    public final /* synthetic */ rz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(rz rzVar, Context context) {
        super(rzVar, context, 1);
        this.H = rzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
