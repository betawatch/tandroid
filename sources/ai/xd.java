package ai;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class xd extends sn {
    public final /* synthetic */ boolean Qc;
    public final /* synthetic */ ke Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(ke keVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = keVar;
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
