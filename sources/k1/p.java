package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class p extends md.c {
    public Object a;
    public z b;
    public be.t c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return z.b(this.e, null, this);
    }
}
