package hi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.bz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public class n5 implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ n5() {
        this.a = 1;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.n6.I.q();
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void c(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                break;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                if (i6Var != null) {
                    i6Var.c(f10, f11, i7, i10);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter d() {
        switch (this.a) {
            case 0:
                if (((PorterDuffColorFilter) this.b) == null) {
                    this.b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.b;
            case 1:
                return org.telegram.ui.ActionBar.n6.v3;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var == null ? org.telegram.ui.ActionBar.n6.v3 : i6Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint e(String str) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.ActionBar.i6) this.c).e(str);
            case 1:
                return org.telegram.ui.ActionBar.n6.V0(str);
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var == null ? org.telegram.ui.ActionBar.n6.V0(str) : i6Var.e(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean f() {
        switch (this.a) {
        }
        return bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int g(int i7) {
        switch (this.a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var == null ? org.telegram.ui.ActionBar.n6.x0(null, i7, false) : i6Var.g(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var == null ? org.telegram.ui.ActionBar.n6.R0(str) : i6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean h() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var == null ? org.telegram.ui.ActionBar.n6.d1() : i6Var.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == org.telegram.ui.ActionBar.n6.G8) {
                    return -14145495;
                }
                if (i7 != org.telegram.ui.ActionBar.n6.E8) {
                    if (i7 == org.telegram.ui.ActionBar.n6.h5) {
                        return -14737633;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.j5) {
                        return -592138;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.r5) {
                        return -8553091;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.zf) {
                        return -16777216;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.Cf) {
                        return -1610612736;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.Ff || i7 == org.telegram.ui.ActionBar.n6.Jf || i7 == org.telegram.ui.ActionBar.n6.Ef) {
                        return -9539985;
                    }
                    if (i7 != org.telegram.ui.ActionBar.n6.G6) {
                        int i10 = org.telegram.ui.ActionBar.n6.Di;
                        if (i7 == i10) {
                            return -11754001;
                        }
                        if (i7 == org.telegram.ui.ActionBar.n6.i6) {
                            return 536870911;
                        }
                        if (i7 != org.telegram.ui.ActionBar.n6.wi && i7 != org.telegram.ui.ActionBar.n6.vi && i7 != org.telegram.ui.ActionBar.n6.xi) {
                            if (i7 == org.telegram.ui.ActionBar.n6.yi) {
                                return 352321535;
                            }
                            if (i7 == org.telegram.ui.ActionBar.n6.Bf || i7 == i10) {
                                return -7895161;
                            }
                            if (i7 == org.telegram.ui.ActionBar.n6.Af) {
                                return 780633991;
                            }
                            if (i7 == org.telegram.ui.ActionBar.n6.a7) {
                                return -15921907;
                            }
                            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                            return i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.v0(i7);
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : org.telegram.ui.ActionBar.n6.v0(i7);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i7);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var2 == null ? org.telegram.ui.ActionBar.n6.v0(i7) : i6Var2.i(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void j(int i7, int i10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                if (i6Var != null) {
                    i6Var.j(i7, i10);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        switch (this.a) {
            case 0:
                return i(i7);
            case 1:
                return ((SparseIntArray) this.b).get(i7);
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                return i6Var == null ? org.telegram.ui.ActionBar.n6.x0(null, i7, false) : i6Var.k(i7);
        }
    }

    public n5(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i7;
        switch (i7) {
            case 2:
                this.b = new SparseIntArray();
                this.c = i6Var;
                a();
                break;
            default:
                this.c = i6Var;
                break;
        }
    }

    public void a() {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
