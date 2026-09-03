package kh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h4 extends zn {
    public boolean Nc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Oc;
    public final /* synthetic */ long Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Oc = tL_starGiftUnique;
        this.Pc = j10;
        this.Nc = false;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc) {
            return;
        }
        this.Nc = true;
        ic O = qc.a0(this).O(this.Oc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Pc)));
        O.r = false;
        O.j();
        s00 s00Var = this.j9;
        if (s00Var != null) {
            s00Var.c(true);
        }
    }
}
