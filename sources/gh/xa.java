package gh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class xa extends ProfileActivity {
    public final /* synthetic */ boolean s6;
    public final /* synthetic */ jb t6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(jb jbVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.t6 = jbVar;
        this.s6 = z10;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s6) {
            return;
        }
        this.t6.show();
    }
}
