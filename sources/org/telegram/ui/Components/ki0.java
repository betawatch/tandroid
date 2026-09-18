package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements zc0, bd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi0 b;

    public /* synthetic */ ki0(pi0 pi0Var, int i10) {
        this.a = i10;
        this.b = pi0Var;
    }

    @Override // org.telegram.ui.Components.zc0
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
                return hg.k0.h(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        pi0 pi0Var = this.b;
        try {
            pi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        pi0Var.c(true);
    }
}
