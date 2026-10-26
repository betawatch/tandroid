package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class od extends ProfileActivity {
    public final /* synthetic */ boolean S6;
    public final /* synthetic */ be T6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(be beVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.T6 = beVar;
        this.S6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.S6) {
            return;
        }
        this.T6.show();
    }
}
