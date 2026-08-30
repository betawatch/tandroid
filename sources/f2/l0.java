package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(i0 i0Var, int i10) {
        super(i0Var);
        this.d = i10;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y10;
        int i10;
        switch (this.d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                y10 = v0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                y10 = v0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
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
                w0 w0Var = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                Rect rect = ((w0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                Rect rect2 = ((w0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
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
                w0 w0Var = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                Rect rect = ((w0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) w0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                Rect rect2 = ((w0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) w0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int x10;
        int i10;
        switch (this.d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                x10 = v0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                ((i0) this.b).getClass();
                x10 = v0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override // androidx.emoji2.text.g
    public final int e() {
        switch (this.d) {
            case 0:
                return ((i0) this.b).m;
            default:
                return ((i0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                i0 i0Var = (i0) this.b;
                i10 = i0Var.m;
                E = i0Var.E();
                break;
            default:
                i0 i0Var2 = (i0) this.b;
                i10 = i0Var2.n;
                E = i0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.d) {
            case 0:
                return ((i0) this.b).E();
            default:
                return ((i0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((i0) this.b).k;
            default:
                return ((i0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((i0) this.b).l;
            default:
                return ((i0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((i0) this.b).D();
            default:
                return ((i0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                i0 i0Var = (i0) this.b;
                return (i0Var.m - i0Var.D()) - i0Var.E();
            default:
                return ((i0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l(View view) {
        switch (this.d) {
            case 0:
                i0 i0Var = (i0) this.b;
                Rect rect = (Rect) this.c;
                i0Var.L(view, rect);
                return rect.right;
            default:
                i0 i0Var2 = (i0) this.b;
                Rect rect2 = (Rect) this.c;
                i0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                i0 i0Var = (i0) this.b;
                Rect rect = (Rect) this.c;
                i0Var.L(view, rect);
                return rect.left;
            default:
                i0 i0Var2 = (i0) this.b;
                Rect rect2 = (Rect) this.c;
                i0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((i0) this.b).b;
                if (recyclerView != null) {
                    int r10 = recyclerView.e.r();
                    for (int i11 = 0; i11 < r10; i11++) {
                        recyclerView.e.q(i11).offsetLeftAndRight(i10);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((i0) this.b).b;
                if (recyclerView2 != null) {
                    int r11 = recyclerView2.e.r();
                    for (int i12 = 0; i12 < r11; i12++) {
                        recyclerView2.e.q(i12).offsetTopAndBottom(i10);
                    }
                    break;
                }
                break;
        }
    }
}
