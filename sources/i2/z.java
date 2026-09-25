package i2;

import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements e2.m, m4.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z(int i10, e9.a1 a1Var) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // m4.z0
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.a) {
        }
        return a0Var.l(rVar, this.b);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.z0) obj).onCues(this.b);
                break;
            default:
                ((j2.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ z(j2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
