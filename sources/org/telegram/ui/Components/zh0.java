package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh0 implements rc0, tc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei0 b;

    public /* synthetic */ zh0(ei0 ei0Var, int i10) {
        this.a = i10;
        this.b = ei0Var;
    }

    @Override // org.telegram.ui.Components.rc0
    public String f(int i10) {
        int i11 = this.a;
        ei0 ei0Var = this.b;
        switch (i11) {
            case 0:
                return ei0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!ei0Var.O) {
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
                return i2.g.i(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.tc0
    public void s(vc0 vc0Var, int i10) {
        ei0 ei0Var = this.b;
        try {
            ei0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ei0Var.c(true);
    }
}
