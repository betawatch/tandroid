// default package

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class b89 {
    public int a = -1;
    public RecyclerView b;
    public q79 c;
    public boolean d;
    public boolean e;
    public View f;
    public final a89 g;
    public boolean h;

    public b89() {
        a89 a89Var = new a89();
        a89Var.d = -1;
        a89Var.f = false;
        a89Var.g = 0;
        a89Var.a = 0;
        a89Var.b = 0;
        a89Var.c = TLObject.FLAG_31;
        a89Var.e = null;
        this.g = a89Var;
    }

    public static void b(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i) {
        q79 q79Var = this.c;
        if (q79Var instanceof x46) {
            return ((x46) q79Var).D0(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + x46.class.getCanonicalName());
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
                recyclerView.w0((int) Math.signum(f), (int) Math.signum(a.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        a89 a89Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.T(view) == this.a) {
                View view2 = this.f;
                c89 c89Var = recyclerView.v0;
                g(view2, a89Var);
                a89Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            c89 c89Var2 = recyclerView.v0;
            d(i, i2, a89Var);
            boolean z = a89Var.d >= 0;
            a89Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.s0.a();
            }
        }
    }

    public abstract void d(int i, int i2, a89 a89Var);

    public abstract void f();

    public abstract void g(View view, a89 a89Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.v0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            q79 q79Var = this.c;
            if (q79Var.e == this) {
                q79Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    public void e() {
    }
}
