package ee;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        return this.c.q(null, this);
    }
}
