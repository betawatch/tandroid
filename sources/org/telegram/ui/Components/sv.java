package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sv extends ey {
    public final /* synthetic */ ry I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(ry ryVar, Context context) {
        super(ryVar, context, 1);
        this.I = ryVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
