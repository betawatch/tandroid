package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nf extends org.telegram.ui.cj0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.cj0
    public final void m(long j3) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j3);
                break;
            default:
                vi viVar = (vi) this.B0;
                fi fiVar = viVar.I0;
                viVar.N0 = j3;
                fiVar.setEffect(j3);
                break;
        }
    }
}
