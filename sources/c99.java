// default package

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c99 extends mu1 {
    public boolean vd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique wd;
    public final /* synthetic */ long xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c99(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.wd = tL_starGiftUnique;
        this.xd = j;
        this.vd = false;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        m21 O = u21.b0(this).O(this.wd.getDocument(), k96.M0(2131752873, null), k96.a0(null, null, 2131752874, cf3.r(this.currentAccount, this.xd)));
        O.r = false;
        O.j();
        qh4 qh4Var = this.J9;
        if (qh4Var != null) {
            qh4Var.c(true);
        }
    }
}
