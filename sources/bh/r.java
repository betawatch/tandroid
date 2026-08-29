package bh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.v41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new r());
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        p00 p00Var = new p00(context, null);
        p00Var.setViewType(16);
        p00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return p00Var;
    }
}
