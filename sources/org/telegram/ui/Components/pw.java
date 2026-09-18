package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pw extends xy {
    public final /* synthetic */ kz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(kz kzVar, Context context) {
        super(kzVar, context, 2);
        this.H = kzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
