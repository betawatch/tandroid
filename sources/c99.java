// default package

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c99 extends mu1 {
    public boolean wd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique xd;
    public final /* synthetic */ long yd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c99(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.xd = tL_starGiftUnique;
        this.yd = j;
        this.wd = false;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.wd) {
            return;
        }
        this.wd = true;
        m21 O = u21.b0(this).O(this.xd.getDocument(), k96.M0(2131752873, null), k96.a0(null, null, 2131752874, cf3.r(this.currentAccount, this.yd)));
        O.r = false;
        O.j();
        qh4 qh4Var = this.J9;
        if (qh4Var != null) {
            qh4Var.c(true);
        }
    }
}
