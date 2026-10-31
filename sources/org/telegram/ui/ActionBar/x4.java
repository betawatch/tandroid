package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.tz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class x4 implements p6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ x4() {
        this.a = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        switch (this.a) {
        }
        return t6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                t6.r(f7, f10, i10, i11);
                break;
            case 1:
                p6 p6Var = (p6) this.c;
                if (p6Var != null) {
                    p6Var.b(f7, f10, i10, i11);
                    break;
                } else {
                    t6.r(f7, f10, i10, i11);
                    break;
                }
            default:
                t6.r(f7, f10, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return t6.v3;
            case 1:
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.v3 : p6Var.c();
            default:
                if (((PorterDuffColorFilter) this.b) == null) {
                    this.b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.b;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return t6.V0(str);
            case 1:
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.V0(str) : p6Var.d(str);
            default:
                return ((p6) this.c).d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        switch (this.a) {
        }
        return tz.H0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        switch (this.a) {
            case 0:
                return h(i10);
            case 1:
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.x0(null, i10, false) : p6Var.f(i10);
            default:
                return h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.d1() : p6Var.g();
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.R0(str) : p6Var.getDrawable(str);
            default:
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : t6.v0(i10);
            case 1:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.v0(i10) : p6Var.h(i10);
            default:
                if (i10 == t6.G8) {
                    return -14145495;
                }
                if (i10 != t6.E8) {
                    if (i10 == t6.h5) {
                        return -14737633;
                    }
                    if (i10 == t6.j5) {
                        return -592138;
                    }
                    if (i10 == t6.r5) {
                        return -8553091;
                    }
                    if (i10 == t6.wf) {
                        return -16777216;
                    }
                    if (i10 == t6.zf) {
                        return -1610612736;
                    }
                    if (i10 == t6.Cf || i10 == t6.Gf || i10 == t6.Bf) {
                        return -9539985;
                    }
                    if (i10 != t6.G6) {
                        int i11 = t6.Ai;
                        if (i10 == i11) {
                            return -11754001;
                        }
                        if (i10 == t6.i6) {
                            return 536870911;
                        }
                        if (i10 != t6.ti && i10 != t6.si && i10 != t6.ui) {
                            if (i10 == t6.vi) {
                                return 352321535;
                            }
                            if (i10 == t6.yf || i10 == i11) {
                                return -7895161;
                            }
                            if (i10 == t6.xf) {
                                return 780633991;
                            }
                            if (i10 == t6.a7) {
                                return -15921907;
                            }
                            p6 p6Var2 = (p6) this.c;
                            return p6Var2 != null ? p6Var2.h(i10) : t6.v0(i10);
                        }
                    }
                }
                return -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void i(int i10, int i11) {
        switch (this.a) {
            case 1:
                p6 p6Var = (p6) this.c;
                if (p6Var != null) {
                    p6Var.i(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        switch (this.a) {
            case 0:
                return ((SparseIntArray) this.b).get(i10);
            case 1:
                p6 p6Var = (p6) this.c;
                return p6Var == null ? t6.x0(null, i10, false) : p6Var.j(i10);
            default:
                return h(i10);
        }
    }

    public x4(int i10, p6 p6Var) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.c = p6Var;
                break;
            default:
                this.b = new SparseIntArray();
                this.c = p6Var;
                k();
                break;
        }
    }

    public void k() {
    }

    private final /* synthetic */ void l(int i10, int i11) {
    }

    private final /* synthetic */ void m(int i10, int i11) {
    }
}
