package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
