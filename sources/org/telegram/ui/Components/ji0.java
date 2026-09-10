package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji0 implements zc0, bd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;

    public /* synthetic */ ji0(oi0 oi0Var, int i10) {
        this.a = i10;
        this.b = oi0Var;
    }

    @Override // org.telegram.ui.Components.zc0
    public String k(int i10) {
        int i11 = this.a;
        oi0 oi0Var = this.b;
        switch (i11) {
            case 0:
                return oi0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!oi0Var.O) {
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
                return hc.b.j(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.bd0
    public void q(dd0 dd0Var, int i10) {
        oi0 oi0Var = this.b;
        try {
            oi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        oi0Var.c(true);
    }
}
