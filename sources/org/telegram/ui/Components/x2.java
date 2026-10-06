package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ gd0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gd0 c;
    public final /* synthetic */ gd0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(gd0 gd0Var, int i10, gd0 gd0Var2, gd0 gd0Var3, int i11, int i12, int i13) {
        this.a = gd0Var;
        this.b = i10;
        this.c = gd0Var2;
        this.d = gd0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gd0 gd0Var = this.a;
        int value = gd0Var.getValue();
        int i10 = this.b;
        gd0 gd0Var2 = this.c;
        gd0 gd0Var3 = this.d;
        if (value == i10) {
            gd0Var2.setMinValue(1);
            try {
                gd0Var2.setMaxValue(YearMonth.of(2024, gd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                gd0Var2.setMaxValue(31);
            }
            gd0Var3.setMinValue(0);
            gd0Var3.setMaxValue(11);
            return;
        }
        if (gd0Var.getValue() != this.e) {
            gd0Var2.setMinValue(1);
            try {
                gd0Var2.setMaxValue(YearMonth.of(gd0Var.getValue(), gd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                gd0Var2.setMaxValue(31);
            }
            gd0Var3.setMinValue(0);
            gd0Var3.setMaxValue(11);
            return;
        }
        gd0Var3.setMinValue(0);
        int i11 = this.f;
        gd0Var3.setMaxValue(i11);
        if (gd0Var3.getValue() == i11) {
            gd0Var2.setMinValue(1);
            gd0Var2.setMaxValue(this.h);
            return;
        }
        gd0Var2.setMinValue(1);
        try {
            gd0Var2.setMaxValue(YearMonth.of(gd0Var.getValue(), gd0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            gd0Var2.setMaxValue(31);
        }
    }
}
