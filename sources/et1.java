// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class et1 extends o39 implements n2b {
    public final /* synthetic */ mu1 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et1(mu1 mu1Var, Context context, ku1 ku1Var) {
        super(context, ku1Var);
        this.f3 = mu1Var;
    }

    @Override // n2b
    public final void b(int[] iArr) {
        mu1 mu1Var = this.f3;
        iArr[0] = ((int) mu1Var.P9) - gl.L(4.0f);
        iArr[1] = de9.f(3.0f, mu1Var.A0.getPaddingBottom(), mu1Var.A0.getMeasuredHeight());
    }
}
