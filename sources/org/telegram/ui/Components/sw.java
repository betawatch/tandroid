package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sw extends az {
    public final /* synthetic */ nz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(nz nzVar, Context context) {
        super(nzVar, context, 2);
        this.H = nzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
