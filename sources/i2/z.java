package i2;

import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements e2.o, m4.h1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z(int i10, x1 x1Var) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // m4.h1
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
        }
        return f0Var.l(wVar, this.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).I(this.b);
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
