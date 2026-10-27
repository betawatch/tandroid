package fh;

import b2.e1;
import e2.j;
import e2.o;
import m4.e0;
import m4.n1;
import m4.v;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
                ((n1) obj).L(this.b, this.c);
                break;
            default:
                ((n1) obj).s0(this.b, this.c);
                break;
        }
    }

    @Override // m4.e0
    public void d(v vVar, int i10) {
        vVar.d(i10, this.b, this.c);
    }

    @Override // fh.d
    public int i(u6 u6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((e1) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((e1) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
