package ih;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i4 extends tn {
    public boolean Mc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Nc;
    public final /* synthetic */ long Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Nc = tL_starGiftUnique;
        this.Oc = j10;
        this.Mc = false;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        mc O = tc.a0(this).O(this.Nc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Oc)));
        O.r = false;
        O.j();
        n00 n00Var = this.i9;
        if (n00Var != null) {
            n00Var.c(true);
        }
    }
}
