package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh0 implements mc0, oc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai0 b;

    public /* synthetic */ vh0(ai0 ai0Var, int i10) {
        this.a = i10;
        this.b = ai0Var;
    }

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        int i11 = this.a;
        ai0 ai0Var = this.b;
        switch (i11) {
            case 0:
                return ai0Var.K ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!ai0Var.K) {
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
                return j7.l1.k(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.oc0
    public void q(qc0 qc0Var, int i10) {
        ai0 ai0Var = this.b;
        try {
            ai0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ai0Var.c(true);
    }
}
