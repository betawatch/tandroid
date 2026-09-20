package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji0 implements yc0, ad0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;

    public /* synthetic */ ji0(oi0 oi0Var, int i10) {
        this.a = i10;
        this.b = oi0Var;
    }

    @Override // org.telegram.ui.Components.yc0
    public String e(int i10) {
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
                return hg.k0.h(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.ad0
    public void q(cd0 cd0Var, int i10) {
        oi0 oi0Var = this.b;
        try {
            oi0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        oi0Var.c(true);
    }
}
