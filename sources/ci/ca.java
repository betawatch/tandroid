package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class ca extends rg.s0 {
    public final /* synthetic */ da Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(da daVar, Context context, float f7) {
        super(context, f7);
        this.Q = daVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
