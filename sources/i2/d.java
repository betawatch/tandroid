package i2;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
