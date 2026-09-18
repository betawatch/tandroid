package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
