package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ww extends fz {
    public final /* synthetic */ sz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(sz szVar, Context context) {
        super(szVar, context, 2);
        this.H = szVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
