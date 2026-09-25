package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.uo {
    public final /* synthetic */ wn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(wn wnVar, Context context) {
        super(context);
        this.f = wnVar;
    }

    @Override // org.telegram.ui.Components.uo
    public final void a(boolean z10) {
        wn wnVar = this.f;
        wnVar.t7();
        wnVar.r7();
        wnVar.u7();
        wnVar.v7();
        al alVar = wnVar.ab;
        if (alVar != null) {
            alVar.setTranslationY(wnVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            wnVar.o9();
        } else {
            wnVar.D9 = true;
            wnVar.jc();
        }
    }
}
