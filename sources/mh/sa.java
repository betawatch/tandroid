package mh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
