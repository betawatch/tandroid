package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.zo {
    public final /* synthetic */ eo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(eo eoVar, Context context) {
        super(context);
        this.f = eoVar;
    }

    @Override // org.telegram.ui.Components.zo
    public final void a(boolean z10) {
        eo eoVar = this.f;
        eoVar.t7();
        eoVar.r7();
        eoVar.u7();
        eoVar.v7();
        fl flVar = eoVar.bb;
        if (flVar != null) {
            flVar.setTranslationY(eoVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            eoVar.o9();
        } else {
            eoVar.D9 = true;
            eoVar.jc();
        }
    }
}
