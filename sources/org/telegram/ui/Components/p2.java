package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ ac0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ac0 c;
    public final /* synthetic */ ac0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ p2(ac0 ac0Var, int i10, ac0 ac0Var2, ac0 ac0Var3, int i11, int i12, int i13) {
        this.a = ac0Var;
        this.b = i10;
        this.c = ac0Var2;
        this.d = ac0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac0 ac0Var = this.a;
        int value = ac0Var.getValue();
        int i10 = this.b;
        ac0 ac0Var2 = this.c;
        ac0 ac0Var3 = this.d;
        if (value == i10) {
            ac0Var2.setMinValue(1);
            try {
                ac0Var2.setMaxValue(YearMonth.of(2024, ac0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                ac0Var2.setMaxValue(31);
            }
            ac0Var3.setMinValue(0);
            ac0Var3.setMaxValue(11);
            return;
        }
        if (ac0Var.getValue() != this.e) {
            ac0Var2.setMinValue(1);
            try {
                ac0Var2.setMaxValue(YearMonth.of(ac0Var.getValue(), ac0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                ac0Var2.setMaxValue(31);
            }
            ac0Var3.setMinValue(0);
            ac0Var3.setMaxValue(11);
            return;
        }
        ac0Var3.setMinValue(0);
        int i11 = this.f;
        ac0Var3.setMaxValue(i11);
        if (ac0Var3.getValue() == i11) {
            ac0Var2.setMinValue(1);
            ac0Var2.setMaxValue(this.h);
            return;
        }
        ac0Var2.setMinValue(1);
        try {
            ac0Var2.setMaxValue(YearMonth.of(ac0Var.getValue(), ac0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
            ac0Var2.setMaxValue(31);
        }
    }
}
