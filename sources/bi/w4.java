package bi;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
