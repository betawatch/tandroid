package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ cb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cb0 c;
    public final /* synthetic */ cb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ m2(cb0 cb0Var, int i3, cb0 cb0Var2, cb0 cb0Var3, int i10, int i11, int i12) {
        this.a = cb0Var;
        this.b = i3;
        this.c = cb0Var2;
        this.d = cb0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cb0 cb0Var = this.a;
        int value = cb0Var.getValue();
        int i3 = this.b;
        cb0 cb0Var2 = this.c;
        cb0 cb0Var3 = this.d;
        if (value == i3) {
            cb0Var2.setMinValue(1);
            try {
                cb0Var2.setMaxValue(YearMonth.of(2024, cb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                cb0Var2.setMaxValue(31);
            }
            cb0Var3.setMinValue(0);
            cb0Var3.setMaxValue(11);
            return;
        }
        if (cb0Var.getValue() != this.e) {
            cb0Var2.setMinValue(1);
            try {
                cb0Var2.setMaxValue(YearMonth.of(cb0Var.getValue(), cb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                cb0Var2.setMaxValue(31);
            }
            cb0Var3.setMinValue(0);
            cb0Var3.setMaxValue(11);
            return;
        }
        cb0Var3.setMinValue(0);
        int i10 = this.f;
        cb0Var3.setMaxValue(i10);
        if (cb0Var3.getValue() == i10) {
            cb0Var2.setMinValue(1);
            cb0Var2.setMaxValue(this.h);
            return;
        }
        cb0Var2.setMinValue(1);
        try {
            cb0Var2.setMaxValue(YearMonth.of(cb0Var.getValue(), cb0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            cb0Var2.setMaxValue(31);
        }
    }
}
