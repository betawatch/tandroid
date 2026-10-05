package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
