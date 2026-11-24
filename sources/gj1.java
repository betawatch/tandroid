// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gj1 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj1(Object obj, Object obj2, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                gj1 gj1Var = new gj1((jm4) obj3, (ij1) obj2, px2Var, (byte) 0);
                gj1Var.c = obj;
                return gj1Var;
            default:
                gj1 gj1Var2 = new gj1((h93) obj3, (fs4) obj2, px2Var, (byte) 1);
                gj1Var2.c = obj;
                return gj1Var2;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((gj1) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        ly2 ly2Var = ly2.a;
        Object obj3 = this.d;
        px2 px2Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                g7c g7cVar = g7c.a;
                if (!z) {
                    tue.b(obj);
                    ky2 ky2Var = (ky2) this.c;
                    jm4 jm4Var = (jm4) obj3;
                    ij1 ij1Var = (ij1) obj2;
                    cy2 cy2Var = ij1Var.a;
                    int i = ij1Var.b;
                    if (i == -3) {
                        i = -2;
                    }
                    w11 w11Var = ij1Var.c;
                    fs4 hj1Var = new hj1(ij1Var, px2Var, (byte) 0);
                    hn8 hn8Var = new hn8(t1e.b(ky2Var, cy2Var), zsd.a(i, w11Var, 4));
                    hn8Var.R(ny2.b, hn8Var, hj1Var);
                    this.b = true;
                    Object a = xie.a(jm4Var, hn8Var, true, this);
                    if (a != ly2Var) {
                        a = g7cVar;
                    }
                    if (a == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (!z) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7cVar;
            default:
                h93 h93Var = (h93) obj3;
                boolean z2 = this.b;
                if (!z2) {
                    tue.b(obj);
                    ky2 ky2Var2 = (ky2) this.c;
                    nq2 a2 = kud.a();
                    d37 d37Var = new d37((fs4) obj2, a2, h93Var.h.k(), ky2Var2.c());
                    xvc xvcVar = h93Var.l;
                    Object d = ((y11) xvcVar.d).d(d37Var);
                    if (d instanceof mk1) {
                        Throwable th = ((mk1) d).a;
                        if (th == null) {
                            throw new nk2("Channel was closed normally");
                        }
                        throw th;
                    }
                    if (!(d instanceof nk1)) {
                        if (((AtomicInteger) ((k6d) xvcVar.e).b).getAndIncrement() == 0) {
                            srd.b((ky2) xvcVar.b, new gj4(xvcVar, null));
                        }
                        this.b = true;
                        Object h = a2.h(this);
                        return h == ly2Var ? ly2Var : h;
                    }
                    dq9.m("Check failed.");
                } else {
                    if (z2) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
