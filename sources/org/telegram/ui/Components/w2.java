package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ cd0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cd0 c;
    public final /* synthetic */ cd0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ w2(cd0 cd0Var, int i10, cd0 cd0Var2, cd0 cd0Var3, int i11, int i12, int i13) {
        this.a = cd0Var;
        this.b = i10;
        this.c = cd0Var2;
        this.d = cd0Var3;
        this.e = i11;
        this.f = i12;
        this.h = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cd0 cd0Var = this.a;
        int value = cd0Var.getValue();
        int i10 = this.b;
        cd0 cd0Var2 = this.c;
        cd0 cd0Var3 = this.d;
        if (value == i10) {
            cd0Var2.setMinValue(1);
            try {
                cd0Var2.setMaxValue(YearMonth.of(2024, cd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                cd0Var2.setMaxValue(31);
            }
            cd0Var3.setMinValue(0);
            cd0Var3.setMaxValue(11);
            return;
        }
        if (cd0Var.getValue() != this.e) {
            cd0Var2.setMinValue(1);
            try {
                cd0Var2.setMaxValue(YearMonth.of(cd0Var.getValue(), cd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                cd0Var2.setMaxValue(31);
            }
            cd0Var3.setMinValue(0);
            cd0Var3.setMaxValue(11);
            return;
        }
        cd0Var3.setMinValue(0);
        int i11 = this.f;
        cd0Var3.setMaxValue(i11);
        if (cd0Var3.getValue() == i11) {
            cd0Var2.setMinValue(1);
            cd0Var2.setMaxValue(this.h);
            return;
        }
        cd0Var2.setMinValue(1);
        try {
            cd0Var2.setMaxValue(YearMonth.of(cd0Var.getValue(), cd0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e10) {
            FileLog.e(e10);
            cd0Var2.setMaxValue(31);
        }
    }
}
