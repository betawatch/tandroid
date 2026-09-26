package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements ad0, cd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi0 b;

    public /* synthetic */ ki0(pi0 pi0Var, int i10) {
        this.a = i10;
        this.b = pi0Var;
    }

    @Override // org.telegram.ui.Components.ad0
    public String j(int i10) {
        int i11 = this.a;
        pi0 pi0Var = this.b;
        switch (i11) {
            case 0:
                return pi0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!pi0Var.O) {
                    if (i10 == 1) {
                        return LocaleController.formatString("MetersShort", R.string.MetersShort, 50);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, Integer.valueOf(i10 * 100));
                }
                if (i10 == 1) {
                    return LocaleController.formatString("FootsShort", R.string.FootsShort, Integer.valueOf(MediaDataController.MAX_LINKS_COUNT));
                }
                if (i10 > 1) {
                    i10--;
                }
                Locale locale = Locale.US;
                return hg.c.h(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.cd0
    public void q(ed0 ed0Var, int i10) {
        pi0 pi0Var = this.b;
        try {
            pi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        pi0Var.c(true);
    }
}
