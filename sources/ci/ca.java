package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
