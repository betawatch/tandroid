package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ nd0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nd0 c;
    public final /* synthetic */ nd0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ a3(nd0 nd0Var, int i10, nd0 nd0Var2, nd0 nd0Var3, int i11, int i12, int i13) {
        this.a = nd0Var;
        this.b = i10;
        this.c = nd0Var2;
        this.d = nd0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd0 nd0Var = this.a;
        int value = nd0Var.getValue();
        int i10 = this.b;
        nd0 nd0Var2 = this.c;
        nd0 nd0Var3 = this.d;
        if (value == i10) {
            nd0Var2.setMinValue(1);
            try {
                nd0Var2.setMaxValue(YearMonth.of(2024, nd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                nd0Var2.setMaxValue(31);
            }
            nd0Var3.setMinValue(0);
            nd0Var3.setMaxValue(11);
            return;
        }
        if (nd0Var.getValue() != this.e) {
            nd0Var2.setMinValue(1);
            try {
                nd0Var2.setMaxValue(YearMonth.of(nd0Var.getValue(), nd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                nd0Var2.setMaxValue(31);
            }
            nd0Var3.setMinValue(0);
            nd0Var3.setMaxValue(11);
            return;
        }
        nd0Var3.setMinValue(0);
        int i11 = this.f;
        nd0Var3.setMaxValue(i11);
        if (nd0Var3.getValue() == i11) {
            nd0Var2.setMinValue(1);
            nd0Var2.setMaxValue(this.h);
            return;
        }
        nd0Var2.setMinValue(1);
        try {
            nd0Var2.setMaxValue(YearMonth.of(nd0Var.getValue(), nd0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            nd0Var2.setMaxValue(31);
        }
    }
}
