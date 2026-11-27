// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc0 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cc0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // pt2
    public final void accept(Object obj) {
        boolean z;
        byte b = this.a;
        byte b2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                dc0 dc0Var = (dc0) obj3;
                yb0 yb0Var = (yb0) obj2;
                ec0[] ec0VarArr = yb0Var.i;
                ac0 ac0Var = yb0Var.j;
                if (!dc0Var.F) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            dc0Var.a(yb0.a((TLRPC.Chat) ac0Var.c, (TLRPC.ChatFull) obj, ec0VarArr));
                            break;
                        }
                    } else {
                        dc0Var.a(yb0.c((TLRPC.User) ac0Var.c, (TLRPC.UserFull) obj, ec0VarArr));
                        break;
                    }
                }
                break;
            case 1:
                pcc pccVar = (pcc) obj2;
                if (((gi0) obj3).a == 0) {
                    hl.c3(new jn0(pccVar, b2));
                    break;
                }
                break;
            case 2:
                tn0 tn0Var = (tn0) obj2;
                if (((gi0) obj3).a == 0) {
                    hl.c3(new pz(tn0Var, (byte) 15));
                    break;
                }
                break;
            case 3:
                ((vab) obj3).v0((a78) obj2, (Integer) obj);
                break;
            case 4:
                iv4 iv4Var = (iv4) obj2;
                int i = ((gi0) obj3).a;
                z = i == 0;
                hl.c3(new yn6((Object) iv4Var, z, (Object) (z ? null : di0.i(i)), (byte) 24));
                break;
            default:
                qe2 qe2Var = (qe2) obj2;
                int i2 = ((gi0) obj3).a;
                z = i2 == 0;
                hl.c3(new yn6((Object) qe2Var, z, (Object) (z ? null : di0.i(i2)), (byte) 25));
                break;
        }
    }
}
