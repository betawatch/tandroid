// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ad0 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ad0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // gu2
    public final void accept(Object obj) {
        boolean z;
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                bd0 bd0Var = (bd0) obj3;
                wc0 wc0Var = (wc0) obj2;
                cd0[] cd0VarArr = wc0Var.i;
                yc0 yc0Var = wc0Var.j;
                if (!bd0Var.F) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            bd0Var.a(wc0.a((TLRPC.Chat) yc0Var.c, (TLRPC.ChatFull) obj, cd0VarArr));
                            break;
                        }
                    } else {
                        bd0Var.a(wc0.c((TLRPC.User) yc0Var.c, (TLRPC.UserFull) obj, cd0VarArr));
                        break;
                    }
                }
                break;
            case 1:
                qac qacVar = (qac) obj2;
                if (((fj0) obj3).a == 0) {
                    gm.c3(new mo0(qacVar, b2));
                    break;
                }
                break;
            case 2:
                to0 to0Var = (to0) obj2;
                if (((fj0) obj3).a == 0) {
                    gm.c3(new f00(to0Var, (byte) 18));
                    break;
                }
                break;
            case 3:
                ((z8b) obj3).v0((m58) obj2, (Integer) obj);
                break;
            case 4:
                fv4 fv4Var = (fv4) obj2;
                int i = ((fj0) obj3).a;
                z = i == 0;
                gm.c3(new yl6((Object) fv4Var, z, (Object) (z ? null : cj0.i(i)), (byte) 26));
                break;
            default:
                lf2 lf2Var = (lf2) obj2;
                int i2 = ((fj0) obj3).a;
                z = i2 == 0;
                gm.c3(new yl6((Object) lf2Var, z, (Object) (z ? null : cj0.i(i2)), (byte) 25));
                break;
        }
    }
}
