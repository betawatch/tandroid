package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg0 implements mb0, ob0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ qg0(vg0 vg0Var, int i7) {
        this.a = i7;
        this.b = vg0Var;
    }

    @Override // org.telegram.ui.Components.mb0
    public String e(int i7) {
        int i10 = this.a;
        vg0 vg0Var = this.b;
        switch (i10) {
            case 0:
                return vg0Var.P ? org.telegram.messenger.gd.a0("MilesShort", null, 2131748234, Integer.valueOf(i7)) : org.telegram.messenger.gd.a0("KMetersShort", null, 2131748868, Integer.valueOf(i7));
            default:
                if (!vg0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.gd.a0("MetersShort", null, 2131748249, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.gd.a0("MetersShort", null, 2131748249, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.gd.a0("FootsShort", null, 2131750584, Integer.valueOf(org.telegram.messenger.ks.Z3));
                }
                if (i7 > 1) {
                    i7--;
                }
                Locale locale = Locale.US;
                return i5.c.i(i7, ".");
        }
    }

    @Override // org.telegram.ui.Components.ob0
    public void o(qb0 qb0Var, int i7) {
        vg0 vg0Var = this.b;
        try {
            vg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        vg0Var.c(true);
    }
}
