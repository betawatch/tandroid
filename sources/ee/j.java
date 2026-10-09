package ee;

import ae.c0;
import ae.h1;
import fe.s;
import org.telegram.tgnet.TLObject;
import sd.p;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements p {
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.b = gVar;
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        jd.f fVar = (jd.f) obj2;
        jd.g key = fVar.getKey();
        jd.f fVar2 = this.b.b.get(key);
        if (key != c0.b) {
            return Integer.valueOf(fVar != fVar2 ? TLObject.FLAG_31 : intValue + 1);
        }
        h1 h1Var = (h1) fVar2;
        h1 h1Var2 = (h1) fVar;
        while (true) {
            if (h1Var2 != null) {
                if (h1Var2 == h1Var || !(h1Var2 instanceof s)) {
                    break;
                }
                h1Var2 = h1Var2.getParent();
            } else {
                h1Var2 = null;
                break;
            }
        }
        if (h1Var2 == h1Var) {
            if (h1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + h1Var2 + ", expected child of " + h1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
