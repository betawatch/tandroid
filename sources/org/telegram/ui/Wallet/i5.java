package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i5 extends s4.p0 {
    public RecyclerView a;
    public u61 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ m5 j;
    public final ei.e9 b = new ei.e9(this);
    public final n i = new n(this, 9);

    public i5(m5 m5Var) {
        this.j = m5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // s4.p0
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
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && (layoutManager instanceof s4.b0))) {
                s4.f1 f1Var = new s4.f1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i11) >= AndroidUtilities.dp(600.0f)) {
                    m5 m5Var = this.j;
                    if (m5Var.u0()) {
                        int i13 = i11 > 0 ? 1 : -1;
                        a71 t02 = m5Var.t0();
                        if (this.c.canScrollVertically(i13) && (i13 >= 0 || t02 == null || !t02.canScrollVertically(-1))) {
                            i12 = i13 > 0 ? layoutManager.B() - 1 : 0;
                            if (i12 != -1) {
                                f1Var.a = i12;
                                layoutManager.w0(f1Var);
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

    public final void b(u61 u61Var) {
        u61 u61Var2 = this.c;
        if (u61Var2 != null) {
            u61Var2.removeCallbacks(this.i);
        }
        this.c = u61Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == u61Var) {
            return;
        }
        ei.e9 e9Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.w0;
            if (arrayList != null) {
                arrayList.remove(e9Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = u61Var;
        if (u61Var != null) {
            if (u61Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(e9Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        u61 u61Var = this.c;
        if (u61Var != null) {
            u61Var.removeCallbacks(this.i);
        }
    }

    public final View d(s4.n0 n0Var) {
        u61 u61Var;
        if (this.e || (u61Var = this.c) == null || u61Var.getScrollState() != 0) {
            return null;
        }
        m5 m5Var = this.j;
        a71 t02 = m5Var.t0();
        if ((t02 != null && t02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!m5Var.u0()) {
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
        this.a.v0(i10, iArr[1], null);
    }
}
