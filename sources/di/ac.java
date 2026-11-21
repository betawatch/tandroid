package di;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ac extends bn {
    public final /* synthetic */ boolean vd;
    public final /* synthetic */ mc wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.wd = mcVar;
        this.vd = z10;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.vd) {
            return;
        }
        this.wd.show();
    }
}
