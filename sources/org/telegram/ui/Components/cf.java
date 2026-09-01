package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cf extends org.telegram.ui.ti0 {
    public final /* synthetic */ int x0;
    public final /* synthetic */ Object y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.x0 = i10;
        this.y0 = obj;
    }

    @Override // org.telegram.ui.ti0
    public final void m(long j10) {
        switch (this.x0) {
            case 0:
                ((ChatActivityEnterView) this.y0).setEffectId(j10);
                break;
            default:
                mi miVar = (mi) this.y0;
                vh vhVar = miVar.F0;
                miVar.K0 = j10;
                vhVar.setEffect(j10);
                break;
        }
    }
}
