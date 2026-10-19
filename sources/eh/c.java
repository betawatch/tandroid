package eh;

import b2.d1;
import e2.j;
import e2.o;
import m4.e0;
import m4.m1;
import m4.u;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, o, e0, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((m1) obj).L(this.b, this.c);
                break;
            default:
                ((m1) obj).s0(this.b, this.c);
                break;
        }
    }

    @Override // m4.e0
    public void b(u uVar, int i10) {
        uVar.d(i10, this.b, this.c);
    }

    @Override // eh.d
    public int f(d6 d6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((d1) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((d1) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
