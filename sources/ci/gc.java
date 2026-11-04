package ci;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gc extends ProfileActivity {
    public final /* synthetic */ boolean V6;
    public final /* synthetic */ tc W6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(tc tcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.W6 = tcVar;
        this.V6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.V6) {
            return;
        }
        this.W6.show();
    }
}
