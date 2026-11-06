package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.Components.co {
    public final /* synthetic */ an f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(an anVar, Context context) {
        super(context);
        this.f = anVar;
    }

    @Override // org.telegram.ui.Components.co
    public final void a(boolean z9) {
        an anVar = this.f;
        anVar.H7();
        anVar.F7();
        anVar.I7();
        anVar.J7();
        hk hkVar = anVar.xb;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.P9 + getCurrentHeight());
        }
        if (!z9) {
            anVar.K9();
        } else {
            anVar.W9 = true;
            anVar.Nc();
        }
    }
}
