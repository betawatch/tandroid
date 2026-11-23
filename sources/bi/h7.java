package bi;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wz;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h7 extends bn {
    public boolean vd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique wd;
    public final /* synthetic */ long xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.wd = tL_starGiftUnique;
        this.xd = j3;
        this.vd = false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        gc O = lc.b0(this).O(this.wd.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(this.currentAccount, this.xd)));
        O.r = false;
        O.j();
        wz wzVar = this.J9;
        if (wzVar != null) {
            wzVar.c(true);
        }
    }
}
