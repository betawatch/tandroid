package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ xc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xc0 c;
    public final /* synthetic */ xc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ u2(xc0 xc0Var, int i10, xc0 xc0Var2, xc0 xc0Var3, int i11, int i12, int i13) {
        this.a = xc0Var;
        this.b = i10;
        this.c = xc0Var2;
        this.d = xc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc0 xc0Var = this.a;
        int value = xc0Var.getValue();
        int i10 = this.b;
        xc0 xc0Var2 = this.c;
        xc0 xc0Var3 = this.d;
        if (value == i10) {
            xc0Var2.setMinValue(1);
            try {
                xc0Var2.setMaxValue(YearMonth.of(2024, xc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                xc0Var2.setMaxValue(31);
            }
            xc0Var3.setMinValue(0);
            xc0Var3.setMaxValue(11);
            return;
        }
        if (xc0Var.getValue() != this.e) {
            xc0Var2.setMinValue(1);
            try {
                xc0Var2.setMaxValue(YearMonth.of(xc0Var.getValue(), xc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e6) {
                FileLog.e(e6);
                xc0Var2.setMaxValue(31);
            }
            xc0Var3.setMinValue(0);
            xc0Var3.setMaxValue(11);
            return;
        }
        xc0Var3.setMinValue(0);
        int i11 = this.f;
        xc0Var3.setMaxValue(i11);
        if (xc0Var3.getValue() == i11) {
            xc0Var2.setMinValue(1);
            xc0Var2.setMaxValue(this.h);
            return;
        }
        xc0Var2.setMinValue(1);
        try {
            xc0Var2.setMaxValue(YearMonth.of(xc0Var.getValue(), xc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            xc0Var2.setMaxValue(31);
        }
    }
}
