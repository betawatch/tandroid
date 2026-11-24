// default package

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class eu5 {
    public static final bg3 c = new bg3(1);
    public static final bg3 d = new bg3(2);
    public final /* synthetic */ byte a;
    public int b;

    public eu5() {
        this.a = (byte) 0;
        this.b = -1;
    }

    public static int c(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 << 1;
            i4 |= (-789517) & i5;
            i3 = i5 & 789516;
        }
        return i4 | (i3 << 2);
    }

    public static String e(int i) {
        return "" + ((char) ((i >> 24) & nm7.d4)) + ((char) ((i >> 16) & nm7.d4)) + ((char) ((i >> 8) & nm7.d4)) + ((char) (i & nm7.d4));
    }

    public static int m(int i, int i2) {
        return i2 | i | (i2 << 8) | (i << 16);
    }

    public static void t(StringBuilder sb) {
        sb.delete(0, sb.length());
    }

    public void a(RecyclerView recyclerView, u69 u69Var) {
        View view = u69Var.a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = kfc.a;
            cfc.h(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 >> 1;
            i4 |= (-3158065) & i5;
            i3 = i5 & 3158064;
        }
        return i4 | (i3 >> 2);
    }

    public long d(RecyclerView recyclerView, int i, float f, float f2) {
        d69 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.j() : itemAnimator.d;
    }

    public int f(RecyclerView recyclerView, u69 u69Var) {
        return u69Var.f != 3 ? m(0, 0) : m(3, 0);
    }

    public float h() {
        return 0.5f;
    }

    public final int j(int i, int i2, long j) {
        int i3 = this.b;
        if (i3 == -1) {
            i3 = gm.L(20.0f);
            this.b = i3;
        }
        int interpolation = (int) (c.getInterpolation(j <= 500 ? j / 500.0f : 1.0f) * ((int) (d.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * i3)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return !(this instanceof iv3);
    }

    public void n(Canvas canvas, RecyclerView recyclerView, u69 u69Var, float f, float f2, int i, boolean z) {
        View view = u69Var.a;
        if (z && view.getTag() == null) {
            WeakHashMap weakHashMap = kfc.a;
            Float valueOf = Float.valueOf(cfc.e(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = kfc.a;
                    float e = cfc.e(childAt);
                    if (e > f3) {
                        f3 = e;
                    }
                }
            }
            cfc.h(view, f3 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2);

    public void p(RecyclerView recyclerView, u69 u69Var, u69 u69Var2, int i, int i2, int i3) {
        View view = u69Var2.a;
        f69 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof u46) {
            ((u46) layoutManager).a1(u69Var.a, view, i2, i3);
            return;
        }
        if (layoutManager.d()) {
            if (f69.w(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.w0(i);
            }
            if (f69.x(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.w0(i);
            }
        }
        if (layoutManager.e()) {
            if (f69.y(view) <= recyclerView.getPaddingTop()) {
                recyclerView.w0(i);
            }
            if (f69.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.w0(i);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return e(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ eu5(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public eu5 s() {
        return this;
    }

    public float g(float f) {
        return f;
    }

    public float i(float f) {
        return f;
    }

    public void r(u69 u69Var) {
    }

    public void q(u69 u69Var, int i) {
    }
}
