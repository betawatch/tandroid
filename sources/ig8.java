// default package

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ig8 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ eq4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig8(eq4 eq4Var, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = eq4Var;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        eq4 eq4Var = this.d;
        switch (b) {
            case 0:
                ig8 ig8Var = new ig8(eq4Var, fw2Var, (byte) 0);
                ig8Var.c = obj;
                return ig8Var;
            default:
                ig8 ig8Var2 = new ig8(eq4Var, fw2Var, (byte) 1);
                ig8Var2.c = obj;
                return ig8Var2;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ih7 ih7Var = (ih7) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((ig8) create(ih7Var, fw2Var)).invokeSuspend(g5cVar);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        eq4 eq4Var = this.d;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    qse.b(obj);
                    ih7 ih7Var = (ih7) this.c;
                    this.b = true;
                    obj = eq4Var.invoke(ih7Var, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (!z) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                ih7 ih7Var2 = (ih7) obj;
                ih7Var2.getClass();
                ((AtomicBoolean) ih7Var2.b.b).set(true);
                return ih7Var2;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    qse.b(obj);
                    ih7 ih7Var3 = new ih7(new LinkedHashMap(((ih7) this.c).a()), false);
                    this.c = ih7Var3;
                    this.b = true;
                    return eq4Var.invoke(ih7Var3, this) == bx2Var ? bx2Var : ih7Var3;
                }
                if (!z2) {
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ih7 ih7Var4 = (ih7) this.c;
                qse.b(obj);
                return ih7Var4;
        }
    }
}
