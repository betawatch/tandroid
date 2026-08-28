package kh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w5 extends xf.c1 {
    public final /* synthetic */ ya A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(ya yaVar, Context context, xf.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ba baVar) {
        super(context, q0Var, bitmap, bitmap2, baVar);
        this.A = yaVar;
    }

    @Override // xf.c1
    public final void g(xf.m mVar) {
        int indexOf = xf.m.a.indexOf(mVar);
        int i9 = indexOf + 1;
        if (i9 <= 1) {
            indexOf = i9;
        }
        ya yaVar = this.A;
        yaVar.g1.b(indexOf);
        yaVar.n(mVar);
    }
}
