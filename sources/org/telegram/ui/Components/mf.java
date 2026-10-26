package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mf extends org.telegram.ui.ni0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.z0 = i10;
        this.A0 = obj;
    }

    @Override // org.telegram.ui.ni0
    public final void l(long j10) {
        switch (this.z0) {
            case 0:
                ((ChatActivityEnterView) this.A0).setEffectId(j10);
                break;
            default:
                ti tiVar = (ti) this.A0;
                bi biVar = tiVar.L0;
                tiVar.Q0 = j10;
                biVar.setEffect(j10);
                break;
        }
    }
}
