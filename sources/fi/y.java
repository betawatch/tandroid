package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class y extends s4.s0 {
    public final /* synthetic */ k0 a;

    public y(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.a;
        if (k0Var.G.K1) {
            AndroidUtilities.hideKeyboard(k0Var.E.r);
        }
    }
}
