package ai;

import android.os.Bundle;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gz;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f5 extends wm {
    public boolean sd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique td;
    public final /* synthetic */ long ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.td = tL_starGiftUnique;
        this.ud = j10;
        this.sd = false;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.sd) {
            return;
        }
        this.sd = true;
        ac O = fc.a0(this).O(this.td.getDocument(), bd.M0(2131752885, null), bd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(this.currentAccount, this.ud)));
        O.r = false;
        O.j();
        gz gzVar = this.G9;
        if (gzVar != null) {
            gzVar.c(true);
        }
    }
}
