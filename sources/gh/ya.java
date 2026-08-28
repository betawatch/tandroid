package gh;

import android.os.Bundle;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ya extends qn {
    public final /* synthetic */ boolean Mc;
    public final /* synthetic */ jb Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(jb jbVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Nc = jbVar;
        this.Mc = z10;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Mc) {
            return;
        }
        this.Nc.show();
    }
}
