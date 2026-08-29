package nh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b4 extends u51 {
    public final /* synthetic */ y9 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(y9 y9Var, Context context, int i10, a4 a4Var, l4.s0 s0Var, lh.b bVar) {
        super(context, i10, 0, false, a4Var, s0Var, null, bVar, -1, 0);
        this.b3 = y9Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.b3.b, (f5.d) new kg.i(this, 5));
    }

    @Override // org.telegram.ui.Components.jl0
    public final Integer W0(int i10) {
        return 0;
    }
}
