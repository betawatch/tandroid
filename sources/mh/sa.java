package mh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
