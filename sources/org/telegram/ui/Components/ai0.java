package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements pc0, rc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi0 b;

    public /* synthetic */ ai0(fi0 fi0Var, int i10) {
        this.a = i10;
        this.b = fi0Var;
    }

    @Override // org.telegram.ui.Components.pc0
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
                return hg.c.i(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.rc0
    public void q(tc0 tc0Var, int i10) {
        fi0 fi0Var = this.b;
        try {
            fi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        fi0Var.c(true);
    }
}
