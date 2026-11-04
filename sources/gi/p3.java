package gi;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class p3 {
    public final View a;
    public View b;
    public final u10 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final m3 i;
    public final n3 j;
    public int k;
    public int l;

    public p3(View view, boolean z10, u10 u10Var) {
        m3 m3Var = new m3(this, 0);
        this.i = m3Var;
        n3 n3Var = new n3(this, 0);
        this.j = n3Var;
        this.a = view;
        this.c = u10Var;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(n3Var);
            view.addOnLayoutChangeListener(m3Var);
        }
        view.addOnAttachStateChangeListener(new o3(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l < org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.n) {
                return;
            } else {
                this.e = false;
            }
        }
        u10 u10Var = this.c;
        if (u10Var != null) {
            u10Var.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        return this.l > org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.n || this.e;
    }

    public final void d() {
        if (this.d) {
            return;
        }
        boolean z10 = this.f;
        View view = this.a;
        if (z10) {
            View view2 = this.b;
            if (view2 != null) {
                view = view2;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a10 = r0.b0.a(view);
            this.l = a10 != null ? a10.a.f(8).d : 0;
        } else {
            Rect rect = this.h;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.b;
            if (view3 != null) {
                view = view3;
            }
            this.l = view.getHeight() - rect.bottom;
        }
        if (this.g) {
            this.l = Math.max(0, this.l - org.telegram.messenger.g0.n);
        }
        int i3 = this.k;
        int i10 = this.l;
        boolean z11 = i3 != i10;
        this.k = i10;
        if (z11) {
            a();
        }
    }
}
