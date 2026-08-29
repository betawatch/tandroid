package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ qc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qc0 c;
    public final /* synthetic */ qc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(qc0 qc0Var, int i10, qc0 qc0Var2, qc0 qc0Var3, int i11, int i12, int i13) {
        this.a = qc0Var;
        this.b = i10;
        this.c = qc0Var2;
        this.d = qc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qc0 qc0Var = this.a;
        int value = qc0Var.getValue();
        int i10 = this.b;
        qc0 qc0Var2 = this.c;
        qc0 qc0Var3 = this.d;
        if (value == i10) {
            qc0Var2.setMinValue(1);
            try {
                qc0Var2.setMaxValue(YearMonth.of(2024, qc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                qc0Var2.setMaxValue(31);
            }
            qc0Var3.setMinValue(0);
            qc0Var3.setMaxValue(11);
            return;
        }
        if (qc0Var.getValue() != this.e) {
            qc0Var2.setMinValue(1);
            try {
                qc0Var2.setMaxValue(YearMonth.of(qc0Var.getValue(), qc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                qc0Var2.setMaxValue(31);
            }
            qc0Var3.setMinValue(0);
            qc0Var3.setMaxValue(11);
            return;
        }
        qc0Var3.setMinValue(0);
        int i11 = this.f;
        qc0Var3.setMaxValue(i11);
        if (qc0Var3.getValue() == i11) {
            qc0Var2.setMinValue(1);
            qc0Var2.setMaxValue(this.h);
            return;
        }
        qc0Var2.setMinValue(1);
        try {
            qc0Var2.setMaxValue(YearMonth.of(qc0Var.getValue(), qc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            FileLog.e(e12);
            qc0Var2.setMaxValue(31);
        }
    }
}
