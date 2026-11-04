package gi;

import android.view.View;
import b8.cd;
import org.telegram.messenger.bd;
import org.telegram.messenger.lc;
import org.telegram.messenger.o10;
import org.telegram.messenger.t10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements o10, w10, hh.d, t10, it0, jt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ i8(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.ui.Components.jt0
    public void c(Object obj, float f10) {
        switch (this.a) {
            case 26:
                ii.a3 a3Var = (ii.a3) obj;
                a3Var.c = f10;
                a3Var.f.invalidate();
                a3Var.Y.setAlpha(f10);
                a3Var.J();
                a3Var.H();
                break;
            default:
                ((ii.w3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return num.intValue() == 0 ? bd.M0(2131748813, null) : bd.H(',', "Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // org.telegram.ui.Components.it0
    public float get(Object obj) {
        switch (this.a) {
            case 25:
                return ((ii.a3) obj).c;
            case 26:
            default:
                return ((ii.c4) obj).getSwipeOffsetY();
            case 27:
                return ((ii.w3) obj).c;
        }
    }

    @Override // hh.d
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        switch (this.a) {
            case 6:
                return z10 ? org.telegram.ui.ActionBar.k6.r1(0.9f, -15658735) : cd.n(lc.e(262144) ? 0.82f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var), -14145496);
            case 7:
                if (!lc.e(256)) {
                    return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                }
                return org.telegram.ui.ActionBar.k6.r1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false));
            case 8:
                return cd.n(lc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Nl, e6Var));
            case 9:
                return org.telegram.ui.ActionBar.k6.r1(lc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, e6Var));
            case 10:
                return cd.n(lc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, e6Var));
            case 11:
                return cd.n(lc.e(262144) ? 0.85f : 0.8f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            case 12:
                return 855638016;
            case 13:
                return TLObject.FLAG_30;
            case 14:
                return org.telegram.ui.ActionBar.k6.r1(z10 ? 0.82f : 0.78f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var));
            case 15:
                return org.telegram.ui.ActionBar.k6.r1(0.075f, -16777216);
            case 16:
                return org.telegram.ui.ActionBar.k6.r1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e6Var));
            case 17:
                return org.telegram.ui.ActionBar.k6.r1(0.88f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            case 18:
                return cd.n(lc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ml, e6Var));
            case 19:
                return org.telegram.ui.ActionBar.k6.r1(lc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            case 20:
                return org.telegram.ui.ActionBar.k6.r1(0.78f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var));
            case 21:
                return org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            case 22:
                lc.e(262144);
                return 0;
            default:
                return org.telegram.ui.ActionBar.k6.r1(lc.e(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
        }
    }
}
