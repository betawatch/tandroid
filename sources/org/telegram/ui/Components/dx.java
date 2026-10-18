package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
