package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vb extends ProfileActivity {
    public final /* synthetic */ boolean Z6;
    public final /* synthetic */ ic a7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(ic icVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.a7 = icVar;
        this.Z6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Z6) {
            return;
        }
        this.a7.show();
    }
}
