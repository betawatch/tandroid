package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h2(int i10, int i11, p3 p3Var, r3 r3Var, int i12, q3 q3Var) {
        this.b = i10;
        this.c = i11;
        this.e = p3Var;
        this.f = r3Var;
        this.d = i12;
        this.g = q3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.e;
                r3 r3Var = (r3) this.f;
                q3 q3Var = (q3) this.g;
                Boolean bool = (Boolean) obj;
                int i12 = this.b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = p3Var.getValue();
                    i10 = r3Var.getValue();
                } else {
                    int i18 = this.d;
                    i10 = i18 % 60;
                    i11 = (i18 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                p3Var.setMinValue(i14);
                p3Var.setMaxValue(i17);
                if (i11 > i17) {
                    p3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    p3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i14 == i17 ? i16 : 59);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i16);
                } else {
                    r3Var.setMinValue(0);
                    r3Var.setMaxValue(59);
                }
                if (i10 > r3Var.getMaxValue()) {
                    i10 = r3Var.getMaxValue();
                    r3Var.setValue(i10);
                } else if (i10 < r3Var.getMinValue()) {
                    i10 = r3Var.getMinValue();
                    r3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    p3Var.setValue(i11);
                    r3Var.setValue(i10);
                }
                q3Var.invalidate();
                break;
            default:
                yh.y3.E0((yh.y3) this.e, this.b, this.c, this.d, (TL_stars.TL_starGiftUnique) this.f, (tg.m1[]) this.g, (Long) obj);
                break;
        }
    }

    public /* synthetic */ h2(yh.y3 y3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, tg.m1[] m1VarArr) {
        this.e = y3Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = tL_starGiftUnique;
        this.g = m1VarArr;
    }
}
