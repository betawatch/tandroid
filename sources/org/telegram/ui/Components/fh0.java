package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements wb0, yb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;

    public /* synthetic */ fh0(kh0 kh0Var, int i10) {
        this.a = i10;
        this.b = kh0Var;
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        int i11 = this.a;
        kh0 kh0Var = this.b;
        switch (i11) {
            case 0:
                return kh0Var.O ? org.telegram.messenger.dd.a0("MilesShort", null, 2131748442, Integer.valueOf(i10)) : org.telegram.messenger.dd.a0("KMetersShort", null, 2131749071, Integer.valueOf(i10));
            default:
                if (!kh0Var.O) {
                    if (i10 == 1) {
                        return org.telegram.messenger.dd.a0("MetersShort", null, 2131748457, 50);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    return org.telegram.messenger.dd.a0("MetersShort", null, 2131748457, Integer.valueOf(i10 * 100));
                }
                if (i10 == 1) {
                    return org.telegram.messenger.dd.a0("FootsShort", null, 2131750602, Integer.valueOf(org.telegram.messenger.at.Z3));
                }
                if (i10 > 1) {
                    i10--;
                }
                Locale locale = Locale.US;
                return i0.a.i(i10, ".");
        }
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        kh0 kh0Var = this.b;
        try {
            kh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kh0Var.c(true);
    }
}
