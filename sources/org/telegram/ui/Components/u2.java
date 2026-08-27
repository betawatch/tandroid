package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ fc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fc0 c;
    public final /* synthetic */ fc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ u2(fc0 fc0Var, int i10, fc0 fc0Var2, fc0 fc0Var3, int i11, int i12, int i13) {
        this.a = fc0Var;
        this.b = i10;
        this.c = fc0Var2;
        this.d = fc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc0 fc0Var = this.a;
        int value = fc0Var.getValue();
        int i10 = this.b;
        fc0 fc0Var2 = this.c;
        fc0 fc0Var3 = this.d;
        if (value == i10) {
            fc0Var2.setMinValue(1);
            try {
                fc0Var2.setMaxValue(YearMonth.of(2024, fc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e9) {
                FileLog.e(e9);
                fc0Var2.setMaxValue(31);
            }
            fc0Var3.setMinValue(0);
            fc0Var3.setMaxValue(11);
            return;
        }
        if (fc0Var.getValue() != this.e) {
            fc0Var2.setMinValue(1);
            try {
                fc0Var2.setMaxValue(YearMonth.of(fc0Var.getValue(), fc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                fc0Var2.setMaxValue(31);
            }
            fc0Var3.setMinValue(0);
            fc0Var3.setMaxValue(11);
            return;
        }
        fc0Var3.setMinValue(0);
        int i11 = this.f;
        fc0Var3.setMaxValue(i11);
        if (fc0Var3.getValue() == i11) {
            fc0Var2.setMinValue(1);
            fc0Var2.setMaxValue(this.h);
            return;
        }
        fc0Var2.setMinValue(1);
        try {
            fc0Var2.setMaxValue(YearMonth.of(fc0Var.getValue(), fc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            fc0Var2.setMaxValue(31);
        }
    }
}
