package gh;

import e2.a1;
import h2.j;
import h2.o;
import org.telegram.ui.ActionBar.i6;
import p4.c0;
import p4.i1;
import p4.u;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                ((i1) obj).M(this.b, this.c);
                break;
            default:
                ((i1) obj).t0(this.b, this.c);
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
    public int j(i6 i6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }
}
