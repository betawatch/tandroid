package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s extends uc.c {
    public Object a;
    public Object b;
    public Object c;
    public kotlin.jvm.internal.q d;
    public a0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ t h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, uc.c cVar) {
        super(cVar);
        this.h = tVar;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
