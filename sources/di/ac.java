package di;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.vd) {
            return;
        }
        this.wd.show();
    }
}
