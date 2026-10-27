package ge;

import ce.b0;
import ce.g1;
import he.s;
import org.telegram.tgnet.TLObject;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ld.f fVar = (ld.f) obj2;
        ld.g key = fVar.getKey();
        ld.f fVar2 = this.b.b.get(key);
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
