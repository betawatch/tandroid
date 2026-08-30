package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class h1 {
    public int a = -1;
    public RecyclerView b;
    public v0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final g1 g;
    public boolean h;

    public h1() {
        g1 g1Var = new g1();
        g1Var.d = -1;
        g1Var.f = false;
        g1Var.g = 0;
        g1Var.a = 0;
        g1Var.b = 0;
        g1Var.c = TLObject.FLAG_31;
        g1Var.e = null;
        this.g = g1Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        v0 v0Var = this.c;
        if (v0Var instanceof i0) {
            return ((i0) v0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + i0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
            float f10 = a2.x;
            if (f10 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f10), (int) Math.signum(a2.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        g1 g1Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                i1 i1Var = recyclerView.q0;
                g(view2, g1Var);
                g1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            i1 i1Var2 = recyclerView.q0;
            d(i10, i11, g1Var);
            boolean z4 = g1Var.d >= 0;
            g1Var.a(recyclerView);
            if (z4 && this.e) {
                this.d = true;
                recyclerView.n0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, g1 g1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, g1 g1Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.q0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            v0 v0Var = this.c;
            if (v0Var.e == this) {
                v0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
