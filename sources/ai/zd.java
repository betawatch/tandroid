package ai;

import android.os.Bundle;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class zd extends sn {
    public final /* synthetic */ boolean ed;
    public final /* synthetic */ me fd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(me meVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.fd = meVar;
        this.ed = z10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.ed) {
            return;
        }
        this.fd.show();
    }
}
