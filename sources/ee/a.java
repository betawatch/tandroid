package ee;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends md.c {
    public fe.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qb.c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qb.c cVar, md.c cVar2) {
        super(cVar2);
        this.c = cVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.q(null, this);
    }
}
