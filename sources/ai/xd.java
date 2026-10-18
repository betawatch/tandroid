package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
