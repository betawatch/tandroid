package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h2(int i10, int i11, o3 o3Var, q3 q3Var, int i12, p3 p3Var) {
        this.b = i10;
        this.c = i11;
        this.e = o3Var;
        this.f = q3Var;
        this.d = i12;
        this.g = p3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                o3 o3Var = (o3) this.e;
                q3 q3Var = (q3) this.f;
                p3 p3Var = (p3) this.g;
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
                    i11 = o3Var.getValue();
                    i10 = q3Var.getValue();
                } else {
                    int i18 = this.d;
                    i10 = i18 % 60;
                    i11 = (i18 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                o3Var.setMinValue(i14);
                o3Var.setMaxValue(i17);
                if (i11 > i17) {
                    o3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    o3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    q3Var.setMinValue(i13);
                    q3Var.setMaxValue(i14 == i17 ? i16 : 59);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    q3Var.setMinValue(i13);
                    q3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    q3Var.setMinValue(i13);
                    q3Var.setMaxValue(i16);
                } else {
                    q3Var.setMinValue(0);
                    q3Var.setMaxValue(59);
                }
                if (i10 > q3Var.getMaxValue()) {
                    i10 = q3Var.getMaxValue();
                    q3Var.setValue(i10);
                } else if (i10 < q3Var.getMinValue()) {
                    i10 = q3Var.getMinValue();
                    q3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    o3Var.setValue(i11);
                    q3Var.setValue(i10);
                }
                p3Var.invalidate();
                break;
            default:
                yh.z3.E0((yh.z3) this.e, this.b, this.c, this.d, (TL_stars.TL_starGiftUnique) this.f, (tg.n1[]) this.g, (Long) obj);
                break;
        }
    }

    public /* synthetic */ h2(yh.z3 z3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, tg.n1[] n1VarArr) {
        this.e = z3Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = tL_starGiftUnique;
        this.g = n1VarArr;
    }
}
