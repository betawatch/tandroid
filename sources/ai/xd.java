package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class xd extends ProfileActivity {
    public final /* synthetic */ boolean y6;
    public final /* synthetic */ le z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(le leVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.z6 = leVar;
        this.y6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y6) {
            return;
        }
        this.z6.show();
    }
}
