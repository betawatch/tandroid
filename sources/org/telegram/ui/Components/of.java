package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class of extends org.telegram.ui.gj0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.A0 = i10;
        this.B0 = obj;
    }

    @Override // org.telegram.ui.gj0
    public final void m(long j10) {
        switch (this.A0) {
            case 0:
                ((ChatActivityEnterView) this.B0).setEffectId(j10);
                break;
            default:
                vi viVar = (vi) this.B0;
                fi fiVar = viVar.L0;
                viVar.Q0 = j10;
                fiVar.setEffect(j10);
                break;
        }
    }
}
