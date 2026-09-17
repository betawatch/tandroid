package i2;

import java.util.List;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements e2.m, m4.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z(int i10, e9.a1 a1Var) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // m4.e1
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
