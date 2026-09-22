package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jw extends xy {
    public final /* synthetic */ kz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(kz kzVar, Context context) {
        super(kzVar, context, 1);
        this.H = kzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
