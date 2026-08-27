package gh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p4 extends rn {
    public boolean Mc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Nc;
    public final /* synthetic */ long Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Nc = tL_starGiftUnique;
        this.Oc = j10;
        this.Mc = false;
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        ec O = mc.a0(this).O(this.Nc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Oc)));
        O.r = false;
        O.j();
        f00 f00Var = this.i9;
        if (f00Var != null) {
            f00Var.c(true);
        }
    }
}
