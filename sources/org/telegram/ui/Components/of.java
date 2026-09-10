package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class of extends org.telegram.ui.cj0 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
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
                yi yiVar = (yi) this.B0;
                ii iiVar = yiVar.I0;
                yiVar.N0 = j3;
                iiVar.setEffect(j3);
                break;
        }
    }
}
