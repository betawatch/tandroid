package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class dx extends gz {
    public final /* synthetic */ tz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(tz tzVar, Context context) {
        super(tzVar, context, 0);
        this.H = tzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
