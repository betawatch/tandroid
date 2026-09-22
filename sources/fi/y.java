package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
