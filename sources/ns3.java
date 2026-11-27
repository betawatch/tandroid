// default package

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ns3 implements av3 {
    public final /* synthetic */ byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public ns3(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new x1c[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // av3
    public final void b(ey7 ey7Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (ey7Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (ey7Var.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (ey7Var.a() == 0) {
                            z = false;
                        } else {
                            if (ey7Var.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = ey7Var.b;
                    int a = ey7Var.a();
                    for (x1c x1cVar : (x1c[]) this.g) {
                        ey7Var.N(i);
                        x1cVar.e(a, ey7Var);
                    }
                    this.e += a;
                    break;
                }
                break;
            default:
                ey7 ey7Var2 = (ey7) this.f;
                ((x1c) this.g).getClass();
                if (this.b) {
                    int a2 = ey7Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(ey7Var.a, ey7Var.b, ey7Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            ey7Var2.N(0);
                            if (73 != ey7Var2.A() || 68 != ey7Var2.A() || 51 != ey7Var2.A()) {
                                efd.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                ey7Var2.O(3);
                                this.d = ey7Var2.z() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((x1c) this.g).e(min2, ey7Var);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // av3
    public final void d() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // av3
    public final void e() {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    yve.p(this.c != -9223372036854775807L);
                    for (x1c x1cVar : (x1c[]) this.g) {
                        x1cVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((x1c) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    yve.p(this.c != -9223372036854775807L);
                    ((x1c) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // av3
    public final void f() {
        byte b = this.a;
    }

    @Override // av3
    public final void g(int i, long j) {
        int i2 = i & 4;
        switch (this.a) {
            case 0:
                if (i2 != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        switch (this.a) {
            case 0:
                x1c[] x1cVarArr = (x1c[]) this.g;
                for (int i = 0; i < x1cVarArr.length; i++) {
                    k6c k6cVar = (k6c) ((List) this.f).get(i);
                    l6cVar.a();
                    l6cVar.b();
                    x1c e0 = g84Var.e0(l6cVar.d, 3);
                    jo4 jo4Var = new jo4();
                    l6cVar.b();
                    jo4Var.a = l6cVar.e;
                    jo4Var.r = dg7.n("video/mp2t");
                    jo4Var.s = dg7.n("application/dvbsubs");
                    jo4Var.v = Collections.singletonList(k6cVar.b);
                    jo4Var.d = k6cVar.a;
                    xnb.v(jo4Var, e0);
                    x1cVarArr[i] = e0;
                }
                break;
            default:
                l6cVar.a();
                l6cVar.b();
                x1c e02 = g84Var.e0(l6cVar.d, 5);
                this.g = e02;
                jo4 jo4Var2 = new jo4();
                l6cVar.b();
                jo4Var2.a = l6cVar.e;
                jo4Var2.r = dg7.n("video/mp2t");
                jo4Var2.s = dg7.n("application/id3");
                xnb.v(jo4Var2, e02);
                break;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    public ns3() {
        this.a = (byte) 1;
        this.f = new ey7(10);
        this.c = -9223372036854775807L;
    }
}
