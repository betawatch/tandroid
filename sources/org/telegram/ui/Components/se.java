package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class se extends org.telegram.ui.vf0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.A0 = i3;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.vf0
    public final void l(long j10) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j10);
                break;
            default:
                bi biVar = (bi) this.B0;
                ih ihVar = biVar.D2;
                biVar.I2 = j10;
                ihVar.setEffect(j10);
                break;
        }
    }
}
