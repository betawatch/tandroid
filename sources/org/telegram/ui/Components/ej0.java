package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej0 implements qd0, sd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj0 b;

    public /* synthetic */ ej0(jj0 jj0Var, int i10) {
        this.a = i10;
        this.b = jj0Var;
    }

    @Override // org.telegram.ui.Components.qd0
    public String i(int i10) {
        int i11 = this.a;
        jj0 jj0Var = this.b;
        switch (i11) {
            case 0:
                return jj0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!jj0Var.O) {
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

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        jj0 jj0Var = this.b;
        try {
            jj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        jj0Var.c(true);
    }
}
