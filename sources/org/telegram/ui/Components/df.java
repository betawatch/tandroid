package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class df extends org.telegram.ui.eg0 {
    public final /* synthetic */ int E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.E0 = i7;
        this.F0 = obj;
    }

    @Override // org.telegram.ui.eg0
    public final void m(long j3) {
        switch (this.E0) {
            case 0:
                ((ChatActivityEnterView) this.F0).setEffectId(j3);
                break;
            default:
                ui uiVar = (ui) this.F0;
                ci ciVar = uiVar.G2;
                uiVar.L2 = j3;
                ciVar.setEffect(j3);
                break;
        }
    }
}
