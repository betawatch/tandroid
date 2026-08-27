package hh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i3(int i10, int i11, org.telegram.ui.Components.l3 l3Var, org.telegram.ui.Components.n3 n3Var, int i12, org.telegram.ui.Components.m3 m3Var) {
        this.b = i10;
        this.c = i11;
        this.e = l3Var;
        this.f = n3Var;
        this.d = i12;
        this.g = m3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                i5.E0((i5) this.e, this.b, this.c, this.d, (TL_stars.TL_starGiftUnique) this.f, (cg.y2[]) this.g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.l3 l3Var = (org.telegram.ui.Components.l3) this.e;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.f;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.g;
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
                    i11 = l3Var.getValue();
                    i10 = n3Var.getValue();
                } else {
                    int i18 = this.d;
                    i10 = i18 % 60;
                    i11 = (i18 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                l3Var.setMinValue(i14);
                l3Var.setMaxValue(i17);
                if (i11 > i17) {
                    l3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    l3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    n3Var.setMinValue(i13);
                    n3Var.setMaxValue(i14 == i17 ? i16 : 59);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    n3Var.setMinValue(i13);
                    n3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    n3Var.setMinValue(i13);
                    n3Var.setMaxValue(i16);
                } else {
                    n3Var.setMinValue(0);
                    n3Var.setMaxValue(59);
                }
                if (i10 > n3Var.getMaxValue()) {
                    i10 = n3Var.getMaxValue();
                    n3Var.setValue(i10);
                } else if (i10 < n3Var.getMinValue()) {
                    i10 = n3Var.getMinValue();
                    n3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    l3Var.setValue(i11);
                    n3Var.setValue(i10);
                }
                m3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ i3(i5 i5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, cg.y2[] y2VarArr) {
        this.e = i5Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = tL_starGiftUnique;
        this.g = y2VarArr;
    }
}
