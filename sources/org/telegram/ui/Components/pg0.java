package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements ob0, qb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ pg0(ug0 ug0Var, int i7) {
        this.a = i7;
        this.b = ug0Var;
    }

    @Override // org.telegram.ui.Components.ob0
    public String i(int i7) {
        int i10 = this.a;
        ug0 ug0Var = this.b;
        switch (i10) {
            case 0:
                return ug0Var.P ? org.telegram.messenger.gd.a0("MilesShort", null, 2131748235, Integer.valueOf(i7)) : org.telegram.messenger.gd.a0("KMetersShort", null, 2131748869, Integer.valueOf(i7));
            default:
                if (!ug0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.gd.a0("MetersShort", null, 2131748250, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.gd.a0("MetersShort", null, 2131748250, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.gd.a0("FootsShort", null, 2131750585, Integer.valueOf(org.telegram.messenger.ks.Z3));
                }
                if (i7 > 1) {
                    i7--;
                }
                Locale locale = Locale.US;
                return i5.c.i(i7, ".");
        }
    }

    @Override // org.telegram.ui.Components.qb0
    public void n(sb0 sb0Var, int i7) {
        ug0 ug0Var = this.b;
        try {
            ug0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ug0Var.c(true);
    }
}
