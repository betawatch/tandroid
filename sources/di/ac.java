package di;

import android.os.Bundle;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
