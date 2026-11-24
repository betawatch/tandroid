// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac0 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ac0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // vs2
    public final void accept(Object obj) {
        boolean z;
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                bc0 bc0Var = (bc0) obj3;
                wb0 wb0Var = (wb0) obj2;
                cc0[] cc0VarArr = wb0Var.i;
                yb0 yb0Var = wb0Var.j;
                if (!bc0Var.F) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            bc0Var.a(wb0.a((TLRPC.Chat) yb0Var.c, (TLRPC.ChatFull) obj, cc0VarArr));
                            break;
                        }
                    } else {
                        bc0Var.a(wb0.c((TLRPC.User) yb0Var.c, (TLRPC.UserFull) obj, cc0VarArr));
                        break;
                    }
                }
                break;
            case 1:
                p8c p8cVar = (p8c) obj2;
                if (((fi0) obj3).a == 0) {
                    gl.d3(new mn0(p8cVar, b2));
                    break;
                }
                break;
            case 2:
                tn0 tn0Var = (tn0) obj2;
                if (((fi0) obj3).a == 0) {
                    gl.d3(new oz(tn0Var, (byte) 16));
                    break;
                }
                break;
            case 3:
                ((x6b) obj3).v0((k38) obj2, (Integer) obj);
                break;
            case 4:
                et4 et4Var = (et4) obj2;
                int i = ((fi0) obj3).a;
                z = i == 0;
                gl.d3(new vj6((Object) et4Var, z, (Object) (z ? null : ci0.i(i)), (byte) 26));
                break;
            default:
                ae2 ae2Var = (ae2) obj2;
                int i2 = ((fi0) obj3).a;
                z = i2 == 0;
                gl.d3(new vj6((Object) ae2Var, z, (Object) (z ? null : ci0.i(i2)), (byte) 25));
                break;
        }
    }
}
