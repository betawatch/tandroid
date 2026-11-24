// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d93 extends eeb implements rr4 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public final /* synthetic */ h93 c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d93(e79 e79Var, h93 h93Var, c79 c79Var, px2 px2Var) {
        super(1, px2Var);
        this.e = e79Var;
        this.c = h93Var;
        this.f = c79Var;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        h93 h93Var = this.c;
        switch (b) {
            case 0:
                return new d93((e79) obj2, h93Var, (c79) obj, px2Var);
            default:
                return new d93(h93Var, (cy2) obj2, (fs4) obj, px2Var);
        }
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        px2 px2Var = (px2) obj;
        switch (b) {
        }
        return ((d93) create(px2Var)).invokeSuspend(g7cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e79 e79Var;
        c79 c79Var;
        e73 e73Var;
        Object obj2;
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        ly2 ly2Var = ly2.a;
        h93 h93Var = this.c;
        px2 px2Var = null;
        switch (b) {
            case 0:
                c79 c79Var2 = (c79) obj3;
                e79 e79Var2 = (e79) obj4;
                byte b2 = this.b;
                try {
                } catch (py2 unused) {
                    Object obj5 = e79Var2.a;
                    this.d = c79Var2;
                    this.b = (byte) 3;
                    obj = h93Var.i(obj5, true, this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                }
                if (b2 == 0) {
                    tue.b(obj);
                    this.d = e79Var2;
                    this.b = (byte) 1;
                    obj = ((hd4) h93Var.j.getValue()).a(new q83(3, (px2) null), this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                    e79Var = e79Var2;
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            c79Var = (c79) ((Serializable) this.d);
                            tue.b(obj);
                            c79Var.a = ((Number) obj).intValue();
                            return g7c.a;
                        }
                        if (b2 != 3) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c79Var2 = (c79) ((Serializable) this.d);
                        tue.b(obj);
                        c79Var2.a = ((Number) obj).intValue();
                        return g7c.a;
                    }
                    e79Var = (e79) ((Serializable) this.d);
                    tue.b(obj);
                }
                e79Var.a = obj;
                kr5 c = h93Var.c();
                this.d = c79Var2;
                this.b = (byte) 2;
                obj = c.b(this);
                if (obj == ly2Var) {
                    return ly2Var;
                }
                c79Var = c79Var2;
                c79Var.a = ((Number) obj).intValue();
                return g7c.a;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    tue.b(obj);
                    this.b = (byte) 1;
                    obj = h93Var.h(true, this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.d;
                            tue.b(obj);
                            return obj6;
                        }
                        e73Var = (e73) this.d;
                        tue.b(obj);
                        obj2 = e73Var.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == e73Var.c) {
                            dq9.m("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!rr5.a(e73Var.b, obj)) {
                            this.d = obj;
                            this.b = (byte) 3;
                            if (h93Var.i(obj, true, this) == ly2Var) {
                                return ly2Var;
                            }
                        }
                        return obj;
                    }
                    tue.b(obj);
                }
                e73Var = (e73) obj;
                hj1 hj1Var = new hj1((fs4) obj3, e73Var, px2Var, (byte) 4);
                this.d = e73Var;
                this.b = (byte) 2;
                obj = srd.c((cy2) obj4, hj1Var, this);
                if (obj == ly2Var) {
                    return ly2Var;
                }
                obj2 = e73Var.b;
                if ((obj2 == null ? obj2.hashCode() : 0) == e73Var.c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d93(h93 h93Var, cy2 cy2Var, fs4 fs4Var, px2 px2Var) {
        super(1, px2Var);
        this.c = h93Var;
        this.e = cy2Var;
        this.f = fs4Var;
    }
}
