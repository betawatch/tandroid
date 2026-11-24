// default package

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ct7 extends ns2 {
    public final /* synthetic */ byte d;

    public ct7(u46 u46Var, byte b) {
        this.d = b;
        this.a = TLObject.FLAG_31;
        this.c = new Rect();
        this.b = u46Var;
    }

    @Override // ns2
    public final int a(View view) {
        int x;
        int i;
        switch (this.d) {
            case 0:
                g69 g69Var = (g69) view.getLayoutParams();
                x = f69.x(view);
                i = ((ViewGroup.MarginLayoutParams) g69Var).rightMargin;
                break;
            default:
                g69 g69Var2 = (g69) view.getLayoutParams();
                x = f69.v(view);
                i = ((ViewGroup.MarginLayoutParams) g69Var2).bottomMargin;
                break;
        }
        return x + i;
    }

    @Override // ns2
    public final int b(View view) {
        int measuredWidth;
        int i;
        switch (this.d) {
            case 0:
                g69 g69Var = (g69) view.getLayoutParams();
                Rect rect = ((g69) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) g69Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) g69Var).rightMargin;
                break;
            default:
                g69 g69Var2 = (g69) view.getLayoutParams();
                Rect rect2 = ((g69) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) g69Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) g69Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // ns2
    public final int c(View view) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                g69 g69Var = (g69) view.getLayoutParams();
                Rect rect = ((g69) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) g69Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin;
                break;
            default:
                g69 g69Var2 = (g69) view.getLayoutParams();
                Rect rect2 = ((g69) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) g69Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) g69Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // ns2
    public final int d(View view) {
        int w;
        int i;
        switch (this.d) {
            case 0:
                g69 g69Var = (g69) view.getLayoutParams();
                w = f69.w(view);
                i = ((ViewGroup.MarginLayoutParams) g69Var).leftMargin;
                break;
            default:
                g69 g69Var2 = (g69) view.getLayoutParams();
                w = f69.y(view);
                i = ((ViewGroup.MarginLayoutParams) g69Var2).topMargin;
                break;
        }
        return w - i;
    }

    @Override // ns2
    public final int e() {
        switch (this.d) {
            case 0:
                return ((u46) this.b).m;
            default:
                return ((u46) this.b).n;
        }
    }

    @Override // ns2
    public final int f() {
        int i;
        int D;
        switch (this.d) {
            case 0:
                u46 u46Var = (u46) this.b;
                i = u46Var.m;
                D = u46Var.D();
                break;
            default:
                u46 u46Var2 = (u46) this.b;
                i = u46Var2.n;
                D = u46Var2.B();
                break;
        }
        return i - D;
    }

    @Override // ns2
    public final int g() {
        switch (this.d) {
            case 0:
                return ((u46) this.b).D();
            default:
                return ((u46) this.b).B();
        }
    }

    @Override // ns2
    public final int h() {
        switch (this.d) {
            case 0:
                return ((u46) this.b).k;
            default:
                return ((u46) this.b).l;
        }
    }

    @Override // ns2
    public final int i() {
        switch (this.d) {
            case 0:
                return ((u46) this.b).l;
            default:
                return ((u46) this.b).k;
        }
    }

    @Override // ns2
    public final int j() {
        switch (this.d) {
            case 0:
                return ((u46) this.b).C();
            default:
                return ((u46) this.b).I();
        }
    }

    @Override // ns2
    public final int k() {
        switch (this.d) {
            case 0:
                u46 u46Var = (u46) this.b;
                return (u46Var.m - u46Var.C()) - u46Var.D();
            default:
                return ((u46) this.b).J();
        }
    }

    @Override // ns2
    public final int l(View view) {
        switch (this.d) {
            case 0:
                u46 u46Var = (u46) this.b;
                Rect rect = (Rect) this.c;
                u46Var.K(view, rect);
                return rect.right;
            default:
                u46 u46Var2 = (u46) this.b;
                Rect rect2 = (Rect) this.c;
                u46Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // ns2
    public final int m(View view) {
        switch (this.d) {
            case 0:
                u46 u46Var = (u46) this.b;
                Rect rect = (Rect) this.c;
                u46Var.K(view, rect);
                return rect.left;
            default:
                u46 u46Var2 = (u46) this.b;
                Rect rect2 = (Rect) this.c;
                u46Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // ns2
    public final void p(int i) {
        int i2 = 0;
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((u46) this.b).b;
                if (recyclerView != null) {
                    int L = recyclerView.e.L();
                    while (i2 < L) {
                        recyclerView.e.K(i2).offsetLeftAndRight(i);
                        i2++;
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((u46) this.b).b;
                if (recyclerView2 != null) {
                    int L2 = recyclerView2.e.L();
                    while (i2 < L2) {
                        recyclerView2.e.K(i2).offsetTopAndBottom(i);
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
