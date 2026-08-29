package f2;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.my;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static final a0 b = new a0(0);
    public static final a0 c = new a0(1);
    public int a = -1;

    public static int c(int i10, int i11) {
        int i12;
        int i13 = i10 & 789516;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 << 2;
        } else {
            int i15 = i13 << 1;
            i14 |= (-789517) & i15;
            i12 = (i15 & 789516) << 2;
        }
        return i14 | i12;
    }

    public static int l(int i10, int i11) {
        int i12 = i11 | i10;
        return (i10 << 16) | (i11 << 8) | i12;
    }

    public void a(RecyclerView recyclerView, n1 n1Var) {
        View view = n1Var.a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.j0.a;
            r0.b0.i(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i10, int i11) {
        int i12;
        int i13 = i10 & 3158064;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 >> 2;
        } else {
            int i15 = i13 >> 1;
            i14 |= (-3158065) & i15;
            i12 = (i15 & 3158064) >> 2;
        }
        return i14 | i12;
    }

    public long d(RecyclerView recyclerView, int i10, float f9, float f10) {
        u0 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i10 == 8 ? 200L : 250L : i10 == 8 ? itemAnimator.j() : itemAnimator.d;
    }

    public abstract int e(RecyclerView recyclerView, n1 n1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i10, int i11, long j10) {
        if (this.a == -1) {
            this.a = AndroidUtilities.dp(20.0f);
        }
        int interpolation = (int) (b.getInterpolation(j10 <= 500 ? j10 / 500.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * this.a)));
        return interpolation == 0 ? i11 > 0 ? 1 : -1 : interpolation;
    }

    public boolean j() {
        return true;
    }

    public boolean k() {
        return !(this instanceof my);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, n1 n1Var, float f9, float f10, int i10, boolean z10) {
        View view = n1Var.a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.j0.a;
            Float valueOf = Float.valueOf(r0.b0.e(view));
            int childCount = recyclerView.getChildCount();
            float f11 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.j0.a;
                    float e10 = r0.b0.e(childAt);
                    if (e10 > f11) {
                        f11 = e10;
                    }
                }
            }
            r0.b0.i(view, f11 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f9);
        view.setTranslationY(f10);
    }

    public abstract boolean n(RecyclerView recyclerView, n1 n1Var, n1 n1Var2);

    public void o(RecyclerView recyclerView, n1 n1Var, n1 n1Var2, int i10, int i11, int i12) {
        View view = n1Var2.a;
        w0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof j0) {
            ((j0) layoutManager).b1(n1Var.a, view, i11, i12);
            return;
        }
        if (layoutManager.d()) {
            if (w0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.u0(i10);
            }
            if (w0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.u0(i10);
            }
        }
        if (layoutManager.e()) {
            if (w0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.u0(i10);
            }
            if (w0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.u0(i10);
            }
        }
    }

    public abstract void q(n1 n1Var);

    public float f(float f9) {
        return f9;
    }

    public float h(float f9) {
        return f9;
    }

    public void p(n1 n1Var, int i10) {
    }
}
