package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fx extends mz {
    public final /* synthetic */ a00 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(a00 a00Var, Context context) {
        super(a00Var, context, 2);
        this.H = a00Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
