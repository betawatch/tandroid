package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import ci.s9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v4 extends s4.r0 {
    public RecyclerView a;
    public e71 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ a5 j;
    public final s9 b = new s9(this);
    public final m i = new m(this, 7);

    public v4(a5 a5Var) {
        this.j = a5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    @Override // s4.r0
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
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && (layoutManager instanceof s4.d0))) {
                s4.h1 h1Var = new s4.h1(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i11) >= AndroidUtilities.dp(600.0f)) {
                    a5 a5Var = this.j;
                    if (a5Var.o0()) {
                        int i13 = i11 > 0 ? 1 : -1;
                        k71 n02 = a5Var.n0();
                        if (this.c.canScrollVertically(i13) && (i13 >= 0 || n02 == null || !n02.canScrollVertically(-1))) {
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

    public final void b(e71 e71Var) {
        e71 e71Var2 = this.c;
        if (e71Var2 != null) {
            e71Var2.removeCallbacks(this.i);
        }
        this.c = e71Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == e71Var) {
            return;
        }
        s9 s9Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.w0;
            if (arrayList != null) {
                arrayList.remove(s9Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = e71Var;
        if (e71Var != null) {
            if (e71Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(s9Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            e();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        e71 e71Var = this.c;
        if (e71Var != null) {
            e71Var.removeCallbacks(this.i);
        }
    }

    public final View d(s4.p0 p0Var) {
        e71 e71Var;
        if (this.e || (e71Var = this.c) == null || e71Var.getScrollState() != 0) {
            return null;
        }
        a5 a5Var = this.j;
        k71 n02 = a5Var.n0();
        if ((n02 != null && n02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!a5Var.o0()) {
            return null;
        }
        View m10 = p0Var.m(0);
        View m11 = p0Var.m(p0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, s4.p0.z(m10) - p0Var.F()}[1]) >= Math.abs(new int[]{0, s4.p0.z(m11) - p0Var.F()}[1])) ? m11 : m10;
    }

    public final void e() {
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
        this.a.v0(i10, iArr[1], null);
    }
}
