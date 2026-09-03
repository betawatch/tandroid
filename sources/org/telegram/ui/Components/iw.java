package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iw extends yy {
    public final /* synthetic */ mz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(mz mzVar, Context context) {
        super(mzVar, context, 1);
        this.E = mzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.G.invalidate();
        }
    }
}
