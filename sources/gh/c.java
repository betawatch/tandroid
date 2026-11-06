package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.f6;
import p4.c0;
import p4.g1;
import p4.u;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, o, c0, j {
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
                ((g1) obj).M(this.b, this.c);
                break;
            default:
                ((g1) obj).t0(this.b, this.c);
                break;
        }
    }

    @Override // p4.c0
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
    public int k(f6 f6Var, boolean z9) {
        return z9 ? this.b : this.c;
    }
}
