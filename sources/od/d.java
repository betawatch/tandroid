package od;

import n7.qa;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
