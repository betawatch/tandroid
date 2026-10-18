package ai;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class yd extends sn {
    public final /* synthetic */ boolean Qc;
    public final /* synthetic */ le Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(le leVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = leVar;
        this.Qc = z10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Qc) {
            return;
        }
        this.Rc.show();
    }
}
