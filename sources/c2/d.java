package c2;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // d9.u
    public final Object get() {
        switch (this.a) {
            case 0:
                return i.e(this.b);
            case 1:
                return new i2.k(this.b);
            case 2:
                return new u2.p(this.b, new c3.m());
            case 3:
                return new x2.n(this.b, new oa.d(26));
            default:
                return y2.f.b(this.b);
        }
    }
}
