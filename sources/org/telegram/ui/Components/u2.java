package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ yc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yc0 c;
    public final /* synthetic */ yc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ u2(yc0 yc0Var, int i10, yc0 yc0Var2, yc0 yc0Var3, int i11, int i12, int i13) {
        this.a = yc0Var;
        this.b = i10;
        this.c = yc0Var2;
        this.d = yc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc0 yc0Var = this.a;
        int value = yc0Var.getValue();
        int i10 = this.b;
        yc0 yc0Var2 = this.c;
        yc0 yc0Var3 = this.d;
        if (value == i10) {
            yc0Var2.setMinValue(1);
            try {
                yc0Var2.setMaxValue(YearMonth.of(2024, yc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e6) {
                FileLog.e(e6);
                yc0Var2.setMaxValue(31);
            }
            yc0Var3.setMinValue(0);
            yc0Var3.setMaxValue(11);
            return;
        }
        if (yc0Var.getValue() != this.e) {
            yc0Var2.setMinValue(1);
            try {
                yc0Var2.setMaxValue(YearMonth.of(yc0Var.getValue(), yc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                yc0Var2.setMaxValue(31);
            }
            yc0Var3.setMinValue(0);
            yc0Var3.setMaxValue(11);
            return;
        }
        yc0Var3.setMinValue(0);
        int i11 = this.f;
        yc0Var3.setMaxValue(i11);
        if (yc0Var3.getValue() == i11) {
            yc0Var2.setMinValue(1);
            yc0Var2.setMaxValue(this.h);
            return;
        }
        yc0Var2.setMinValue(1);
        try {
            yc0Var2.setMaxValue(YearMonth.of(yc0Var.getValue(), yc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            yc0Var2.setMaxValue(31);
        }
    }
}
