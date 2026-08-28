package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iw extends jy {
    public final /* synthetic */ wy D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(wy wyVar, Context context) {
        super(wyVar, context, 0);
        this.D = wyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.D.t0.invalidate();
        }
    }
}
