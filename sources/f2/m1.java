package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m1 {
    public int a = -1;
    public RecyclerView b;
    public z0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final l1 g;
    public boolean h;

    public m1() {
        l1 l1Var = new l1();
        l1Var.d = -1;
        l1Var.f = false;
        l1Var.g = 0;
        l1Var.a = 0;
        l1Var.b = 0;
        l1Var.c = TLObject.FLAG_31;
        l1Var.e = null;
        this.g = l1Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i9) {
        z0 z0Var = this.c;
        if (z0Var instanceof m0) {
            return ((m0) z0Var).E0(i9);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + m0.class.getCanonicalName());
        return null;
    }

    public final void c(int i9, int i10) {
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
        l1 l1Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                n1 n1Var = recyclerView.p0;
                g(view2, l1Var);
                l1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            n1 n1Var2 = recyclerView.p0;
            d(i9, i10, l1Var);
            boolean z10 = l1Var.d >= 0;
            l1Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.m0.a();
            }
        }
    }

    public abstract void d(int i9, int i10, l1 l1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, l1 l1Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.p0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            z0 z0Var = this.c;
            if (z0Var.e == this) {
                z0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
