package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class cb implements org.telegram.ui.Components.ob {
    public final float[] a = new float[2];
    public final /* synthetic */ db b;

    public cb(db dbVar) {
        this.b = dbVar;
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
        pb pbVar = this.b.I0;
        o5 t10 = pbVar.t();
        if (t10 == null) {
            return 0;
        }
        l4 l4Var = t10.c1;
        db dbVar = pbVar.s;
        float[] fArr = this.a;
        AndroidUtilities.getViewPositionInParent(l4Var, dbVar, fArr);
        return (int) (r4.getMeasuredHeight() - (fArr[1] + l4Var.getMeasuredHeight()));
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
