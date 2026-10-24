package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mf extends org.telegram.ui.qi0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.z0 = i10;
        this.A0 = obj;
    }

    @Override // org.telegram.ui.qi0
    public final void l(long j10) {
        switch (this.z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                break;
            default:
                ti tiVar = (ti) this.A0;
                ei eiVar = tiVar.L0;
                tiVar.Q0 = j10;
                eiVar.setEffect(j10);
                break;
        }
    }
}
