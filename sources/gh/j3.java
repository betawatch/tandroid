package gh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j3(int i9, int i10, org.telegram.ui.Components.l3 l3Var, org.telegram.ui.Components.n3 n3Var, int i11, org.telegram.ui.Components.m3 m3Var) {
        this.b = i9;
        this.c = i10;
        this.e = l3Var;
        this.f = n3Var;
        this.d = i11;
        this.g = m3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                k5.D0((k5) this.e, this.b, this.c, this.d, (TL_stars.TL_starGiftUnique) this.f, (bg.g3[]) this.g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.l3 l3Var = (org.telegram.ui.Components.l3) this.e;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.f;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.g;
                Boolean bool = (Boolean) obj;
                int i11 = this.b;
                int i12 = i11 % 60;
                int i13 = (i11 - i12) / 60;
                int i14 = this.c;
                int i15 = i14 % 60;
                int i16 = (i14 - i15) / 60;
                if (i15 == 0 && i16 > 0) {
                    i16--;
                    i15 = 59;
                }
                if (bool.booleanValue()) {
                    i10 = l3Var.getValue();
                    i9 = n3Var.getValue();
                } else {
                    int i17 = this.d;
                    i9 = i17 % 60;
                    i10 = (i17 - i9) / 60;
                    if (i10 == 24) {
                        i10--;
                        i9 = 59;
                    }
                }
                l3Var.setMinValue(i13);
                l3Var.setMaxValue(i16);
                if (i10 > i16) {
                    l3Var.setValue(i16);
                    i10 = i16;
                } else if (i10 < i13) {
                    l3Var.setValue(i13);
                    i10 = i13;
                }
                if (i10 <= i13) {
                    n3Var.setMinValue(i12);
                    n3Var.setMaxValue(i13 == i16 ? i15 : 59);
                } else if (i10 >= i16) {
                    if (i13 != i16) {
                        i12 = 0;
                    }
                    n3Var.setMinValue(i12);
                    n3Var.setMaxValue(i15);
                } else if (i13 == i16) {
                    n3Var.setMinValue(i12);
                    n3Var.setMaxValue(i15);
                } else {
                    n3Var.setMinValue(0);
                    n3Var.setMaxValue(59);
                }
                if (i9 > n3Var.getMaxValue()) {
                    i9 = n3Var.getMaxValue();
                    n3Var.setValue(i9);
                } else if (i9 < n3Var.getMinValue()) {
                    i9 = n3Var.getMinValue();
                    n3Var.setValue(i9);
                }
                if (!bool.booleanValue()) {
                    l3Var.setValue(i10);
                    n3Var.setValue(i9);
                }
                m3Var.invalidate();
                break;
        }
    }

    public /* synthetic */ j3(k5 k5Var, int i9, int i10, int i11, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.g3[] g3VarArr) {
        this.e = k5Var;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.f = tL_starGiftUnique;
        this.g = g3VarArr;
    }
}
