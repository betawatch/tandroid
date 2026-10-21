package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class xd extends ProfileActivity {
    public final /* synthetic */ boolean A6;
    public final /* synthetic */ le B6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(le leVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.B6 = leVar;
        this.A6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.A6) {
            return;
        }
        this.B6.show();
    }
}
