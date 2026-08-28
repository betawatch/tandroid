package fh;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v4 extends qn {
    public boolean Mc;
    public final /* synthetic */ TL_stars.TL_starGiftUnique Nc;
    public final /* synthetic */ long Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(Bundle bundle, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(bundle);
        this.Nc = tL_starGiftUnique;
        this.Oc = j10;
        this.Mc = false;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        gc O = oc.a0(this).O(this.Nc.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, this.Oc)));
        O.r = false;
        O.j();
        c00 c00Var = this.i9;
        if (c00Var != null) {
            c00Var.c(true);
        }
    }
}
