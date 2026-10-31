package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh0 implements wb0, yb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh0 b;

    public /* synthetic */ eh0(jh0 jh0Var, int i10) {
        this.a = i10;
        this.b = jh0Var;
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        int i11 = this.a;
        jh0 jh0Var = this.b;
        switch (i11) {
            case 0:
                return jh0Var.O ? org.telegram.messenger.cd.a0("MilesShort", null, 2131748442, Integer.valueOf(i10)) : org.telegram.messenger.cd.a0("KMetersShort", null, 2131749071, Integer.valueOf(i10));
            default:
                if (!jh0Var.O) {
                    if (i10 == 1) {
                        return org.telegram.messenger.cd.a0("MetersShort", null, 2131748457, 50);
                    }
                    if (i10 > 1) {
                        i10--;
                    }
                    return org.telegram.messenger.cd.a0("MetersShort", null, 2131748457, Integer.valueOf(i10 * 100));
                }
                if (i10 == 1) {
                    return org.telegram.messenger.cd.a0("FootsShort", null, 2131750602, Integer.valueOf(org.telegram.messenger.zs.Z3));
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
        jh0 jh0Var = this.b;
        try {
            jh0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        jh0Var.c(true);
    }
}
