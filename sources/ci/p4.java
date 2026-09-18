package ci;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class p4 extends t61 {
    public final /* synthetic */ fb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, n4Var, cVar, null, dVar, -1, 0);
        this.f3 = fbVar;
    }

    @Override // org.telegram.ui.Components.t61
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (e2.h) new ai.f3(this, 4));
    }

    @Override // org.telegram.ui.Components.wl0
    public final Integer X0(int i10) {
        return 0;
    }
}
