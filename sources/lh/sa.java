package lh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class sa extends ProfileActivity {
    public final /* synthetic */ boolean t6;
    public final /* synthetic */ eb u6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(eb ebVar, Bundle bundle, boolean z4) {
        super(bundle, null);
        this.u6 = ebVar;
        this.t6 = z4;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.t6) {
            return;
        }
        this.u6.show();
    }
}
