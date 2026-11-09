package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tv extends ux {
    public final /* synthetic */ hy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(hy hyVar, Context context) {
        super(hyVar, context, 0);
        this.H = hyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.x0.invalidate();
        }
    }
}
