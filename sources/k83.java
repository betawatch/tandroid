// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class k83 extends yfb implements ur4 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public final /* synthetic */ o83 c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(p89 p89Var, o83 o83Var, n89 n89Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.e = p89Var;
        this.c = o83Var;
        this.f = n89Var;
    }

    @Override // qf0
    public final zw2 create(zw2 zw2Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        o83 o83Var = this.c;
        switch (b) {
            case 0:
                return new k83((p89) obj2, o83Var, (n89) obj, zw2Var);
            default:
                return new k83(o83Var, (mx2) obj2, (is4) obj, zw2Var);
        }
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        zw2 zw2Var = (zw2) obj;
        switch (b) {
        }
        return ((k83) create(zw2Var)).invokeSuspend(g9cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p89 p89Var;
        n89 n89Var;
        k63 k63Var;
        Object obj2;
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        vx2 vx2Var = vx2.a;
        o83 o83Var = this.c;
        switch (b) {
            case 0:
                n89 n89Var2 = (n89) obj3;
                p89 p89Var2 = (p89) obj4;
                byte b2 = this.b;
                try {
                } catch (zx2 unused) {
                    Object obj5 = p89Var2.a;
                    this.d = n89Var2;
                    this.b = (byte) 3;
                    obj = o83Var.i(obj5, true, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                }
                if (b2 == 0) {
                    ixe.b(obj);
                    this.d = p89Var2;
                    this.b = (byte) 1;
                    obj = ((ed4) o83Var.j.getValue()).a(new x73(3, (zw2) null), this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                    p89Var = p89Var2;
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            n89Var = (n89) ((Serializable) this.d);
                            ixe.b(obj);
                            n89Var.a = ((Number) obj).intValue();
                            return g9c.a;
                        }
                        if (b2 != 3) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n89Var2 = (n89) ((Serializable) this.d);
                        ixe.b(obj);
                        n89Var2.a = ((Number) obj).intValue();
                        return g9c.a;
                    }
                    p89Var = (p89) ((Serializable) this.d);
                    ixe.b(obj);
                }
                p89Var.a = obj;
                nr5 c = o83Var.c();
                this.d = n89Var2;
                this.b = (byte) 2;
                obj = c.b(this);
                if (obj == vx2Var) {
                    return vx2Var;
                }
                n89Var = n89Var2;
                n89Var.a = ((Number) obj).intValue();
                return g9c.a;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    ixe.b(obj);
                    this.b = (byte) 1;
                    obj = o83Var.h(true, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.d;
                            ixe.b(obj);
                            return obj6;
                        }
                        k63Var = (k63) this.d;
                        ixe.b(obj);
                        obj2 = k63Var.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == k63Var.c) {
                            grb.i("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!ur5.a(k63Var.b, obj)) {
                            this.d = obj;
                            this.b = (byte) 3;
                            if (o83Var.i(obj, true, this) == vx2Var) {
                                return vx2Var;
                            }
                        }
                        return obj;
                    }
                    ixe.b(obj);
                }
                k63Var = (k63) obj;
                ii1 ii1Var = new ii1((is4) obj3, k63Var, null, (byte) 4);
                this.d = k63Var;
                this.b = (byte) 2;
                obj = fud.c((mx2) obj4, ii1Var, this);
                if (obj == vx2Var) {
                    return vx2Var;
                }
                obj2 = k63Var.b;
                if ((obj2 == null ? obj2.hashCode() : 0) == k63Var.c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(o83 o83Var, mx2 mx2Var, is4 is4Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.c = o83Var;
        this.e = mx2Var;
        this.f = is4Var;
    }
}
