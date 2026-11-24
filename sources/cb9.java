// default package

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cb9 extends yv1 {
    public boolean Gd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Hd;
    public final /* synthetic */ long Id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb9(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.Hd = tL_starGiftUnique;
        this.Id = j;
        this.Gd = false;
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Gd) {
            return;
        }
        this.Gd = true;
        u31 O = c41.b0(this).O(this.Hd.getDocument(), jb6.M0(2131752838, null), jb6.a0(null, null, 2131752839, pg3.r(this.currentAccount, this.Id)));
        O.s = false;
        O.j();
        uj4 uj4Var = this.J9;
        if (uj4Var != null) {
            uj4Var.c(true);
        }
    }
}
