package gi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.az;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class e5 implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ e5() {
        this.a = 1;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.k6.I.q();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i3, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                if (e6Var != null) {
                    e6Var.b(f10, f11, i3, i10);
                    break;
                } else {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                if (((PorterDuffColorFilter) this.b) == null) {
                    this.b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.b;
            case 1:
                return org.telegram.ui.ActionBar.k6.v3;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var == null ? org.telegram.ui.ActionBar.k6.v3 : e6Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.ActionBar.e6) this.c).d(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var == null ? org.telegram.ui.ActionBar.k6.V0(str) : e6Var.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        switch (this.a) {
        }
        return az.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i3) {
        switch (this.a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var == null ? org.telegram.ui.ActionBar.k6.x0(null, i3, false) : e6Var.f(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var == null ? org.telegram.ui.ActionBar.k6.d1() : e6Var.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var == null ? org.telegram.ui.ActionBar.k6.R0(str) : e6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i3) {
        switch (this.a) {
            case 0:
                if (i3 == org.telegram.ui.ActionBar.k6.G8) {
                    return -14145495;
                }
                if (i3 != org.telegram.ui.ActionBar.k6.E8) {
                    if (i3 == org.telegram.ui.ActionBar.k6.h5) {
                        return -14737633;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.j5) {
                        return -592138;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.r5) {
                        return -8553091;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.wf) {
                        return -16777216;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.zf) {
                        return -1610612736;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.Cf || i3 == org.telegram.ui.ActionBar.k6.Gf || i3 == org.telegram.ui.ActionBar.k6.Bf) {
                        return -9539985;
                    }
                    if (i3 != org.telegram.ui.ActionBar.k6.G6) {
                        int i10 = org.telegram.ui.ActionBar.k6.Ai;
                        if (i3 == i10) {
                            return -11754001;
                        }
                        if (i3 == org.telegram.ui.ActionBar.k6.i6) {
                            return 536870911;
                        }
                        if (i3 != org.telegram.ui.ActionBar.k6.ti && i3 != org.telegram.ui.ActionBar.k6.si && i3 != org.telegram.ui.ActionBar.k6.ui) {
                            if (i3 == org.telegram.ui.ActionBar.k6.vi) {
                                return 352321535;
                            }
                            if (i3 == org.telegram.ui.ActionBar.k6.yf || i3 == i10) {
                                return -7895161;
                            }
                            if (i3 == org.telegram.ui.ActionBar.k6.xf) {
                                return 780633991;
                            }
                            if (i3 == org.telegram.ui.ActionBar.k6.a7) {
                                return -15921907;
                            }
                            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                            return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.v0(i3);
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i3);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : org.telegram.ui.ActionBar.k6.v0(i3);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i3);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var2 == null ? org.telegram.ui.ActionBar.k6.v0(i3) : e6Var2.h(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void i(int i3, int i10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                if (e6Var != null) {
                    e6Var.i(i3, i10);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i3) {
        switch (this.a) {
            case 0:
                return h(i3);
            case 1:
                return ((SparseIntArray) this.b).get(i3);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                return e6Var == null ? org.telegram.ui.ActionBar.k6.x0(null, i3, false) : e6Var.j(i3);
        }
    }

    public e5(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i3;
        switch (i3) {
            case 2:
                this.b = new SparseIntArray();
                this.c = e6Var;
                k();
                break;
            default:
                this.c = e6Var;
                break;
        }
    }

    public void k() {
    }

    private final /* synthetic */ void l(int i3, int i10) {
    }

    private final /* synthetic */ void m(int i3, int i10) {
    }
}
