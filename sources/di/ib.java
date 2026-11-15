package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ib extends FrameLayout implements is {
    public final u41 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final hb h;

    public ib(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i7;
        this.e = z10;
        this.c = i10;
        this.f = j3;
        this.b = e6Var;
        this.h = new hb(i10, i7, j3, z10);
        u41 u41Var = new u41(context, i10, i11, true, new bi.b(this, 23), new z6(this, 1), null, e6Var);
        this.a = u41Var;
        addView(u41Var, c8.ja.c(-1.0f, -1));
        u41Var.setOnScrollListener(new bi.z4(this, 10));
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.z3;
        u41 u41Var = this.a;
        if (i7 != i11) {
            if (i7 == ns.D3 && ((Long) objArr[0]).longValue() == this.f) {
                u41Var.g3.O(true);
                return;
            }
            return;
        }
        u41Var.g3.O(true);
        if (u41Var.canScrollVertically(1)) {
            for (int i12 = 0; i12 < u41Var.getChildCount(); i12++) {
                if (!(u41Var.getChildAt(i12) instanceof pz)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            ns.f(i7).c(this, ns.D3);
        } else {
            ns.f(i7).c(this, ns.z3);
        }
        this.a.g3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            ns.f(i7).n(this, ns.D3);
        } else {
            ns.f(i7).n(this, ns.z3);
        }
    }
}
