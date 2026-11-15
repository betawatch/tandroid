package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.Components.mo {
    public final /* synthetic */ an f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(an anVar, Context context) {
        super(context);
        this.f = anVar;
    }

    @Override // org.telegram.ui.Components.mo
    public final void a(boolean z10) {
        an anVar = this.f;
        anVar.I7();
        anVar.G7();
        anVar.J7();
        anVar.K7();
        hk hkVar = anVar.Ab;
        if (hkVar != null) {
            hkVar.setTranslationY(anVar.S9 + getCurrentHeight());
        }
        if (!z10) {
            anVar.M9();
        } else {
            anVar.Z9 = true;
            anVar.Rc();
        }
    }
}
