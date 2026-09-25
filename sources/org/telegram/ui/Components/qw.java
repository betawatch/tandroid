package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qw extends yy {
    public final /* synthetic */ lz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(lz lzVar, Context context) {
        super(lzVar, context, 2);
        this.H = lzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
