package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi0 implements md0, od0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;

    public /* synthetic */ zi0(ej0 ej0Var, int i10) {
        this.a = i10;
        this.b = ej0Var;
    }

    @Override // org.telegram.ui.Components.md0
    public String e(int i10) {
        int i11 = this.a;
        ej0 ej0Var = this.b;
        switch (i11) {
            case 0:
                return ej0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!ej0Var.O) {
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
                return i2.o1.k(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.od0
    public void n(qd0 qd0Var, int i10) {
        ej0 ej0Var = this.b;
        try {
            ej0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ej0Var.c(true);
    }
}
