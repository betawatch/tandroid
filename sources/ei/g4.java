package ei;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c71;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class g4 extends c71 {
    public final /* synthetic */ ma d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(ma maVar, Context context, int i10, f4 f4Var, e1.c cVar, ci.b bVar) {
        super(context, i10, 0, false, f4Var, cVar, null, bVar, -1, 0);
        this.d3 = maVar;
    }

    @Override // org.telegram.ui.Components.c71
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.d3.b, (Utilities.Callback<View>) new ai.r0(this, 17));
    }

    @Override // org.telegram.ui.Components.jm0
    public final Integer W0(int i10) {
        return 0;
    }
}
