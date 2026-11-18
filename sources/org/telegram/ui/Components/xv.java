package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xv extends ey {
    public final /* synthetic */ ry I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(ry ryVar, Context context) {
        super(ryVar, context, 2);
        this.I = ryVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.h0.invalidate();
        }
    }
}
