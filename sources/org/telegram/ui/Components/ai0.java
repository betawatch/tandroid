package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements qc0, sc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi0 b;

    public /* synthetic */ ai0(fi0 fi0Var, int i10) {
        this.a = i10;
        this.b = fi0Var;
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        int i11 = this.a;
        fi0 fi0Var = this.b;
        switch (i11) {
            case 0:
                return fi0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!fi0Var.O) {
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
                return hg.k0.i(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.sc0
    public void q(uc0 uc0Var, int i10) {
        fi0 fi0Var = this.b;
        try {
            fi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        fi0Var.c(true);
    }
}
