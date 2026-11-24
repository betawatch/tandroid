// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k83 {
    public final /* synthetic */ oj7 a;
    public final /* synthetic */ b79 b;
    public final /* synthetic */ e79 c;
    public final /* synthetic */ h93 d;

    public k83(oj7 oj7Var, b79 b79Var, e79 e79Var, h93 h93Var) {
        this.a = oj7Var;
        this.b = b79Var;
        this.c = e79Var;
        this.d = h93Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        if (r10.d(r0) != r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #2 {all -> 0x00c9, blocks: (B:27:0x004b, B:28:0x00a1, B:30:0x00a9), top: B:26:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0086, B:42:0x008a, B:45:0x00cc, B:46:0x00d3), top: B:39:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0086, B:42:0x008a, B:45:0x00cc, B:46:0x00d3), top: B:39:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oj7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r73 r73Var, qx2 qx2Var) {
        j83 j83Var;
        int i;
        b79 b79Var;
        e79 e79Var;
        h93 h93Var;
        qj7 qj7Var;
        fs4 fs4Var;
        oj7 oj7Var;
        oj7 oj7Var2;
        e79 e79Var2;
        Object obj;
        try {
            if (qx2Var instanceof j83) {
                j83Var = (j83) qx2Var;
                int i2 = j83Var.n;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    j83Var.n = i2 - TLObject.FLAG_31;
                    Object obj2 = j83Var.f;
                    i = j83Var.n;
                    ly2 ly2Var = ly2.a;
                    if (i != 0) {
                        tue.b(obj2);
                        j83Var.a = r73Var;
                        oj7 oj7Var3 = this.a;
                        j83Var.b = oj7Var3;
                        b79Var = this.b;
                        j83Var.c = b79Var;
                        e79Var = this.c;
                        j83Var.d = e79Var;
                        h93Var = this.d;
                        j83Var.e = h93Var;
                        j83Var.n = 1;
                        qj7Var = (qj7) oj7Var3;
                        fs4Var = r73Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = j83Var.c;
                                e79Var2 = (e79) j83Var.b;
                                oj7Var = (oj7) j83Var.a;
                                try {
                                    tue.b(obj2);
                                    e79Var2.a = obj;
                                    Object obj3 = e79Var2.a;
                                    ((qj7) oj7Var).f(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((qj7) oj7Var).f(null);
                                    throw th;
                                }
                            }
                            h93Var = (h93) j83Var.c;
                            e79Var2 = (e79) j83Var.b;
                            oj7Var2 = (oj7) j83Var.a;
                            try {
                                tue.b(obj2);
                                if (!rr5.a(obj2, e79Var2.a)) {
                                    oj7Var = oj7Var2;
                                    Object obj32 = e79Var2.a;
                                    ((qj7) oj7Var).f(null);
                                    return obj32;
                                }
                                j83Var.a = oj7Var2;
                                j83Var.b = e79Var2;
                                j83Var.c = obj2;
                                j83Var.n = 3;
                                if (h93Var.i(obj2, false, j83Var) != ly2Var) {
                                    obj = obj2;
                                    oj7Var = oj7Var2;
                                    e79Var2.a = obj;
                                    Object obj322 = e79Var2.a;
                                    ((qj7) oj7Var).f(null);
                                    return obj322;
                                }
                                return ly2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                oj7Var = oj7Var2;
                                ((qj7) oj7Var).f(null);
                                throw th;
                            }
                        }
                        h93Var = j83Var.e;
                        e79 e79Var3 = j83Var.d;
                        b79Var = (b79) j83Var.c;
                        ?? r4 = (oj7) j83Var.b;
                        fs4 fs4Var2 = (fs4) j83Var.a;
                        tue.b(obj2);
                        e79Var = e79Var3;
                        fs4Var = fs4Var2;
                        qj7Var = r4;
                    }
                    if (!b79Var.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = e79Var.a;
                    j83Var.a = qj7Var;
                    j83Var.b = e79Var;
                    j83Var.c = h93Var;
                    j83Var.d = null;
                    j83Var.e = null;
                    j83Var.n = 2;
                    Object invoke = fs4Var.invoke(obj4, j83Var);
                    if (invoke != ly2Var) {
                        oj7Var2 = qj7Var;
                        obj2 = invoke;
                        e79Var2 = e79Var;
                        if (!rr5.a(obj2, e79Var2.a)) {
                        }
                    }
                    return ly2Var;
                }
            }
            if (!b79Var.a) {
            }
        } catch (Throwable th3) {
            th = th3;
            oj7Var = qj7Var;
            ((qj7) oj7Var).f(null);
            throw th;
        }
        j83Var = new j83(this, qx2Var);
        Object obj22 = j83Var.f;
        i = j83Var.n;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
    }
}
