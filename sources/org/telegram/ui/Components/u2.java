package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ wc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wc0 c;
    public final /* synthetic */ wc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ u2(wc0 wc0Var, int i10, wc0 wc0Var2, wc0 wc0Var3, int i11, int i12, int i13) {
        this.a = wc0Var;
        this.b = i10;
        this.c = wc0Var2;
        this.d = wc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc0 wc0Var = this.a;
        int value = wc0Var.getValue();
        int i10 = this.b;
        wc0 wc0Var2 = this.c;
        wc0 wc0Var3 = this.d;
        if (value == i10) {
            wc0Var2.setMinValue(1);
            try {
                wc0Var2.setMaxValue(YearMonth.of(2024, wc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                wc0Var2.setMaxValue(31);
            }
            wc0Var3.setMinValue(0);
            wc0Var3.setMaxValue(11);
            return;
        }
        if (wc0Var.getValue() != this.e) {
            wc0Var2.setMinValue(1);
            try {
                wc0Var2.setMaxValue(YearMonth.of(wc0Var.getValue(), wc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e6) {
                FileLog.e(e6);
                wc0Var2.setMaxValue(31);
            }
            wc0Var3.setMinValue(0);
            wc0Var3.setMaxValue(11);
            return;
        }
        wc0Var3.setMinValue(0);
        int i11 = this.f;
        wc0Var3.setMaxValue(i11);
        if (wc0Var3.getValue() == i11) {
            wc0Var2.setMinValue(1);
            wc0Var2.setMaxValue(this.h);
            return;
        }
        wc0Var2.setMinValue(1);
        try {
            wc0Var2.setMaxValue(YearMonth.of(wc0Var.getValue(), wc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            wc0Var2.setMaxValue(31);
        }
    }
}
