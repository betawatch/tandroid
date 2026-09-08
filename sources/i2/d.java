package i2;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // d9.j
    public final Object get() {
        switch (this.a) {
            case 0:
                return c2.d.e(this.b);
            case 1:
                return new m(this.b);
            case 2:
                return new u2.p(this.b, new c3.m());
            case 3:
                return new x2.p(this.b, new rb.a(25));
            default:
                return y2.f.b(this.b);
        }
    }
}
