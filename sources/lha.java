// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
