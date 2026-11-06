package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ hb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hb0 c;
    public final /* synthetic */ hb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ p2(hb0 hb0Var, int i7, hb0 hb0Var2, hb0 hb0Var3, int i10, int i11, int i12) {
        this.a = hb0Var;
        this.b = i7;
        this.c = hb0Var2;
        this.d = hb0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hb0 hb0Var = this.a;
        int value = hb0Var.getValue();
        int i7 = this.b;
        hb0 hb0Var2 = this.c;
        hb0 hb0Var3 = this.d;
        if (value == i7) {
            hb0Var2.setMinValue(1);
            try {
                hb0Var2.setMaxValue(YearMonth.of(2024, hb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                hb0Var2.setMaxValue(31);
            }
            hb0Var3.setMinValue(0);
            hb0Var3.setMaxValue(11);
            return;
        }
        if (hb0Var.getValue() != this.e) {
            hb0Var2.setMinValue(1);
            try {
                hb0Var2.setMaxValue(YearMonth.of(hb0Var.getValue(), hb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                hb0Var2.setMaxValue(31);
            }
            hb0Var3.setMinValue(0);
            hb0Var3.setMaxValue(11);
            return;
        }
        hb0Var3.setMinValue(0);
        int i10 = this.f;
        hb0Var3.setMaxValue(i10);
        if (hb0Var3.getValue() == i10) {
            hb0Var2.setMinValue(1);
            hb0Var2.setMaxValue(this.h);
            return;
        }
        hb0Var2.setMinValue(1);
        try {
            hb0Var2.setMaxValue(YearMonth.of(hb0Var.getValue(), hb0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            hb0Var2.setMaxValue(31);
        }
    }
}
