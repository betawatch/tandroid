package i2;

import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements e2.o, m4.e0, e2.j, wg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ v(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((m4.n1) obj).L(this.b, this.c);
                break;
            default:
                ((m4.n1) obj).t0(this.b, this.c);
                break;
        }
    }

    @Override // m4.e0
    public void e(m4.v vVar, int i10) {
        vVar.d(i10, this.b, this.c);
    }

    @Override // wg.c
    public int g(p6 p6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).M(this.b, this.c);
                break;
            default:
                ((b2.d1) obj).M(this.b, this.c);
                break;
        }
    }
}
