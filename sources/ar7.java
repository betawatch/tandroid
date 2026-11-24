// default package

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ar7 extends cr2 {
    public final /* synthetic */ byte d;

    public ar7(t26 t26Var, byte b) {
        this.d = b;
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = t26Var;
    }

    @Override // cr2
    public final int a(View view) {
        int x;
        int i;
        switch (this.d) {
            case 0:
                e49 e49Var = (e49) view.getLayoutParams();
                x = d49.x(view);
                i = ((ViewGroup.MarginLayoutParams) e49Var).rightMargin;
                break;
            default:
                e49 e49Var2 = (e49) view.getLayoutParams();
                x = d49.v(view);
                i = ((ViewGroup.MarginLayoutParams) e49Var2).bottomMargin;
                break;
        }
        return x + i;
    }

    @Override // cr2
    public final int b(View view) {
        int measuredWidth;
        int i;
        switch (this.d) {
            case 0:
                e49 e49Var = (e49) view.getLayoutParams();
                Rect rect = ((e49) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) e49Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var).rightMargin;
                break;
            default:
                e49 e49Var2 = (e49) view.getLayoutParams();
                Rect rect2 = ((e49) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) e49Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // cr2
    public final int c(View view) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                e49 e49Var = (e49) view.getLayoutParams();
                Rect rect = ((e49) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) e49Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin;
                break;
            default:
                e49 e49Var2 = (e49) view.getLayoutParams();
                Rect rect2 = ((e49) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) e49Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) e49Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // cr2
    public final int d(View view) {
        int w;
        int i;
        switch (this.d) {
            case 0:
                e49 e49Var = (e49) view.getLayoutParams();
                w = d49.w(view);
                i = ((ViewGroup.MarginLayoutParams) e49Var).leftMargin;
                break;
            default:
                e49 e49Var2 = (e49) view.getLayoutParams();
                w = d49.y(view);
                i = ((ViewGroup.MarginLayoutParams) e49Var2).topMargin;
                break;
        }
        return w - i;
    }

    @Override // cr2
    public final int e() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).m;
            default:
                return ((t26) this.b).n;
        }
    }

    @Override // cr2
    public final int f() {
        int i;
        int D;
        switch (this.d) {
            case 0:
                t26 t26Var = (t26) this.b;
                i = t26Var.m;
                D = t26Var.D();
                break;
            default:
                t26 t26Var2 = (t26) this.b;
                i = t26Var2.n;
                D = t26Var2.B();
                break;
        }
        return i - D;
    }

    @Override // cr2
    public final int g() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).D();
            default:
                return ((t26) this.b).B();
        }
    }

    @Override // cr2
    public final int h() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).k;
            default:
                return ((t26) this.b).l;
        }
    }

    @Override // cr2
    public final int i() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).l;
            default:
                return ((t26) this.b).k;
        }
    }

    @Override // cr2
    public final int j() {
        switch (this.d) {
            case 0:
                return ((t26) this.b).C();
            default:
                return ((t26) this.b).I();
        }
    }

    @Override // cr2
    public final int k() {
        switch (this.d) {
            case 0:
                t26 t26Var = (t26) this.b;
                return (t26Var.m - t26Var.C()) - t26Var.D();
            default:
                return ((t26) this.b).J();
        }
    }

    @Override // cr2
    public final int l(View view) {
        switch (this.d) {
            case 0:
                t26 t26Var = (t26) this.b;
                Rect rect = (Rect) this.c;
                t26Var.K(view, rect);
                return rect.right;
            default:
                t26 t26Var2 = (t26) this.b;
                Rect rect2 = (Rect) this.c;
                t26Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // cr2
    public final int m(View view) {
        switch (this.d) {
            case 0:
                t26 t26Var = (t26) this.b;
                Rect rect = (Rect) this.c;
                t26Var.K(view, rect);
                return rect.left;
            default:
                t26 t26Var2 = (t26) this.b;
                Rect rect2 = (Rect) this.c;
                t26Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // cr2
    public final void p(int i) {
        int i2 = 0;
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((t26) this.b).b;
                if (recyclerView != null) {
                    int J = recyclerView.e.J();
                    while (i2 < J) {
                        recyclerView.e.I(i2).offsetLeftAndRight(i);
                        i2++;
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((t26) this.b).b;
                if (recyclerView2 != null) {
                    int J2 = recyclerView2.e.J();
                    while (i2 < J2) {
                        recyclerView2.e.I(i2).offsetTopAndBottom(i);
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
