package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class p extends md.c {
    public Object a;
    public z b;
    public be.t c;
    public /* synthetic */ Object d;
    public final /* synthetic */ z e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return z.a(this.e, null, this);
    }
}
