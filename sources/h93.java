// default package

import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h93 implements h83 {
    public final ed4 a;
    public final ai4 b;
    public final ky2 c;
    public final oo8 d;
    public int f;
    public yoa g;
    public final e7a i;
    public final zeb j;
    public final zeb k;
    public final xvc l;
    public final qj7 e = new qj7();
    public final ni6 h = new ni6((byte) 24);

    public h93(ed4 ed4Var, List list, ai4 ai4Var, ky2 ky2Var) {
        this.a = ed4Var;
        this.b = ai4Var;
        this.c = ky2Var;
        px2 px2Var = null;
        byte b = 0;
        this.d = new oo8(new t83(this, px2Var, b), (byte) 9);
        e7a e7aVar = new e7a();
        e7aVar.d = this;
        e7aVar.a = new qj7();
        e7aVar.b = kud.a();
        e7aVar.c = km2.k(list);
        this.i = e7aVar;
        this.j = new zeb(new m83(this, (byte) 1));
        this.k = new zeb(new m83(this, b));
        this.l = new xvc(ky2Var, new e93(this, b), new hj1(this, px2Var, (byte) 5));
    }

    @Override // h83
    public final Object a(fs4 fs4Var, qx2 qx2Var) {
        o8c o8cVar = (o8c) qx2Var.getContext().get(kg7.d);
        if (o8cVar != null) {
            o8cVar.a(this);
        }
        return srd.c(new o8c(o8cVar, this), new gj1(this, fs4Var, null, (byte) 1), qx2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0055), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(qx2 qx2Var) {
        u83 u83Var;
        int i;
        qj7 qj7Var;
        int i2;
        try {
            if (qx2Var instanceof u83) {
                u83Var = (u83) qx2Var;
                int i3 = u83Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    u83Var.e = i3 - TLObject.FLAG_31;
                    Object obj = u83Var.c;
                    i = u83Var.e;
                    if (i != 0) {
                        tue.b(obj);
                        u83Var.a = this;
                        qj7Var = this.e;
                        u83Var.b = qj7Var;
                        u83Var.e = 1;
                        Object d = qj7Var.d(u83Var);
                        ly2 ly2Var = ly2.a;
                        if (d == ly2Var) {
                            return ly2Var;
                        }
                    } else {
                        if (i != 1) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qj7 qj7Var2 = u83Var.b;
                        h93 h93Var = u83Var.a;
                        tue.b(obj);
                        qj7Var = qj7Var2;
                        this = h93Var;
                    }
                    i2 = this.f - 1;
                    this.f = i2;
                    if (i2 == 0) {
                        yoa yoaVar = this.g;
                        if (yoaVar != null) {
                            yoaVar.cancel(null);
                        }
                        this.g = null;
                    }
                    qj7Var.f(null);
                    return g7c.a;
                }
            }
            i2 = this.f - 1;
            this.f = i2;
            if (i2 == 0) {
            }
            qj7Var.f(null);
            return g7c.a;
        } catch (Throwable th) {
            qj7Var.f(null);
            throw th;
        }
        u83Var = new u83(this, qx2Var);
        Object obj2 = u83Var.c;
        i = u83Var.e;
        if (i != 0) {
        }
    }

    public final kr5 c() {
        return (kr5) this.k.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(8:49|(1:(1:(2:53|54))(3:55|56|57))|58|59|18|(1:20)(1:24)|21|22)(5:9|10|11|(2:13|14)(3:27|(1:29)|(2:31|(1:33)(2:38|39))(2:40|(2:42|43)(2:44|45)))|26)|35|36))|63|6|7|(0)(0)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r9 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r1 != r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r9 != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, nq2] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [sc9] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [h93] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [h93] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [nq2, ov5] */
    /* JADX WARN: Type inference failed for: r9v8, types: [mq2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(d37 d37Var, qx2 qx2Var) {
        v83 v83Var;
        int i;
        Throwable th;
        Throwable a;
        nq2 nq2Var;
        ?? r9;
        Object c;
        nq2 nq2Var2;
        if (qx2Var instanceof v83) {
            v83Var = (v83) qx2Var;
            int i2 = v83Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                v83Var.f = i2 - TLObject.FLAG_31;
                ?? r11 = v83Var.d;
                i = v83Var.f;
                ly2 ly2Var = ly2.a;
                if (i == 0) {
                    try {
                        if (i != 1) {
                            if (i == 2) {
                                nq2 nq2Var3 = v83Var.c;
                                h93 h93Var = v83Var.b;
                                d37 d37Var2 = (d37) v83Var.a;
                                tue.b(r11);
                                nq2Var = nq2Var3;
                                r9 = h93Var;
                                d37Var = d37Var2;
                            } else if (i != 3) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        this = (mq2) v83Var.a;
                        tue.b(r11);
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = new sc9(th);
                        a = tc9.a(r11);
                        ?? r92 = (nq2) this;
                        if (a == null) {
                        }
                        return g7c.a;
                    }
                    a = tc9.a(r11);
                    ?? r922 = (nq2) this;
                    if (a == null) {
                        r922.B(r11);
                    } else {
                        r922.P(a);
                    }
                    return g7c.a;
                }
                tue.b(r11);
                r11 = d37Var.b;
                try {
                    iya k = this.h.k();
                    if (k instanceof e73) {
                        fs4 fs4Var = d37Var.a;
                        cy2 cy2Var = d37Var.d;
                        v83Var.a = r11;
                        v83Var.f = 1;
                        c = c().c(new d93((h93) this, cy2Var, fs4Var, (px2) null), v83Var);
                        nq2Var2 = r11;
                    } else {
                        if (!(k instanceof o39 ? true : k instanceof o6c)) {
                            if (k instanceof vh4) {
                                throw ((vh4) k).b;
                            }
                            throw new rq2();
                        }
                        if (k != d37Var.c) {
                            k.getClass();
                            throw ((o39) k).b;
                        }
                        v83Var.a = d37Var;
                        v83Var.b = this;
                        v83Var.c = r11;
                        v83Var.f = 2;
                        Object f = f(v83Var);
                        this = this;
                        nq2Var = r11;
                    }
                    return ly2Var;
                } catch (Throwable th3) {
                    th = th3;
                    this = r11;
                    r11 = new sc9(th);
                    a = tc9.a(r11);
                    ?? r9222 = (nq2) this;
                    if (a == null) {
                    }
                    return g7c.a;
                }
                fs4 fs4Var2 = d37Var.a;
                cy2 cy2Var2 = d37Var.d;
                v83Var.a = nq2Var;
                v83Var.b = null;
                v83Var.c = null;
                v83Var.f = 3;
                c = r9.c().c(new d93((h93) r9, cy2Var2, fs4Var2, (px2) null), v83Var);
                nq2Var2 = nq2Var;
            }
        }
        v83Var = new v83(this, qx2Var);
        ?? r112 = v83Var.d;
        i = v83Var.f;
        ly2 ly2Var2 = ly2.a;
        if (i == 0) {
        }
        fs4 fs4Var22 = d37Var.a;
        cy2 cy2Var22 = d37Var.d;
        v83Var.a = nq2Var;
        v83Var.b = null;
        v83Var.c = null;
        v83Var.f = 3;
        c = r9.c().c(new d93((h93) r9, cy2Var22, fs4Var22, (px2) null), v83Var);
        nq2Var2 = nq2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0046, B:13:0x004d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(qx2 qx2Var) {
        w83 w83Var;
        int i;
        qj7 qj7Var;
        int i2;
        try {
            if (qx2Var instanceof w83) {
                w83Var = (w83) qx2Var;
                int i3 = w83Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    w83Var.e = i3 - TLObject.FLAG_31;
                    Object obj = w83Var.c;
                    i = w83Var.e;
                    px2 px2Var = null;
                    if (i != 0) {
                        tue.b(obj);
                        w83Var.a = this;
                        qj7Var = this.e;
                        w83Var.b = qj7Var;
                        w83Var.e = 1;
                        Object d = qj7Var.d(w83Var);
                        ly2 ly2Var = ly2.a;
                        if (d == ly2Var) {
                            return ly2Var;
                        }
                    } else {
                        if (i != 1) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qj7 qj7Var2 = w83Var.b;
                        h93 h93Var = w83Var.a;
                        tue.b(obj);
                        qj7Var = qj7Var2;
                        this = h93Var;
                    }
                    i2 = this.f + 1;
                    this.f = i2;
                    if (i2 == 1) {
                        this.g = srd.b(this.c, new x83(this, px2Var, (byte) 0));
                    }
                    qj7Var.f(null);
                    return g7c.a;
                }
            }
            i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
            }
            qj7Var.f(null);
            return g7c.a;
        } catch (Throwable th) {
            qj7Var.f(null);
            throw th;
        }
        w83Var = new w83(this, qx2Var);
        Object obj2 = w83Var.c;
        i = w83Var.e;
        px2 px2Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1.F(r0) != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r7 != r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(qx2 qx2Var) {
        y83 y83Var;
        int i;
        int intValue;
        h93 h93Var;
        int i2;
        Throwable th;
        try {
            if (qx2Var instanceof y83) {
                y83Var = (y83) qx2Var;
                int i3 = y83Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    y83Var.e = i3 - TLObject.FLAG_31;
                    Object obj = y83Var.c;
                    i = y83Var.e;
                    ly2 ly2Var = ly2.a;
                    if (i != 0) {
                        tue.b(obj);
                        kr5 c = c();
                        y83Var.a = this;
                        y83Var.e = 1;
                        obj = c.b(y83Var);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = y83Var.b;
                            h93Var = y83Var.a;
                            try {
                                tue.b(obj);
                                return g7c.a;
                            } catch (Throwable th2) {
                                th = th2;
                                h93Var.h.F(new o39(i2, th));
                                throw th;
                            }
                        }
                        this = y83Var.a;
                        tue.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    e7a e7aVar = this.i;
                    y83Var.a = this;
                    y83Var.b = intValue;
                    y83Var.e = 2;
                }
            }
            e7a e7aVar2 = this.i;
            y83Var.a = this;
            y83Var.b = intValue;
            y83Var.e = 2;
        } catch (Throwable th3) {
            h93Var = this;
            i2 = intValue;
            th = th3;
            h93Var.h.F(new o39(i2, th));
            throw th;
        }
        y83Var = new y83(this, qx2Var);
        Object obj2 = y83Var.c;
        i = y83Var.e;
        ly2 ly2Var2 = ly2.a;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(boolean z, px2 px2Var) {
        z83 z83Var;
        int i;
        ly2 ly2Var;
        h93 h93Var;
        iya iyaVar;
        boolean z2;
        h93 h93Var2;
        lw7 lw7Var;
        if (px2Var instanceof z83) {
            z83Var = (z83) px2Var;
            int i2 = z83Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                z83Var.f = i2 - TLObject.FLAG_31;
                Object obj = z83Var.d;
                i = z83Var.f;
                px2 px2Var2 = null;
                ly2Var = ly2.a;
                if (i != 0) {
                    tue.b(obj);
                    iya k = this.h.k();
                    if (k instanceof o6c) {
                        dq9.m("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    kr5 c = c();
                    z83Var.a = this;
                    z83Var.b = k;
                    z83Var.c = z;
                    z83Var.f = 1;
                    Object b = c.b(z83Var);
                    if (b != ly2Var) {
                        h93Var = this;
                        iyaVar = k;
                        obj = b;
                    }
                    return ly2Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        h93Var2 = z83Var.a;
                        tue.b(obj);
                        lw7Var = (lw7) obj;
                        iya iyaVar2 = (iya) lw7Var.a;
                        if (((Boolean) lw7Var.b).booleanValue()) {
                        }
                        return iyaVar2;
                    }
                    if (i != 3) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h93Var2 = z83Var.a;
                    tue.b(obj);
                    lw7Var = (lw7) obj;
                    iya iyaVar22 = (iya) lw7Var.a;
                    if (((Boolean) lw7Var.b).booleanValue()) {
                        h93Var2.h.F(iyaVar22);
                    }
                    return iyaVar22;
                }
                z = z83Var.c;
                iyaVar = z83Var.b;
                h93Var = z83Var.a;
                tue.b(obj);
                int intValue = ((Number) obj).intValue();
                z2 = iyaVar instanceof e73;
                int i3 = !z2 ? iyaVar.a : -1;
                if (!z2 && intValue == i3) {
                    return iyaVar;
                }
                if (z) {
                    kr5 c2 = h93Var.c();
                    b93 b93Var = new b93(h93Var, i3, px2Var2, (byte) 0);
                    z83Var.a = h93Var;
                    z83Var.b = null;
                    z83Var.f = 3;
                    obj = c2.e(b93Var, z83Var);
                    if (obj != ly2Var) {
                        h93Var2 = h93Var;
                        lw7Var = (lw7) obj;
                        iya iyaVar222 = (iya) lw7Var.a;
                        if (((Boolean) lw7Var.b).booleanValue()) {
                        }
                        return iyaVar222;
                    }
                } else {
                    kr5 c3 = h93Var.c();
                    a93 a93Var = new a93(h93Var, null);
                    z83Var.a = h93Var;
                    z83Var.b = null;
                    z83Var.f = 2;
                    obj = c3.c(a93Var, z83Var);
                    if (obj != ly2Var) {
                        h93Var2 = h93Var;
                        lw7Var = (lw7) obj;
                        iya iyaVar2222 = (iya) lw7Var.a;
                        if (((Boolean) lw7Var.b).booleanValue()) {
                        }
                        return iyaVar2222;
                    }
                }
                return ly2Var;
            }
        }
        z83Var = new z83(this, px2Var);
        Object obj2 = z83Var.d;
        i = z83Var.f;
        px2 px2Var22 = null;
        ly2Var = ly2.a;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = iyaVar instanceof e73;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return ly2Var;
    }

    @Override // h83
    public final im4 getData() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|70|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r12 != r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009e, code lost:
    
        if (r12 != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00df, code lost:
    
        if (r12 != r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:27:0x012c, B:29:0x013e, B:33:0x0146), top: B:26:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #1 {all -> 0x016a, blocks: (B:27:0x012c, B:29:0x013e, B:33:0x0146), top: B:26:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, qx2 qx2Var) {
        c93 c93Var;
        int i;
        e79 e79Var;
        py2 py2Var;
        h93 h93Var;
        boolean z2;
        e79 e79Var2;
        py2 py2Var2;
        Object c;
        c79 c79Var;
        e79 e79Var3;
        h93 h93Var2;
        int i2;
        Object obj;
        if (qx2Var instanceof c93) {
            c93Var = (c93) qx2Var;
            int i3 = c93Var.r;
            if ((i3 & TLObject.FLAG_31) != 0) {
                c93Var.r = i3 - TLObject.FLAG_31;
                Object obj2 = c93Var.h;
                i = c93Var.r;
                byte b = 1;
                px2 px2Var = null;
                ly2 ly2Var = ly2.a;
                switch (i) {
                    case 0:
                        tue.b(obj2);
                        int i4 = 3;
                        if (!z) {
                            kr5 c2 = c();
                            c93Var.a = this;
                            c93Var.e = z;
                            c93Var.r = 3;
                            obj2 = c2.b(c93Var);
                            break;
                        } else {
                            c93Var.a = this;
                            c93Var.e = z;
                            c93Var.r = 1;
                            obj2 = ((hd4) this.j.getValue()).a(new q83(i4, px2Var), c93Var);
                            break;
                        }
                        return ly2Var;
                    case 1:
                        z = c93Var.e;
                        this = (h93) c93Var.a;
                        tue.b(obj2);
                        int hashCode = obj2 != null ? obj2.hashCode() : 0;
                        kr5 c3 = this.c();
                        c93Var.a = this;
                        c93Var.b = obj2;
                        c93Var.e = z;
                        c93Var.f = hashCode;
                        c93Var.r = 2;
                        Object b2 = c3.b(c93Var);
                        if (b2 != ly2Var) {
                            h93Var2 = this;
                            i2 = hashCode;
                            obj = obj2;
                            obj2 = b2;
                            return new e73(i2, ((Number) obj2).intValue(), obj);
                        }
                        return ly2Var;
                    case 2:
                        i2 = c93Var.f;
                        z = c93Var.e;
                        obj = c93Var.b;
                        h93Var2 = (h93) c93Var.a;
                        try {
                            tue.b(obj2);
                            return new e73(i2, ((Number) obj2).intValue(), obj);
                        } catch (py2 e) {
                            e = e;
                            this = h93Var2;
                            e79Var = new e79();
                            ai4 ai4Var = this.b;
                            c93Var.a = this;
                            c93Var.b = e;
                            c93Var.c = e79Var;
                            c93Var.d = e79Var;
                            c93Var.e = z;
                            c93Var.r = 5;
                            Object invoke = ((rr4) ai4Var.b).invoke(e);
                            if (invoke != ly2Var) {
                                py2Var = e;
                                obj2 = invoke;
                                h93Var = this;
                                z2 = z;
                                e79Var2 = e79Var;
                                e79Var2.a = obj2;
                                c79 c79Var2 = new c79();
                                try {
                                    d93 d93Var = new d93(e79Var, h93Var, c79Var2, (px2) null);
                                    c93Var.a = py2Var;
                                    c93Var.b = e79Var;
                                    c93Var.c = c79Var2;
                                    c93Var.d = null;
                                    c93Var.r = 6;
                                    if (z2) {
                                    }
                                    if (c != ly2Var) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    py2Var2 = py2Var;
                                    uhe.a(py2Var2, th);
                                    throw py2Var2;
                                }
                            }
                            return ly2Var;
                        }
                    case 3:
                        z = c93Var.e;
                        this = (h93) c93Var.a;
                        tue.b(obj2);
                        int intValue = ((Number) obj2).intValue();
                        kr5 c4 = this.c();
                        b93 b93Var = new b93(this, intValue, px2Var, b);
                        c93Var.a = this;
                        c93Var.e = z;
                        c93Var.r = 4;
                        obj2 = c4.e(b93Var, c93Var);
                        break;
                    case 4:
                        boolean z3 = c93Var.e;
                        tue.b(obj2);
                        return (e73) obj2;
                    case 5:
                        z2 = c93Var.e;
                        e79Var2 = c93Var.d;
                        e79Var = (e79) c93Var.c;
                        py2Var = (py2) c93Var.b;
                        h93Var = (h93) c93Var.a;
                        tue.b(obj2);
                        e79Var2.a = obj2;
                        c79 c79Var22 = new c79();
                        d93 d93Var2 = new d93(e79Var, h93Var, c79Var22, (px2) null);
                        c93Var.a = py2Var;
                        c93Var.b = e79Var;
                        c93Var.c = c79Var22;
                        c93Var.d = null;
                        c93Var.r = 6;
                        if (z2) {
                            c = h93Var.c().c(new q73(d93Var2, px2Var, b), c93Var);
                        } else {
                            h93Var.getClass();
                            c = d93Var2.invoke(c93Var);
                        }
                        if (c != ly2Var) {
                            c79Var = c79Var22;
                            e79Var3 = e79Var;
                            Object obj3 = e79Var3.a;
                            return new e73(obj3 != null ? obj3.hashCode() : 0, c79Var.a, obj3);
                        }
                        return ly2Var;
                    case 6:
                        c79Var = (c79) c93Var.c;
                        e79Var3 = (e79) c93Var.b;
                        py2Var2 = (py2) c93Var.a;
                        try {
                            tue.b(obj2);
                            Object obj32 = e79Var3.a;
                            return new e73(obj32 != null ? obj32.hashCode() : 0, c79Var.a, obj32);
                        } catch (Throwable th2) {
                            th = th2;
                            uhe.a(py2Var2, th);
                            throw py2Var2;
                        }
                    default:
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        c93Var = new c93(this, qx2Var);
        Object obj22 = c93Var.h;
        i = c93Var.r;
        byte b3 = 1;
        px2 px2Var2 = null;
        ly2 ly2Var2 = ly2.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z, qx2 qx2Var) {
        f93 f93Var;
        int i;
        c79 c79Var;
        if (qx2Var instanceof f93) {
            f93Var = (f93) qx2Var;
            int i2 = f93Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                f93Var.d = i2 - TLObject.FLAG_31;
                Object obj2 = f93Var.b;
                i = f93Var.d;
                if (i != 0) {
                    tue.b(obj2);
                    c79 c79Var2 = new c79();
                    hd4 hd4Var = (hd4) this.j.getValue();
                    g93 g93Var = new g93(c79Var2, this, obj, z, null);
                    f93Var.a = c79Var2;
                    f93Var.d = 1;
                    Object b = hd4Var.b(g93Var, f93Var);
                    ly2 ly2Var = ly2.a;
                    if (b == ly2Var) {
                        return ly2Var;
                    }
                    c79Var = c79Var2;
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c79Var = f93Var.a;
                    tue.b(obj2);
                }
                return new Integer(c79Var.a);
            }
        }
        f93Var = new f93(this, qx2Var);
        Object obj22 = f93Var.b;
        i = f93Var.d;
        if (i != 0) {
        }
        return new Integer(c79Var.a);
    }
}
