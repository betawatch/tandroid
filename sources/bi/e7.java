package bi;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.uz;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e7 extends bn {
    public boolean vd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique wd;
    public final /* synthetic */ long xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
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
