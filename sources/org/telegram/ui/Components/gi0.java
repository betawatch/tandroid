package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements sc0, uc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;

    public /* synthetic */ gi0(li0 li0Var, int i10) {
        this.a = i10;
        this.b = li0Var;
    }

    @Override // org.telegram.ui.Components.sc0
    public String e(int i10) {
        int i11 = this.a;
        li0 li0Var = this.b;
        switch (i11) {
            case 0:
                return li0Var.L ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!li0Var.L) {
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
                return kh.a2.j(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.uc0
    public void q(wc0 wc0Var, int i10) {
        li0 li0Var = this.b;
        try {
            li0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        li0Var.c(true);
    }
}
