package c2;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements e9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // e9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return j.e(this.b);
            case 1:
                return new i2.k(this.b);
            case 2:
                return new u2.q(this.b, new c3.m());
            case 3:
                return new x2.o(this.b, new qb.a(26));
            default:
                return y2.f.c(this.b);
        }
    }
}
