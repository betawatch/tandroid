package nh;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j5 extends ag.t1 {
    public final /* synthetic */ ja A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(ja jaVar, Context context, ag.f1 f1Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ga gaVar) {
        super(context, f1Var, bitmap, bitmap2, gaVar);
        this.A = jaVar;
    }

    @Override // ag.t1
    public final void g(ag.m mVar) {
        int indexOf = ag.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        ja jaVar = this.A;
        jaVar.g1.b(indexOf);
        jaVar.q(mVar);
    }
}
