package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements kd0, md0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj0 b;

    public /* synthetic */ vi0(aj0 aj0Var, int i10) {
        this.a = i10;
        this.b = aj0Var;
    }

    @Override // org.telegram.ui.Components.kd0
    public String e(int i10) {
        int i11 = this.a;
        aj0 aj0Var = this.b;
        switch (i11) {
            case 0:
                return aj0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!aj0Var.O) {
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
                return i2.d.j(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.md0
    public void q(od0 od0Var, int i10) {
        aj0 aj0Var = this.b;
        try {
            aj0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        aj0Var.c(true);
    }
}
