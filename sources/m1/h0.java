package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h0 extends kd.c {
    public i0 a;
    public Object b;
    public Object c;
    public k0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i0 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f = i0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.b(null, this);
    }
}
