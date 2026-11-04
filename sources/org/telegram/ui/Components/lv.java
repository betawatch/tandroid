package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lv extends rx {
    public final /* synthetic */ ey I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(ey eyVar, Context context) {
        super(eyVar, context, 2);
        this.I = eyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.h0.invalidate();
        }
    }
}
