package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class n9 implements ob {
    public final float[] a = new float[2];
    public final /* synthetic */ o9 b;

    public n9(o9 o9Var) {
        this.b = o9Var;
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
        aa aaVar = this.b.I0;
        q4 t10 = aaVar.t();
        if (t10 == null) {
            return 0;
        }
        r3 r3Var = t10.c1;
        o9 o9Var = aaVar.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(r3Var, o9Var, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + r3Var.getMeasuredHeight()));
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
