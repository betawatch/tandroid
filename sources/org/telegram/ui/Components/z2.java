package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ ud0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ud0 c;
    public final /* synthetic */ ud0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ z2(ud0 ud0Var, int i10, ud0 ud0Var2, ud0 ud0Var3, int i11, int i12, int i13) {
        this.a = ud0Var;
        this.b = i10;
        this.c = ud0Var2;
        this.d = ud0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ud0 ud0Var = this.a;
        int value = ud0Var.getValue();
        int i10 = this.b;
        ud0 ud0Var2 = this.c;
        ud0 ud0Var3 = this.d;
        if (value == i10) {
            ud0Var2.setMinValue(1);
            try {
                ud0Var2.setMaxValue(YearMonth.of(2024, ud0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                ud0Var2.setMaxValue(31);
            }
            ud0Var3.setMinValue(0);
            ud0Var3.setMaxValue(11);
            return;
        }
        if (ud0Var.getValue() != this.e) {
            ud0Var2.setMinValue(1);
            try {
                ud0Var2.setMaxValue(YearMonth.of(ud0Var.getValue(), ud0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                ud0Var2.setMaxValue(31);
            }
            ud0Var3.setMinValue(0);
            ud0Var3.setMaxValue(11);
            return;
        }
        ud0Var3.setMinValue(0);
        int i11 = this.f;
        ud0Var3.setMaxValue(i11);
        if (ud0Var3.getValue() == i11) {
            ud0Var2.setMinValue(1);
            ud0Var2.setMaxValue(this.h);
            return;
        }
        ud0Var2.setMinValue(1);
        try {
            ud0Var2.setMaxValue(YearMonth.of(ud0Var.getValue(), ud0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            ud0Var2.setMaxValue(31);
        }
    }
}
