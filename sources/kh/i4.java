package kh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r00;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i4 extends xn {
    public boolean Nc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Oc;
    public final /* synthetic */ long Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Oc = tL_starGiftUnique;
        this.Pc = j10;
        this.Nc = false;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc) {
            return;
        }
        this.Nc = true;
        ic O = qc.a0(this).O(this.Oc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Pc)));
        O.r = false;
        O.j();
        r00 r00Var = this.j9;
        if (r00Var != null) {
            r00Var.c(true);
        }
    }
}
