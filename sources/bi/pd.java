package bi;

import android.os.Bundle;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pd extends an {
    public final /* synthetic */ boolean rd;
    public final /* synthetic */ ce sd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle);
        this.sd = ceVar;
        this.rd = z9;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.rd) {
            return;
        }
        this.sd.show();
    }
}
