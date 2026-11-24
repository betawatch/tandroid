// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fd implements wjb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // wjb
    public final boolean a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            default:
                return bkb.I.o();
            case 3:
                return ((a18) obj).T;
            case 4:
                return ((mmb) obj).f.a.a();
        }
    }

    @Override // wjb
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                bkb.q(f, f2, i, i2);
                break;
            case 4:
                slb slbVar = ((mmb) this.b).f.a;
                if (slbVar == null) {
                    bkb.q(f, f2, i, i2);
                    break;
                } else {
                    slbVar.b(f, f2, i, i2);
                    break;
                }
        }
    }

    @Override // wjb
    public final ColorFilter c() {
        byte b = this.a;
        return bkb.u3;
    }

    @Override // wjb
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            default:
                return bkb.T0(str);
            case 3:
                return bkb.T0(str);
            case 4:
                return ((mmb) this.b).f.a.d(str);
        }
    }

    @Override // wjb
    public final boolean e() {
        byte b = this.a;
        return gba.D0;
    }

    @Override // wjb
    public final int f(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((hd) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((mu1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((mmb) obj).f.a.h(i);
            default:
                return ((l5c) obj).I(i);
        }
    }

    @Override // wjb
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return ((mmb) this.b).f.a.g();
            default:
                return false;
        }
    }

    @Override // wjb
    public final Drawable getDrawable(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return null;
            case 3:
                a18 a18Var = (a18) obj;
                if (str.equals("drawableMsgIn")) {
                    return a18Var.x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return a18Var.y;
                }
                wjb wjbVar = a18Var.s;
                return wjbVar != null ? wjbVar.getDrawable(str) : bkb.P0(str);
            case 4:
                qmb qmbVar = ((mmb) obj).f;
                if (str.equals("drawableMsgOut")) {
                    return qmbVar.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return qmbVar.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return qmbVar.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return qmbVar.W;
                }
                slb slbVar = qmbVar.a;
                return slbVar != null ? slbVar.getDrawable(str) : bkb.P0(str);
            default:
                return null;
        }
    }

    @Override // wjb
    public final int h(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((hd) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((mu1) obj).getThemedColor(i);
            case 3:
                a18 a18Var = (a18) obj;
                SparseIntArray sparseIntArray = a18Var.w;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                wjb wjbVar = a18Var.s;
                return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
            case 4:
                return ((mmb) obj).f.a.h(i);
            default:
                return ((l5c) obj).I(i);
        }
    }

    @Override // wjb
    public final void i(int i, int i2) {
        byte b = this.a;
    }

    @Override // wjb
    public final int j(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((hd) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((mu1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((mmb) obj).f.a.j(i);
            default:
                return ((l5c) obj).I(i);
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
