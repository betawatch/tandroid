package bi;

import android.os.Bundle;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class pd extends wn {
    public final /* synthetic */ boolean od;
    public final /* synthetic */ be pd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(be beVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.pd = beVar;
        this.od = z10;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.od) {
            return;
        }
        this.pd.show();
    }
}
