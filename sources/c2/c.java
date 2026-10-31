package c2;

import android.content.Context;
import t7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // d9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return h.e(this.b);
            case 1:
                return new i2.j(this.b);
            case 2:
                return new u2.q(this.b, new c3.m());
            case 3:
                return new x2.o(this.b, new u(25));
            default:
                return y2.f.c(this.b);
        }
    }
}
