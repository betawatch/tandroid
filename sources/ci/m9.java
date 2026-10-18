package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m9 implements ob {
    public final float[] a = new float[2];
    public final /* synthetic */ n9 b;

    public m9(n9 n9Var) {
        this.b = n9Var;
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
        z9 z9Var = this.b.I0;
        p4 t10 = z9Var.t();
        if (t10 == null) {
            return 0;
        }
        q3 q3Var = t10.c1;
        n9 n9Var = z9Var.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(q3Var, n9Var, fArr);
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
