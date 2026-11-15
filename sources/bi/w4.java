package bi;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w4 extends an {
    public boolean ud;
    public final /* synthetic */ TL_stars.TL_starGiftUnique vd;
    public final /* synthetic */ long wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.vd = tL_starGiftUnique;
        this.wd = j3;
        this.ud = false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ud) {
            return;
        }
        this.ud = true;
        xb O = cc.a0(this).O(this.vd.getDocument(), hd.M0(2131752885, null), hd.a0(null, null, 2131752886, org.telegram.messenger.m5.s(this.currentAccount, this.wd)));
        O.r = false;
        O.j();
        nz nzVar = this.I9;
        if (nzVar != null) {
            nzVar.c(true);
        }
    }
}
