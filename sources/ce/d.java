package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ of.b c;
    public of.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(of.b bVar, kd.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.u(null, this);
    }
}
