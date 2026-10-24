package i2;

import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements e2.o, m4.g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y(int i10, x1 x1Var) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // m4.g1
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.a) {
        }
        return f0Var.l(vVar, this.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).onCues(this.b);
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
