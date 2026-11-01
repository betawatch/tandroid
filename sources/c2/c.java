package c2;

import android.content.Context;
import t7.u;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
