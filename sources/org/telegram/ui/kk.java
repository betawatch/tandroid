package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
