package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sv extends yx {
    public final /* synthetic */ ly I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(ly lyVar, Context context) {
        super(lyVar, context, 2);
        this.I = lyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.h0.invalidate();
        }
    }
}
