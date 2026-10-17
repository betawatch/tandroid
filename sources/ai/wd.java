package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class wd extends ProfileActivity {
    public final /* synthetic */ boolean y6;
    public final /* synthetic */ ke z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(ke keVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.z6 = keVar;
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
