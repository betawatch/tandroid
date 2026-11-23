package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ef extends org.telegram.ui.dg0 {
    public final /* synthetic */ int E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef(Object obj, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.E0 = i7;
        this.F0 = obj;
    }

    @Override // org.telegram.ui.dg0
    public final void m(long j3) {
        switch (this.E0) {
            case 0:
                ((ChatActivityEnterView) this.F0).setEffectId(j3);
                break;
            default:
                ti tiVar = (ti) this.F0;
                bi biVar = tiVar.G2;
                tiVar.L2 = j3;
                biVar.setEffect(j3);
                break;
        }
    }
}
