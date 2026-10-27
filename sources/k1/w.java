package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w extends nd.c {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, nd.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.g(this);
    }
}
