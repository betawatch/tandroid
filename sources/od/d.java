package od;

import n7.qa;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends wc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qa c;
    public qa d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qa qaVar, wc.c cVar) {
        super(cVar);
        this.c = qaVar;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.x(null, this);
    }
}
