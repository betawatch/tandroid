package org.telegram.ui.Wallet;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.r71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i5 extends s4.s0 {
    public RecyclerView a;
    public l71 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ m5 j;
    public final fi.a9 b = new fi.a9(this);
    public final m i = new m(this, 8);

    public i5(m5 m5Var) {
        this.j = m5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // s4.s0
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
            s4.p0 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && (layoutManager instanceof s4.c0))) {
                s4.h1 h1Var = new s4.h1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i11) >= AndroidUtilities.dp(600.0f)) {
                    m5 m5Var = this.j;
                    if (m5Var.v0()) {
                        int i13 = i11 > 0 ? 1 : -1;
                        r71 u02 = m5Var.u0();
                        if (this.c.canScrollVertically(i13) && (i13 >= 0 || u02 == null || !u02.canScrollVertically(-1))) {
                            i12 = i13 > 0 ? layoutManager.B() - 1 : 0;
                            if (i12 != -1) {
                                h1Var.a = i12;
                                layoutManager.w0(h1Var);
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

    public final void b(l71 l71Var) {
        l71 l71Var2 = this.c;
        if (l71Var2 != null) {
            l71Var2.removeCallbacks(this.i);
        }
        this.c = l71Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == l71Var) {
            return;
        }
        fi.a9 a9Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.w0;
            if (arrayList != null) {
                arrayList.remove(a9Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = l71Var;
        if (l71Var != null) {
            if (l71Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(a9Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        l71 l71Var = this.c;
        if (l71Var != null) {
            l71Var.removeCallbacks(this.i);
        }
    }

    public final View d(s4.p0 p0Var) {
        l71 l71Var;
        if (this.e || (l71Var = this.c) == null || l71Var.getScrollState() != 0) {
            return null;
        }
        m5 m5Var = this.j;
        r71 u02 = m5Var.u0();
        if ((u02 != null && u02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!m5Var.v0()) {
            return null;
        }
        View m10 = p0Var.m(0);
        View m11 = p0Var.m(p0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, s4.p0.z(m10) - p0Var.F()}[1]) >= Math.abs(new int[]{0, s4.p0.z(m11) - p0Var.F()}[1])) ? m11 : m10;
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
        s4.p0 layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, s4.p0.z(d) - layoutManager.F()};
        int i10 = iArr[0];
        if (i10 == 0 && iArr[1] == 0) {
            return;
        }
        this.a.w0(i10, iArr[1], null);
    }
}
