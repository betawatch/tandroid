package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends androidx.emoji2.text.f {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(m0 m0Var, int i9) {
        super(m0Var);
        this.d = i9;
    }

    @Override // androidx.emoji2.text.f
    public final int a(View view) {
        int y10;
        int i9;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                y10 = z0.y(view);
                i9 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin;
                break;
            default:
                a1 a1Var2 = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                y10 = z0.v(view);
                i9 = ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin;
                break;
        }
        return y10 + i9;
    }

    @Override // androidx.emoji2.text.f
    public final int b(View view) {
        int measuredWidth;
        int i9;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                Rect rect = ((a1) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin;
                break;
            default:
                a1 a1Var2 = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                Rect rect2 = ((a1) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin;
                break;
        }
        return measuredWidth + i9;
    }

    @Override // androidx.emoji2.text.f
    public final int c(View view) {
        int measuredHeight;
        int i9;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                Rect rect = ((a1) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
                break;
            default:
                a1 a1Var2 = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                Rect rect2 = ((a1) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) a1Var2).leftMargin;
                i9 = ((ViewGroup.MarginLayoutParams) a1Var2).rightMargin;
                break;
        }
        return measuredHeight + i9;
    }

    @Override // androidx.emoji2.text.f
    public final int d(View view) {
        int x10;
        int i9;
        switch (this.d) {
            case 0:
                a1 a1Var = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                x10 = z0.x(view);
                i9 = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin;
                break;
            default:
                a1 a1Var2 = (a1) view.getLayoutParams();
                ((m0) this.b).getClass();
                x10 = z0.z(view);
                i9 = ((ViewGroup.MarginLayoutParams) a1Var2).topMargin;
                break;
        }
        return x10 - i9;
    }

    @Override // androidx.emoji2.text.f
    public final int e() {
        switch (this.d) {
            case 0:
                return ((m0) this.b).m;
            default:
                return ((m0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int f() {
        int i9;
        int E;
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.b;
                i9 = m0Var.m;
                E = m0Var.E();
                break;
            default:
                m0 m0Var2 = (m0) this.b;
                i9 = m0Var2.n;
                E = m0Var2.C();
                break;
        }
        return i9 - E;
    }

    @Override // androidx.emoji2.text.f
    public final int g() {
        switch (this.d) {
            case 0:
                return ((m0) this.b).E();
            default:
                return ((m0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int h() {
        switch (this.d) {
            case 0:
                return ((m0) this.b).k;
            default:
                return ((m0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int i() {
        switch (this.d) {
            case 0:
                return ((m0) this.b).l;
            default:
                return ((m0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int j() {
        switch (this.d) {
            case 0:
                return ((m0) this.b).D();
            default:
                return ((m0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int k() {
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.b;
                return (m0Var.m - m0Var.D()) - m0Var.E();
            default:
                return ((m0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.f
    public final int l(View view) {
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.b;
                Rect rect = (Rect) this.c;
                m0Var.L(view, rect);
                return rect.right;
            default:
                m0 m0Var2 = (m0) this.b;
                Rect rect2 = (Rect) this.c;
                m0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.f
    public final int m(View view) {
        switch (this.d) {
            case 0:
                m0 m0Var = (m0) this.b;
                Rect rect = (Rect) this.c;
                m0Var.L(view, rect);
                return rect.left;
            default:
                m0 m0Var2 = (m0) this.b;
                Rect rect2 = (Rect) this.c;
                m0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.f
    public final void n(int i9) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((m0) this.b).b;
                if (recyclerView != null) {
                    int q10 = recyclerView.e.q();
                    for (int i10 = 0; i10 < q10; i10++) {
                        recyclerView.e.p(i10).offsetLeftAndRight(i9);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((m0) this.b).b;
                if (recyclerView2 != null) {
                    int q11 = recyclerView2.e.q();
                    for (int i11 = 0; i11 < q11; i11++) {
                        recyclerView2.e.p(i11).offsetTopAndBottom(i9);
                    }
                    break;
                }
                break;
        }
    }
}
