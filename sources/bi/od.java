package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
