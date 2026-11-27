// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lha extends yia {
    public final /* synthetic */ eja h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lha(eja ejaVar, Context context) {
        super(ejaVar, context);
        this.h = ejaVar;
    }

    @Override // j79
    public final void f() {
        super.f();
        eja ejaVar = this.h;
        zha P = ejaVar.P(0);
        if (P == null || P.n.getVisibility() != 0) {
            return;
        }
        ejaVar.L.f();
    }
}
