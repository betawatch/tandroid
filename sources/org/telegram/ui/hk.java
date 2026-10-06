package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.wo {
    public final /* synthetic */ yn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(yn ynVar, Context context) {
        super(context);
        this.f = ynVar;
    }

    @Override // org.telegram.ui.Components.wo
    public final void a(boolean z10) {
        yn ynVar = this.f;
        ynVar.t7();
        ynVar.r7();
        ynVar.u7();
        ynVar.v7();
        al alVar = ynVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(ynVar.u9 + getCurrentHeight());
        }
        if (!z10) {
            ynVar.o9();
        } else {
            ynVar.B9 = true;
            ynVar.ic();
        }
    }
}
