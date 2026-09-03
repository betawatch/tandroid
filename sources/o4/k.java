package o4;

import j3.m2;
import j3.n2;
import j3.o2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k extends h {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o2 o2Var, int i10) {
        super(o2Var);
        this.c = i10;
    }

    @Override // o4.h, j3.o2
    public int e(int i10, int i11, boolean z4) {
        switch (this.c) {
            case 0:
                o2 o2Var = this.b;
                int e6 = o2Var.e(i10, i11, z4);
                return e6 == -1 ? o2Var.a(z4) : e6;
            default:
                return super.e(i10, i11, z4);
        }
    }

    @Override // o4.h, j3.o2
    public m2 f(int i10, m2 m2Var, boolean z4) {
        switch (this.c) {
            case 1:
                super.f(i10, m2Var, z4);
                m2Var.f = true;
                return m2Var;
            default:
                return super.f(i10, m2Var, z4);
        }
    }

    @Override // o4.h, j3.o2
    public int k(int i10, int i11, boolean z4) {
        switch (this.c) {
            case 0:
                o2 o2Var = this.b;
                int k10 = o2Var.k(i10, i11, z4);
                return k10 == -1 ? o2Var.c(z4) : k10;
            default:
                return super.k(i10, i11, z4);
        }
    }

    @Override // o4.h, j3.o2
    public n2 m(int i10, n2 n2Var, long j10) {
        switch (this.c) {
            case 1:
                super.m(i10, n2Var, j10);
                n2Var.w = true;
                return n2Var;
            default:
                return super.m(i10, n2Var, j10);
        }
    }
}
