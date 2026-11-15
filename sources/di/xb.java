package di;

import android.os.Bundle;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xb extends an {
    public final /* synthetic */ boolean ud;
    public final /* synthetic */ jc vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(jc jcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.vd = jcVar;
        this.ud = z10;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.ud) {
            return;
        }
        this.vd.show();
    }
}
