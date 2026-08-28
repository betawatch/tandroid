package ja;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends sc.c {
    public h a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, sc.c cVar) {
        super(cVar);
        this.c = hVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.b(this);
    }
}
