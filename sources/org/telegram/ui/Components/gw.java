package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gw extends gy {
    public final /* synthetic */ ty I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(ty tyVar, Context context) {
        super(tyVar, context, 0);
        this.I = tyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.y0.invalidate();
        }
    }
}
