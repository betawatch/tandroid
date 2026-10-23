package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class f5 implements g6 {
    public final /* synthetic */ int a;
    public SparseIntArray b;
    public Object c;

    public /* synthetic */ f5() {
        this.a = 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        switch (this.a) {
        }
        return k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                k6.q(f7, f10, i10, i11);
                break;
            default:
                g6 g6Var = (g6) this.c;
                if (g6Var != null) {
                    g6Var.b(f7, f10, i10, i11);
                    break;
                } else {
                    k6.q(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return k6.v3;
            default:
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.v3 : g6Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return k6.U0(str);
            default:
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.U0(str) : g6Var.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e(int i10) {
        switch (this.a) {
            case 0:
                return g(i10);
            default:
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.x0(null, i10, false) : g6Var.e(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean f() {
        switch (this.a) {
            case 0:
                return false;
            default:
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.c1() : g6Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int g(int i10) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : k6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.x0(null, i10, false) : g6Var.g(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            default:
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.Q0(str) : g6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void h(int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                g6 g6Var = (g6) this.c;
                if (g6Var != null) {
                    g6Var.h(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int i(int i10) {
        switch (this.a) {
            case 0:
                return this.b.get(i10);
            default:
                g6 g6Var = (g6) this.c;
                return g6Var == null ? k6.x0(null, i10, false) : g6Var.i(i10);
        }
    }

    public f5(g6 g6Var) {
        this.a = 1;
        this.b = new SparseIntArray();
        this.c = g6Var;
        j();
    }

    public void j() {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }
}
