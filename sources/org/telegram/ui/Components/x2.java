package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ dd0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dd0 c;
    public final /* synthetic */ dd0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(dd0 dd0Var, int i10, dd0 dd0Var2, dd0 dd0Var3, int i11, int i12, int i13) {
        this.a = dd0Var;
        this.b = i10;
        this.c = dd0Var2;
        this.d = dd0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dd0 dd0Var = this.a;
        int value = dd0Var.getValue();
        int i10 = this.b;
        dd0 dd0Var2 = this.c;
        dd0 dd0Var3 = this.d;
        if (value == i10) {
            dd0Var2.setMinValue(1);
            try {
                dd0Var2.setMaxValue(YearMonth.of(2024, dd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                dd0Var2.setMaxValue(31);
            }
            dd0Var3.setMinValue(0);
            dd0Var3.setMaxValue(11);
            return;
        }
        if (dd0Var.getValue() != this.e) {
            dd0Var2.setMinValue(1);
            try {
                dd0Var2.setMaxValue(YearMonth.of(dd0Var.getValue(), dd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                dd0Var2.setMaxValue(31);
            }
            dd0Var3.setMinValue(0);
            dd0Var3.setMaxValue(11);
            return;
        }
        dd0Var3.setMinValue(0);
        int i11 = this.f;
        dd0Var3.setMaxValue(i11);
        if (dd0Var3.getValue() == i11) {
            dd0Var2.setMinValue(1);
            dd0Var2.setMaxValue(this.h);
            return;
        }
        dd0Var2.setMinValue(1);
        try {
            dd0Var2.setMaxValue(YearMonth.of(dd0Var.getValue(), dd0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            dd0Var2.setMaxValue(31);
        }
    }
}
