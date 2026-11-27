// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gd implements vnb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // vnb
    public final boolean a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            default:
                return aob.I.o();
            case 3:
                return ((h48) obj).T;
            case 4:
                return ((lqb) obj).f.a.a();
        }
    }

    @Override // vnb
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                aob.q(f, f2, i, i2);
                break;
            case 4:
                rpb rpbVar = ((lqb) this.b).f.a;
                if (rpbVar == null) {
                    aob.q(f, f2, i, i2);
                    break;
                } else {
                    rpbVar.b(f, f2, i, i2);
                    break;
                }
        }
    }

    @Override // vnb
    public final ColorFilter c() {
        byte b = this.a;
        return aob.v3;
    }

    @Override // vnb
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            default:
                return aob.T0(str);
            case 3:
                return aob.T0(str);
            case 4:
                return ((lqb) this.b).f.a.d(str);
        }
    }

    @Override // vnb
    public final boolean e() {
        byte b = this.a;
        return xea.D0;
    }

    @Override // vnb
    public final int f(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((id) obj).e(i);
            case 1:
                return ((e) obj).getThemedColor(i);
            case 2:
                return ((zu1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((lqb) obj).f.a.h(i);
            default:
                return ((l9c) obj).I(i);
        }
    }

    @Override // vnb
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return ((lqb) this.b).f.a.g();
            default:
                return false;
        }
    }

    @Override // vnb
    public final Drawable getDrawable(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return null;
            case 3:
                h48 h48Var = (h48) obj;
                if (str.equals("drawableMsgIn")) {
                    return h48Var.x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return h48Var.y;
                }
                vnb vnbVar = h48Var.s;
                return vnbVar != null ? vnbVar.getDrawable(str) : aob.P0(str);
            case 4:
                pqb pqbVar = ((lqb) obj).f;
                if (str.equals("drawableMsgOut")) {
                    return pqbVar.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return pqbVar.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return pqbVar.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return pqbVar.W;
                }
                rpb rpbVar = pqbVar.a;
                return rpbVar != null ? rpbVar.getDrawable(str) : aob.P0(str);
            default:
                return null;
        }
    }

    @Override // vnb
    public final int h(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((id) obj).e(i);
            case 1:
                return ((e) obj).getThemedColor(i);
            case 2:
                return ((zu1) obj).getThemedColor(i);
            case 3:
                h48 h48Var = (h48) obj;
                SparseIntArray sparseIntArray = h48Var.w;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                vnb vnbVar = h48Var.s;
                return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
            case 4:
                return ((lqb) obj).f.a.h(i);
            default:
                return ((l9c) obj).I(i);
        }
    }

    @Override // vnb
    public final void i(int i, int i2) {
        byte b = this.a;
    }

    @Override // vnb
    public final int j(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((id) obj).e(i);
            case 1:
                return ((e) obj).getThemedColor(i);
            case 2:
                return ((zu1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((lqb) obj).f.a.j(i);
            default:
                return ((l9c) obj).I(i);
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
