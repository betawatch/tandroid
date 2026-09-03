package b4;

import j3.m0;
import j3.n0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h implements i {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public h(List list) {
        this.a = 0;
        this.f = list;
        this.g = new r3.v[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // b4.i
    public final void a(h5.w wVar) {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (wVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (wVar.u() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z10 = this.b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.d == 1) {
                        if (wVar.a() == 0) {
                            z4 = false;
                        } else {
                            if (wVar.u() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z4 = this.b;
                        }
                        if (!z4) {
                        }
                    }
                    int i10 = wVar.b;
                    int a2 = wVar.a();
                    for (r3.v vVar : (r3.v[]) this.g) {
                        wVar.F(i10);
                        vVar.d(a2, wVar);
                    }
                    this.e += a2;
                    break;
                }
                break;
            default:
                h5.w wVar2 = (h5.w) this.f;
                h5.a.j((r3.v) this.g);
                if (this.b) {
                    int a10 = wVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(wVar.a, wVar.b, wVar2.a, this.e, min);
                        if (this.e + min == 10) {
                            wVar2.F(0);
                            if (73 != wVar2.u() || 68 != wVar2.u() || 51 != wVar2.u()) {
                                h5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                wVar2.G(3);
                                this.d = wVar2.t() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((r3.v) this.g).d(min2, wVar);
                    this.e += min2;
                    break;
                }
                break;
        }
    }

    @Override // b4.i
    public final void b() {
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

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        switch (this.a) {
            case 0:
                r3.v[] vVarArr = (r3.v[]) this.g;
                for (int i10 = 0; i10 < vVarArr.length; i10++) {
                    g0 g0Var = (g0) ((List) this.f).get(i10);
                    h0Var.a();
                    h0Var.b();
                    r3.v d22 = mVar.d2(h0Var.d, 3);
                    m0 m0Var = new m0();
                    h0Var.b();
                    m0Var.a = h0Var.e;
                    m0Var.o = "application/dvbsubs";
                    m0Var.q = Collections.singletonList(g0Var.b);
                    m0Var.c = g0Var.a;
                    d22.b(new n0(m0Var));
                    vVarArr[i10] = d22;
                }
                break;
            default:
                h0Var.a();
                h0Var.b();
                r3.v d23 = mVar.d2(h0Var.d, 5);
                this.g = d23;
                m0 m0Var2 = new m0();
                h0Var.b();
                m0Var2.a = h0Var.e;
                m0Var2.o = "application/id3";
                d23.b(new n0(m0Var2));
                break;
        }
    }

    @Override // b4.i
    public final void d() {
        int i10;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c != -9223372036854775807L) {
                        for (r3.v vVar : (r3.v[]) this.g) {
                            vVar.c(this.c, 1, this.e, 0, null);
                        }
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                h5.a.j((r3.v) this.g);
                if (this.b && (i10 = this.d) != 0 && this.e == i10) {
                    long j10 = this.c;
                    if (j10 != -9223372036854775807L) {
                        ((r3.v) this.g).c(j10, 1, i10, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        switch (this.a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    if (j10 != -9223372036854775807L) {
                        this.c = j10;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.b = true;
                    if (j10 != -9223372036854775807L) {
                        this.c = j10;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public h() {
        this.a = 1;
        this.f = new h5.w(10);
        this.c = -9223372036854775807L;
    }
}
