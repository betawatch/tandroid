package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj0 implements qd0, sd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj0 b;

    public /* synthetic */ aj0(fj0 fj0Var, int i10) {
        this.a = i10;
        this.b = fj0Var;
    }

    @Override // org.telegram.ui.Components.qd0
    public String e(int i10) {
        int i11 = this.a;
        fj0 fj0Var = this.b;
        switch (i11) {
            case 0:
                return fj0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!fj0Var.O) {
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
                return i2.d.i(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.sd0
    public void r(ud0 ud0Var, int i10) {
        fj0 fj0Var = this.b;
        try {
            fj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        fj0Var.c(true);
    }
}
