package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.iz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class g5 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ g5() {
        this.a = 1;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.m6.I.q();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                break;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                if (h6Var != null) {
                    h6Var.b(f10, f11, i7, i10);
                    break;
                } else {
                    org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                if (((PorterDuffColorFilter) this.b) == null) {
                    this.b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.b;
            case 1:
                return org.telegram.ui.ActionBar.m6.v3;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var == null ? org.telegram.ui.ActionBar.m6.v3 : h6Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.ActionBar.h6) this.c).d(str);
            case 1:
                return org.telegram.ui.ActionBar.m6.V0(str);
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var == null ? org.telegram.ui.ActionBar.m6.V0(str) : h6Var.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean e() {
        switch (this.a) {
        }
        return iz.H0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int f(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var == null ? org.telegram.ui.ActionBar.m6.x0(null, i7, false) : h6Var.f(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var == null ? org.telegram.ui.ActionBar.m6.d1() : h6Var.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var == null ? org.telegram.ui.ActionBar.m6.R0(str) : h6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == org.telegram.ui.ActionBar.m6.G8) {
                    return -14145495;
                }
                if (i7 != org.telegram.ui.ActionBar.m6.E8) {
                    if (i7 == org.telegram.ui.ActionBar.m6.h5) {
                        return -14737633;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.j5) {
                        return -592138;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.r5) {
                        return -8553091;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.wf) {
                        return -16777216;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.zf) {
                        return -1610612736;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.Cf || i7 == org.telegram.ui.ActionBar.m6.Gf || i7 == org.telegram.ui.ActionBar.m6.Bf) {
                        return -9539985;
                    }
                    if (i7 != org.telegram.ui.ActionBar.m6.G6) {
                        int i10 = org.telegram.ui.ActionBar.m6.Ai;
                        if (i7 == i10) {
                            return -11754001;
                        }
                        if (i7 == org.telegram.ui.ActionBar.m6.i6) {
                            return 536870911;
                        }
                        if (i7 != org.telegram.ui.ActionBar.m6.ti && i7 != org.telegram.ui.ActionBar.m6.si && i7 != org.telegram.ui.ActionBar.m6.ui) {
                            if (i7 == org.telegram.ui.ActionBar.m6.vi) {
                                return 352321535;
                            }
                            if (i7 == org.telegram.ui.ActionBar.m6.yf || i7 == i10) {
                                return -7895161;
                            }
                            if (i7 == org.telegram.ui.ActionBar.m6.xf) {
                                return 780633991;
                            }
                            if (i7 == org.telegram.ui.ActionBar.m6.a7) {
                                return -15921907;
                            }
                            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                            return h6Var != null ? h6Var.h(i7) : org.telegram.ui.ActionBar.m6.v0(i7);
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : org.telegram.ui.ActionBar.m6.v0(i7);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i7);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var2 == null ? org.telegram.ui.ActionBar.m6.v0(i7) : h6Var2.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void i(int i7, int i10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                if (h6Var != null) {
                    h6Var.i(i7, i10);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int j(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return ((SparseIntArray) this.b).get(i7);
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                return h6Var == null ? org.telegram.ui.ActionBar.m6.x0(null, i7, false) : h6Var.j(i7);
        }
    }

    public g5(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = i7;
        switch (i7) {
            case 2:
                this.b = new SparseIntArray();
                this.c = h6Var;
                k();
                break;
            default:
                this.c = h6Var;
                break;
        }
    }

    public void k() {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
