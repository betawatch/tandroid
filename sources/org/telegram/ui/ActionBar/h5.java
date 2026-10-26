package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class h5 implements u6 {
    public final /* synthetic */ int a;
    public SparseIntArray b;
    public Object c;

    public /* synthetic */ h5() {
        this.a = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        switch (this.a) {
        }
        return y6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                y6.q(f7, f10, i10, i11);
                break;
            default:
                u6 u6Var = (u6) this.c;
                if (u6Var != null) {
                    u6Var.b(f7, f10, i10, i11);
                    break;
                } else {
                    y6.q(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return y6.v3;
            default:
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.v3 : u6Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return y6.U0(str);
            default:
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.U0(str) : u6Var.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        switch (this.a) {
            case 0:
                return g(i10);
            default:
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.x0(null, i10, false) : u6Var.e(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean f() {
        switch (this.a) {
            case 0:
                return false;
            default:
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.c1() : u6Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : y6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.x0(null, i10, false) : u6Var.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            default:
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.Q0(str) : u6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void h(int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                u6 u6Var = (u6) this.c;
                if (u6Var != null) {
                    u6Var.h(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        switch (this.a) {
            case 0:
                return this.b.get(i10);
            default:
                u6 u6Var = (u6) this.c;
                return u6Var == null ? y6.x0(null, i10, false) : u6Var.i(i10);
        }
    }

    public h5(u6 u6Var) {
        this.a = 1;
        this.b = new SparseIntArray();
        this.c = u6Var;
        j();
    }

    public void j() {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }
}
