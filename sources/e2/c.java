package e2;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements f9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c(Context context, int i3) {
        this.a = i3;
        this.b = context;
    }

    @Override // f9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return h.e(this.b);
            case 1:
                return new k2.j(this.b);
            case 2:
                return new w2.q(this.b, new e3.m());
            case 3:
                return new z2.n(this.b, new ra.e(28));
            default:
                return a3.g.c(this.b);
        }
    }
}
