package f2;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // g9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return i.d(this.b);
            case 1:
                return new l2.j(this.b);
            case 2:
                return new x2.q(this.b, new f3.m());
            case 3:
                return new a3.s(this.b, new nb.a(1));
            default:
                return b3.g.c(this.b);
        }
    }
}
