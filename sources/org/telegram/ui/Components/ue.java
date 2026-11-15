package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ue extends org.telegram.ui.bg0 {
    public final /* synthetic */ int E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.E0 = i7;
        this.F0 = obj;
    }

    @Override // org.telegram.ui.bg0
    public final void m(long j3) {
        switch (this.E0) {
            case 0:
                ((ChatActivityEnterView) this.F0).setEffectId(j3);
                break;
            default:
                ki kiVar = (ki) this.F0;
                sh shVar = kiVar.G2;
                kiVar.L2 = j3;
                shVar.setEffect(j3);
                break;
        }
    }
}
