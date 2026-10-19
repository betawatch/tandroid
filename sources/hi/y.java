package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class y extends s4.r0 {
    public final /* synthetic */ k0 a;

    public y(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.a;
        if (k0Var.G.I1) {
            AndroidUtilities.hideKeyboard(k0Var.E.r);
        }
    }
}
