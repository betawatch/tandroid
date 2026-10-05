package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class of extends org.telegram.ui.zi0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.zi0
    public final void m(long j3) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j3);
                break;
            default:
                xi xiVar = (xi) this.B0;
                ei eiVar = xiVar.I0;
                xiVar.N0 = j3;
                eiVar.setEffect(j3);
                break;
        }
    }
}
