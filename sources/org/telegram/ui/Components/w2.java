package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ uc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ uc0 c;
    public final /* synthetic */ uc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ w2(uc0 uc0Var, int i10, uc0 uc0Var2, uc0 uc0Var3, int i11, int i12, int i13) {
        this.a = uc0Var;
        this.b = i10;
        this.c = uc0Var2;
        this.d = uc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uc0 uc0Var = this.a;
        int value = uc0Var.getValue();
        int i10 = this.b;
        uc0 uc0Var2 = this.c;
        uc0 uc0Var3 = this.d;
        if (value == i10) {
            uc0Var2.setMinValue(1);
            try {
                uc0Var2.setMaxValue(YearMonth.of(2024, uc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                uc0Var2.setMaxValue(31);
            }
            uc0Var3.setMinValue(0);
            uc0Var3.setMaxValue(11);
            return;
        }
        if (uc0Var.getValue() != this.e) {
            uc0Var2.setMinValue(1);
            try {
                uc0Var2.setMaxValue(YearMonth.of(uc0Var.getValue(), uc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                uc0Var2.setMaxValue(31);
            }
            uc0Var3.setMinValue(0);
            uc0Var3.setMaxValue(11);
            return;
        }
        uc0Var3.setMinValue(0);
        int i11 = this.f;
        uc0Var3.setMaxValue(i11);
        if (uc0Var3.getValue() == i11) {
            uc0Var2.setMinValue(1);
            uc0Var2.setMaxValue(this.h);
            return;
        }
        uc0Var2.setMinValue(1);
        try {
            uc0Var2.setMaxValue(YearMonth.of(uc0Var.getValue(), uc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            uc0Var2.setMaxValue(31);
        }
    }
}
