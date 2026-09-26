package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
