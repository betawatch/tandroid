package kg;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ a1(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                i1Var.b.invalidate();
                i1Var.I0();
                break;
            default:
                i1 i1Var2 = this.b;
                i1Var2.b.invalidate();
                i1Var2.I0();
                break;
        }
    }
}
