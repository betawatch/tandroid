package lh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class v5 extends yf.b1 {
    public final /* synthetic */ va A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(va vaVar, Context context, yf.p0 p0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.z9 z9Var) {
        super(context, p0Var, bitmap, bitmap2, z9Var);
        this.A = vaVar;
    }

    @Override // yf.b1
    public final void g(yf.m mVar) {
        int indexOf = yf.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        va vaVar = this.A;
        vaVar.g1.b(indexOf);
        vaVar.l(mVar);
    }
}
