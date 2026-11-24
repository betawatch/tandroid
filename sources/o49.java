// default package

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class o49 {
    public int a = -1;
    public RecyclerView b;
    public d49 c;
    public boolean d;
    public boolean e;
    public View f;
    public final n49 g;
    public boolean h;

    public o49() {
        n49 n49Var = new n49();
        n49Var.d = -1;
        n49Var.f = false;
        n49Var.g = 0;
        n49Var.a = 0;
        n49Var.b = 0;
        n49Var.c = TLObject.FLAG_31;
        n49Var.e = null;
        this.g = n49Var;
    }

    public static void b(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i) {
        d49 d49Var = this.c;
        if (d49Var instanceof t26) {
            return ((t26) d49Var).D0(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + t26.class.getCanonicalName());
        return null;
    }

    public final void c(int i, int i2) {
        PointF a;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (a = a(this.a)) != null) {
            float f = a.x;
            if (f != 0.0f || a.y != 0.0f) {
                recyclerView.v0((int) Math.signum(f), (int) Math.signum(a.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        n49 n49Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                p49 p49Var = recyclerView.v0;
                g(view2, n49Var);
                n49Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            p49 p49Var2 = recyclerView.v0;
            d(i, i2, n49Var);
            boolean z = n49Var.d >= 0;
            n49Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.s0.a();
            }
        }
    }

    public abstract void d(int i, int i2, n49 n49Var);

    public abstract void f();

    public abstract void g(View view, n49 n49Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.v0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            d49 d49Var = this.c;
            if (d49Var.e == this) {
                d49Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    public void e() {
    }
}
