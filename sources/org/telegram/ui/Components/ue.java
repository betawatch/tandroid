package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ue extends org.telegram.ui.bg0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.z0 = i7;
        this.A0 = obj;
    }

    @Override // org.telegram.ui.bg0
    public final void l(long j3) {
        switch (this.z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j3);
                break;
            default:
                di diVar = (di) this.A0;
                lh lhVar = diVar.C2;
                diVar.H2 = j3;
                lhVar.setEffect(j3);
                break;
        }
    }
}
