package org.telegram.ui.Components;

import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements bd0, dd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri0 b;

    public /* synthetic */ mi0(ri0 ri0Var, int i10) {
        this.a = i10;
        this.b = ri0Var;
    }

    @Override // org.telegram.ui.Components.bd0
    public String e(int i10) {
        int i11 = this.a;
        ri0 ri0Var = this.b;
        switch (i11) {
            case 0:
                return ri0Var.O ? LocaleController.formatString("MilesShort", R.string.MilesShort, Integer.valueOf(i10)) : LocaleController.formatString("KMetersShort", R.string.KMetersShort, Integer.valueOf(i10));
            default:
                if (!ri0Var.O) {
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

    @Override // org.telegram.ui.Components.dd0
    public void q(fd0 fd0Var, int i10) {
        ri0 ri0Var = this.b;
        try {
            ri0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ri0Var.c(true);
    }
}
