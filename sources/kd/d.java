package kd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends sc.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g5.b c;
    public g5.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g5.b bVar, sc.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.q(null, this);
    }
}
