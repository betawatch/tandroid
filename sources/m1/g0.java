package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g0 extends kd.c {
    public i0 a;
    public d0 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.e = i0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.a(null, this);
    }
}
