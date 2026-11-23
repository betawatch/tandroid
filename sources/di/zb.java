package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zb extends ProfileActivity {
    public final /* synthetic */ boolean b7;
    public final /* synthetic */ mc c7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.c7 = mcVar;
        this.b7 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.b7) {
            return;
        }
        this.c7.show();
    }
}
