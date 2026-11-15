package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements eb0, gb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg0 b;

    public /* synthetic */ fg0(kg0 kg0Var, int i7) {
        this.a = i7;
        this.b = kg0Var;
    }

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        int i10 = this.a;
        kg0 kg0Var = this.b;
        switch (i10) {
            case 0:
                return kg0Var.P ? org.telegram.messenger.hd.a0("MilesShort", null, 2131748427, Integer.valueOf(i7)) : org.telegram.messenger.hd.a0("KMetersShort", null, 2131749061, Integer.valueOf(i7));
            default:
                if (!kg0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.hd.a0("MetersShort", null, 2131748442, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.hd.a0("MetersShort", null, 2131748442, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.hd.a0("FootsShort", null, 2131750601, Integer.valueOf(org.telegram.messenger.ns.Z3));
                }
                if (i7 > 1) {
                    i7--;
                }
                Locale locale = Locale.US;
                return i5.c.i(i7, ".");
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        kg0 kg0Var = this.b;
        try {
            kg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        kg0Var.c(true);
    }
}
