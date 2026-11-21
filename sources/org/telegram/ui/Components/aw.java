package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class aw extends gy {
    public final /* synthetic */ ty I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ty tyVar, Context context) {
        super(tyVar, context, 2);
        this.I = tyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.h0.invalidate();
        }
    }
}
