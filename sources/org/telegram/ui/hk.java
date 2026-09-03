package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.ro {
    public final /* synthetic */ xn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(xn xnVar, Context context) {
        super(context);
        this.f = xnVar;
    }

    @Override // org.telegram.ui.Components.ro
    public final void a(boolean z4) {
        xn xnVar = this.f;
        xnVar.t7();
        xnVar.r7();
        xnVar.u7();
        xnVar.v7();
        al alVar = xnVar.Ya;
        if (alVar != null) {
            alVar.setTranslationY(xnVar.t9 + getCurrentHeight());
        }
        if (!z4) {
            xnVar.o9();
        } else {
            xnVar.A9 = true;
            xnVar.jc();
        }
    }
}
