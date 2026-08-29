package md;

import ag.o1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends uc.c {
    public nd.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o1 o1Var, uc.c cVar) {
        super(cVar);
        this.c = o1Var;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.e(null, this);
    }
}
