package fi;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v2 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ v2(f3 f3Var, int i7) {
        this.a = i7;
        this.b = f3Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                f3Var.getClass();
                f3Var.invalidate();
                break;
            default:
                f3 f3Var2 = this.b;
                if (f3Var2.n.I1 && (r0Var = f3Var2.G) != null && r0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(f3Var2.G.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
