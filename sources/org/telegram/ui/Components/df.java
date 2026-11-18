package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class df extends org.telegram.ui.eg0 {
    public final /* synthetic */ int E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df(Object obj, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
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
                si siVar = (si) this.F0;
                ai aiVar = siVar.G2;
                siVar.L2 = j3;
                aiVar.setEffect(j3);
                break;
        }
    }
}
