// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l83 extends eeb implements rr4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public byte h;
    public final /* synthetic */ h93 n;
    public final /* synthetic */ e7a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l83(h93 h93Var, e7a e7aVar, px2 px2Var) {
        super(1, px2Var);
        this.n = h93Var;
        this.r = e7aVar;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        return new l83(this.n, this.r, px2Var);
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        return ((l83) create((px2) obj)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oj7 qj7Var;
        b79 b79Var;
        e79 e79Var;
        e79 e79Var2;
        Iterator it;
        oj7 oj7Var;
        b79 b79Var2;
        e79 e79Var3;
        k83 k83Var;
        qj7 qj7Var2;
        e79 e79Var4;
        b79 b79Var3;
        Object obj2;
        int hashCode;
        Object b;
        Object obj3;
        byte b2 = this.h;
        e7a e7aVar = this.r;
        h93 h93Var = this.n;
        ly2 ly2Var = ly2.a;
        if (b2 == 0) {
            tue.b(obj);
            qj7Var = new qj7();
            b79Var = new b79();
            e79Var = new e79();
            this.a = qj7Var;
            this.b = b79Var;
            this.c = e79Var;
            this.d = e79Var;
            this.h = (byte) 1;
            obj = h93Var.h(true, this);
            if (obj != ly2Var) {
                e79Var2 = e79Var;
            }
            return ly2Var;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashCode = this.f;
                    obj3 = this.a;
                    tue.b(obj);
                    return new e73(hashCode, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (oj7) this.c;
                e79Var4 = (e79) this.b;
                b79Var3 = (b79) this.a;
                tue.b(obj);
                obj2 = obj4;
                try {
                    b79Var3.a = true;
                    ((qj7) obj2).f(null);
                    Object obj5 = e79Var4.a;
                    hashCode = obj5 == null ? obj5.hashCode() : 0;
                    kr5 c = h93Var.c();
                    this.a = obj5;
                    this.b = null;
                    this.c = null;
                    this.f = hashCode;
                    this.h = (byte) 4;
                    b = c.b(this);
                    if (b != ly2Var) {
                        obj = b;
                        obj3 = obj5;
                        return new e73(hashCode, ((Number) obj).intValue(), obj3);
                    }
                    return ly2Var;
                } catch (Throwable th) {
                    ((qj7) obj2).f(null);
                    throw th;
                }
            }
            it = this.e;
            k83Var = (k83) this.d;
            e79Var3 = (e79) this.c;
            b79Var2 = (b79) this.b;
            oj7Var = (oj7) this.a;
            tue.b(obj);
            while (it.hasNext()) {
                fs4 fs4Var = (fs4) it.next();
                this.a = oj7Var;
                this.b = b79Var2;
                this.c = e79Var3;
                this.d = k83Var;
                this.e = it;
                this.h = (byte) 2;
                if (fs4Var.invoke(k83Var, this) == ly2Var) {
                    break;
                }
            }
            e79Var2 = e79Var3;
            b79Var = b79Var2;
            qj7Var = oj7Var;
            e7aVar.c = null;
            this.a = b79Var;
            this.b = e79Var2;
            this.c = qj7Var;
            this.d = null;
            this.e = null;
            this.h = (byte) 3;
            qj7Var2 = (qj7) qj7Var;
            if (qj7Var2.d(this) != ly2Var) {
                e79Var4 = e79Var2;
                b79Var3 = b79Var;
                obj2 = qj7Var2;
                b79Var3.a = true;
                ((qj7) obj2).f(null);
                Object obj52 = e79Var4.a;
                if (obj52 == null) {
                }
                kr5 c2 = h93Var.c();
                this.a = obj52;
                this.b = null;
                this.c = null;
                this.f = hashCode;
                this.h = (byte) 4;
                b = c2.b(this);
                if (b != ly2Var) {
                }
            }
            return ly2Var;
        }
        e79Var = (e79) this.d;
        e79Var2 = (e79) this.c;
        b79Var = (b79) this.b;
        qj7Var = (oj7) this.a;
        tue.b(obj);
        e79Var.a = ((e73) obj).b;
        k83 k83Var2 = new k83(qj7Var, b79Var, e79Var2, h93Var);
        List list = (List) e7aVar.c;
        if (list != null) {
            it = list.iterator();
            oj7Var = qj7Var;
            b79Var2 = b79Var;
            e79Var3 = e79Var2;
            k83Var = k83Var2;
            while (it.hasNext()) {
            }
            e79Var2 = e79Var3;
            b79Var = b79Var2;
            qj7Var = oj7Var;
        }
        e7aVar.c = null;
        this.a = b79Var;
        this.b = e79Var2;
        this.c = qj7Var;
        this.d = null;
        this.e = null;
        this.h = (byte) 3;
        qj7Var2 = (qj7) qj7Var;
        if (qj7Var2.d(this) != ly2Var) {
        }
        return ly2Var;
    }
}
