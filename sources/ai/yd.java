package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class yd extends ProfileActivity {
    public final /* synthetic */ boolean J6;
    public final /* synthetic */ me K6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(me meVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.K6 = meVar;
        this.J6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.J6) {
            return;
        }
        this.K6.show();
    }
}
