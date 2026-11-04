package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rv extends rx {
    public final /* synthetic */ ey I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(ey eyVar, Context context) {
        super(eyVar, context, 0);
        this.I = eyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.y0.invalidate();
        }
    }
}
