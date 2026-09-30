package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class yw extends zy {
    public final /* synthetic */ mz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(mz mzVar, Context context) {
        super(mzVar, context, 0);
        this.H = mzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
