package k1;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class r extends wc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, wc.c cVar) {
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
