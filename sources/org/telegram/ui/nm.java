package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class nm extends org.telegram.ui.Components.zk0 implements jh.z6 {
    public final /* synthetic */ rn T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(rn rnVar, Context context, pn pnVar) {
        super(context, pnVar);
        this.T2 = rnVar;
    }

    @Override // jh.z6
    public final void a(int[] iArr) {
        rn rnVar = this.T2;
        iArr[0] = ((int) rnVar.o9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.y1.A(3.0f, rnVar.t0.getPaddingBottom(), rnVar.t0.getMeasuredHeight());
    }
}
