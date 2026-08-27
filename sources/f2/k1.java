package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class k1 {
    public int a = -1;
    public RecyclerView b;
    public x0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final j1 g;
    public boolean h;

    public k1() {
        j1 j1Var = new j1();
        j1Var.d = -1;
        j1Var.f = false;
        j1Var.g = 0;
        j1Var.a = 0;
        j1Var.b = 0;
        j1Var.c = TLObject.FLAG_31;
        j1Var.e = null;
        this.g = j1Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        x0 x0Var = this.c;
        if (x0Var instanceof k0) {
            return ((k0) x0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + k0.class.getCanonicalName());
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
        j1 j1Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                l1 l1Var = recyclerView.p0;
                g(view2, j1Var);
                j1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            l1 l1Var2 = recyclerView.p0;
            d(i10, i11, j1Var);
            boolean z10 = j1Var.d >= 0;
            j1Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.m0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, j1 j1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, j1 j1Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.p0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            x0 x0Var = this.c;
            if (x0Var.e == this) {
                x0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
