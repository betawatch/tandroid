package jh;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class a9 extends v {
    public final /* synthetic */ i9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, i9 i9Var) {
        super(context);
        this.a = i9Var;
    }

    @Override // jh.v, android.view.View
    public final void invalidate() {
        super.invalidate();
        d4 d4Var = this.a.C0;
        if (d4Var != null) {
            d4Var.a();
        }
    }
}
