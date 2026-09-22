package ci;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class p4 extends u61 {
    public final /* synthetic */ fb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, n4Var, cVar, null, dVar, -1, 0);
        this.f3 = fbVar;
    }

    @Override // org.telegram.ui.Components.u61
    public final void I1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (e2.h) new ai.f3(this, 4));
    }

    @Override // org.telegram.ui.Components.yl0
    public final Integer X0(int i10) {
        return 0;
    }
}
