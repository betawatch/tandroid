// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gd3 {
    public static final k50 h = new k50((byte) 2);
    public static final Random i = new Random();
    public rt6 d;
    public String f;
    public final aqb a = new aqb();
    public final ypb b = new ypb();
    public final HashMap c = new HashMap();
    public bqb e = bqb.a;
    public long g = -1;

    public final void a(fd3 fd3Var) {
        long j = fd3Var.c;
        if (j != -1 && fd3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(tk tkVar) {
        rt6 rt6Var;
        String str = this.f;
        if (str != null) {
            fd3 fd3Var = (fd3) this.c.get(str);
            fd3Var.getClass();
            a(fd3Var);
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            fd3 fd3Var2 = (fd3) it.next();
            it.remove();
            if (fd3Var2.e && (rt6Var = this.d) != null) {
                rt6Var.p(tkVar, fd3Var2.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 == (-1)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd3 c(int i2, rz6 rz6Var) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        fd3 fd3Var = null;
        long j4 = Long.MAX_VALUE;
        for (fd3 fd3Var2 : hashMap.values()) {
            long j5 = fd3Var2.c;
            rz6 rz6Var2 = fd3Var2.d;
            if (j5 == -1 && i2 == fd3Var2.b && rz6Var != null) {
                long j6 = rz6Var.d;
                gd3 gd3Var = fd3Var2.g;
                j = -1;
                fd3 fd3Var3 = (fd3) gd3Var.c.get(gd3Var.f);
                if (fd3Var3 != null) {
                    j3 = fd3Var3.c;
                }
                j3 = gd3Var.g + 1;
                if (j6 >= j3) {
                    fd3Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (rz6Var != null) {
                long j7 = rz6Var.d;
                if (j7 != j) {
                    if (rz6Var2 == null) {
                        if (!rz6Var.c() && j7 == fd3Var2.c) {
                            j2 = fd3Var2.c;
                            if (j2 == j || j2 < j4) {
                                fd3Var = fd3Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = hac.a;
                                if (fd3Var.d != null && rz6Var2 != null) {
                                    fd3Var = fd3Var2;
                                }
                            }
                        }
                    } else if (j7 == rz6Var2.d && rz6Var.b == rz6Var2.b && rz6Var.c == rz6Var2.c) {
                        j2 = fd3Var2.c;
                        if (j2 == j) {
                        }
                        fd3Var = fd3Var2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == fd3Var2.b) {
                j2 = fd3Var2.c;
                if (j2 == j) {
                }
                fd3Var = fd3Var2;
                j4 = j2;
            }
        }
        if (fd3Var != null) {
            return fd3Var;
        }
        String str2 = (String) h.get();
        fd3 fd3Var4 = new fd3(this, str2, i2, rz6Var);
        hashMap.put(str2, fd3Var4);
        return fd3Var4;
    }

    public final synchronized String d(bqb bqbVar, rz6 rz6Var) {
        return c(bqbVar.g(rz6Var.a, this.b).c, rz6Var).a;
    }

    public final void e(tk tkVar) {
        rz6 rz6Var;
        bqb bqbVar = tkVar.b;
        int i2 = tkVar.c;
        rz6 rz6Var2 = tkVar.d;
        boolean p = bqbVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                fd3 fd3Var = (fd3) hashMap.get(str);
                fd3Var.getClass();
                a(fd3Var);
                return;
            }
            return;
        }
        fd3 fd3Var2 = (fd3) hashMap.get(str);
        this.f = c(i2, rz6Var2).a;
        f(tkVar);
        if (rz6Var2 != null) {
            long j = rz6Var2.d;
            if (rz6Var2.c()) {
                if (fd3Var2 != null && fd3Var2.c == j && (rz6Var = fd3Var2.d) != null && rz6Var.b == rz6Var2.b && rz6Var.c == rz6Var2.c) {
                    return;
                }
                c(i2, new rz6(rz6Var2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(tk tkVar) {
        long j;
        this.d.getClass();
        if (tkVar.b.p()) {
            return;
        }
        rz6 rz6Var = tkVar.d;
        if (rz6Var != null) {
            long j2 = rz6Var.d;
            if (j2 != -1) {
                fd3 fd3Var = (fd3) this.c.get(this.f);
                if (fd3Var != null) {
                    j = fd3Var.c;
                }
                j = this.g + 1;
                if (j2 < j) {
                    return;
                }
            }
            fd3 fd3Var2 = (fd3) this.c.get(this.f);
            if (fd3Var2 != null && fd3Var2.c == -1 && fd3Var2.b != tkVar.c) {
                return;
            }
        }
        fd3 c = c(tkVar.c, tkVar.d);
        if (this.f == null) {
            this.f = c.a;
        }
        rz6 rz6Var2 = tkVar.d;
        if (rz6Var2 != null && rz6Var2.c()) {
            rz6 rz6Var3 = tkVar.d;
            fd3 c2 = c(tkVar.c, new rz6(rz6Var3.a, rz6Var3.d, rz6Var3.b));
            if (!c2.e) {
                c2.e = true;
                tkVar.b.g(tkVar.d.a, this.b);
                this.b.d(tkVar.d.b);
                String str = hac.a;
                this.d.getClass();
            }
        }
        if (!c.e) {
            c.e = true;
            this.d.getClass();
        }
        if (c.a.equals(this.f) && !c.f) {
            c.f = true;
            this.d.o(tkVar, c.a);
        }
    }

    public final synchronized void g(tk tkVar, int i2) {
        this.d.getClass();
        boolean z = i2 == 0;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            fd3 fd3Var = (fd3) it.next();
            if (fd3Var.a(tkVar)) {
                it.remove();
                boolean equals = fd3Var.a.equals(this.f);
                if (equals) {
                    a(fd3Var);
                }
                if (fd3Var.e) {
                    if (z && equals) {
                        boolean z2 = fd3Var.f;
                    }
                    this.d.p(tkVar, fd3Var.a);
                }
            }
        }
        e(tkVar);
    }
}
