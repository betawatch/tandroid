package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j6 extends v4.s0 {
    public RecyclerView a;
    public bi.c6 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ n6 j;
    public final hi.f8 b = new hi.f8(this);
    public final m i = new m(this, 8);

    public j6(n6 n6Var) {
        this.j = n6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // v4.s0
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
            v4.p0 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && (layoutManager instanceof v4.c0))) {
                v4.i1 i1Var = new v4.i1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i10) >= org.telegram.messenger.g0.L(600.0f)) {
                    n6 n6Var = this.j;
                    if (n6Var.C0()) {
                        int i12 = i10 > 0 ? 1 : -1;
                        e51 B0 = n6Var.B0();
                        if (this.c.canScrollVertically(i12) && (i12 >= 0 || B0 == null || !B0.canScrollVertically(-1))) {
                            i11 = i12 > 0 ? layoutManager.B() - 1 : 0;
                            if (i11 != -1) {
                                i1Var.a = i11;
                                layoutManager.w0(i1Var);
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

    public final void b(bi.c6 c6Var) {
        bi.c6 c6Var2 = this.c;
        if (c6Var2 != null) {
            c6Var2.removeCallbacks(this.i);
        }
        this.c = c6Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == c6Var) {
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
        this.a = c6Var;
        if (c6Var != null) {
            if (c6Var.getOnFlingListener() != null) {
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
        bi.c6 c6Var = this.c;
        if (c6Var != null) {
            c6Var.removeCallbacks(this.i);
        }
    }

    public final View d(v4.p0 p0Var) {
        bi.c6 c6Var;
        if (this.e || (c6Var = this.c) == null || c6Var.getScrollState() != 0) {
            return null;
        }
        n6 n6Var = this.j;
        e51 B0 = n6Var.B0();
        if ((B0 != null && B0.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!n6Var.C0()) {
            return null;
        }
        View m10 = p0Var.m(0);
        View m11 = p0Var.m(p0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, v4.p0.z(m10) - p0Var.F()}[1]) >= Math.abs(new int[]{0, v4.p0.z(m11) - p0Var.F()}[1])) ? m11 : m10;
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
        v4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, v4.p0.z(d) - layoutManager.F()};
        int i7 = iArr[0];
        if (i7 == 0 && iArr[1] == 0) {
            return;
        }
        this.a.w0(i7, iArr[1], null);
    }
}
