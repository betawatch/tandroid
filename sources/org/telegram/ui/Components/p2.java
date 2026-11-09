package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ ib0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ib0 c;
    public final /* synthetic */ ib0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ p2(ib0 ib0Var, int i7, ib0 ib0Var2, ib0 ib0Var3, int i10, int i11, int i12) {
        this.a = ib0Var;
        this.b = i7;
        this.c = ib0Var2;
        this.d = ib0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ib0 ib0Var = this.a;
        int value = ib0Var.getValue();
        int i7 = this.b;
        ib0 ib0Var2 = this.c;
        ib0 ib0Var3 = this.d;
        if (value == i7) {
            ib0Var2.setMinValue(1);
            try {
                ib0Var2.setMaxValue(YearMonth.of(2024, ib0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                ib0Var2.setMaxValue(31);
            }
            ib0Var3.setMinValue(0);
            ib0Var3.setMaxValue(11);
            return;
        }
        if (ib0Var.getValue() != this.e) {
            ib0Var2.setMinValue(1);
            try {
                ib0Var2.setMaxValue(YearMonth.of(ib0Var.getValue(), ib0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                ib0Var2.setMaxValue(31);
            }
            ib0Var3.setMinValue(0);
            ib0Var3.setMaxValue(11);
            return;
        }
        ib0Var3.setMinValue(0);
        int i10 = this.f;
        ib0Var3.setMaxValue(i10);
        if (ib0Var3.getValue() == i10) {
            ib0Var2.setMinValue(1);
            ib0Var2.setMaxValue(this.h);
            return;
        }
        ib0Var2.setMinValue(1);
        try {
            ib0Var2.setMaxValue(YearMonth.of(ib0Var.getValue(), ib0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            ib0Var2.setMaxValue(31);
        }
    }
}
