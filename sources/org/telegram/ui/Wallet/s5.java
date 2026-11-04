package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s5 extends u4.r0 {
    public RecyclerView a;
    public ai.h4 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ w5 j;
    public final gi.g8 b = new gi.g8(this);
    public final l i = new l(this, 8);

    public s5(w5 w5Var) {
        this.j = w5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // u4.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i3, int i10) {
        int minFlingVelocity;
        int i11;
        boolean z10 = this.f;
        if (z10) {
            if (z10) {
                this.d = true;
            }
            u4.o0 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i3) > minFlingVelocity) && (layoutManager instanceof u4.b0))) {
                u4.g1 g1Var = new u4.g1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i10) >= org.telegram.messenger.g0.L(600.0f)) {
                    w5 w5Var = this.j;
                    if (w5Var.z0()) {
                        int i12 = i10 > 0 ? 1 : -1;
                        l41 y02 = w5Var.y0();
                        if (this.c.canScrollVertically(i12) && (i12 >= 0 || y02 == null || !y02.canScrollVertically(-1))) {
                            i11 = i12 > 0 ? layoutManager.B() - 1 : 0;
                            if (i11 != -1) {
                                g1Var.a = i11;
                                layoutManager.w0(g1Var);
                                return true;
                            }
                        }
                    }
                }
                i11 = -1;
                if (i11 != -1) {
                }
            }
        }
        return false;
    }

    public final void b(ai.h4 h4Var) {
        ai.h4 h4Var2 = this.c;
        if (h4Var2 != null) {
            h4Var2.removeCallbacks(this.i);
        }
        this.c = h4Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == h4Var) {
            return;
        }
        gi.g8 g8Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.x0;
            if (arrayList != null) {
                arrayList.remove(g8Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = h4Var;
        if (h4Var != null) {
            if (h4Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(g8Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        ai.h4 h4Var = this.c;
        if (h4Var != null) {
            h4Var.removeCallbacks(this.i);
        }
    }

    public final View d(u4.o0 o0Var) {
        ai.h4 h4Var;
        if (this.e || (h4Var = this.c) == null || h4Var.getScrollState() != 0) {
            return null;
        }
        w5 w5Var = this.j;
        l41 y02 = w5Var.y0();
        if ((y02 != null && y02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!w5Var.z0()) {
            return null;
        }
        View m10 = o0Var.m(0);
        View m11 = o0Var.m(o0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, u4.o0.z(m10) - o0Var.F()}[1]) >= Math.abs(new int[]{0, u4.o0.z(m11) - o0Var.F()}[1])) ? m11 : m10;
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
        u4.o0 layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, u4.o0.z(d) - layoutManager.F()};
        int i3 = iArr[0];
        if (i3 == 0 && iArr[1] == 0) {
            return;
        }
        this.a.w0(i3, iArr[1], null);
    }
}
