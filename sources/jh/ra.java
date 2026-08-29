package jh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ra extends ProfileActivity {
    public final /* synthetic */ boolean s6;
    public final /* synthetic */ db t6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(db dbVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.t6 = dbVar;
        this.s6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s6) {
            return;
        }
        this.t6.show();
    }
}
