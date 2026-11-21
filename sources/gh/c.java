package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.h6;
import p4.d0;
import p4.i1;
import p4.u;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, o, d0, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i7, int i10, int i11) {
        this.a = i11;
        this.b = i7;
        this.c = i10;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((i1) obj).M(this.b, this.c);
                break;
            default:
                ((i1) obj).t0(this.b, this.c);
                break;
        }
    }

    @Override // p4.d0
    public void b(u uVar, int i7) {
        uVar.d(i7, this.b, this.c);
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((a1) obj).J(this.b, this.c);
                break;
            default:
                ((a1) obj).J(this.b, this.c);
                break;
        }
    }

    @Override // gh.d
    public int j(h6 h6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }
}
