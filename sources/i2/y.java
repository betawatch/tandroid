package i2;

import java.util.List;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.m, m4.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y(int i10, e9.a1 a1Var) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // m4.e1
    public Object i(m4.a0 a0Var, m4.r rVar, int i10) {
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

    public /* synthetic */ y(j2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
