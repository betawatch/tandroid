package bi;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t4(int i10, int i11, org.telegram.ui.Components.s3 s3Var, org.telegram.ui.Components.u3 u3Var, int i12, org.telegram.ui.Components.t3 t3Var) {
        this.b = i10;
        this.c = i11;
        this.e = s3Var;
        this.f = u3Var;
        this.d = i12;
        this.g = t3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                h7.W0((h7) this.e, this.b, this.c, this.d, (vg.n1[]) this.f, (TL_stars.TL_starGiftUnique) this.g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.e;
                org.telegram.ui.Components.u3 u3Var = (org.telegram.ui.Components.u3) this.f;
                org.telegram.ui.Components.t3 t3Var = (org.telegram.ui.Components.t3) this.g;
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
                    i11 = s3Var.getValue();
                    i10 = u3Var.getValue();
                } else {
                    int i18 = this.d;
                    i10 = i18 % 60;
                    i11 = (i18 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                s3Var.setMinValue(i14);
                s3Var.setMaxValue(i17);
                if (i11 > i17) {
                    s3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    s3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i14 == i17 ? i16 : 59);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i16);
                } else {
                    u3Var.setMinValue(0);
                    u3Var.setMaxValue(59);
                }
                if (i10 > u3Var.getMaxValue()) {
                    i10 = u3Var.getMaxValue();
                    u3Var.setValue(i10);
                } else if (i10 < u3Var.getMinValue()) {
                    i10 = u3Var.getMinValue();
                    u3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    s3Var.setValue(i11);
                    u3Var.setValue(i10);
                }
                t3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ t4(h7 h7Var, int i10, int i11, int i12, vg.n1[] n1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = h7Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = n1VarArr;
        this.g = tL_starGiftUnique;
    }
}
