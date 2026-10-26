package c2;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                return y2.f.b(this.b);
        }
    }
}
