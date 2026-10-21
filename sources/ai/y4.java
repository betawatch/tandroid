package ai;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y4(int i10, int i11, org.telegram.ui.Components.r3 r3Var, org.telegram.ui.Components.t3 t3Var, int i12, org.telegram.ui.Components.s3 s3Var) {
        this.b = i10;
        this.c = i11;
        this.e = r3Var;
        this.f = t3Var;
        this.d = i12;
        this.g = s3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                l7.X0((l7) this.e, this.b, this.c, this.d, (ug.m1[]) this.f, (TL_stars.TL_starGiftUnique) this.g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.e;
                org.telegram.ui.Components.t3 t3Var = (org.telegram.ui.Components.t3) this.f;
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.g;
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
                    i11 = r3Var.getValue();
                    i10 = t3Var.getValue();
                } else {
                    int i18 = this.d;
                    i10 = i18 % 60;
                    i11 = (i18 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                r3Var.setMinValue(i14);
                r3Var.setMaxValue(i17);
                if (i11 > i17) {
                    r3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    r3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    t3Var.setMinValue(i13);
                    t3Var.setMaxValue(i14 == i17 ? i16 : 59);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    t3Var.setMinValue(i13);
                    t3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    t3Var.setMinValue(i13);
                    t3Var.setMaxValue(i16);
                } else {
                    t3Var.setMinValue(0);
                    t3Var.setMaxValue(59);
                }
                if (i10 > t3Var.getMaxValue()) {
                    i10 = t3Var.getMaxValue();
                    t3Var.setValue(i10);
                } else if (i10 < t3Var.getMinValue()) {
                    i10 = t3Var.getMinValue();
                    t3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    r3Var.setValue(i11);
                    t3Var.setValue(i10);
                }
                s3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ y4(l7 l7Var, int i10, int i11, int i12, ug.m1[] m1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = l7Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = m1VarArr;
        this.g = tL_starGiftUnique;
    }
}
