package bi;

import android.os.Bundle;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
