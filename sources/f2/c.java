package f2;

import android.content.Context;
import g9.u;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements u {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ c(Context context, int i7) {
        this.a = i7;
        this.b = context;
    }

    @Override // g9.u
    public final Object get() {
        switch (this.a) {
            case 0:
                return i.d(this.b);
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
