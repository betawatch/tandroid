package m1;

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w extends kd.c {
    public Object a;
    public Object b;
    public Serializable c;
    public kotlin.jvm.internal.r d;
    public boolean e;
    public int f;
    public /* synthetic */ Object h;
    public final /* synthetic */ b0 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.n = b0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return b0.f(this.n, false, this);
    }
}
