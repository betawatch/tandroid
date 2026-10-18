package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ od0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ od0 c;
    public final /* synthetic */ od0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ y2(od0 od0Var, int i10, od0 od0Var2, od0 od0Var3, int i11, int i12, int i13) {
        this.a = od0Var;
        this.b = i10;
        this.c = od0Var2;
        this.d = od0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od0 od0Var = this.a;
        int value = od0Var.getValue();
        int i10 = this.b;
        od0 od0Var2 = this.c;
        od0 od0Var3 = this.d;
        if (value == i10) {
            od0Var2.setMinValue(1);
            try {
                od0Var2.setMaxValue(YearMonth.of(2024, od0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                od0Var2.setMaxValue(31);
            }
            od0Var3.setMinValue(0);
            od0Var3.setMaxValue(11);
            return;
        }
        if (od0Var.getValue() != this.e) {
            od0Var2.setMinValue(1);
            try {
                od0Var2.setMaxValue(YearMonth.of(od0Var.getValue(), od0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                od0Var2.setMaxValue(31);
            }
            od0Var3.setMinValue(0);
            od0Var3.setMaxValue(11);
            return;
        }
        od0Var3.setMinValue(0);
        int i11 = this.f;
        od0Var3.setMaxValue(i11);
        if (od0Var3.getValue() == i11) {
            od0Var2.setMinValue(1);
            od0Var2.setMaxValue(this.h);
            return;
        }
        od0Var2.setMinValue(1);
        try {
            od0Var2.setMaxValue(YearMonth.of(od0Var.getValue(), od0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            od0Var2.setMaxValue(31);
        }
    }
}
