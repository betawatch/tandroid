package eg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z1 extends mv {
    public final /* synthetic */ e2 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(e2 e2Var, y1 y1Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(y1Var, context, f6Var, arrayList);
        this.T = e2Var;
    }

    @Override // org.telegram.ui.Components.mv
    public final void Y() {
        this.T.dismiss();
    }
}
