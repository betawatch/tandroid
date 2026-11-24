// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fe implements ylb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ylb
    public final boolean a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            default:
                return cmb.I.o();
            case 3:
                return ((d38) obj).T;
            case 4:
                return ((nob) obj).f.a.a();
        }
    }

    @Override // ylb
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                cmb.q(f, f2, i, i2);
                break;
            case 4:
                tnb tnbVar = ((nob) this.b).f.a;
                if (tnbVar == null) {
                    cmb.q(f, f2, i, i2);
                    break;
                } else {
                    tnbVar.b(f, f2, i, i2);
                    break;
                }
        }
    }

    @Override // ylb
    public final ColorFilter c() {
        byte b = this.a;
        return cmb.u3;
    }

    @Override // ylb
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            default:
                return cmb.T0(str);
            case 3:
                return cmb.T0(str);
            case 4:
                return ((nob) this.b).f.a.d(str);
        }
    }

    @Override // ylb
    public final boolean e() {
        byte b = this.a;
        return gda.D0;
    }

    @Override // ylb
    public final int f(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((he) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((yv1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((nob) obj).f.a.h(i);
            default:
                return ((l7c) obj).I(i);
        }
    }

    @Override // ylb
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return ((nob) this.b).f.a.g();
            default:
                return false;
        }
    }

    @Override // ylb
    public final Drawable getDrawable(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return null;
            case 3:
                d38 d38Var = (d38) obj;
                if (str.equals("drawableMsgIn")) {
                    return d38Var.x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return d38Var.y;
                }
                ylb ylbVar = d38Var.s;
                return ylbVar != null ? ylbVar.getDrawable(str) : cmb.P0(str);
            case 4:
                rob robVar = ((nob) obj).f;
                if (str.equals("drawableMsgOut")) {
                    return robVar.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return robVar.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return robVar.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return robVar.W;
                }
                tnb tnbVar = robVar.a;
                return tnbVar != null ? tnbVar.getDrawable(str) : cmb.P0(str);
            default:
                return null;
        }
    }

    @Override // ylb
    public final int h(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((he) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((yv1) obj).getThemedColor(i);
            case 3:
                d38 d38Var = (d38) obj;
                SparseIntArray sparseIntArray = d38Var.w;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                ylb ylbVar = d38Var.s;
                return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
            case 4:
                return ((nob) obj).f.a.h(i);
            default:
                return ((l7c) obj).I(i);
        }
    }

    @Override // ylb
    public final void i(int i, int i2) {
        byte b = this.a;
    }

    @Override // ylb
    public final int j(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((he) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((yv1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((nob) obj).f.a.j(i);
            default:
                return ((l7c) obj).I(i);
        }
    }

    private final void k(int i, int i2) {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }

    private final void n(int i, int i2) {
    }

    private final void o(int i, int i2) {
    }

    private final void p(int i, int i2) {
    }
}
