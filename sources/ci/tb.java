package ci;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tb extends FrameLayout implements cs {
    public final l41 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final sb h;

    public tb(Context context, boolean z10, long j10, int i3, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i3;
        this.e = z10;
        this.c = i10;
        this.f = j10;
        this.b = e6Var;
        this.h = new sb(i10, i3, j10, z10);
        l41 l41Var = new l41(context, i10, i11, true, new ai.c(this, 22), new a1.c(this, 20), null, e6Var);
        this.a = l41Var;
        addView(l41Var, mf.c(-1.0f, -1));
        l41Var.setOnScrollListener(new ai.j5(this, 9));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.z3;
        l41 l41Var = this.a;
        if (i3 != i11) {
            if (i3 == hs.D3 && ((Long) objArr[0]).longValue() == this.f) {
                l41Var.g3.O(true);
                return;
            }
            return;
        }
        l41Var.g3.O(true);
        if (l41Var.canScrollVertically(1)) {
            for (int i12 = 0; i12 < l41Var.getChildCount(); i12++) {
                if (!(l41Var.getChildAt(i12) instanceof iz)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f;
        int i3 = this.c;
        if (j10 != 0) {
            hs.f(i3).c(this, hs.D3);
        } else {
            hs.f(i3).c(this, hs.z3);
        }
        this.a.g3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f;
        int i3 = this.c;
        if (j10 != 0) {
            hs.f(i3).n(this, hs.D3);
        } else {
            hs.f(i3).n(this, hs.z3);
        }
    }
}
