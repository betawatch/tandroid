package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
