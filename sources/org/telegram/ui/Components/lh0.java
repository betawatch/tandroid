package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements xb0, zb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ lh0(qh0 qh0Var, int i9) {
        this.a = i9;
        this.b = qh0Var;
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        int i10 = this.a;
        qh0 qh0Var = this.b;
        switch (i10) {
            case 0:
                return qh0Var.K ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i9)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i9));
            default:
                if (!qh0Var.K) {
                    if (i9 == 1) {
                        return LocaleController.formatString("MetersShort", R.string.MetersShort, 50);
                    }
                    if (i9 > 1) {
                        i9--;
                    }
                    return LocaleController.formatString("MetersShort", R.string.MetersShort, Integer.valueOf(i9 * 100));
                }
                if (i9 == 1) {
                    return LocaleController.formatString("FootsShort", R.string.FootsShort, Integer.valueOf(MediaDataController.MAX_LINKS_COUNT));
                }
                if (i9 > 1) {
                    i9--;
                }
                Locale locale = Locale.US;
                return j3.r0.l(i9, ".");
        }
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(bc0 bc0Var, int i9) {
        qh0 qh0Var = this.b;
        try {
            qh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        qh0Var.c(true);
    }
}
