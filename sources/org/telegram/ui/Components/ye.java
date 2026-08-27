package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ye extends org.telegram.ui.ni0 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.w0 = i10;
        this.x0 = obj;
    }

    @Override // org.telegram.ui.ni0
    public final void m(long j10) {
        switch (this.w0) {
            case 0:
                ((ChatActivityEnterView) this.x0).setEffectId(j10);
                break;
            default:
                gi giVar = (gi) this.x0;
                rh rhVar = giVar.E0;
                giVar.J0 = j10;
                rhVar.setEffect(j10);
                break;
        }
    }
}
