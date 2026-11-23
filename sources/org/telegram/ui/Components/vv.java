package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vv extends gy {
    public final /* synthetic */ ty I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(ty tyVar, Context context) {
        super(tyVar, context, 1);
        this.I = tyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
