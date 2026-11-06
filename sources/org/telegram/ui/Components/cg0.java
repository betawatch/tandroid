package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                return hg0Var.O ? org.telegram.messenger.hd.a0("MilesShort", null, 2131748426, Integer.valueOf(i7)) : org.telegram.messenger.hd.a0("KMetersShort", null, 2131749060, Integer.valueOf(i7));
            default:
                if (!hg0Var.O) {
                    if (i7 == 1) {
                        return org.telegram.messenger.hd.a0("MetersShort", null, 2131748441, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.hd.a0("MetersShort", null, 2131748441, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.hd.a0("FootsShort", null, 2131750602, Integer.valueOf(org.telegram.messenger.qs.Z3));
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
