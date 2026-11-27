// default package

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gu7 extends vr2 {
    public final /* synthetic */ byte d;

    public gu7(x46 x46Var, byte b) {
        this.d = b;
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = x46Var;
    }

    @Override // vr2
    public final int a(View view) {
        int x;
        int i;
        switch (this.d) {
            case 0:
                r79 r79Var = (r79) view.getLayoutParams();
                x = q79.x(view);
                i = ((ViewGroup.MarginLayoutParams) r79Var).rightMargin;
                break;
            default:
                r79 r79Var2 = (r79) view.getLayoutParams();
                x = q79.v(view);
                i = ((ViewGroup.MarginLayoutParams) r79Var2).bottomMargin;
                break;
        }
        return x + i;
    }

    @Override // vr2
    public final int b(View view) {
        int measuredWidth;
        int i;
        switch (this.d) {
            case 0:
                r79 r79Var = (r79) view.getLayoutParams();
                Rect rect = ((r79) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) r79Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) r79Var).rightMargin;
                break;
            default:
                r79 r79Var2 = (r79) view.getLayoutParams();
                Rect rect2 = ((r79) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) r79Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) r79Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // vr2
    public final int c(View view) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                r79 r79Var = (r79) view.getLayoutParams();
                Rect rect = ((r79) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) r79Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin;
                break;
            default:
                r79 r79Var2 = (r79) view.getLayoutParams();
                Rect rect2 = ((r79) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) r79Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) r79Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // vr2
    public final int d(View view) {
        int w;
        int i;
        switch (this.d) {
            case 0:
                r79 r79Var = (r79) view.getLayoutParams();
                w = q79.w(view);
                i = ((ViewGroup.MarginLayoutParams) r79Var).leftMargin;
                break;
            default:
                r79 r79Var2 = (r79) view.getLayoutParams();
                w = q79.y(view);
                i = ((ViewGroup.MarginLayoutParams) r79Var2).topMargin;
                break;
        }
        return w - i;
    }

    @Override // vr2
    public final int e() {
        switch (this.d) {
            case 0:
                return ((x46) this.b).m;
            default:
                return ((x46) this.b).n;
        }
    }

    @Override // vr2
    public final int f() {
        int i;
        int D;
        switch (this.d) {
            case 0:
                x46 x46Var = (x46) this.b;
                i = x46Var.m;
                D = x46Var.D();
                break;
            default:
                x46 x46Var2 = (x46) this.b;
                i = x46Var2.n;
                D = x46Var2.B();
                break;
        }
        return i - D;
    }

    @Override // vr2
    public final int g() {
        switch (this.d) {
            case 0:
                return ((x46) this.b).D();
            default:
                return ((x46) this.b).B();
        }
    }

    @Override // vr2
    public final int h() {
        switch (this.d) {
            case 0:
                return ((x46) this.b).k;
            default:
                return ((x46) this.b).l;
        }
    }

    @Override // vr2
    public final int i() {
        switch (this.d) {
            case 0:
                return ((x46) this.b).l;
            default:
                return ((x46) this.b).k;
        }
    }

    @Override // vr2
    public final int j() {
        switch (this.d) {
            case 0:
                return ((x46) this.b).C();
            default:
                return ((x46) this.b).I();
        }
    }

    @Override // vr2
    public final int k() {
        switch (this.d) {
            case 0:
                x46 x46Var = (x46) this.b;
                return (x46Var.m - x46Var.C()) - x46Var.D();
            default:
                return ((x46) this.b).J();
        }
    }

    @Override // vr2
    public final int l(View view) {
        switch (this.d) {
            case 0:
                x46 x46Var = (x46) this.b;
                Rect rect = (Rect) this.c;
                x46Var.K(view, rect);
                return rect.right;
            default:
                x46 x46Var2 = (x46) this.b;
                Rect rect2 = (Rect) this.c;
                x46Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // vr2
    public final int m(View view) {
        switch (this.d) {
            case 0:
                x46 x46Var = (x46) this.b;
                Rect rect = (Rect) this.c;
                x46Var.K(view, rect);
                return rect.left;
            default:
                x46 x46Var2 = (x46) this.b;
                Rect rect2 = (Rect) this.c;
                x46Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // vr2
    public final void p(int i) {
        int i2 = 0;
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((x46) this.b).b;
                if (recyclerView != null) {
                    int K = recyclerView.e.K();
                    while (i2 < K) {
                        recyclerView.e.J(i2).offsetLeftAndRight(i);
                        i2++;
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((x46) this.b).b;
                if (recyclerView2 != null) {
                    int K2 = recyclerView2.e.K();
                    while (i2 < K2) {
                        recyclerView2.e.J(i2).offsetTopAndBottom(i);
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
