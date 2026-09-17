package i2;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
