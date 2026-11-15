package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t extends kd.c {
    public b0 a;
    public e1 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b0 b0Var, id.c cVar) {
        super(cVar);
        this.e = b0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return b0.e(this.e, false, this);
    }
}
