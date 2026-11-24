// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class er1 extends su1 {
    public final /* synthetic */ mu1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er1(mu1 mu1Var, Context context, wjb wjbVar, wp1 wp1Var, kl0 kl0Var) {
        super(context, wjbVar, wp1Var, kl0Var);
        this.M = mu1Var;
    }

    @Override // su1, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.M.kd.s(3, i == 0, getMeasuredWidth() > 0);
    }
}
