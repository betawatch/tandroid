package di;

import org.telegram.messenger.nr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements nr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.nr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                o0Var.getClass();
                o0Var.K0(cg.a.j(0L, i7 == 0 ? cg.b.a : cg.b.b), true, false, true);
                o0Var.s1.setText("");
                break;
            case 1:
                r0 r0Var = (r0) this.b;
                r0Var.getClass();
                r0Var.N0(cg.a.j(0L, i7 == 0 ? cg.b.a : cg.b.b), true, false, true);
                r0Var.r1.setText("");
                break;
            default:
                h5 h5Var = (h5) this.b;
                h5Var.getClass();
                h5Var.s = i7 == 0 ? cg.b.a : cg.b.b;
                h5Var.a(true);
                break;
        }
    }
}
