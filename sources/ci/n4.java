package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n4 extends k71 {
    public final /* synthetic */ cb d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(cb cbVar, Context context, int i10, l4 l4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, l4Var, cVar, null, dVar, -1, 0);
        this.d3 = cbVar;
    }

    @Override // org.telegram.ui.Components.k71
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.d3.b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override // org.telegram.ui.Components.qm0
    public final Integer W0(int i10) {
        return 0;
    }
}
