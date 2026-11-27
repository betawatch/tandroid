// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nc3 {
    public static final m40 h = new m40((byte) 2);
    public static final Random i = new Random();
    public vt6 d;
    public String f;
    public final zrb a = new zrb();
    public final xrb b = new xrb();
    public final HashMap c = new HashMap();
    public asb e = asb.a;
    public long g = -1;

    public final void a(mc3 mc3Var) {
        long j = mc3Var.c;
        if (j != -1 && mc3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(uj ujVar) {
        vt6 vt6Var;
        String str = this.f;
        if (str != null) {
            mc3 mc3Var = (mc3) this.c.get(str);
            mc3Var.getClass();
            a(mc3Var);
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            mc3 mc3Var2 = (mc3) it.next();
            it.remove();
            if (mc3Var2.e && (vt6Var = this.d) != null) {
                vt6Var.p(ujVar, mc3Var2.a);
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
    public final mc3 c(int i2, vz6 vz6Var) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        mc3 mc3Var = null;
        long j4 = Long.MAX_VALUE;
        for (mc3 mc3Var2 : hashMap.values()) {
            long j5 = mc3Var2.c;
            vz6 vz6Var2 = mc3Var2.d;
            if (j5 == -1 && i2 == mc3Var2.b && vz6Var != null) {
                long j6 = vz6Var.d;
                nc3 nc3Var = mc3Var2.g;
                j = -1;
                mc3 mc3Var3 = (mc3) nc3Var.c.get(nc3Var.f);
                if (mc3Var3 != null) {
                    j3 = mc3Var3.c;
                }
                j3 = nc3Var.g + 1;
                if (j6 >= j3) {
                    mc3Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (vz6Var != null) {
                long j7 = vz6Var.d;
                if (j7 != j) {
                    if (vz6Var2 == null) {
                        if (!vz6Var.c() && j7 == mc3Var2.c) {
                            j2 = mc3Var2.c;
                            if (j2 == j || j2 < j4) {
                                mc3Var = mc3Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = gcc.a;
                                if (mc3Var.d != null && vz6Var2 != null) {
                                    mc3Var = mc3Var2;
                                }
                            }
                        }
                    } else if (j7 == vz6Var2.d && vz6Var.b == vz6Var2.b && vz6Var.c == vz6Var2.c) {
                        j2 = mc3Var2.c;
                        if (j2 == j) {
                        }
                        mc3Var = mc3Var2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == mc3Var2.b) {
                j2 = mc3Var2.c;
                if (j2 == j) {
                }
                mc3Var = mc3Var2;
                j4 = j2;
            }
        }
        if (mc3Var != null) {
            return mc3Var;
        }
        String str2 = (String) h.get();
        mc3 mc3Var4 = new mc3(this, str2, i2, vz6Var);
        hashMap.put(str2, mc3Var4);
        return mc3Var4;
    }

    public final synchronized String d(asb asbVar, vz6 vz6Var) {
        return c(asbVar.g(vz6Var.a, this.b).c, vz6Var).a;
    }

    public final void e(uj ujVar) {
        vz6 vz6Var;
        asb asbVar = ujVar.b;
        int i2 = ujVar.c;
        vz6 vz6Var2 = ujVar.d;
        boolean p = asbVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                mc3 mc3Var = (mc3) hashMap.get(str);
                mc3Var.getClass();
                a(mc3Var);
                return;
            }
            return;
        }
        mc3 mc3Var2 = (mc3) hashMap.get(str);
        this.f = c(i2, vz6Var2).a;
        f(ujVar);
        if (vz6Var2 != null) {
            long j = vz6Var2.d;
            if (vz6Var2.c()) {
                if (mc3Var2 != null && mc3Var2.c == j && (vz6Var = mc3Var2.d) != null && vz6Var.b == vz6Var2.b && vz6Var.c == vz6Var2.c) {
                    return;
                }
                c(i2, new vz6(j, vz6Var2.a));
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
    public final synchronized void f(uj ujVar) {
        long j;
        this.d.getClass();
        if (ujVar.b.p()) {
            return;
        }
        vz6 vz6Var = ujVar.d;
        if (vz6Var != null) {
            long j2 = vz6Var.d;
            if (j2 != -1) {
                mc3 mc3Var = (mc3) this.c.get(this.f);
                if (mc3Var != null) {
                    j = mc3Var.c;
                }
                j = this.g + 1;
                if (j2 < j) {
                    return;
                }
            }
            mc3 mc3Var2 = (mc3) this.c.get(this.f);
            if (mc3Var2 != null && mc3Var2.c == -1 && mc3Var2.b != ujVar.c) {
                return;
            }
        }
        mc3 c = c(ujVar.c, ujVar.d);
        if (this.f == null) {
            this.f = c.a;
        }
        vz6 vz6Var2 = ujVar.d;
        if (vz6Var2 != null && vz6Var2.c()) {
            vz6 vz6Var3 = ujVar.d;
            mc3 c2 = c(ujVar.c, new vz6(vz6Var3.a, vz6Var3.d, vz6Var3.b));
            if (!c2.e) {
                c2.e = true;
                ujVar.b.g(ujVar.d.a, this.b);
                this.b.d(ujVar.d.b);
                String str = gcc.a;
                this.d.getClass();
            }
        }
        if (!c.e) {
            c.e = true;
            this.d.getClass();
        }
        if (c.a.equals(this.f) && !c.f) {
            c.f = true;
            this.d.o(ujVar, c.a);
        }
    }

    public final synchronized void g(uj ujVar, int i2) {
        this.d.getClass();
        boolean z = i2 == 0;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            mc3 mc3Var = (mc3) it.next();
            if (mc3Var.a(ujVar)) {
                it.remove();
                boolean equals = mc3Var.a.equals(this.f);
                if (equals) {
                    a(mc3Var);
                }
                if (mc3Var.e) {
                    if (z && equals) {
                        boolean z2 = mc3Var.f;
                    }
                    this.d.p(ujVar, mc3Var.a);
                }
            }
        }
        e(ujVar);
    }
}
