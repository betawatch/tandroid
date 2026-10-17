package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class mf extends org.telegram.ui.oi0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.oi0
    public final void m(long j10) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j10);
                break;
            default:
                ti tiVar = (ti) this.B0;
                ei eiVar = tiVar.L0;
                tiVar.Q0 = j10;
                eiVar.setEffect(j10);
                break;
        }
    }
}
