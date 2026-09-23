package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.uo {
    public final /* synthetic */ xn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(xn xnVar, Context context) {
        super(context);
        this.f = xnVar;
    }

    @Override // org.telegram.ui.Components.uo
    public final void a(boolean z10) {
        xn xnVar = this.f;
        xnVar.t7();
        xnVar.r7();
        xnVar.u7();
        xnVar.v7();
        al alVar = xnVar.ab;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            xnVar.o9();
        } else {
            xnVar.D9 = true;
            xnVar.jc();
        }
    }
}
