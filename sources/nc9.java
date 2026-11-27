// default package

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nc9 extends zu1 {
    public boolean Jd;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Kd;
    public final /* synthetic */ long Ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc9(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(bundle);
        this.Kd = tL_starGiftUnique;
        this.Ld = j;
        this.Jd = false;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Jd) {
            return;
        }
        this.Jd = true;
        v21 O = d31.b0(this).O(this.Kd.getDocument(), ob6.M0(2131752866, null), ob6.a0(null, null, 2131752867, wf3.r(this.currentAccount, this.Ld)));
        O.s = false;
        O.j();
        tj4 tj4Var = this.J9;
        if (tj4Var != null) {
            tj4Var.c(true);
        }
    }
}
