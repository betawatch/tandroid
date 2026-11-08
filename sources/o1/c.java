package o1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends kd.c {
    public d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.c = dVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
