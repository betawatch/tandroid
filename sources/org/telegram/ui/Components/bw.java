package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bw extends ky {
    public final /* synthetic */ yy D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(yy yyVar, Context context) {
        super(yyVar, context, 2);
        this.D = yyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.D.c0.invalidate();
        }
    }
}
