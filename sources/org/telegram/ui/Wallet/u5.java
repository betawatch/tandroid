package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class u5 extends v4.r0 {
    public RecyclerView a;
    public bi.v3 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ y5 j;
    public final hi.f8 b = new hi.f8(this);
    public final l i = new l(this, 8);

    public u5(y5 y5Var) {
        this.j = y5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // v4.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i7, int i10) {
        int minFlingVelocity;
        int i11;
        boolean z10 = this.f;
        if (z10) {
            if (z10) {
                this.d = true;
            }
            v4.o0 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && (layoutManager instanceof v4.b0))) {
                v4.h1 h1Var = new v4.h1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i10) >= org.telegram.messenger.g0.L(600.0f)) {
                    y5 y5Var = this.j;
                    if (y5Var.z0()) {
                        int i12 = i10 > 0 ? 1 : -1;
                        u41 y02 = y5Var.y0();
                        if (this.c.canScrollVertically(i12) && (i12 >= 0 || y02 == null || !y02.canScrollVertically(-1))) {
                            i11 = i12 > 0 ? layoutManager.B() - 1 : 0;
                            if (i11 != -1) {
                                h1Var.a = i11;
                                layoutManager.w0(h1Var);
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

    public final void b(bi.v3 v3Var) {
        bi.v3 v3Var2 = this.c;
        if (v3Var2 != null) {
            v3Var2.removeCallbacks(this.i);
        }
        this.c = v3Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == v3Var) {
            return;
        }
        hi.f8 f8Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.x0;
            if (arrayList != null) {
                arrayList.remove(f8Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = v3Var;
        if (v3Var != null) {
            if (v3Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(f8Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        bi.v3 v3Var = this.c;
        if (v3Var != null) {
            v3Var.removeCallbacks(this.i);
        }
    }

    public final View d(v4.o0 o0Var) {
        bi.v3 v3Var;
        if (this.e || (v3Var = this.c) == null || v3Var.getScrollState() != 0) {
            return null;
        }
        y5 y5Var = this.j;
        u41 y02 = y5Var.y0();
        if ((y02 != null && y02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!y5Var.z0()) {
            return null;
        }
        View m10 = o0Var.m(0);
        View m11 = o0Var.m(o0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, v4.o0.z(m10) - o0Var.F()}[1]) >= Math.abs(new int[]{0, v4.o0.z(m11) - o0Var.F()}[1])) ? m11 : m10;
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
        v4.o0 layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, v4.o0.z(d) - layoutManager.F()};
        int i7 = iArr[0];
        if (i7 == 0 && iArr[1] == 0) {
            return;
        }
        this.a.w0(i7, iArr[1], null);
    }
}
