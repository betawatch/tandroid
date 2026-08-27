package f2;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ny;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static final b0 b = new b0(0);
    public static final b0 c = new b0(1);
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

    public void a(RecyclerView recyclerView, o1 o1Var) {
        View view = o1Var.a;
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

    public long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        v0 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i10 == 8 ? 200L : 250L : i10 == 8 ? itemAnimator.j() : itemAnimator.d;
    }

    public abstract int e(RecyclerView recyclerView, o1 o1Var);

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
        return !(this instanceof ny);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, o1 o1Var, float f10, float f11, int i10, boolean z10) {
        View view = o1Var.a;
        if (z10 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.j0.a;
            Float valueOf = Float.valueOf(r0.b0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.j0.a;
                    float e9 = r0.b0.e(childAt);
                    if (e9 > f12) {
                        f12 = e9;
                    }
                }
            }
            r0.b0.i(view, f12 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    public abstract boolean n(RecyclerView recyclerView, o1 o1Var, o1 o1Var2);

    public void o(RecyclerView recyclerView, o1 o1Var, o1 o1Var2, int i10, int i11, int i12) {
        View view = o1Var2.a;
        x0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof k0) {
            ((k0) layoutManager).b1(o1Var.a, view, i11, i12);
            return;
        }
        if (layoutManager.d()) {
            if (x0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.u0(i10);
            }
            if (x0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.u0(i10);
            }
        }
        if (layoutManager.e()) {
            if (x0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.u0(i10);
            }
            if (x0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.u0(i10);
            }
        }
    }

    public abstract void q(o1 o1Var);

    public float f(float f10) {
        return f10;
    }

    public float h(float f10) {
        return f10;
    }

    public void p(o1 o1Var, int i10) {
    }
}
