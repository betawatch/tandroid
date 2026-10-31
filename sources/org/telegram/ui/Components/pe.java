package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pe extends org.telegram.ui.kh0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe(Object obj, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.z0 = i10;
        this.A0 = obj;
    }

    @Override // org.telegram.ui.kh0
    public final void l(long j10) {
        switch (this.z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                break;
            default:
                bi biVar = (bi) this.A0;
                ih ihVar = biVar.C2;
                biVar.H2 = j10;
                ihVar.setEffect(j10);
                break;
        }
    }
}
