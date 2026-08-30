package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sw extends wy {
    public final /* synthetic */ kz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(kz kzVar, Context context) {
        super(kzVar, context, 0);
        this.E = kzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.u0.invalidate();
        }
    }
}
