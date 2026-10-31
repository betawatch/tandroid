package jg;

import org.telegram.ui.er0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;

    public /* synthetic */ m(er0 er0Var, int i10) {
        this.a = i10;
        this.b = er0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                r0.X(this.b, (Integer) obj);
                break;
            default:
                r0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
