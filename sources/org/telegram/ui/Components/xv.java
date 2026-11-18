package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xv extends ey {
    public final /* synthetic */ ry I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(ry ryVar, Context context) {
        super(ryVar, context, 2);
        this.I = ryVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.h0.invalidate();
        }
    }
}
