package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pe extends org.telegram.ui.ih0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe(Object obj, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.z0 = i10;
        this.A0 = obj;
    }

    @Override // org.telegram.ui.ih0
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
