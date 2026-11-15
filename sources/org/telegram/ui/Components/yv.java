package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yv extends yx {
    public final /* synthetic */ ly I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(ly lyVar, Context context) {
        super(lyVar, context, 0);
        this.I = lyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.y0.invalidate();
        }
    }
}
