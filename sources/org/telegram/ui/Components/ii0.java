package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements uc0, wc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;

    public /* synthetic */ ii0(ni0 ni0Var, int i10) {
        this.a = i10;
        this.b = ni0Var;
    }

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        int i11 = this.a;
        ni0 ni0Var = this.b;
        switch (i11) {
            case 0:
                return ni0Var.L ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!ni0Var.L) {
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
                return l.d.j(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.wc0
    public void q(yc0 yc0Var, int i10) {
        ni0 ni0Var = this.b;
        try {
            ni0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ni0Var.c(true);
    }
}
