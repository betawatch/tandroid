package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ fd0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fd0 c;
    public final /* synthetic */ fd0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ w2(fd0 fd0Var, int i10, fd0 fd0Var2, fd0 fd0Var3, int i11, int i12, int i13) {
        this.a = fd0Var;
        this.b = i10;
        this.c = fd0Var2;
        this.d = fd0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fd0 fd0Var = this.a;
        int value = fd0Var.getValue();
        int i10 = this.b;
        fd0 fd0Var2 = this.c;
        fd0 fd0Var3 = this.d;
        if (value == i10) {
            fd0Var2.setMinValue(1);
            try {
                fd0Var2.setMaxValue(YearMonth.of(2024, fd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                fd0Var2.setMaxValue(31);
            }
            fd0Var3.setMinValue(0);
            fd0Var3.setMaxValue(11);
            return;
        }
        if (fd0Var.getValue() != this.e) {
            fd0Var2.setMinValue(1);
            try {
                fd0Var2.setMaxValue(YearMonth.of(fd0Var.getValue(), fd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                fd0Var2.setMaxValue(31);
            }
            fd0Var3.setMinValue(0);
            fd0Var3.setMaxValue(11);
            return;
        }
        fd0Var3.setMinValue(0);
        int i11 = this.f;
        fd0Var3.setMaxValue(i11);
        if (fd0Var3.getValue() == i11) {
            fd0Var2.setMinValue(1);
            fd0Var2.setMaxValue(this.h);
            return;
        }
        fd0Var2.setMinValue(1);
        try {
            fd0Var2.setMaxValue(YearMonth.of(fd0Var.getValue(), fd0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            fd0Var2.setMaxValue(31);
        }
    }
}
