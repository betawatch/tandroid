package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
