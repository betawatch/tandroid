package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mw extends wy {
    public final /* synthetic */ kz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(kz kzVar, Context context) {
        super(kzVar, context, 2);
        this.E = kzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.E.d0.invalidate();
        }
    }
}
