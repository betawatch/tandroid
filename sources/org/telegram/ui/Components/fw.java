package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fw extends iy {
    public final /* synthetic */ vy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(vy vyVar, Context context) {
        super(vyVar, context, 0);
        this.H = vyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
