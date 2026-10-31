package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ul;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x5 extends s4.q0 {
    public RecyclerView a;
    public ii c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ b6 j;
    public final ul b = new ul(this);
    public final l i = new l(this, 8);

    public x5(b6 b6Var) {
        this.j = b6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // s4.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i10, int i11) {
        int minFlingVelocity;
        int i12;
        boolean z10 = this.f;
        if (z10) {
            if (z10) {
                this.d = true;
            }
            s4.n0 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && (layoutManager instanceof s4.a0))) {
                s4.g1 g1Var = new s4.g1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i11) >= org.telegram.messenger.i0.L(600.0f)) {
                    b6 b6Var = this.j;
                    if (b6Var.y0()) {
                        int i13 = i11 > 0 ? 1 : -1;
                        u51 x02 = b6Var.x0();
                        if (this.c.canScrollVertically(i13) && (i13 >= 0 || x02 == null || !x02.canScrollVertically(-1))) {
                            i12 = i13 > 0 ? layoutManager.B() - 1 : 0;
                            if (i12 != -1) {
                                g1Var.a = i12;
                                layoutManager.w0(g1Var);
                                return true;
                            }
                        }
                    }
                }
                i12 = -1;
                if (i12 != -1) {
                }
            }
        }
        return false;
    }

    public final void b(ii iiVar) {
        ii iiVar2 = this.c;
        if (iiVar2 != null) {
            iiVar2.removeCallbacks(this.i);
        }
        this.c = iiVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView == iiVar) {
            return;
        }
        ul ulVar = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.w0;
            if (arrayList != null) {
                arrayList.remove(ulVar);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = iiVar;
        if (iiVar != null) {
            if (iiVar.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(ulVar);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        ii iiVar = this.c;
        if (iiVar != null) {
            iiVar.removeCallbacks(this.i);
        }
    }

    public final View d(s4.n0 n0Var) {
        ii iiVar;
        if (this.e || (iiVar = this.c) == null || iiVar.getScrollState() != 0) {
            return null;
        }
        b6 b6Var = this.j;
        u51 x02 = b6Var.x0();
        if ((x02 != null && x02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!b6Var.y0()) {
            return null;
        }
        View m10 = n0Var.m(0);
        View m11 = n0Var.m(n0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, s4.n0.z(m10) - n0Var.F()}[1]) >= Math.abs(new int[]{0, s4.n0.z(m11) - n0Var.F()}[1])) ? m11 : m10;
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.g = motionEvent.getX();
            this.h = motionEvent.getY();
            return;
        }
        if (actionMasked == 3) {
            c();
            return;
        }
        if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            boolean z10 = abs2 > ((float) ViewConfiguration.get(this.c.getContext()).getScaledTouchSlop()) && abs2 > abs * 1.5f;
            this.f = z10;
            if (!z10) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        s4.n0 layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, s4.n0.z(d) - layoutManager.F()};
        int i10 = iArr[0];
        if (i10 == 0 && iArr[1] == 0) {
            return;
        }
        this.a.w0(i10, iArr[1], null);
    }
}
