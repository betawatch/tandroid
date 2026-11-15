package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h extends kd.c {
    public ab.c0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ab.c0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.c = c0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.e(this);
    }
}
