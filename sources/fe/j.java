package fe;

import be.b0;
import be.g1;
import ge.s;
import org.telegram.tgnet.TLObject;
import td.p;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        kd.f fVar = (kd.f) obj2;
        kd.g key = fVar.getKey();
        kd.f fVar2 = this.b.b.get(key);
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
