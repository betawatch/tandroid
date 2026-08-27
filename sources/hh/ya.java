package hh;

import android.os.Bundle;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ya extends rn {
    public final /* synthetic */ boolean Mc;
    public final /* synthetic */ jb Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(jb jbVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Nc = jbVar;
        this.Mc = z10;
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Mc) {
            return;
        }
        this.Nc.show();
    }
}
