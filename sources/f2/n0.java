package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(k0 k0Var, int i10) {
        super(k0Var);
        this.d = i10;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y10;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                y10 = x0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                y10 = x0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin;
                break;
        }
        return y10 + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int measuredWidth;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                Rect rect = ((y0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                Rect rect2 = ((y0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) y0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int measuredHeight;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                Rect rect = ((y0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) y0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                Rect rect2 = ((y0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) y0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int x8;
        int i10;
        switch (this.d) {
            case 0:
                y0 y0Var = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                x8 = x0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
                break;
            default:
                y0 y0Var2 = (y0) view.getLayoutParams();
                ((k0) this.b).getClass();
                x8 = x0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) y0Var2).topMargin;
                break;
        }
        return x8 - i10;
    }

    @Override // androidx.emoji2.text.g
    public final int e() {
        switch (this.d) {
            case 0:
                return ((k0) this.b).m;
            default:
                return ((k0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.b;
                i10 = k0Var.m;
                E = k0Var.E();
                break;
            default:
                k0 k0Var2 = (k0) this.b;
                i10 = k0Var2.n;
                E = k0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.d) {
            case 0:
                return ((k0) this.b).E();
            default:
                return ((k0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((k0) this.b).k;
            default:
                return ((k0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((k0) this.b).l;
            default:
                return ((k0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((k0) this.b).D();
            default:
                return ((k0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.b;
                return (k0Var.m - k0Var.D()) - k0Var.E();
            default:
                return ((k0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l(View view) {
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.b;
                Rect rect = (Rect) this.c;
                k0Var.L(view, rect);
                return rect.right;
            default:
                k0 k0Var2 = (k0) this.b;
                Rect rect2 = (Rect) this.c;
                k0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                k0 k0Var = (k0) this.b;
                Rect rect = (Rect) this.c;
                k0Var.L(view, rect);
                return rect.left;
            default:
                k0 k0Var2 = (k0) this.b;
                Rect rect2 = (Rect) this.c;
                k0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((k0) this.b).b;
                if (recyclerView != null) {
                    int o10 = recyclerView.e.o();
                    for (int i11 = 0; i11 < o10; i11++) {
                        recyclerView.e.n(i11).offsetLeftAndRight(i10);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((k0) this.b).b;
                if (recyclerView2 != null) {
                    int o11 = recyclerView2.e.o();
                    for (int i12 = 0; i12 < o11; i12++) {
                        recyclerView2.e.n(i12).offsetTopAndBottom(i10);
                    }
                    break;
                }
                break;
        }
    }
}
