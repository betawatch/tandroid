package hi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new r());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((s) view).a((TL_agent.agentProvider) u61Var.G, null, false, u61Var.e, u61Var.z == 1, z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new s(context, i10, u6Var);
    }
}
