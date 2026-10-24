package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ qd0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qd0 c;
    public final /* synthetic */ qd0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(qd0 qd0Var, int i10, qd0 qd0Var2, qd0 qd0Var3, int i11, int i12, int i13) {
        this.a = qd0Var;
        this.b = i10;
        this.c = qd0Var2;
        this.d = qd0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qd0 qd0Var = this.a;
        int value = qd0Var.getValue();
        int i10 = this.b;
        qd0 qd0Var2 = this.c;
        qd0 qd0Var3 = this.d;
        if (value == i10) {
            qd0Var2.setMinValue(1);
            try {
                qd0Var2.setMaxValue(YearMonth.of(2024, qd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                qd0Var2.setMaxValue(31);
            }
            qd0Var3.setMinValue(0);
            qd0Var3.setMaxValue(11);
            return;
        }
        if (qd0Var.getValue() != this.e) {
            qd0Var2.setMinValue(1);
            try {
                qd0Var2.setMaxValue(YearMonth.of(qd0Var.getValue(), qd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                qd0Var2.setMaxValue(31);
            }
            qd0Var3.setMinValue(0);
            qd0Var3.setMaxValue(11);
            return;
        }
        qd0Var3.setMinValue(0);
        int i11 = this.f;
        qd0Var3.setMaxValue(i11);
        if (qd0Var3.getValue() == i11) {
            qd0Var2.setMinValue(1);
            qd0Var2.setMaxValue(this.h);
            return;
        }
        qd0Var2.setMinValue(1);
        try {
            qd0Var2.setMaxValue(YearMonth.of(qd0Var.getValue(), qd0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            qd0Var2.setMaxValue(31);
        }
    }
}
