package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ bc0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ bc0 c;
    public final /* synthetic */ bc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ u2(bc0 bc0Var, int i9, bc0 bc0Var2, bc0 bc0Var3, int i10, int i11, int i12) {
        this.a = bc0Var;
        this.b = i9;
        this.c = bc0Var2;
        this.d = bc0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bc0 bc0Var = this.a;
        int value = bc0Var.getValue();
        int i9 = this.b;
        bc0 bc0Var2 = this.c;
        bc0 bc0Var3 = this.d;
        if (value == i9) {
            bc0Var2.setMinValue(1);
            try {
                bc0Var2.setMaxValue(YearMonth.of(2024, bc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                bc0Var2.setMaxValue(31);
            }
            bc0Var3.setMinValue(0);
            bc0Var3.setMaxValue(11);
            return;
        }
        if (bc0Var.getValue() != this.e) {
            bc0Var2.setMinValue(1);
            try {
                bc0Var2.setMaxValue(YearMonth.of(bc0Var.getValue(), bc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                bc0Var2.setMaxValue(31);
            }
            bc0Var3.setMinValue(0);
            bc0Var3.setMaxValue(11);
            return;
        }
        bc0Var3.setMinValue(0);
        int i10 = this.f;
        bc0Var3.setMaxValue(i10);
        if (bc0Var3.getValue() == i10) {
            bc0Var2.setMinValue(1);
            bc0Var2.setMaxValue(this.h);
            return;
        }
        bc0Var2.setMinValue(1);
        try {
            bc0Var2.setMaxValue(YearMonth.of(bc0Var.getValue(), bc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            FileLog.e(e12);
            bc0Var2.setMaxValue(31);
        }
    }
}
