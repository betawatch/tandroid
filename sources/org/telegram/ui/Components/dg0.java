package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements eb0, gb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ dg0(ig0 ig0Var, int i7) {
        this.a = i7;
        this.b = ig0Var;
    }

    @Override // org.telegram.ui.Components.eb0
    public String h(int i7) {
        int i10 = this.a;
        ig0 ig0Var = this.b;
        switch (i10) {
            case 0:
                return ig0Var.O ? org.telegram.messenger.id.a0("MilesShort", null, 2131748427, Integer.valueOf(i7)) : org.telegram.messenger.id.a0("KMetersShort", null, 2131749061, Integer.valueOf(i7));
            default:
                if (!ig0Var.O) {
                    if (i7 == 1) {
                        return org.telegram.messenger.id.a0("MetersShort", null, 2131748442, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.id.a0("MetersShort", null, 2131748442, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.id.a0("FootsShort", null, 2131750601, Integer.valueOf(org.telegram.messenger.qs.Z3));
                }
                if (i7 > 1) {
                    i7--;
                }
                Locale locale = Locale.US;
                return jg.g.j(i7, ".");
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void n(ib0 ib0Var, int i7) {
        ig0 ig0Var = this.b;
        try {
            ig0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ig0Var.c(true);
    }
}
