package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g61 extends h3.l {
    public final /* synthetic */ m61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(Context context, m61 m61Var) {
        super(context);
        this.d = m61Var;
    }

    @Override // h3.l
    public final j3.j0 a(Context context) {
        a5.n nVar = new a5.n(25);
        j3.g a2 = j3.g.a(context);
        a2.getClass();
        nVar.b = a2;
        nVar.c = new a5.n(new j3.j[]{new j3.t0(new l61(this.d))});
        return nVar.e();
    }
}
