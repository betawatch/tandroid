package ld;

import hd.b0;
import hd.g1;
import md.s;
import org.telegram.tgnet.TLObject;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        qc.f fVar = (qc.f) obj2;
        qc.g key = fVar.getKey();
        qc.f fVar2 = this.b.b.get(key);
        if (key != b0.b) {
            return Integer.valueOf(fVar != fVar2 ? TLObject.FLAG_31 : intValue + 1);
        }
        g1 g1Var = (g1) fVar2;
        g1 g1Var2 = (g1) fVar;
        while (true) {
            if (g1Var2 != null) {
                if (g1Var2 == g1Var || !(g1Var2 instanceof s)) {
                    break;
                }
                g1Var2 = g1Var2.getParent();
            } else {
                g1Var2 = null;
                break;
            }
        }
        if (g1Var2 == g1Var) {
            if (g1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var2 + ", expected child of " + g1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
