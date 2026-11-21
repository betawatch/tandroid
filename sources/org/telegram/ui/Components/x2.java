package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ tb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tb0 c;
    public final /* synthetic */ tb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(tb0 tb0Var, int i7, tb0 tb0Var2, tb0 tb0Var3, int i10, int i11, int i12) {
        this.a = tb0Var;
        this.b = i7;
        this.c = tb0Var2;
        this.d = tb0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tb0 tb0Var = this.a;
        int value = tb0Var.getValue();
        int i7 = this.b;
        tb0 tb0Var2 = this.c;
        tb0 tb0Var3 = this.d;
        if (value == i7) {
            tb0Var2.setMinValue(1);
            try {
                tb0Var2.setMaxValue(YearMonth.of(2024, tb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                tb0Var2.setMaxValue(31);
            }
            tb0Var3.setMinValue(0);
            tb0Var3.setMaxValue(11);
            return;
        }
        if (tb0Var.getValue() != this.e) {
            tb0Var2.setMinValue(1);
            try {
                tb0Var2.setMaxValue(YearMonth.of(tb0Var.getValue(), tb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                tb0Var2.setMaxValue(31);
            }
            tb0Var3.setMinValue(0);
            tb0Var3.setMaxValue(11);
            return;
        }
        tb0Var3.setMinValue(0);
        int i10 = this.f;
        tb0Var3.setMaxValue(i10);
        if (tb0Var3.getValue() == i10) {
            tb0Var2.setMinValue(1);
            tb0Var2.setMaxValue(this.h);
            return;
        }
        tb0Var2.setMinValue(1);
        try {
            tb0Var2.setMaxValue(YearMonth.of(tb0Var.getValue(), tb0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            tb0Var2.setMaxValue(31);
        }
    }
}
