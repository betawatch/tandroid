package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ vc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vc0 c;
    public final /* synthetic */ vc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(vc0 vc0Var, int i10, vc0 vc0Var2, vc0 vc0Var3, int i11, int i12, int i13) {
        this.a = vc0Var;
        this.b = i10;
        this.c = vc0Var2;
        this.d = vc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vc0 vc0Var = this.a;
        int value = vc0Var.getValue();
        int i10 = this.b;
        vc0 vc0Var2 = this.c;
        vc0 vc0Var3 = this.d;
        if (value == i10) {
            vc0Var2.setMinValue(1);
            try {
                vc0Var2.setMaxValue(YearMonth.of(2024, vc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                vc0Var2.setMaxValue(31);
            }
            vc0Var3.setMinValue(0);
            vc0Var3.setMaxValue(11);
            return;
        }
        if (vc0Var.getValue() != this.e) {
            vc0Var2.setMinValue(1);
            try {
                vc0Var2.setMaxValue(YearMonth.of(vc0Var.getValue(), vc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                vc0Var2.setMaxValue(31);
            }
            vc0Var3.setMinValue(0);
            vc0Var3.setMaxValue(11);
            return;
        }
        vc0Var3.setMinValue(0);
        int i11 = this.f;
        vc0Var3.setMaxValue(i11);
        if (vc0Var3.getValue() == i11) {
            vc0Var2.setMinValue(1);
            vc0Var2.setMaxValue(this.h);
            return;
        }
        vc0Var2.setMinValue(1);
        try {
            vc0Var2.setMaxValue(YearMonth.of(vc0Var.getValue(), vc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            vc0Var2.setMaxValue(31);
        }
    }
}
