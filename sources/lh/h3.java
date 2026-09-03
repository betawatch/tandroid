package lh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h3(int i10, int i11, org.telegram.ui.Components.m3 m3Var, org.telegram.ui.Components.o3 o3Var, int i12, org.telegram.ui.Components.n3 n3Var) {
        this.b = i10;
        this.c = i11;
        this.e = m3Var;
        this.f = o3Var;
        this.d = i12;
        this.g = n3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                g5.E0((g5) this.e, this.b, this.c, this.d, (TL_stars.TL_starGiftUnique) this.f, (gg.v2[]) this.g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.e;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) this.f;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.g;
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
                    i11 = m3Var.getValue();
                    i10 = o3Var.getValue();
                } else {
                    int i18 = this.d;
                    i10 = i18 % 60;
                    i11 = (i18 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                m3Var.setMinValue(i14);
                m3Var.setMaxValue(i17);
                if (i11 > i17) {
                    m3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    m3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    o3Var.setMinValue(i13);
                    o3Var.setMaxValue(i14 == i17 ? i16 : 59);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    o3Var.setMinValue(i13);
                    o3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    o3Var.setMinValue(i13);
                    o3Var.setMaxValue(i16);
                } else {
                    o3Var.setMinValue(0);
                    o3Var.setMaxValue(59);
                }
                if (i10 > o3Var.getMaxValue()) {
                    i10 = o3Var.getMaxValue();
                    o3Var.setValue(i10);
                } else if (i10 < o3Var.getMinValue()) {
                    i10 = o3Var.getMinValue();
                    o3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i11);
                    o3Var.setValue(i10);
                }
                n3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ h3(g5 g5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, gg.v2[] v2VarArr) {
        this.e = g5Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.f = tL_starGiftUnique;
        this.g = v2VarArr;
    }
}
