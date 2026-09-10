package bi;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k5 extends r61 {
    public final /* synthetic */ oc f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(oc ocVar, Context context, int i10, h5 h5Var, a1.c cVar, zh.b bVar) {
        super(context, i10, 0, false, h5Var, cVar, null, bVar, -1, 0);
        this.f3 = ocVar;
    }

    @Override // org.telegram.ui.Components.r61
    public final void G1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (e2.h) new i5(this, 1));
    }

    @Override // org.telegram.ui.Components.vl0
    public final Integer V0(int i10) {
        return 0;
    }
}
