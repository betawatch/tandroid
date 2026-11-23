package org.telegram.ui.Components;

import java.util.Locale;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements pb0, rb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ rg0(wg0 wg0Var, int i7) {
        this.a = i7;
        this.b = wg0Var;
    }

    @Override // org.telegram.ui.Components.pb0
    public String i(int i7) {
        int i10 = this.a;
        wg0 wg0Var = this.b;
        switch (i10) {
            case 0:
                return wg0Var.P ? org.telegram.messenger.hd.a0("MilesShort", null, 2131748234, Integer.valueOf(i7)) : org.telegram.messenger.hd.a0("KMetersShort", null, 2131748868, Integer.valueOf(i7));
            default:
                if (!wg0Var.P) {
                    if (i7 == 1) {
                        return org.telegram.messenger.hd.a0("MetersShort", null, 2131748249, 50);
                    }
                    if (i7 > 1) {
                        i7--;
                    }
                    return org.telegram.messenger.hd.a0("MetersShort", null, 2131748249, Integer.valueOf(i7 * 100));
                }
                if (i7 == 1) {
                    return org.telegram.messenger.hd.a0("FootsShort", null, 2131750584, Integer.valueOf(org.telegram.messenger.ls.Z3));
                }
                if (i7 > 1) {
                    i7--;
                }
                Locale locale = Locale.US;
                return i5.c.i(i7, ".");
        }
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        wg0 wg0Var = this.b;
        try {
            wg0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        wg0Var.c(true);
    }
}
