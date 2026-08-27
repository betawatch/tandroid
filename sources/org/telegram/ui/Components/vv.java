package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vv extends ky {
    public final /* synthetic */ yy D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(yy yyVar, Context context) {
        super(yyVar, context, 1);
        this.D = yyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.D.F.invalidate();
        }
    }
}
