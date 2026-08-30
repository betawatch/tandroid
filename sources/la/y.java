package la;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y extends wc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ k1.s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k1.s sVar, wc.c cVar) {
        super(cVar);
        this.c = sVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
