package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        return this.c.d(this);
    }
}
