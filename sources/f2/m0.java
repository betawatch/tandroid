package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(j0 j0Var, int i10) {
        super(j0Var);
        this.d = i10;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y10;
        int i10;
        switch (this.d) {
            case 0:
                x0 x0Var = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                y10 = w0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) x0Var).rightMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                y10 = w0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin;
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
                x0 x0Var = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                Rect rect = ((x0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var).rightMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                Rect rect2 = ((x0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) x0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin;
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
                x0 x0Var = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                Rect rect = ((x0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) x0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                Rect rect2 = ((x0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) x0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) x0Var2).rightMargin;
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
                x0 x0Var = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                x10 = w0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) x0Var).leftMargin;
                break;
            default:
                x0 x0Var2 = (x0) view.getLayoutParams();
                ((j0) this.b).getClass();
                x10 = w0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) x0Var2).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override // androidx.emoji2.text.g
    public final int e() {
        switch (this.d) {
            case 0:
                return ((j0) this.b).m;
            default:
                return ((j0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                j0 j0Var = (j0) this.b;
                i10 = j0Var.m;
                E = j0Var.E();
                break;
            default:
                j0 j0Var2 = (j0) this.b;
                i10 = j0Var2.n;
                E = j0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.d) {
            case 0:
                return ((j0) this.b).E();
            default:
                return ((j0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((j0) this.b).k;
            default:
                return ((j0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((j0) this.b).l;
            default:
                return ((j0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((j0) this.b).D();
            default:
                return ((j0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                j0 j0Var = (j0) this.b;
                return (j0Var.m - j0Var.D()) - j0Var.E();
            default:
                return ((j0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l(View view) {
        switch (this.d) {
            case 0:
                j0 j0Var = (j0) this.b;
                Rect rect = (Rect) this.c;
                j0Var.L(view, rect);
                return rect.right;
            default:
                j0 j0Var2 = (j0) this.b;
                Rect rect2 = (Rect) this.c;
                j0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                j0 j0Var = (j0) this.b;
                Rect rect = (Rect) this.c;
                j0Var.L(view, rect);
                return rect.left;
            default:
                j0 j0Var2 = (j0) this.b;
                Rect rect2 = (Rect) this.c;
                j0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((j0) this.b).b;
                if (recyclerView != null) {
                    int p10 = recyclerView.e.p();
                    for (int i11 = 0; i11 < p10; i11++) {
                        recyclerView.e.o(i11).offsetLeftAndRight(i10);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((j0) this.b).b;
                if (recyclerView2 != null) {
                    int p11 = recyclerView2.e.p();
                    for (int i12 = 0; i12 < p11; i12++) {
                        recyclerView2.e.o(i12).offsetTopAndBottom(i10);
                    }
                    break;
                }
                break;
        }
    }
}
