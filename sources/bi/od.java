package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class od extends ProfileActivity {
    public final /* synthetic */ boolean X6;
    public final /* synthetic */ ce Y6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle, null);
        this.Y6 = ceVar;
        this.X6 = z9;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.X6) {
            return;
        }
        this.Y6.show();
    }
}
