package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rw extends fz {
    public final /* synthetic */ sz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(sz szVar, Context context) {
        super(szVar, context, 1);
        this.H = szVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
