package f2;

import android.content.Context;
import g9.t;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // g9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return h.d(this.b);
            case 1:
                return new l2.j(this.b);
            case 2:
                return new x2.p(this.b, new f3.m());
            case 3:
                return new a3.s(this.b, new nb.a(1));
            default:
                return b3.g.c(this.b);
        }
    }
}
