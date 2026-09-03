package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi0 implements tc0, vc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ hi0(mi0 mi0Var, int i10) {
        this.a = i10;
        this.b = mi0Var;
    }

    @Override // org.telegram.ui.Components.tc0
    public String e(int i10) {
        int i11 = this.a;
        mi0 mi0Var = this.b;
        switch (i11) {
            case 0:
                return mi0Var.L ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!mi0Var.L) {
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
                return kf.k0.j(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.vc0
    public void q(xc0 xc0Var, int i10) {
        mi0 mi0Var = this.b;
        try {
            mi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        mi0Var.c(true);
    }
}
