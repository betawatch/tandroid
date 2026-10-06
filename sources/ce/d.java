package ce;

import n4.y;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class d extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ y c;
    public y d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.c = yVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.d(null, this);
    }
}
