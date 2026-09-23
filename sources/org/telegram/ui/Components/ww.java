package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ww extends yy {
    public final /* synthetic */ lz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(lz lzVar, Context context) {
        super(lzVar, context, 0);
        this.H = lzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
