package de;

import ee.s;
import org.telegram.tgnet.TLObject;
import rd.p;
import zd.b0;
import zd.f1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        id.f fVar = (id.f) obj2;
        id.g key = fVar.getKey();
        id.f fVar2 = this.b.b.get(key);
        if (key != b0.b) {
            return Integer.valueOf(fVar != fVar2 ? TLObject.FLAG_31 : intValue + 1);
        }
        f1 f1Var = (f1) fVar2;
        f1 f1Var2 = (f1) fVar;
        while (true) {
            if (f1Var2 != null) {
                if (f1Var2 == f1Var || !(f1Var2 instanceof s)) {
                    break;
                }
                f1Var2 = f1Var2.getParent();
            } else {
                f1Var2 = null;
                break;
            }
        }
        if (f1Var2 == f1Var) {
            if (f1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f1Var2 + ", expected child of " + f1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
