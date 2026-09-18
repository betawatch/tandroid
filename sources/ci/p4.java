package ci;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class p4 extends f61 {
    public final /* synthetic */ fb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, n4Var, cVar, null, dVar, -1, 0);
        this.f3 = fbVar;
    }

    @Override // org.telegram.ui.Components.f61
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (e2.h) new ai.f3(this, 4));
    }

    @Override // org.telegram.ui.Components.ml0
    public final Integer X0(int i10) {
        return 0;
    }
}
