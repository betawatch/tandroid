package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l9 implements ob {
    public final float[] a = new float[2];
    public final /* synthetic */ m9 b;

    public l9(m9 m9Var) {
        this.b = m9Var;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final int f(int i10) {
        y9 y9Var = this.b.x0;
        q4 u10 = y9Var.u();
        if (u10 == null) {
            return 0;
        }
        q3 q3Var = u10.R0;
        m9 m9Var = y9Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(q3Var, m9Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + q3Var.getMeasuredHeight()));
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ void b(qc qcVar) {
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ void d(qc qcVar) {
    }
}
