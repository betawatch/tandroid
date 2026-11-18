package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ sb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sb0 c;
    public final /* synthetic */ sb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ w2(sb0 sb0Var, int i7, sb0 sb0Var2, sb0 sb0Var3, int i10, int i11, int i12) {
        this.a = sb0Var;
        this.b = i7;
        this.c = sb0Var2;
        this.d = sb0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sb0 sb0Var = this.a;
        int value = sb0Var.getValue();
        int i7 = this.b;
        sb0 sb0Var2 = this.c;
        sb0 sb0Var3 = this.d;
        if (value == i7) {
            sb0Var2.setMinValue(1);
            try {
                sb0Var2.setMaxValue(YearMonth.of(2024, sb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                sb0Var2.setMaxValue(31);
            }
            sb0Var3.setMinValue(0);
            sb0Var3.setMaxValue(11);
            return;
        }
        if (sb0Var.getValue() != this.e) {
            sb0Var2.setMinValue(1);
            try {
                sb0Var2.setMaxValue(YearMonth.of(sb0Var.getValue(), sb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                sb0Var2.setMaxValue(31);
            }
            sb0Var3.setMinValue(0);
            sb0Var3.setMaxValue(11);
            return;
        }
        sb0Var3.setMinValue(0);
        int i10 = this.f;
        sb0Var3.setMaxValue(i10);
        if (sb0Var3.getValue() == i10) {
            sb0Var2.setMinValue(1);
            sb0Var2.setMaxValue(this.h);
            return;
        }
        sb0Var2.setMinValue(1);
        try {
            sb0Var2.setMaxValue(YearMonth.of(sb0Var.getValue(), sb0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            sb0Var2.setMaxValue(31);
        }
    }
}
