package ee;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d extends md.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qf.b c;
    public qf.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.p(null, this);
    }
}
