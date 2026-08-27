package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ak extends org.telegram.ui.Components.ho {
    public final /* synthetic */ rn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(rn rnVar, Context context) {
        super(context);
        this.f = rnVar;
    }

    @Override // org.telegram.ui.Components.ho
    public final void a(boolean z10) {
        rn rnVar = this.f;
        rnVar.t7();
        rnVar.r7();
        rnVar.u7();
        rnVar.v7();
        tk tkVar = rnVar.Xa;
        if (tkVar != null) {
            tkVar.setTranslationY(rnVar.s9 + getCurrentHeight());
        }
        if (!z10) {
            rnVar.o9();
        } else {
            rnVar.z9 = true;
            rnVar.jc();
        }
    }
}
