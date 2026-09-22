package i2;

import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.m, m4.f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y(int i10, e9.a1 a1Var) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // m4.f1
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

    public /* synthetic */ y(j2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
