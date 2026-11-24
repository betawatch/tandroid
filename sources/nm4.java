// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nm4 implements im4 {
    public final /* synthetic */ sz4 a;
    public final /* synthetic */ q83 b;

    public nm4(sz4 sz4Var, q83 q83Var) {
        this.a = sz4Var;
        this.b = q83Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(5:(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|30|31|(3:33|15|16)|34))|30|31|(0)|34)|45|6|7|(0)(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        if (r10.g(r9, r0) != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r10 = new jpb(r9);
        r9 = r8.b;
        r0.d = r9;
        r0.e = null;
        r0.b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (dje.a(r10, r9, r9, r0) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // im4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(jm4 jm4Var, px2 px2Var) {
        mm4 mm4Var;
        int i;
        ly2 ly2Var;
        pq9 pq9Var;
        pq9 pq9Var2;
        q83 q83Var;
        try {
            if (px2Var instanceof mm4) {
                mm4Var = (mm4) px2Var;
                int i2 = mm4Var.b;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    mm4Var.b = i2 - TLObject.FLAG_31;
                    Object obj = mm4Var.a;
                    i = mm4Var.b;
                    ly2Var = ly2.a;
                    if (i != 0) {
                        tue.b(obj);
                        sz4 sz4Var = this.a;
                        mm4Var.d = this;
                        mm4Var.e = jm4Var;
                        mm4Var.b = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) mm4Var.d;
                                tue.b(obj);
                                throw th;
                            }
                            if (i != 3) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            pq9Var2 = (pq9) mm4Var.d;
                            try {
                                tue.b(obj);
                                pq9Var2.releaseIntercepted();
                                return g7c.a;
                            } catch (Throwable th2) {
                                th = th2;
                                pq9Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        jm4Var = mm4Var.e;
                        this = (nm4) mm4Var.d;
                        tue.b(obj);
                    }
                    pq9Var = new pq9(jm4Var, mm4Var.getContext());
                    q83Var = this.b;
                    mm4Var.d = pq9Var;
                    mm4Var.e = null;
                    mm4Var.b = 3;
                    if (q83Var.a(pq9Var, null, mm4Var) != ly2Var) {
                        pq9Var2 = pq9Var;
                        pq9Var2.releaseIntercepted();
                        return g7c.a;
                    }
                    return ly2Var;
                }
            }
            q83Var = this.b;
            mm4Var.d = pq9Var;
            mm4Var.e = null;
            mm4Var.b = 3;
            if (q83Var.a(pq9Var, null, mm4Var) != ly2Var) {
            }
            return ly2Var;
        } catch (Throwable th3) {
            th = th3;
            pq9Var2 = pq9Var;
            pq9Var2.releaseIntercepted();
            throw th;
        }
        mm4Var = new mm4(this, px2Var);
        Object obj2 = mm4Var.a;
        i = mm4Var.b;
        ly2Var = ly2.a;
        if (i != 0) {
        }
        pq9Var = new pq9(jm4Var, mm4Var.getContext());
    }
}
