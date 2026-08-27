package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nu extends cv {
    public final /* synthetic */ cv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(cv cvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(n2Var, context, c6Var, arrayList);
        this.S = cvVar;
    }

    @Override // org.telegram.ui.Components.cv
    public final void Y() {
        this.S.dismiss();
    }
}
