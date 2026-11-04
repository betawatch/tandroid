package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements ya0, ab0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;

    public /* synthetic */ fg0(kg0 kg0Var, int i3) {
        this.a = i3;
        this.b = kg0Var;
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        int i10 = this.a;
        kg0 kg0Var = this.b;
        switch (i10) {
            case 0:
                return kg0Var.P ? org.telegram.messenger.bd.a0("MilesShort", null, 2131748435, Integer.valueOf(i3)) : org.telegram.messenger.bd.a0("KMetersShort", null, 2131749069, Integer.valueOf(i3));
            default:
                if (!kg0Var.P) {
                    if (i3 == 1) {
                        return org.telegram.messenger.bd.a0("MetersShort", null, 2131748450, 50);
                    }
                    if (i3 > 1) {
                        i3--;
                    }
                    return org.telegram.messenger.bd.a0("MetersShort", null, 2131748450, Integer.valueOf(i3 * 100));
                }
                if (i3 == 1) {
                    return org.telegram.messenger.bd.a0("FootsShort", null, 2131750602, Integer.valueOf(org.telegram.messenger.hs.Z3));
                }
                if (i3 > 1) {
                    i3--;
                }
                Locale locale = Locale.US;
                return k2.p1.i(i3, ".");
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        kg0 kg0Var = this.b;
        try {
            kg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kg0Var.c(true);
    }
}
