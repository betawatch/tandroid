package nb;

import c5.j;
import c9.f;
import cb.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements f {
    public static final /* synthetic */ a b = new a(0);
    public static final /* synthetic */ a c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // c9.f
    public final Object d0(j jVar) {
        switch (this.a) {
            case 0:
                return new c((h) jVar.a(h.class));
            default:
                return new b((c) jVar.a(c.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
