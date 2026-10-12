package c2;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                return new u2.q(this.b, new c3.m());
            case 3:
                return new x2.n(this.b, new oa.d(26));
            default:
                return y2.f.b(this.b);
        }
    }
}
