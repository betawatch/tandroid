package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg0 implements db0, fb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ cg0(hg0 hg0Var, int i7) {
        this.a = i7;
        this.b = hg0Var;
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        int i10 = this.a;
        hg0 hg0Var = this.b;
        switch (i10) {
            case 0:
                return hg0Var.O ? org.telegram.messenger.id.a0("MilesShort", null, 2131748428, Integer.valueOf(i7)) : org.telegram.messenger.id.a0("KMetersShort", null, 2131749062, Integer.valueOf(i7));
            default:
                if (!hg0Var.O) {
                    if (i7 == 1) {
                        return org.telegram.messenger.id.a0("MetersShort", null, 2131748443, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.id.a0("MetersShort", null, 2131748443, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.id.a0("FootsShort", null, 2131750602, Integer.valueOf(org.telegram.messenger.qs.Z3));
                }
                if (i7 > 1) {
                    i7--;
                }
                Locale locale = Locale.US;
                return jg.g.j(i7, ".");
        }
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        hg0 hg0Var = this.b;
        try {
            hg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hg0Var.c(true);
    }
}
