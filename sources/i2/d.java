package i2;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // d9.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return c2.d.e(this.b);
            case 1:
                return new l(this.b);
            case 2:
                return new u2.p(this.b, new c3.m());
            case 3:
                return new x2.p(this.b, new qb.b(25));
            default:
                return y2.f.b(this.b);
        }
    }
}
