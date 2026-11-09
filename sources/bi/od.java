package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
