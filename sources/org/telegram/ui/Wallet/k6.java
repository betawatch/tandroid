package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k6 extends v4.s0 {
    public RecyclerView a;
    public bi.i6 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ o6 j;
    public final hi.z8 b = new hi.z8(this);
    public final m i = new m(this, 8);

    public k6(o6 o6Var) {
        this.j = o6Var;
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
                    o6 o6Var = this.j;
                    if (o6Var.C0()) {
                        int i12 = i10 > 0 ? 1 : -1;
                        g51 B0 = o6Var.B0();
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

    public final void b(bi.i6 i6Var) {
        bi.i6 i6Var2 = this.c;
        if (i6Var2 != null) {
            i6Var2.removeCallbacks(this.i);
        }
        this.c = i6Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == i6Var) {
            return;
        }
        hi.z8 z8Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.x0;
            if (arrayList != null) {
                arrayList.remove(z8Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = i6Var;
        if (i6Var != null) {
            if (i6Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(z8Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        bi.i6 i6Var = this.c;
        if (i6Var != null) {
            i6Var.removeCallbacks(this.i);
        }
    }

    public final View d(v4.p0 p0Var) {
        bi.i6 i6Var;
        if (this.e || (i6Var = this.c) == null || i6Var.getScrollState() != 0) {
            return null;
        }
        o6 o6Var = this.j;
        g51 B0 = o6Var.B0();
        if ((B0 != null && B0.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!o6Var.C0()) {
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
