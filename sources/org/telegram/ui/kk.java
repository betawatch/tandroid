package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
