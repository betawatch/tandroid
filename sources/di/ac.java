package di;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
