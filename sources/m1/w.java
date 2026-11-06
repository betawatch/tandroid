package m1;

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
