package bi;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.uz;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f7 extends bn {
    public boolean vd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique wd;
    public final /* synthetic */ long xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(bundle);
        this.wd = tL_starGiftUnique;
        this.xd = j3;
        this.vd = false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.vd) {
            return;
        }
        this.vd = true;
        gc O = lc.b0(this).O(this.wd.getDocument(), gd.M0(2131752874, null), gd.a0(null, null, 2131752875, org.telegram.messenger.n5.s(this.currentAccount, this.xd)));
        O.r = false;
        O.j();
        uz uzVar = this.J9;
        if (uzVar != null) {
            uzVar.c(true);
        }
    }
}
