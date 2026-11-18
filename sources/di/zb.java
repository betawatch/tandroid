package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.b7) {
            return;
        }
        this.c7.show();
    }
}
