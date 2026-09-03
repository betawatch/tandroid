package nb;

import c5.j;
import cb.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements c9.e {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // c9.e
    public final Object e0(j jVar) {
        switch (this.a) {
            case 0:
                return new c((h) jVar.a(h.class));
            default:
                return new b((c) jVar.a(c.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
