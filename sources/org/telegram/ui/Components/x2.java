package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ ed0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ed0 c;
    public final /* synthetic */ ed0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ x2(ed0 ed0Var, int i10, ed0 ed0Var2, ed0 ed0Var3, int i11, int i12, int i13) {
        this.a = ed0Var;
        this.b = i10;
        this.c = ed0Var2;
        this.d = ed0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ed0 ed0Var = this.a;
        int value = ed0Var.getValue();
        int i10 = this.b;
        ed0 ed0Var2 = this.c;
        ed0 ed0Var3 = this.d;
        if (value == i10) {
            ed0Var2.setMinValue(1);
            try {
                ed0Var2.setMaxValue(YearMonth.of(2024, ed0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                ed0Var2.setMaxValue(31);
            }
            ed0Var3.setMinValue(0);
            ed0Var3.setMaxValue(11);
            return;
        }
        if (ed0Var.getValue() != this.e) {
            ed0Var2.setMinValue(1);
            try {
                ed0Var2.setMaxValue(YearMonth.of(ed0Var.getValue(), ed0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                ed0Var2.setMaxValue(31);
            }
            ed0Var3.setMinValue(0);
            ed0Var3.setMaxValue(11);
            return;
        }
        ed0Var3.setMinValue(0);
        int i11 = this.f;
        ed0Var3.setMaxValue(i11);
        if (ed0Var3.getValue() == i11) {
            ed0Var2.setMinValue(1);
            ed0Var2.setMaxValue(this.h);
            return;
        }
        ed0Var2.setMinValue(1);
        try {
            ed0Var2.setMaxValue(YearMonth.of(ed0Var.getValue(), ed0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            ed0Var2.setMaxValue(31);
        }
    }
}
