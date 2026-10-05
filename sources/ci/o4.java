package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class o4 extends e71 {
    public final /* synthetic */ bb m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(bb bbVar, Context context, int i10, m4 m4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, m4Var, cVar, null, dVar, -1, 0);
        this.m3 = bbVar;
    }

    @Override // org.telegram.ui.Components.e71
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.m3.b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override // org.telegram.ui.Components.zl0
    public final Integer W0(int i10) {
        return 0;
    }
}
