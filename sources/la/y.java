package la;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
