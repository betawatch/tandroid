package jh;

import android.os.Bundle;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class sa extends tn {
    public final /* synthetic */ boolean Mc;
    public final /* synthetic */ db Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(db dbVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Nc = dbVar;
        this.Mc = z10;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Mc) {
            return;
        }
        this.Nc.show();
    }
}
