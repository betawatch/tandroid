package jh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i3(int i10, int i11, org.telegram.ui.Components.p3 p3Var, org.telegram.ui.Components.r3 r3Var, int i12, org.telegram.ui.Components.q3 q3Var) {
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
                h5.E0((h5) this.e, this.b, this.c, this.d, (TL_stars.TL_starGiftUnique) this.f, (eg.w2[]) this.g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.p3 p3Var = (org.telegram.ui.Components.p3) this.e;
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.f;
                org.telegram.ui.Components.q3 q3Var = (org.telegram.ui.Components.q3) this.g;
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
        }
    }

    public /* synthetic */ i3(h5 h5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, eg.w2[] w2VarArr) {
        this.e = h5Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = tL_starGiftUnique;
        this.g = w2VarArr;
    }
}
