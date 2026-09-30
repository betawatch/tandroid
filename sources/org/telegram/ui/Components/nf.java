package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class nf extends org.telegram.ui.vi0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.vi0
    public final void m(long j3) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j3);
                break;
            default:
                wi wiVar = (wi) this.B0;
                gi giVar = wiVar.I0;
                wiVar.N0 = j3;
                giVar.setEffect(j3);
                break;
        }
    }
}
