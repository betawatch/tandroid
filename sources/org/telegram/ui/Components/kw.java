package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class kw extends yy {
    public final /* synthetic */ lz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(lz lzVar, Context context) {
        super(lzVar, context, 1);
        this.H = lzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
