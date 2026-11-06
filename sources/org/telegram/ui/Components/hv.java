package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class hv extends tx {
    public final /* synthetic */ gy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(gy gyVar, Context context) {
        super(gyVar, context, 1);
        this.H = gyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.J.invalidate();
        }
    }
}
