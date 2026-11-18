package m1;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
