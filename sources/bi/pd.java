package bi;

import android.os.Bundle;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pd extends cn {
    public final /* synthetic */ boolean td;
    public final /* synthetic */ ce ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle);
        this.ud = ceVar;
        this.td = z9;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.td) {
            return;
        }
        this.ud.show();
    }
}
