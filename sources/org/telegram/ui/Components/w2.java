package org.telegram.ui.Components;

import j$.time.YearMonth;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ qb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qb0 c;
    public final /* synthetic */ qb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ w2(qb0 qb0Var, int i7, qb0 qb0Var2, qb0 qb0Var3, int i10, int i11, int i12) {
        this.a = qb0Var;
        this.b = i7;
        this.c = qb0Var2;
        this.d = qb0Var3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qb0 qb0Var = this.a;
        int value = qb0Var.getValue();
        int i7 = this.b;
        qb0 qb0Var2 = this.c;
        qb0 qb0Var3 = this.d;
        if (value == i7) {
            qb0Var2.setMinValue(1);
            try {
                qb0Var2.setMaxValue(YearMonth.of(2024, qb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                qb0Var2.setMaxValue(31);
            }
            qb0Var3.setMinValue(0);
            qb0Var3.setMaxValue(11);
            return;
        }
        if (qb0Var.getValue() != this.e) {
            qb0Var2.setMinValue(1);
            try {
                qb0Var2.setMaxValue(YearMonth.of(qb0Var.getValue(), qb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                qb0Var2.setMaxValue(31);
            }
            qb0Var3.setMinValue(0);
            qb0Var3.setMaxValue(11);
            return;
        }
        qb0Var3.setMinValue(0);
        int i10 = this.f;
        qb0Var3.setMaxValue(i10);
        if (qb0Var3.getValue() == i10) {
            qb0Var2.setMinValue(1);
            qb0Var2.setMaxValue(this.h);
            return;
        }
        qb0Var2.setMinValue(1);
        try {
            qb0Var2.setMaxValue(YearMonth.of(qb0Var.getValue(), qb0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
            qb0Var2.setMaxValue(31);
        }
    }
}
