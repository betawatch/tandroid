package di;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n4 extends i71 {
    public final /* synthetic */ bb d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(bb bbVar, Context context, int i10, l4 l4Var, a1.c cVar, bi.b bVar) {
        super(context, i10, 0, false, l4Var, cVar, null, bVar, -1, 0);
        this.d3 = bbVar;
    }

    @Override // org.telegram.ui.Components.i71
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.d3.b, (Utilities.Callback<View>) new bi.o1(this, 11));
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        return 0;
    }
}
