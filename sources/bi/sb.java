package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class sb extends rg.u0 {
    public final /* synthetic */ tb Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(tb tbVar, Context context, float f7) {
        super(context, f7);
        this.Q = tbVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
