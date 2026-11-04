package ci;

import android.os.Bundle;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hc extends wm {
    public final /* synthetic */ boolean sd;
    public final /* synthetic */ tc td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(tc tcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.td = tcVar;
        this.sd = z10;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.sd) {
            return;
        }
        this.td.show();
    }
}
