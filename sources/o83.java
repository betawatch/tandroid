// default package

import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o83 implements o73 {
    public final bd4 a;
    public final i09 b;
    public final ux2 c;
    public final k09 d;
    public int f;
    public uqa g;
    public final u8a i;
    public final tgb j;
    public final tgb k;
    public final lyc l;
    public final wj7 e = new wj7();
    public final ri6 h = new ri6((byte) 24);

    public o83(bd4 bd4Var, List list, i09 i09Var, ux2 ux2Var) {
        this.a = bd4Var;
        this.b = i09Var;
        this.c = ux2Var;
        zw2 zw2Var = null;
        byte b = 0;
        this.d = new k09(new a83(this, zw2Var, b), (byte) 6);
        u8a u8aVar = new u8a();
        u8aVar.d = this;
        u8aVar.a = new wj7();
        u8aVar.b = xwd.a();
        u8aVar.c = sl2.k(list);
        this.i = u8aVar;
        this.j = new tgb(new t73(this, (byte) 1));
        this.k = new tgb(new t73(this, b));
        this.l = new lyc(ux2Var, new l83(this, b), new ii1(this, zw2Var, (byte) 5));
    }

    @Override // o73
    public final Object a(is4 is4Var, ax2 ax2Var) {
        nac nacVar = (nac) ax2Var.getContext().get(rg7.d);
        if (nacVar != null) {
            nacVar.a(this);
        }
        return fud.c(new nac(nacVar, this), new hi1(this, is4Var, null, (byte) 1), ax2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0055), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ax2 ax2Var) {
        b83 b83Var;
        int i;
        wj7 wj7Var;
        int i2;
        try {
            if (ax2Var instanceof b83) {
                b83Var = (b83) ax2Var;
                int i3 = b83Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    b83Var.e = i3 - TLObject.FLAG_31;
                    Object obj = b83Var.c;
                    i = b83Var.e;
                    if (i != 0) {
                        ixe.b(obj);
                        b83Var.a = this;
                        wj7Var = this.e;
                        b83Var.b = wj7Var;
                        b83Var.e = 1;
                        Object d = wj7Var.d(b83Var);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wj7 wj7Var2 = b83Var.b;
                        o83 o83Var = b83Var.a;
                        ixe.b(obj);
                        wj7Var = wj7Var2;
                        this = o83Var;
                    }
                    i2 = this.f - 1;
                    this.f = i2;
                    if (i2 == 0) {
                        uqa uqaVar = this.g;
                        if (uqaVar != null) {
                            uqaVar.cancel(null);
                        }
                        this.g = null;
                    }
                    wj7Var.f(null);
                    return f9c.a;
                }
            }
            i2 = this.f - 1;
            this.f = i2;
            if (i2 == 0) {
            }
            wj7Var.f(null);
            return f9c.a;
        } catch (Throwable th) {
            wj7Var.f(null);
            throw th;
        }
        b83Var = new b83(this, ax2Var);
        Object obj2 = b83Var.c;
        i = b83Var.e;
        if (i != 0) {
        }
    }

    public final nr5 c() {
        return (nr5) this.k.getValue();
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
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, vp2] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [ge9] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o83] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [o83] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [sv5, vp2] */
    /* JADX WARN: Type inference failed for: r9v8, types: [up2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(k37 k37Var, ax2 ax2Var) {
        c83 c83Var;
        int i;
        Throwable th;
        Throwable a;
        vp2 vp2Var;
        ?? r9;
        Object c;
        vp2 vp2Var2;
        if (ax2Var instanceof c83) {
            c83Var = (c83) ax2Var;
            int i2 = c83Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                c83Var.f = i2 - TLObject.FLAG_31;
                ?? r11 = c83Var.d;
                i = c83Var.f;
                vx2 vx2Var = vx2.a;
                if (i == 0) {
                    try {
                        if (i != 1) {
                            if (i == 2) {
                                vp2 vp2Var3 = c83Var.c;
                                o83 o83Var = c83Var.b;
                                k37 k37Var2 = (k37) c83Var.a;
                                ixe.b(r11);
                                vp2Var = vp2Var3;
                                r9 = o83Var;
                                k37Var = k37Var2;
                            } else if (i != 3) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        this = (up2) c83Var.a;
                        ixe.b(r11);
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = new ge9(th);
                        a = he9.a(r11);
                        ?? r92 = (vp2) this;
                        if (a == null) {
                        }
                        return f9c.a;
                    }
                    a = he9.a(r11);
                    ?? r922 = (vp2) this;
                    if (a == null) {
                        r922.B(r11);
                    } else {
                        r922.P(a);
                    }
                    return f9c.a;
                }
                ixe.b(r11);
                r11 = k37Var.b;
                try {
                    i0b r = this.h.r();
                    if (r instanceof k63) {
                        is4 is4Var = k37Var.a;
                        mx2 mx2Var = k37Var.d;
                        c83Var.a = r11;
                        c83Var.f = 1;
                        c = c().c(new k83((o83) this, mx2Var, is4Var, (zw2) null), c83Var);
                        vp2Var2 = r11;
                    } else {
                        if (!(r instanceof a59 ? true : r instanceof n8c)) {
                            if (r instanceof sh4) {
                                throw ((sh4) r).b;
                            }
                            throw new zp2();
                        }
                        if (r != k37Var.c) {
                            r.getClass();
                            throw ((a59) r).b;
                        }
                        c83Var.a = k37Var;
                        c83Var.b = this;
                        c83Var.c = r11;
                        c83Var.f = 2;
                        Object f = f(c83Var);
                        this = this;
                        vp2Var = r11;
                    }
                    return vx2Var;
                } catch (Throwable th3) {
                    th = th3;
                    this = r11;
                    r11 = new ge9(th);
                    a = he9.a(r11);
                    ?? r9222 = (vp2) this;
                    if (a == null) {
                    }
                    return f9c.a;
                }
                is4 is4Var2 = k37Var.a;
                mx2 mx2Var2 = k37Var.d;
                c83Var.a = vp2Var;
                c83Var.b = null;
                c83Var.c = null;
                c83Var.f = 3;
                c = r9.c().c(new k83((o83) r9, mx2Var2, is4Var2, (zw2) null), c83Var);
                vp2Var2 = vp2Var;
            }
        }
        c83Var = new c83(this, ax2Var);
        ?? r112 = c83Var.d;
        i = c83Var.f;
        vx2 vx2Var2 = vx2.a;
        if (i == 0) {
        }
        is4 is4Var22 = k37Var.a;
        mx2 mx2Var22 = k37Var.d;
        c83Var.a = vp2Var;
        c83Var.b = null;
        c83Var.c = null;
        c83Var.f = 3;
        c = r9.c().c(new k83((o83) r9, mx2Var22, is4Var22, (zw2) null), c83Var);
        vp2Var2 = vp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0046, B:13:0x004d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ax2 ax2Var) {
        d83 d83Var;
        int i;
        wj7 wj7Var;
        int i2;
        try {
            if (ax2Var instanceof d83) {
                d83Var = (d83) ax2Var;
                int i3 = d83Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    d83Var.e = i3 - TLObject.FLAG_31;
                    Object obj = d83Var.c;
                    i = d83Var.e;
                    zw2 zw2Var = null;
                    if (i != 0) {
                        ixe.b(obj);
                        d83Var.a = this;
                        wj7Var = this.e;
                        d83Var.b = wj7Var;
                        d83Var.e = 1;
                        Object d = wj7Var.d(d83Var);
                        vx2 vx2Var = vx2.a;
                        if (d == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (i != 1) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wj7 wj7Var2 = d83Var.b;
                        o83 o83Var = d83Var.a;
                        ixe.b(obj);
                        wj7Var = wj7Var2;
                        this = o83Var;
                    }
                    i2 = this.f + 1;
                    this.f = i2;
                    if (i2 == 1) {
                        this.g = fud.b(this.c, new e83(this, zw2Var, (byte) 0));
                    }
                    wj7Var.f(null);
                    return f9c.a;
                }
            }
            i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
            }
            wj7Var.f(null);
            return f9c.a;
        } catch (Throwable th) {
            wj7Var.f(null);
            throw th;
        }
        d83Var = new d83(this, ax2Var);
        Object obj2 = d83Var.c;
        i = d83Var.e;
        zw2 zw2Var2 = null;
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
    public final Object f(ax2 ax2Var) {
        f83 f83Var;
        int i;
        int intValue;
        o83 o83Var;
        int i2;
        Throwable th;
        try {
            if (ax2Var instanceof f83) {
                f83Var = (f83) ax2Var;
                int i3 = f83Var.e;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    f83Var.e = i3 - TLObject.FLAG_31;
                    Object obj = f83Var.c;
                    i = f83Var.e;
                    vx2 vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj);
                        nr5 c = c();
                        f83Var.a = this;
                        f83Var.e = 1;
                        obj = c.b(f83Var);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = f83Var.b;
                            o83Var = f83Var.a;
                            try {
                                ixe.b(obj);
                                return f9c.a;
                            } catch (Throwable th2) {
                                th = th2;
                                o83Var.h.H(new a59(i2, th));
                                throw th;
                            }
                        }
                        this = f83Var.a;
                        ixe.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    u8a u8aVar = this.i;
                    f83Var.a = this;
                    f83Var.b = intValue;
                    f83Var.e = 2;
                }
            }
            u8a u8aVar2 = this.i;
            f83Var.a = this;
            f83Var.b = intValue;
            f83Var.e = 2;
        } catch (Throwable th3) {
            o83Var = this;
            i2 = intValue;
            th = th3;
            o83Var.h.H(new a59(i2, th));
            throw th;
        }
        f83Var = new f83(this, ax2Var);
        Object obj2 = f83Var.c;
        i = f83Var.e;
        vx2 vx2Var2 = vx2.a;
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
    public final Object g(boolean z, zw2 zw2Var) {
        g83 g83Var;
        int i;
        vx2 vx2Var;
        o83 o83Var;
        i0b i0bVar;
        boolean z2;
        o83 o83Var2;
        rx7 rx7Var;
        if (zw2Var instanceof g83) {
            g83Var = (g83) zw2Var;
            int i2 = g83Var.f;
            if ((i2 & TLObject.FLAG_31) != 0) {
                g83Var.f = i2 - TLObject.FLAG_31;
                Object obj = g83Var.d;
                i = g83Var.f;
                zw2 zw2Var2 = null;
                vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    i0b r = this.h.r();
                    if (r instanceof n8c) {
                        grb.i("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    nr5 c = c();
                    g83Var.a = this;
                    g83Var.b = r;
                    g83Var.c = z;
                    g83Var.f = 1;
                    Object b = c.b(g83Var);
                    if (b != vx2Var) {
                        o83Var = this;
                        i0bVar = r;
                        obj = b;
                    }
                    return vx2Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        o83Var2 = g83Var.a;
                        ixe.b(obj);
                        rx7Var = (rx7) obj;
                        i0b i0bVar2 = (i0b) rx7Var.a;
                        if (((Boolean) rx7Var.b).booleanValue()) {
                        }
                        return i0bVar2;
                    }
                    if (i != 3) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o83Var2 = g83Var.a;
                    ixe.b(obj);
                    rx7Var = (rx7) obj;
                    i0b i0bVar22 = (i0b) rx7Var.a;
                    if (((Boolean) rx7Var.b).booleanValue()) {
                        o83Var2.h.H(i0bVar22);
                    }
                    return i0bVar22;
                }
                z = g83Var.c;
                i0bVar = g83Var.b;
                o83Var = g83Var.a;
                ixe.b(obj);
                int intValue = ((Number) obj).intValue();
                z2 = i0bVar instanceof k63;
                int i3 = !z2 ? i0bVar.a : -1;
                if (!z2 && intValue == i3) {
                    return i0bVar;
                }
                if (z) {
                    nr5 c2 = o83Var.c();
                    i83 i83Var = new i83(o83Var, i3, zw2Var2, (byte) 0);
                    g83Var.a = o83Var;
                    g83Var.b = null;
                    g83Var.f = 3;
                    obj = c2.e(i83Var, g83Var);
                    if (obj != vx2Var) {
                        o83Var2 = o83Var;
                        rx7Var = (rx7) obj;
                        i0b i0bVar222 = (i0b) rx7Var.a;
                        if (((Boolean) rx7Var.b).booleanValue()) {
                        }
                        return i0bVar222;
                    }
                } else {
                    nr5 c3 = o83Var.c();
                    h83 h83Var = new h83(o83Var, null);
                    g83Var.a = o83Var;
                    g83Var.b = null;
                    g83Var.f = 2;
                    obj = c3.c(h83Var, g83Var);
                    if (obj != vx2Var) {
                        o83Var2 = o83Var;
                        rx7Var = (rx7) obj;
                        i0b i0bVar2222 = (i0b) rx7Var.a;
                        if (((Boolean) rx7Var.b).booleanValue()) {
                        }
                        return i0bVar2222;
                    }
                }
                return vx2Var;
            }
        }
        g83Var = new g83(this, zw2Var);
        Object obj2 = g83Var.d;
        i = g83Var.f;
        zw2 zw2Var22 = null;
        vx2Var = vx2.a;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = i0bVar instanceof k63;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return vx2Var;
    }

    @Override // o73
    public final mm4 getData() {
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
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e A[Catch: all -> 0x016a, TryCatch #2 {all -> 0x016a, blocks: (B:27:0x012c, B:29:0x013e, B:33:0x0146), top: B:26:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #2 {all -> 0x016a, blocks: (B:27:0x012c, B:29:0x013e, B:33:0x0146), top: B:26:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, ax2 ax2Var) {
        j83 j83Var;
        int i;
        p89 p89Var;
        zx2 zx2Var;
        o83 o83Var;
        boolean z2;
        p89 p89Var2;
        zx2 zx2Var2;
        Object c;
        n89 n89Var;
        p89 p89Var3;
        o83 o83Var2;
        int i2;
        Object obj;
        if (ax2Var instanceof j83) {
            j83Var = (j83) ax2Var;
            int i3 = j83Var.r;
            if ((i3 & TLObject.FLAG_31) != 0) {
                j83Var.r = i3 - TLObject.FLAG_31;
                Object obj2 = j83Var.h;
                i = j83Var.r;
                byte b = 1;
                zw2 zw2Var = null;
                vx2 vx2Var = vx2.a;
                switch (i) {
                    case 0:
                        ixe.b(obj2);
                        int i4 = 3;
                        if (!z) {
                            nr5 c2 = c();
                            j83Var.a = this;
                            j83Var.e = z;
                            j83Var.r = 3;
                            obj2 = c2.b(j83Var);
                            break;
                        } else {
                            j83Var.a = this;
                            j83Var.e = z;
                            j83Var.r = 1;
                            obj2 = ((ed4) this.j.getValue()).a(new x73(i4, zw2Var), j83Var);
                            break;
                        }
                        return vx2Var;
                    case 1:
                        z = j83Var.e;
                        this = (o83) j83Var.a;
                        ixe.b(obj2);
                        int hashCode = obj2 != null ? obj2.hashCode() : 0;
                        nr5 c3 = this.c();
                        j83Var.a = this;
                        j83Var.b = obj2;
                        j83Var.e = z;
                        j83Var.f = hashCode;
                        j83Var.r = 2;
                        Object b2 = c3.b(j83Var);
                        if (b2 != vx2Var) {
                            o83Var2 = this;
                            i2 = hashCode;
                            obj = obj2;
                            obj2 = b2;
                            return new k63(i2, ((Number) obj2).intValue(), obj);
                        }
                        return vx2Var;
                    case 2:
                        i2 = j83Var.f;
                        z = j83Var.e;
                        obj = j83Var.b;
                        o83Var2 = (o83) j83Var.a;
                        try {
                            ixe.b(obj2);
                            return new k63(i2, ((Number) obj2).intValue(), obj);
                        } catch (zx2 e) {
                            e = e;
                            this = o83Var2;
                            p89Var = new p89();
                            i09 i09Var = this.b;
                            j83Var.a = this;
                            j83Var.b = e;
                            j83Var.c = p89Var;
                            j83Var.d = p89Var;
                            j83Var.e = z;
                            j83Var.r = 5;
                            Object invoke = ((ur4) i09Var.b).invoke(e);
                            if (invoke != vx2Var) {
                                zx2Var = e;
                                obj2 = invoke;
                                o83Var = this;
                                z2 = z;
                                p89Var2 = p89Var;
                                p89Var2.a = obj2;
                                n89 n89Var2 = new n89();
                                try {
                                    k83 k83Var = new k83(p89Var, o83Var, n89Var2, (zw2) null);
                                    j83Var.a = zx2Var;
                                    j83Var.b = p89Var;
                                    j83Var.c = n89Var2;
                                    j83Var.d = null;
                                    j83Var.r = 6;
                                    if (z2) {
                                    }
                                    if (c != vx2Var) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    zx2Var2 = zx2Var;
                                    kke.a(zx2Var2, th);
                                    throw zx2Var2;
                                }
                            }
                            return vx2Var;
                        }
                    case 3:
                        z = j83Var.e;
                        this = (o83) j83Var.a;
                        ixe.b(obj2);
                        int intValue = ((Number) obj2).intValue();
                        nr5 c4 = this.c();
                        i83 i83Var = new i83(this, intValue, zw2Var, b);
                        j83Var.a = this;
                        j83Var.e = z;
                        j83Var.r = 4;
                        obj2 = c4.e(i83Var, j83Var);
                        break;
                    case 4:
                        boolean z3 = j83Var.e;
                        ixe.b(obj2);
                        return (k63) obj2;
                    case 5:
                        z2 = j83Var.e;
                        p89Var2 = j83Var.d;
                        p89Var = (p89) j83Var.c;
                        zx2Var = (zx2) j83Var.b;
                        o83Var = (o83) j83Var.a;
                        ixe.b(obj2);
                        p89Var2.a = obj2;
                        n89 n89Var22 = new n89();
                        k83 k83Var2 = new k83(p89Var, o83Var, n89Var22, (zw2) null);
                        j83Var.a = zx2Var;
                        j83Var.b = p89Var;
                        j83Var.c = n89Var22;
                        j83Var.d = null;
                        j83Var.r = 6;
                        if (z2) {
                            c = o83Var.c().c(new x63(k83Var2, zw2Var, b), j83Var);
                        } else {
                            o83Var.getClass();
                            c = k83Var2.invoke(j83Var);
                        }
                        if (c != vx2Var) {
                            n89Var = n89Var22;
                            p89Var3 = p89Var;
                            Object obj3 = p89Var3.a;
                            return new k63(obj3 != null ? obj3.hashCode() : 0, n89Var.a, obj3);
                        }
                        return vx2Var;
                    case 6:
                        n89Var = (n89) j83Var.c;
                        p89Var3 = (p89) j83Var.b;
                        zx2Var2 = (zx2) j83Var.a;
                        try {
                            ixe.b(obj2);
                            Object obj32 = p89Var3.a;
                            return new k63(obj32 != null ? obj32.hashCode() : 0, n89Var.a, obj32);
                        } catch (Throwable th2) {
                            th = th2;
                            kke.a(zx2Var2, th);
                            throw zx2Var2;
                        }
                    default:
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        j83Var = new j83(this, ax2Var);
        Object obj22 = j83Var.h;
        i = j83Var.r;
        byte b3 = 1;
        zw2 zw2Var2 = null;
        vx2 vx2Var2 = vx2.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z, ax2 ax2Var) {
        m83 m83Var;
        int i;
        n89 n89Var;
        if (ax2Var instanceof m83) {
            m83Var = (m83) ax2Var;
            int i2 = m83Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                m83Var.d = i2 - TLObject.FLAG_31;
                Object obj2 = m83Var.b;
                i = m83Var.d;
                if (i != 0) {
                    ixe.b(obj2);
                    n89 n89Var2 = new n89();
                    ed4 ed4Var = (ed4) this.j.getValue();
                    n83 n83Var = new n83(n89Var2, this, obj, z, null);
                    m83Var.a = n89Var2;
                    m83Var.d = 1;
                    Object b = ed4Var.b(n83Var, m83Var);
                    vx2 vx2Var = vx2.a;
                    if (b == vx2Var) {
                        return vx2Var;
                    }
                    n89Var = n89Var2;
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n89Var = m83Var.a;
                    ixe.b(obj2);
                }
                return new Integer(n89Var.a);
            }
        }
        m83Var = new m83(this, ax2Var);
        Object obj22 = m83Var.b;
        i = m83Var.d;
        if (i != 0) {
        }
        return new Integer(n89Var.a);
    }
}
