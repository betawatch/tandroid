package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
