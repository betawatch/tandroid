package ee;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        return this.c.l(null, this);
    }
}
