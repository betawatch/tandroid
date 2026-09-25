package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class o4 extends r61 {
    public final /* synthetic */ cb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(cb cbVar, Context context, int i10, m4 m4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, m4Var, cVar, null, dVar, -1, 0);
        this.f3 = cbVar;
    }

    @Override // org.telegram.ui.Components.r61
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override // org.telegram.ui.Components.wl0
    public final Integer W0(int i10) {
        return 0;
    }
}
