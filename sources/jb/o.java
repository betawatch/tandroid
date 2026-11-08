package jb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ p b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.b = pVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, this);
    }
}
