package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class te extends org.telegram.ui.eg0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.z0 = i7;
        this.A0 = obj;
    }

    @Override // org.telegram.ui.eg0
    public final void l(long j3) {
        switch (this.z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j3);
                break;
            default:
                ci ciVar = (ci) this.A0;
                kh khVar = ciVar.F2;
                ciVar.K2 = j3;
                khVar.setEffect(j3);
                break;
        }
    }
}
