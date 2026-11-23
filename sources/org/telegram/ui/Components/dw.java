package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dw extends dy {
    public final /* synthetic */ qy I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(qy qyVar, Context context) {
        super(qyVar, context, 0);
        this.I = qyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.y0.invalidate();
        }
    }
}
