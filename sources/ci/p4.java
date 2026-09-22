package ci;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e61;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class p4 extends e61 {
    public final /* synthetic */ fb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(fb fbVar, Context context, int i10, n4 n4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, n4Var, cVar, null, dVar, -1, 0);
        this.f3 = fbVar;
    }

    @Override // org.telegram.ui.Components.e61
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (e2.h) new ai.f3(this, 4));
    }

    @Override // org.telegram.ui.Components.ll0
    public final Integer W0(int i10) {
        return 0;
    }
}
