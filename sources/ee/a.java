package ee;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a extends md.c {
    public fe.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a6.m c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a6.m mVar, md.c cVar) {
        super(cVar);
        this.c = mVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.p(null, this);
    }
}
