package l2;

import h9.t1;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements h2.o, p4.c1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ w(int i7, t1 t1Var) {
        this.a = i7;
        this.b = t1Var;
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

    @Override // p4.c1
    public Object k(p4.e0 e0Var, p4.v vVar, int i7) {
        switch (this.a) {
        }
        return e0Var.l(vVar, this.b);
    }

    public /* synthetic */ w(m2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
