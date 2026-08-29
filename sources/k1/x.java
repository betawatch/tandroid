package k1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends uc.c {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.h(this);
    }
}
