// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mk4 implements hk4 {
    public final /* synthetic */ lj9 a;
    public final /* synthetic */ e73 b;

    public mk4(lj9 lj9Var, e73 e73Var) {
        this.a = lj9Var;
        this.b = e73Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(5:(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|30|31|(3:33|15|16)|34))|30|31|(0)|34)|45|6|7|(0)(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        if (r10.h(r9, r0) != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r10 = new inb(r9);
        r9 = r8.b;
        r0.d = r9;
        r0.e = null;
        r0.b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (che.a(r10, r9, r9, r0) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // hk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        lk4 lk4Var;
        int i;
        bx2 bx2Var;
        oo9 oo9Var;
        oo9 oo9Var2;
        e73 e73Var;
        try {
            if (fw2Var instanceof lk4) {
                lk4Var = (lk4) fw2Var;
                int i2 = lk4Var.b;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    lk4Var.b = i2 - TLObject.FLAG_31;
                    Object obj = lk4Var.a;
                    i = lk4Var.b;
                    bx2Var = bx2.a;
                    if (i != 0) {
                        qse.b(obj);
                        lj9 lj9Var = this.a;
                        lk4Var.d = this;
                        lk4Var.e = ik4Var;
                        lk4Var.b = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) lk4Var.d;
                                qse.b(obj);
                                throw th;
                            }
                            if (i != 3) {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oo9Var2 = (oo9) lk4Var.d;
                            try {
                                qse.b(obj);
                                oo9Var2.releaseIntercepted();
                                return g5c.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oo9Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        ik4Var = lk4Var.e;
                        this = (mk4) lk4Var.d;
                        qse.b(obj);
                    }
                    oo9Var = new oo9(ik4Var, lk4Var.getContext());
                    e73Var = this.b;
                    lk4Var.d = oo9Var;
                    lk4Var.e = null;
                    lk4Var.b = 3;
                    if (e73Var.a(oo9Var, null, lk4Var) != bx2Var) {
                        oo9Var2 = oo9Var;
                        oo9Var2.releaseIntercepted();
                        return g5c.a;
                    }
                    return bx2Var;
                }
            }
            e73Var = this.b;
            lk4Var.d = oo9Var;
            lk4Var.e = null;
            lk4Var.b = 3;
            if (e73Var.a(oo9Var, null, lk4Var) != bx2Var) {
            }
            return bx2Var;
        } catch (Throwable th3) {
            th = th3;
            oo9Var2 = oo9Var;
            oo9Var2.releaseIntercepted();
            throw th;
        }
        lk4Var = new lk4(this, fw2Var);
        Object obj2 = lk4Var.a;
        i = lk4Var.b;
        bx2Var = bx2.a;
        if (i != 0) {
        }
        oo9Var = new oo9(ik4Var, lk4Var.getContext());
    }
}
