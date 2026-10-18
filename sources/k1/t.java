package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class t extends md.c {
    public z a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, md.c cVar) {
        super(cVar);
        this.c = zVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.e(this);
    }
}
