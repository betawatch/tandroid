// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
