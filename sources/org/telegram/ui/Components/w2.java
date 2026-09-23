package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ tc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tc0 c;
    public final /* synthetic */ tc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ w2(tc0 tc0Var, int i10, tc0 tc0Var2, tc0 tc0Var3, int i11, int i12, int i13) {
        this.a = tc0Var;
        this.b = i10;
        this.c = tc0Var2;
        this.d = tc0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc0 tc0Var = this.a;
        int value = tc0Var.getValue();
        int i10 = this.b;
        tc0 tc0Var2 = this.c;
        tc0 tc0Var3 = this.d;
        if (value == i10) {
            tc0Var2.setMinValue(1);
            try {
                tc0Var2.setMaxValue(YearMonth.of(2024, tc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                tc0Var2.setMaxValue(31);
            }
            tc0Var3.setMinValue(0);
            tc0Var3.setMaxValue(11);
            return;
        }
        if (tc0Var.getValue() != this.e) {
            tc0Var2.setMinValue(1);
            try {
                tc0Var2.setMaxValue(YearMonth.of(tc0Var.getValue(), tc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                tc0Var2.setMaxValue(31);
            }
            tc0Var3.setMinValue(0);
            tc0Var3.setMaxValue(11);
            return;
        }
        tc0Var3.setMinValue(0);
        int i11 = this.f;
        tc0Var3.setMaxValue(i11);
        if (tc0Var3.getValue() == i11) {
            tc0Var2.setMinValue(1);
            tc0Var2.setMaxValue(this.h);
            return;
        }
        tc0Var2.setMinValue(1);
        try {
            tc0Var2.setMaxValue(YearMonth.of(tc0Var.getValue(), tc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            tc0Var2.setMaxValue(31);
        }
    }
}
