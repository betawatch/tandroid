package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gw extends wy {
    public final /* synthetic */ kz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(kz kzVar, Context context) {
        super(kzVar, context, 1);
        this.E = kzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.G.invalidate();
        }
    }
}
