package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rw extends zy {
    public final /* synthetic */ mz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(mz mzVar, Context context) {
        super(mzVar, context, 2);
        this.H = mzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.g0.invalidate();
        }
    }
}
