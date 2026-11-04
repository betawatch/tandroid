package hh;

import d2.c1;
import g2.k;
import g2.p;
import o4.d0;
import o4.l1;
import o4.u;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, p, d0, k {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i3, int i10, int i11) {
        this.a = i11;
        this.b = i3;
        this.c = i10;
    }

    @Override // g2.k
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((l1) obj).K(this.b, this.c);
                break;
            default:
                ((l1) obj).q0(this.b, this.c);
                break;
        }
    }

    @Override // o4.d0
    public void d(u uVar, int i3) {
        uVar.c(i3, this.b, this.c);
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((c1) obj).J(this.b, this.c);
                break;
            default:
                ((c1) obj).J(this.b, this.c);
                break;
        }
    }

    @Override // hh.d
    public int j(e6 e6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }
}
