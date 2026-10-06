package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zw extends az {
    public final /* synthetic */ nz H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(nz nzVar, Context context) {
        super(nzVar, context, 0);
        this.H = nzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.x0.invalidate();
        }
    }
}
