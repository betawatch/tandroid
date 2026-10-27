package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cx extends fz {
    public final /* synthetic */ sz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(sz szVar, Context context) {
        super(szVar, context, 0);
        this.H = szVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
