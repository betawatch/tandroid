package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ew extends ey {
    public final /* synthetic */ ry I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(ry ryVar, Context context) {
        super(ryVar, context, 0);
        this.I = ryVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.y0.invalidate();
        }
    }
}
