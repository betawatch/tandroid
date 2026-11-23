package l2;

import h9.s1;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements h2.o, p4.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ x(int i7, s1 s1Var) {
        this.a = i7;
        this.b = s1Var;
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((e2.a1) obj).B(this.b);
                break;
            default:
                ((m2.b) obj).getClass();
                break;
        }
    }

    @Override // p4.b1
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
        }
        return d0Var.l(vVar, this.b);
    }

    public /* synthetic */ x(m2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
