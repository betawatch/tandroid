package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class j1 {
    public int a = -1;
    public RecyclerView b;
    public w0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final i1 g;
    public boolean h;

    public j1() {
        i1 i1Var = new i1();
        i1Var.d = -1;
        i1Var.f = false;
        i1Var.g = 0;
        i1Var.a = 0;
        i1Var.b = 0;
        i1Var.c = TLObject.FLAG_31;
        i1Var.e = null;
        this.g = i1Var;
    }

    public static void b(PointF pointF) {
        float f9 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
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
            float f9 = a2.x;
            if (f9 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f9), (int) Math.signum(a2.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        i1 i1Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                k1 k1Var = recyclerView.p0;
                g(view2, i1Var);
                i1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            k1 k1Var2 = recyclerView.p0;
            d(i10, i11, i1Var);
            boolean z10 = i1Var.d >= 0;
            i1Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.m0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, i1 i1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, i1 i1Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.p0.a = -1;
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
