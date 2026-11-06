package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class od extends ProfileActivity {
    public final /* synthetic */ boolean U6;
    public final /* synthetic */ ce V6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle, null);
        this.V6 = ceVar;
        this.U6 = z9;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.U6) {
            return;
        }
        this.V6.show();
    }
}
