package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class i1 {
    public int a = -1;
    public RecyclerView b;
    public w0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final h1 g;
    public boolean h;

    public i1() {
        h1 h1Var = new h1();
        h1Var.d = -1;
        h1Var.f = false;
        h1Var.g = 0;
        h1Var.a = 0;
        h1Var.b = 0;
        h1Var.c = TLObject.FLAG_31;
        h1Var.e = null;
        this.g = h1Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        w0 w0Var = this.c;
        if (w0Var instanceof j0) {
            return ((j0) w0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + j0.class.getCanonicalName());
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
        h1 h1Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                j1 j1Var = recyclerView.q0;
                g(view2, h1Var);
                h1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            j1 j1Var2 = recyclerView.q0;
            d(i10, i11, h1Var);
            boolean z4 = h1Var.d >= 0;
            h1Var.a(recyclerView);
            if (z4 && this.e) {
                this.d = true;
                recyclerView.n0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, h1 h1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, h1 h1Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.q0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            w0 w0Var = this.c;
            if (w0Var.e == this) {
                w0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
