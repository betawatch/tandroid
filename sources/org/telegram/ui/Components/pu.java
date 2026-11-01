package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pu extends cv {
    public final /* synthetic */ cv N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(cv cvVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList) {
        super(k2Var, context, p6Var, arrayList);
        this.N1 = cvVar;
    }

    @Override // org.telegram.ui.Components.cv
    public final void L0() {
        this.N1.dismiss();
    }
}
