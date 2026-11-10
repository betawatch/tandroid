package l2;

import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements h2.o, p4.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y(int i7, h9.t1 t1Var) {
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

    @Override // p4.a1
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
        }
        return d0Var.l(vVar, this.b);
    }

    public /* synthetic */ y(m2.a aVar, List list) {
        this.a = 1;
        this.b = list;
    }
}
