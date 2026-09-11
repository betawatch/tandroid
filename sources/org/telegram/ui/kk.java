package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.so {
    public final /* synthetic */ co f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(co coVar, Context context) {
        super(context);
        this.f = coVar;
    }

    @Override // org.telegram.ui.Components.so
    public final void a(boolean z10) {
        co coVar = this.f;
        coVar.t7();
        coVar.r7();
        coVar.u7();
        coVar.v7();
        dl dlVar = coVar.bb;
        if (dlVar != null) {
            dlVar.setTranslationY(coVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            coVar.o9();
        } else {
            coVar.D9 = true;
            coVar.jc();
        }
    }
}
