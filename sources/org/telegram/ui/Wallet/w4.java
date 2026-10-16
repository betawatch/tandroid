package org.telegram.ui.Wallet;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import di.r9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class w4 extends s4.p0 {
    public RecyclerView a;
    public c71 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ a5 j;
    public final r9 b = new r9(this);
    public final n i = new n(this, 7);

    public w4(a5 a5Var) {
        this.j = a5Var;
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
                    a5 a5Var = this.j;
                    if (a5Var.o0()) {
                        int i13 = i11 > 0 ? 1 : -1;
                        i71 n02 = a5Var.n0();
                        if (this.c.canScrollVertically(i13) && (i13 >= 0 || n02 == null || !n02.canScrollVertically(-1))) {
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

    public final void b(c71 c71Var) {
        c71 c71Var2 = this.c;
        if (c71Var2 != null) {
            c71Var2.removeCallbacks(this.i);
        }
        this.c = c71Var;
        RecyclerView recyclerView = this.a;
        if (recyclerView == c71Var) {
            return;
        }
        r9 r9Var = this.b;
        if (recyclerView != null) {
            ArrayList arrayList = recyclerView.w0;
            if (arrayList != null) {
                arrayList.remove(r9Var);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = c71Var;
        if (c71Var != null) {
            if (c71Var.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(r9Var);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            e();
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        c71 c71Var = this.c;
        if (c71Var != null) {
            c71Var.removeCallbacks(this.i);
        }
    }

    public final View d(s4.n0 n0Var) {
        c71 c71Var;
        if (this.e || (c71Var = this.c) == null || c71Var.getScrollState() != 0) {
            return null;
        }
        a5 a5Var = this.j;
        i71 n02 = a5Var.n0();
        if ((n02 != null && n02.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!a5Var.o0()) {
            return null;
        }
        View m10 = n0Var.m(0);
        View m11 = n0Var.m(n0Var.B() - 1);
        return m10 == null ? m11 : (m11 != null && Math.abs(new int[]{0, s4.n0.z(m10) - n0Var.F()}[1]) >= Math.abs(new int[]{0, s4.n0.z(m11) - n0Var.F()}[1])) ? m11 : m10;
    }

    public final void e() {
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
