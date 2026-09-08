package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qw extends xy {
    public final /* synthetic */ kz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(kz kzVar, Context context) {
        super(kzVar, context, 2);
        this.H = kzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
