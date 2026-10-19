package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
